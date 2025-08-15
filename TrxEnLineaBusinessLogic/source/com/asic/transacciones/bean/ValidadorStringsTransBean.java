/*
 * Created on Dec 13, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.bean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.util.Propiedad;
import com.asic.transacciones.util.ValidadorCampo;
import com.asic.transacciones.vo.MensajeError;
import com.asic.transacciones.vo.MensajeError_Imp;
import com.asic.transacciones.vo.TPOS_DATA_ENTRY_Imp;
import com.asic.transacciones.vo.TPOS_DISCOUNT_Imp;
import com.asic.transacciones.vo.TPOS_EXCEPTION_LOG_Imp;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TPOS_HEADER_Imp;
import com.asic.transacciones.vo.TPOS_ITEMENTRY_Imp;
import com.asic.transacciones.vo.TPOS_ITEM_RECORD_CHANGE_Imp;
import com.asic.transacciones.vo.TPOS_MANAGER_OVERRIDE_Imp;
import com.asic.transacciones.vo.TPOS_OPERATOR_TRAINING_Imp;
import com.asic.transacciones.vo.TPOS_PRICE_CHANGE_Imp;
import com.asic.transacciones.vo.TPOS_STORE_CLOSING_Imp;
import com.asic.transacciones.vo.TPOS_TAX_Imp;
import com.asic.transacciones.vo.TPOS_TENDER_Imp;
import com.asic.transacciones.vo.TPOS_TILL_CHANGE_Imp;
import com.asic.transacciones.vo.TPOS_TRADING_STAMPS_Imp;
import com.asic.transacciones.vo.TPOS_USER_DATA_Imp;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TRANSACCION_Imp;

/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ValidadorStringsTransBean {

	private TRANSACCION transVal = new TRANSACCION_Imp();
	private TRANSACCION transProc;
	private static Hashtable reglasValHash;
	private static Hashtable mensajesHash;
	private SimpleDateFormat sdfFecha = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	/**
	 * Valida los Strings empaquetados en el VO ingresadon por paramtro. 
	 * @param pVo
	 * @throws ServiceException
	 */
	public List validarTrama(TRANSACCION pVo) throws ServiceException {
		transProc = pVo;
		reglasValHash = Propiedad.getInstance().getReglasValHash();
		mensajesHash = Propiedad.getInstance().getPropiedades(Propiedad.RESOURCE_BUNDLE_MSG);
		return invocarValidacionxObj(transProc);

	}

	private String getNombreClase(Object class_) {
		Class[] interfaces_ = class_.getClass().getInterfaces();
		String interfaceName_ = interfaces_[0].getName();
		int posi_ = interfaceName_.lastIndexOf(".");
		interfaceName_ = interfaceName_.substring(posi_ + 1, interfaceName_.length()).toLowerCase();
		return interfaceName_;
	}

	private List validarString(Object class_) throws ServiceException {
		String valorOffsetx_ = "";
		List esVal_ = new ArrayList();
		esVal_.add(0, new Boolean(true));

		String interfaceName_ = getNombreClase(class_);
		List claves_ = new ArrayList();
		String reglaVal_ = "";
		Object valor_ = "";
		String tipoVal_ = (String) mensajesHash.get("cfg.tipoval");
		String campoOffsetx_ = (String) mensajesHash.get("cfg.offsetx");

		if (reglasValHash.containsKey(interfaceName_)) {
			Hashtable hashCampos_ = (Hashtable) reglasValHash.get(interfaceName_);
			claves_.addAll(hashCampos_.keySet());

			Method metodo_ = buscarMetodo("get" + campoOffsetx_.toUpperCase(), class_);
			if (metodo_ != null)
				valorOffsetx_ = (String) invocarMetodo(class_, metodo_, null);

			for (Iterator iter = claves_.iterator(); iter.hasNext();) {
				String campo_ = (String) iter.next();

				reglaVal_ = (String) hashCampos_.get(campo_);
				valor_ = invocarMetodo(class_, buscarMetodo("get" + campo_.toUpperCase(), class_), null);
				List result_ = validarCampo(valor_, reglaVal_, campo_, (String) mensajesHash.get(interfaceName_), class_, valorOffsetx_);
				boolean isVal_ = ((Boolean) result_.get(0)).booleanValue();

				if (!isVal_ && tipoVal_.equals("0"))
					return result_;
				else if (!isVal_ && tipoVal_.equals("1")) {
					esVal_.set(0, new Boolean(false));
					esVal_.add(result_.get(1));
				}
			}
		} else
			LogWriter.getLog().log(LogWriter.WARNING, "NO hay en la Hash valor para el String " + interfaceName_);
		return esVal_;
	}

	private List invocarValidacionxObj(Object pObject) throws ServiceException {
		List esVal_ = new ArrayList();
		esVal_.add(0, new Boolean(true));
		Class clase_ = pObject.getClass();
		Object retObj_ = null;
		Method[] methods_ = clase_.getDeclaredMethods();
		String tipoVal_ = (String) mensajesHash.get("cfg.tipoval");

		for (int i = 0; i < methods_.length; i++) {
			Method method_ = methods_[i];
			String methodName_ = method_.getName();
			if (methodName_.startsWith("get")) {
				retObj_ = invocarMetodo(pObject, method_, null);
				if (retObj_ != null && retObj_ instanceof List) {
					List lst_ = (List) retObj_;
					for (Iterator iter = lst_.iterator(); iter.hasNext();) {
						Object obj_ = (Object) iter.next();
						List validacion_ = validarString(obj_);
						boolean isVal_ = ((Boolean) validacion_.get(0)).booleanValue();
						if (!isVal_ && tipoVal_.equals("0"))
							return validacion_;
						else if (!isVal_ && tipoVal_.equals("1")) {
							esVal_.set(0, new Boolean(isVal_));
							if (validacion_.size()>1)
								esVal_.add(validacion_.get(1));
						} else if (isVal_) {
							llenarVOsTpos(obj_);
						}
					}
				} else if (retObj_ == null) {				
					LogWriter.getLog().log(LogWriter.WARNING, "Objeto nulo obtenido del metodo --> " + methodName_);
					//throw new ServiceException("Exception",  "tx_enlinea.error.objetonulo");
				} else
					LogWriter.getLog().log(LogWriter.WARNING, "Objeto invalido --> " + retObj_ + " obtenido del metodo --> " + methodName_);
			}
		}
		return esVal_;
	}

	private Object invocarMetodo(Object pObject, Method method_, Object[] pArgs) throws ServiceException {

		try {
			if (method_ != null)
				return method_.invoke(pObject, pArgs);
			else {
				LogWriter.getLog().log(LogWriter.WARNING, "[invocarMetodo(...)");
				throw new ServiceException("No es posible invocar metodo :" + null);
			}

		} catch (IllegalArgumentException e) {
			LogWriter.getLog().log(LogWriter.WARNING, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		} catch (IllegalAccessException e) {
			LogWriter.getLog().log(LogWriter.WARNING, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		} catch (InvocationTargetException e) {
			LogWriter.getLog().log(LogWriter.WARNING, "[invocarMetodo(...)", e);
			throw new ServiceException("Exception", e);
		}
	}

	private List validarCampo(Object pValor, String pReglaVal, String pNomCampo, String pString, Object pClase, String pOffsetx) throws ServiceException {
		String mensaje_ = "";
		MensajeError msg_ = new MensajeError_Imp();
		boolean formatoVal_ = false, longVal_ = false;
		List rtaVal = new ArrayList(2);
		rtaVal.add(0, new Boolean(true));
		rtaVal.add(1, mensaje_);
		StringTokenizer tok_ = new StringTokenizer(pReglaVal.trim(), ",");
		int numTok_ = tok_.countTokens();
		String[] reglas_ = new String[numTok_];
		int i = 0;

		while (tok_.hasMoreTokens())
			reglas_[i++] = tok_.nextToken();

		//la posicion 0 del arreglo contiene el formato
		//la posicion 1 del arreglo contiene la longitud
		if (reglas_[0] != null && reglas_[1] != null && pValor != null) {
			formatoVal_ = ValidadorCampo.validarFormato(pValor.toString(), reglas_[0]);
			if (ValidadorCampo.validarFormato(reglas_[1], ValidadorCampo.F_NUMERO + "")) {
				longVal_ = ValidadorCampo.validarLongitud(pValor.toString(), Integer.parseInt(reglas_[1]));

			} else {
				LogWriter.getLog().log(LogWriter.WARNING, "[validarCampo(...)");
				throw new ServiceException("Exception: El valor del formato \"" + reglas_[1] + "es inválido", "tx_enlinea.error.valorlogitudcampo");
			}
			//}

			if (!formatoVal_) {
				msg_.setCodigo((String) mensajesHash.get("validador.formato.error.code"));
				mensaje_ += (String) mensajesHash.get("validador.formato.error") + ": " + pString + "." + pNomCampo + "=" + pValor;
			}

			if (!longVal_) {
				msg_.setCodigo((String) mensajesHash.get("validador.longitud.error.code"));
				mensaje_ += (String) mensajesHash.get("validador.longitud.error") + ": " + pString + "." + pNomCampo + "=" + pValor;
				truncarCampo(pValor, pNomCampo, pClase, reglas_);
			}
			if (!formatoVal_ || !longVal_) {
				msg_.setString(pString);
				msg_.setSubString(pNomCampo);
				msg_.setValor("" + pValor);
				msg_.setDescripcion(mensaje_);
				msg_.setOffsetx(pOffsetx);
			}

			if (!mensaje_.trim().equals(""))
				LogWriter.getLog().log(LogWriter.WARNING, mensaje_ + " Offsetx="+pOffsetx);
				
			rtaVal.set(0, new Boolean(formatoVal_ && longVal_));
			rtaVal.set(1, msg_);

		}
		
		if (pValor == null)
			LogWriter.getLog().log(LogWriter.FINEST," El campo "+pNomCampo + " es nulo.");

		return rtaVal;
	}

	private void truncarCampo(Object pValor, String pNomCampo, Object pClase, String[] reglas_) throws ServiceException {
		Method metSet_ = buscarMetodo("set" + pNomCampo.toUpperCase(), pClase);
		//Class[] tipos_ =  metSet_.getParameterTypes();
		if (pValor != null) {
			Object obj_ = pValor.toString().substring(0, Integer.parseInt(reglas_[1]));
			invocarMetodo(pClase, metSet_, new Object[] { obj_ });
		}

	}

	private Method buscarMetodo(String pMetodo, Object pObject) throws ServiceException {

		Class clase_ = pObject.getClass();

		Object retObj_ = null;
		Method[] methods_ = clase_.getDeclaredMethods();

		for (int i = 0; i < methods_.length; i++) {
			Method method_ = methods_[i];
			String methodName_ = method_.getName();

			if (methodName_.equals(pMetodo))
				return method_;
		}
		LogWriter.getLog().log(LogWriter.INFO, "NO SE ENCONTRO EL METODO:" + pMetodo);
		return null;
	}

	private Object setVOs(Object pObjOrig, Object pObjDest) throws ServiceException {

		String interfaceName_ = getNombreClase(pObjOrig);
		List claves_ = new ArrayList();
		Hashtable hashCampos_ = (Hashtable) reglasValHash.get(interfaceName_);
		claves_.addAll(hashCampos_.keySet());
		for (Iterator iter = claves_.iterator(); iter.hasNext();) {
			String campo_ = (String) iter.next();

			Method metGet_;
			try {

				metGet_ = pObjOrig.getClass().getMethod("get" + campo_.toUpperCase(), null);
				Object valor_ = invocarMetodo(pObjOrig, metGet_, null);

				Method metSet_ = buscarMetodo("set" + campo_.toUpperCase(), pObjDest);
				Object obj_ = null;
				if (metSet_ != null) {
					Class[] tipos_ = metSet_.getParameterTypes();
					obj_ = setValor(tipos_[0], valor_);
					invocarMetodo(pObjDest, metSet_, new Object[] { obj_ });
				}

			} catch (SecurityException e) {
				LogWriter.getLog().log(LogWriter.WARNING, "[setVOs(...)", e);
				throw new ServiceException("Exception", e);
			} catch (NoSuchMethodException e) {
				LogWriter.getLog().log(LogWriter.WARNING, "[setVOs(...)", e);
				throw new ServiceException("Exception", e);
			} catch (ServiceException e) {
				LogWriter.getLog().log(LogWriter.WARNING, "[setVOs(...)", e);
				throw new ServiceException("Exception", e);
			}

		}
		return pObjDest;

	}
	private Object setValor(Class pClase, Object pValor) {
		
		Object arg_ = null;
		try{
	
		if (pValor != null) {
			if (pClase.equals(String.class)) {
				arg_ = (String) pValor;
			} else if (pClase.equals(Double.class)) {
				arg_ = new Double(pValor.toString());
			} else if (pClase.equals(java.math.BigDecimal.class)) {
				arg_ = new java.math.BigDecimal(pValor.toString());
			} else if (pClase.equals(Integer.class)) {
				arg_ = new Integer(pValor.toString());
			} else if (pClase.equals(Float.class)) {
				arg_ = new Float(pValor.toString());
			} else if (pClase.equals(java.sql.Timestamp.class)) {
				String fh_ = (String) pValor;
				java.util.Date date_ = Calendar.getInstance().getTime();
				String year_ = new SimpleDateFormat("yyyy").format(date_).substring(0, 2) + fh_.substring(0, 2);
				String mes_ = fh_.substring(2, 4);
				String dia_ = fh_.substring(4, 6);
				//System.out.println("String timestamp->"+year_ + "-" + mes_ + "-" + dia_+" "+fh_.substring(6,8)+":"+fh_.substring(8,10)+":00");
				if (fh_.length()==6)
					arg_ = java.sql.Timestamp.valueOf(sdfFecha.format(java.sql.Date.valueOf(year_ + "-" + mes_ + "-" + dia_)));
				else
					arg_ = java.sql.Timestamp.valueOf(year_ + "-" + mes_ + "-" + dia_+" "+fh_.substring(6,8)+":"+fh_.substring(8,10)+":00");
				//arg_ = java.sql.Timestamp.valueOf(sdfFecha.format(java.sql.Date.valueOf(year_ + "-" + mes_ + "-" + dia_)));
			}
		}

		}catch(Exception e){
			LogWriter.getLog().log(LogWriter.WARNING, "ERROR al setear valor:" +pValor +" clase:"+pClase, e);
			e.printStackTrace();
		}
		return arg_;
	}

	private void llenarVOsTpos(Object pObj) throws ServiceException {

		Object tpos_ = new Object();
		String nomInterface_ = getNombreClase(pObj).toLowerCase();
		if (nomInterface_.equals("tx_header")) {
			tpos_ = setVOs(pObj, new TPOS_HEADER_Imp());
			transVal.getHeader().add(tpos_);
		} else if (nomInterface_.equals("tx_itementry")) {
			tpos_ = setVOs(pObj, new TPOS_ITEMENTRY_Imp());
			transVal.getItemEntry().add(tpos_);
		} else if (nomInterface_.equals("tx_discount")) {
			tpos_ = setVOs(pObj, new TPOS_DISCOUNT_Imp());
			transVal.getDiscount().add(tpos_);
		} else if (nomInterface_.equals("tx_tender")) {
			tpos_ = setVOs(pObj, new TPOS_TENDER_Imp());
			transVal.getTender().add(tpos_);
		} else if (nomInterface_.equals("tx_tax")) {
			tpos_ = setVOs(pObj, new TPOS_TAX_Imp());
			transVal.getTax().add(tpos_);
		} else if (nomInterface_.equals("tx_manager_override")) {
			tpos_ = setVOs(pObj, new TPOS_MANAGER_OVERRIDE_Imp());
			transVal.getManagerOverride().add(tpos_);
		} else if (nomInterface_.equals("tx_data_entry")) {
			tpos_ = setVOs(pObj, new TPOS_DATA_ENTRY_Imp());
			transVal.getDataEntry().add(tpos_);
		} else if (nomInterface_.equals("tx_price_change")) {
			tpos_ = setVOs(pObj, new TPOS_PRICE_CHANGE_Imp());
			transVal.getPriceChange().add(tpos_);
		} else if (nomInterface_.equals("tx_till_change")) {
			tpos_ = setVOs(pObj, new TPOS_TILL_CHANGE_Imp());
			transVal.getTillChange().add(tpos_);
		} else if (nomInterface_.equals("tx_item_record_change")) {
			tpos_ = setVOs(pObj, new TPOS_ITEM_RECORD_CHANGE_Imp());
			transVal.getItemRecordChange().add(tpos_);
		} else if (nomInterface_.equals("tx_trading_stamps")) {
			tpos_ = setVOs(pObj, new TPOS_TRADING_STAMPS_Imp());
			transVal.getTradingStamps().add(tpos_);
		} else if (nomInterface_.equals("tx_exception_log")) {
			tpos_ = setVOs(pObj, new TPOS_EXCEPTION_LOG_Imp());
			transVal.getExceptionLog().add(tpos_);
		} else if (nomInterface_.equals("tx_store_closing")) {
			tpos_ = setVOs(pObj, new TPOS_STORE_CLOSING_Imp());
			transVal.getStoreClosig().add(tpos_);
		} else if (nomInterface_.equals("tx_operator_training")) {
			tpos_ = setVOs(pObj, new TPOS_OPERATOR_TRAINING_Imp());
			transVal.getOperatorTraining().add(tpos_);
		} else if (nomInterface_.equals("tx_user_data")) {
			tpos_ = setVOs(pObj, new TPOS_USER_DATA_Imp());
			transVal.getUserData().add(tpos_);
		}

	}
	/**
	 * @return
	 */
	public TRANSACCION getTrans() {
		return transVal;
	}

}
