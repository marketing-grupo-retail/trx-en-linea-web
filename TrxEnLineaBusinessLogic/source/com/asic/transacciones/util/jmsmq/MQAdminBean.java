/*
 * Proyecto: VisaPagos
 * 
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 * 
 * $Id: MQAdminBean.java,v 1.1 2019/12/18 17:09:00 Alfonso Exp $
 * 
 */
package com.asic.transacciones.util.jmsmq;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueBrowser;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.directory.InitialDirContext;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.ibm.mq.MQC;
import com.ibm.mq.MQQueueManager;
import com.ibm.mq.jms.MQQueue;

/**
 * Administrador de colas de MQ point to point (p2p).
 * 
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */

public class MQAdminBean {
	private static String qcfLookup;
	private static String qLookup;

	private Queue ioCola = null;
	private QueueSession sesion = null;
	private QueueConnection conexion = null;
	private QueueConnectionFactory factory = null;
	private Context ctx = null;

	private static String icf;
	private static String url;
	private String waitInterval;

	/**
	 * 
	 * En el constructor se asocian y leen las variables de ambiente de los objetos administrados de mq
	 * a traves de el archivo de propiedades asociado
	 *
	 */
	public MQAdminBean() throws ServiceException {
		try {
			ResourceBundle resource = ResourceBundle.getBundle("mq");
			qcfLookup = resource.getString("qcfLookup").trim();
			qLookup = resource.getString("qLookup").trim();
			icf = resource.getString("icf").trim();
			url = resource.getString("url").trim();
			waitInterval = resource.getString("waitInterval").trim();
			//LogWriter.getLog().log(this, LogWriter.INFO, "En [MQAdmin()]: Valores -- "+qcfLookup+" -- "+qLookup+" -- "+icf+" -- "+url);
			inicializar(false, Session.AUTO_ACKNOWLEDGE);
		} catch (MissingResourceException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [MQAdmin()]: " + e.getMessage());
			throw new ServiceException("MissingResourceException", e);
		}

	}

	public MQAdminBean(boolean pTransaccional, int pTipo) throws ServiceException {
		try {
			ResourceBundle resource = ResourceBundle.getBundle("mq");
			qcfLookup = resource.getString("qcfLookup").trim();
			qLookup = resource.getString("qLookup").trim();
			icf = resource.getString("icf").trim();
			url = resource.getString("url").trim();
			waitInterval = resource.getString("waitInterval").trim();
			//LogWriter.getLog().log(this, LogWriter.INFO, "En [MQAdmin()]: Valores -- "+qcfLookup+" -- "+qLookup+" -- "+icf+" -- "+url);
			inicializar(pTransaccional, pTipo);
		} catch (MissingResourceException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [MQAdmin()]: " + e.getMessage());
			throw new ServiceException("MissingResourceException", e);
		}
	}
	/**
	 * 
	 * Constructor de configuración de MQ para nuevas propiedades
	 * 
	 * @param prefix Contiene el prefijo de la nueva configuración.
	 * @throws ServiceException
	 */
	public MQAdminBean(String prefix) throws ServiceException {
		try {
			ResourceBundle resource = ResourceBundle.getBundle("mq");
			qcfLookup = resource.getString(prefix + ".qcfLookup").trim();
			qLookup = resource.getString(prefix + ".qLookup").trim();
			icf = resource.getString(prefix + ".icf").trim();
			url = resource.getString(prefix + ".url").trim();

			inicializar(false, Session.AUTO_ACKNOWLEDGE);
		} catch (MissingResourceException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [MQAdmin(...)]: " + e.getMessage());
			throw new ServiceException("MissingResourceException", e);
		}
	}

	public MQAdminBean(String pQcfLookup, String pQLookup, String pIcf, String pUrl) throws ServiceException {
		try {
			qcfLookup = pQcfLookup.trim();
			qLookup = pQLookup.trim();
			icf = pIcf.trim();
			url = pUrl.trim();
			inicializar(false, Session.AUTO_ACKNOWLEDGE);
		} catch (MissingResourceException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [MQAdmin(...)]: " + e.getMessage());
			throw new ServiceException("MissingResourceException", e);
		}
	}

	/**
	 * 
	 * Envia el objeto a la cola de MQ
	 * 
	 * @param pObjEnviar Representa el objeto a enviar a la cola de MQ.
	 * @throws ServiceException
	 */
	public void enviarACola(Object pObjEnviar) throws ServiceException {
		
		// Crea el objeto que envia a la cola
		try {
			QueueSender qsenviaAcola_ = sesion.createSender(ioCola);

			// Crea el objeto mensaje para ser enviado
			ObjectMessage mensajeEnviado_ = sesion.createObjectMessage();
			// Adiciona el objeto
			mensajeEnviado_.setObject((Serializable) pObjEnviar);

			// Envia el mensaje a la cola de configurada
			qsenviaAcola_.send(mensajeEnviado_);

			//Cierra el objeto que envia a la cola
			qsenviaAcola_.close();
		} catch (JMSException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [enviaCola(...)]: " + e.getMessage());
			throw new ServiceException("JMSException", e);
		}
	}

	/**
	 * 
	 * Recibe el objeto de la cola de MQ
	 * 
	 * @return Retorna un objeto de la cola de MQ.
	 * @throws ServiceException
	 */
	public Object recibirMensaje() throws ServiceException {
		Object mensajeRecibido_ = null;
		ObjectMessage objMSG = null;
		Object obj_ = null;
		try {

			// Crea el objeto que recibe de la cola
			QueueReceiver qrReceptorCola_ = sesion.createReceiver(ioCola);

			// Lee el mensaje enviado
			mensajeRecibido_ = qrReceptorCola_.receive(Long.parseLong(waitInterval));

			if (mensajeRecibido_ == null)
				return obj_;
			if (mensajeRecibido_ instanceof ObjectMessage) {
				objMSG = (ObjectMessage) mensajeRecibido_;
				obj_ = objMSG.getObject();
			} else {
				LogWriter.getLog().log(this, LogWriter.INFO, "En [recibirMensaje(String pSelector)]: Mensaje de tipo no esperado-->" + mensajeRecibido_);
			}
		} catch (JMSException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [recibeCola(...)]: " + e.getMessage());
			throw new ServiceException("JMSException", e);
		}

		return obj_;
	}

	/**
		 * 
		 * Recibe el objeto de la cola de MQ
		 * 
		 * @return Retorna un objeto de la cola de MQ.
		 * @throws ServiceException
		 */
	public Object recibirMensaje(String pSelector) throws ServiceException {
		Object mensajeRecibido_ = null;
		ObjectMessage objMSG = null;
		Object obj_ = null;
		try {

			// Crea el objeto que recibe de la cola
			QueueReceiver qrReceptorCola_ = sesion.createReceiver(ioCola, pSelector);

			// Lee el mensaje enviado
			mensajeRecibido_ = qrReceptorCola_.receive(Long.parseLong(waitInterval));

			if (mensajeRecibido_ == null)
				return obj_;
			if (mensajeRecibido_ instanceof ObjectMessage) {
				objMSG = (ObjectMessage) mensajeRecibido_;
				obj_ = objMSG.getObject();
			} else {
				LogWriter.getLog().log(this, LogWriter.INFO, "En [recibirMensaje(String pSelector)]: Mensaje de tipo no esperado-->" + mensajeRecibido_);
			}

			// Cierra el receptor de colas
			qrReceptorCola_.close();
		} catch (JMSException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [recibeCola(String pSelector)]: " + e.getMessage());
			throw new ServiceException("JMSException", e);
		}

		return obj_;
	}

	public List browseMensaje() throws ServiceException {

		//ObjectMessage mensajeRecibido_ = null;
		Object mensajeRecibido_ = null;
		Object obj_ = null;
		List mensajes_ = new ArrayList();
		try {
			// Crea el objeto que recibe de la cola
			QueueBrowser qrReceptorCola_ = sesion.createBrowser(ioCola);

			// Lee el mensaje enviado
			Enumeration enum_ = qrReceptorCola_.getEnumeration();
			while (enum_.hasMoreElements()) {
				mensajeRecibido_ = (Object) enum_.nextElement();
				mensajes_.add(mensajeRecibido_);
				//	mensajeRecibido_.getJMSMessageID();
			}

			// Cierra el receptor de colas
			qrReceptorCola_.close();
		} catch (JMSException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [browseMensaje(...)]: " + e.getMessage());
			throw new ServiceException("JMSException", e);
		}

		return mensajes_;

	}

	public Object recibirObjeto() throws ServiceException {

		//ObjectMessage mensajeRecibido_ = null;
		Object mensajeRecibido_ = null;

		try {
			// Crea el objeto que recibe de la cola
			QueueReceiver qrReceptorCola_ = sesion.createReceiver(ioCola);

			// Lee el mensaje enviado
			mensajeRecibido_ = qrReceptorCola_.receive(Long.parseLong(waitInterval));

			// Cierra el receptor de colas
			qrReceptorCola_.close();
		} catch (JMSException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [recibirObjeto(...)]: " + e.getMessage());
			throw new ServiceException("JMSException", e);
		}

		return mensajeRecibido_;

	}

	public QueueReceiver getReceiver() throws ServiceException {

		try {
			// Crea el objeto que recibe de la cola
			QueueReceiver qrReceptorCola_ = sesion.createReceiver(ioCola);

			return qrReceptorCola_;
		} catch (JMSException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [getReceiver(...)]: " + e.getMessage());
			throw new ServiceException("JMSException", e);
		}

	}

	/**
	 * 
	 * Metodo que se utiliza para cerrar todos los objetos inicializados para le manejo de colas
	 * Es necesario para mantener el gestor de colas optimizado
	 * 
	 * @throws ServiceException
	 */
	public void cerrar() throws ServiceException {
		try {
			// Cierra Sesion
			sesion.close();
			sesion = null;

			//Cierra conexion
			conexion.close();
			conexion = null;
		} catch (JMSException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [cerrar(...)]: " + e.getMessage());
			throw new ServiceException("JMSException", e);
		}
	}

	/**
	 * 
	 * Inicializa el ambiente de envio y recepcion de mensajes a colas de MQ (p2p).
	 * 
	 * @throws ServiceException
	 */
	private void inicializar(boolean pTransaccional, int pTipo) throws ServiceException {
		try {
			ctx = iniciarJNDI(icf, url);
			factory = getConeccionFactoryDesdeJNDI(ctx, qcfLookup);
			conexion = factory.createQueueConnection();
			conexion.start();
			//boolean bTramitado_ = false;
			sesion = conexion.createQueueSession(pTransaccional, Session.AUTO_ACKNOWLEDGE);

			ioCola = getColaDesdeJNDI(ctx, qLookup);
		} catch (ServiceException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [inicializa(...)]: " + e.getMessage());
			throw new ServiceException("ServiceException", e);
		} catch (Exception e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [inicializa(...)]: " + e.getMessage());
			throw new ServiceException("Exception", e);
		}
	}

	/**
	 * 
	 * Inicializa el JNDI asociado con la cola de mq (p2p).
	 * 
	 * @param pstrIcf Representa el InicialContextFactory de los objetos de JNDI
	 * @param pstrUrl Representa el URL de los objetos administrados por el JNDI
	 * @return Retorna InitialDirContext basado en los parametros que recibio.
	 * @throws ServiceException
	 */
	private static InitialDirContext iniciarJNDI(String pstrIcf, String pstrUrl) throws ServiceException {
		InitialDirContext idcCtx_ = null;

		Hashtable htVarAmbiente_ = new Hashtable();

		if (pstrUrl == null) {
			LogWriter.getLog().log(MQAdminBean.class, LogWriter.SEVERE, "En [iniciaJNDI(...)]: Debe especificar el parametro de el provedor URL");
			throw new ServiceException("Debe especificar el parametro de el provedor URL");
		}

		htVarAmbiente_.put(Context.INITIAL_CONTEXT_FACTORY, pstrIcf);

		htVarAmbiente_.put(Context.PROVIDER_URL, pstrUrl);

		htVarAmbiente_.put(Context.REFERRAL, "throw");

		try {
			idcCtx_ = new InitialDirContext(htVarAmbiente_);
		} catch (Exception e) {
			LogWriter.getLog().log(MQAdminBean.class, LogWriter.SEVERE, "En [iniciaJNDI(...)]: " + e.getMessage());
			throw new ServiceException("Exception", e);
		}
		return idcCtx_;
	}

	/**
	 * 
	 * Inicializa la fabrica de conexion desde el JNDI configurado
	 * 
	 * @param pCtx Representa el Context de la conección al JNDI
	 * @param pstrNombre Representa el ContextFactory de la cola de MQ en nuestro Caso. 
	 * @return Retorna un objeto de tipo QueueConnectionFactory con la conexion a los objetos de MQ.
	 * @throws ServiceException
	 */
	private static QueueConnectionFactory getConeccionFactoryDesdeJNDI(Context pCtx, String pstrNombre) throws ServiceException {
		QueueConnectionFactory qcfFactory_ = null;

		// Recibe un conexion de la fabrica de colas desde el JNDI
		try {
			qcfFactory_ = (QueueConnectionFactory) pCtx.lookup(pstrNombre);
		} catch (Exception e) {
			try {
				System.out.println(pCtx.getEnvironment());
				qcfFactory_ = (QueueConnectionFactory) pCtx.lookup("cn=" + pstrNombre);
			} catch (Exception e1) {
				e1.printStackTrace();
				//LogWriter.getLog().log(MQAdmin.class,LogWriter.SEVERE, "En [getConeccionFactoryDesdeJNDI(...)]: " + e1.getMessage());
				//throw new ServiceException("Exception", e1);
			}
		}
		return qcfFactory_;
	}

	/**
	 * 
	 * Inicializa el contexto de los objetos de la cola de MQ
	 * 
	 * @param pctx Representa el Context de los objetos de MQ
	 * @param pstrNombre Representa el ContextFactory de la cola de MQ en nuestro Caso.
	 * @return Retorna un objeto de tipo Queue que contiene el acceso a losobjetos de MQ. 
	 * @throws ServiceException
	 */
	private static Queue getColaDesdeJNDI(Context pctx, String pstrNombre) throws ServiceException {
		Queue ioCola_ = null;

		// Recibe la cola desde el JNDI
		try {
			ioCola_ = (Queue) pctx.lookup(pstrNombre);
		} catch (Exception e) {
			try {
				ioCola_ = (Queue) pctx.lookup("cn=" + pstrNombre);
			} catch (Exception e1) {
				LogWriter.getLog().log(MQAdminBean.class, LogWriter.SEVERE, "En [getColaDesdeJNDI(...)]: " + e1.getMessage());
				throw new ServiceException("Exception", e1);
			}
		}
		return ioCola_;
	}

	public void commitTrx() throws ServiceException {
		if (sesion != null)
			try {
				sesion.commit();
			} catch (JMSException e) {
				LogWriter.getLog().log(MQAdminBean.class, LogWriter.SEVERE, "En [commitTrx(...)]: " + e.getMessage());
				rollbackTrx();
				throw new ServiceException("Exception", e);
			}
	}

	public void rollbackTrx() throws ServiceException {
		if (sesion != null)
			try {
				sesion.rollback();
			} catch (JMSException e) {
				LogWriter.getLog().log(MQAdminBean.class, LogWriter.SEVERE, "En [rollbackTrx(...)]: " + e.getMessage());
				throw new ServiceException("Exception", e);
			}

	}

	public void recoverTrx() throws ServiceException {
		try {
			sesion.recover();
		} catch (JMSException e) {
			LogWriter.getLog().log(MQAdminBean.class, LogWriter.SEVERE, "En [rollbackTrx(...)]: " + e.getMessage());
			throw new ServiceException("Exception", e);
		}

	}

	/**
	 * @return
	 */
	public QueueSession getSesion() {
		return sesion;
	}

}
