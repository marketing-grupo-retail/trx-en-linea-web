/*
 * Created on Nov 29, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

//import javax.jms.BytesMessage;
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.ObjectMessage;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.AdminMensajesMailBean;
import com.asic.transacciones.bean.AdminRechazosBean;
import com.asic.transacciones.bean.AdminRegistroTempBean;
import com.asic.transacciones.bean.SupportProcessBean;
import com.asic.transacciones.bean.ValidadorStringsTransBean;
import com.asic.transacciones.proceso.ProcesoStopTrigger;
import com.asic.transacciones.util.Propiedad;
import com.asic.transacciones.util.jmsmq.MQAdminBean;
import com.asic.transacciones.vo.MensajeError;
import com.asic.transacciones.vo.MensajeError_Imp;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TX_HEADER;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class SupportFacadeAdapter {

	private static final String ERROR_CODE_CONEXION = "error.generic.connection_failed";
	private static final String ERROR_CODE_STOREPROC = "error.generic.store_procedure";

	private static boolean SHUTDOWN = false;
	private int intentos = 0;

	/**
	 * 1. Browse de mensajes
	 * 2. Procesar cada mensaje.
	 * 3. Sacar el mensaje de la cola, hacer commit...
	 * 
	 */
	public void procesarTransaccion() throws ServiceException {}
	/*
	public boolean procesarTransaccionDemo(TRANSACCION pObj) throws ServiceException {

		Object mensaje_ = null;
		boolean answer_=false;
			Object objetoMsg_ = null;
			long tIni_ = System.currentTimeMillis();
						answer_ = procesarMensajeDemo(pObj);
			long tCommit_ = System.currentTimeMillis() - tIni_;
			//LogWriter.getLog().log(this, LogWriter.FINEST, "Tiempo procesamiento(Millis) : " + tCommit_);
		return answer_;
	}
	*/
	
/*
	private void inicializarStopTrigger(ProcesoStopTrigger pTrigger) throws ServiceException {
		AdminProcesosFacadeAdapter fac_ = new AdminProcesosFacadeAdapter();
		//SHUTDOWN = fac_.getEstadoProcTrigger();
		boolean continua_ = true;
		Hashtable hashCfg_ = Propiedad.getInstance().getMensajesHash();
		long tiempo_ = Long.parseLong((String) hashCfg_.get("cfg.tiempo_intentos"));

		try {
			SHUTDOWN = fac_.getEstadoProcTrigger();
		} catch (ServiceException e) {
			Vector msg_ = new Vector();
			msg_.add(e.getMessage());
			AdminMensajesMailBean beanMail_ = new AdminMensajesMailBean();
			beanMail_.enviarMensaje(AdminMensajesMailBean.FALLO_CONX, msg_);
			//Intenta inicializar el estado del trigger n veces hasta que se reestablece la conexion.
			String errorCode_ = e.getErrorCode();
			try {
				if (errorCode_ != null && errorCode_.equalsIgnoreCase(ERROR_CODE_CONEXION) ) {

					while (continua_) {
						intentos++;
						Thread.sleep(tiempo_);
						LogWriter.getLog().log(this, LogWriter.INFO, " Despierta del sleep. En [inicializarStopTrigger(...)]");
						try {
							SHUTDOWN = fac_.getEstadoProcTrigger();
							continua_ = false;
							LogWriter.getLog().log(this, LogWriter.INFO, " Estado del trigger obtenido exitosamente despues de: " + intentos);
						} catch (ServiceException exc) {
							if (exc.getErrorCode() == null)
							continua_ = false;
						}
					}
				}
			} catch (InterruptedException ex) {
				LogWriter.getLog().log(this, LogWriter.SEVERE, " En [inicializarStopTrigger(...)]: " + ex.getMessage(), ex);
			}
		}
			pTrigger.setDaemon(true);
			pTrigger.start();
		}
*/
		/*private boolean procesarMensaje(Object mensaje_, MQAdminBean beanAdmin_, ObjectMessage element_, Object objMsg_, int pCount) throws ServiceException {

			boolean sucess_ = false;
			boolean continua_ = true;

			TRANSACCION vo_ = (TRANSACCION) objMsg_;

			Hashtable hashCfg_ = Propiedad.getInstance().getMensajesHash();
			intentos = 0;
			AdminMensajesMailBean beanMail_ = new AdminMensajesMailBean();
			long tiempo_ = Long.parseLong((String) hashCfg_.get("cfg.tiempo_intentos"));

			try {
				insertTransaccion(vo_);
				sucess_ = true;

			} catch (ServiceException e) {
				//Intenta realizar el ingreso de la transaccion n veces hasta que se reestablece la conexion.
				String errorCode_ = e.getErrorCode();
				try {
					if (errorCode_ != null && errorCode_.equalsIgnoreCase(ERROR_CODE_CONEXION) && element_.getJMSRedelivered()) {

						while (continua_) {
							intentos++;
							Thread.sleep(tiempo_);
							LogWriter.getLog().log(this, LogWriter.INFO, " Despierta del sleep.");
							try {
								insertTransaccion(vo_);
								sucess_ = true;
								continua_ = false;
								LogWriter.getLog().log(this, LogWriter.INFO, " Ingresa la transacción exitosamente con # intentos: " + intentos);
							} catch (ServiceException exc) {
								if (exc.getErrorCode() == null)
									continua_ = false;
							}
						}
					} else if (errorCode_ != null && errorCode_.equalsIgnoreCase(ERROR_CODE_CONEXION) && !element_.getJMSRedelivered()) {
						//ENVIAR MAIL del Fallo de conexion.
						Vector msg_ = new Vector();
						msg_.add(e.getMessage());
						beanMail_.enviarMensaje(AdminMensajesMailBean.FALLO_CONX, msg_);
						return sucess_;
					} else if (errorCode_ != null && errorCode_.equalsIgnoreCase(ERROR_CODE_STOREPROC) && !element_.getJMSRedelivered()) {
						//ENVIAR MAIL del Fallo al invocar el procedimiento almacenado.
						Vector msg_ = new Vector();
						msg_.add(e.getMessage());
						beanMail_.enviarMensaje(AdminMensajesMailBean.FALLO_STORE_PROC, msg_);
						return sucess_;
					} else {
						//Deterner procesamiento
						SHUTDOWN = true;
						sucess_ = true;
						LogWriter.getLog().log(this, LogWriter.SEVERE, "DETENIDO PROCESAMIENTO DE MENSAJES:<br>TRANSACCION:" + vo_ + "<br>EXCEPCION:" + e);

					}
				} catch (JMSException exc) {
					LogWriter.getLog().log(this, LogWriter.SEVERE, " En [procesarMensaje(...)]: " + exc.getMessage(), exc);
				} catch (InterruptedException ex) {
					LogWriter.getLog().log(this, LogWriter.SEVERE, " En [procesarMensaje(...)]: " + ex.getMessage(), ex);
				}
			}

			return sucess_;
		}*/

	public List getSupportStores() throws ServiceException {

		List answer_ = null;
		//boolean continua_ = true;

		//TRANSACCION vo_ = (TRANSACCION) objMsg_;


		//Hashtable hashCfg_ = Propiedad.getInstance().getMensajesHash();
		intentos = 0;
		SupportProcessBean bean_ = new SupportProcessBean();
		//long tiempo_ = Long.parseLong((String) hashCfg_.get("cfg.tiempo_intentos"));

		//try {
			answer_ = bean_.getSupportStores();
			//sucess_ = true;

		/*} catch (ServiceException e) {
			e.printStackTrace();
			sucess_ = false;
		} catch(Exception e){
			e.printStackTrace();
			sucess_ = false;
		}*/
		return answer_;
	}

		boolean insertTransaccion(TRANSACCION pMensaje) throws ServiceException {

			boolean success_ = false, successEstruc_ = false;
			AdminMensajesMailBean beanMail_ = new AdminMensajesMailBean();
			ValidadorStringsTransBean bean_ = new ValidadorStringsTransBean();

			List result_ = bean_.validarTrama(pMensaje);

			if (!result_.isEmpty()) {
				Boolean validaEstructura_ = (Boolean) result_.get(0);
				successEstruc_ = validaEstructura_.booleanValue();
				if (successEstruc_) {
					AdminRegistroTempBean reg_ = new AdminRegistroTempBean();
					if (!reg_.existsTrx(bean_.getTrans())){
						result_ = reg_.insertTransaccion(bean_.getTrans());
						if (!result_.isEmpty()) {
							Integer valIntegridad_ = (Integer) result_.get(0);
							if (valIntegridad_.intValue() == 0) {
								success_ = true;
							}
						}
					}else
						success_ = true;	
				}
			}else
				System.out.println("Esta trama no es válida");
			//es valida la estructura y valida la integridad
			boolean returnBol_ = (successEstruc_ && success_);
			if (!returnBol_) {
				//registrarTramaRechazada(pMensaje, result_);
				AdminRechazosBean beanrh_ = new AdminRechazosBean();
				//ENVIAR MAIL... NOTIFICANDO EL RECHAZO
				Vector msgError_ = new Vector();
				msgError_.add(beanrh_.getMensaje(result_, false));
				//@ TODO DESCOMENTARIAR CODIGO ENVIO DEL MENSAJE
				//beanMail_.enviarMensaje(AdminMensajesMailBean.TRX_RECHAZADA, msgError_);
			}
			return returnBol_;

		}

	boolean insertTransaccionDemo(TRANSACCION pMensaje) throws ServiceException {
		boolean success_ = false, successEstruc_ = false;
		AdminMensajesMailBean beanMail_ = new AdminMensajesMailBean();
		ValidadorStringsTransBean bean_ = new ValidadorStringsTransBean();

		List result_ = bean_.validarTrama(pMensaje);


		AdminRegistroTempBean reg_ = new AdminRegistroTempBean();
		result_ = reg_.insertTransaccion(bean_.getTrans());
		if (!result_.isEmpty()) {
			Integer valIntegridad_ = (Integer) result_.get(0);
			if (valIntegridad_.intValue() == 0) {
				success_ = true;
			}
		}
		return success_;
	}


		private void registrarTramaRechazada(TRANSACCION pVo, List pMensaje) throws ServiceException {
			AdminRechazosBean bean_ = new AdminRechazosBean();

			try {
				bean_.insertRechazo(pVo, pMensaje);
			} catch (ServiceException e) {
				LogWriter.getLog().log(this, LogWriter.SEVERE, "En [registrarTramaRechazada(...)]: " + e.getMessage(), e.getRootCause());
				throw e;
			}

		}

	}
