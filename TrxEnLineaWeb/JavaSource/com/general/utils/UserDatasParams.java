/*
 * Created on 27/07/2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.general.utils;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import com.asic.utils.locator.ResourceLocator;

/**
 * @author COMFANDI
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class UserDatasParams {
	
		public static final String KEY_FIELDS_ID		= "KEY_FIELDS";       // Vigencia en días del subsidio
		public static final String ID_MAX_SUBSIDIO		= "MAX_SUBSIDIO";	// Valor Máximo de subsidio a pagar por este medio
		public static final String ID_CONCIL_TIMEOUT	= "CONCIL_TIMEOUT";	// Timeout en minutos que se puede dejar un proceso de conciliación para permitir otros sobre la misma tienda.
		public static final String ID_SYSTEM_INIT_DATE	= "SYSTEM_INIT_DATE";	// Fecha inicial del sistema
		public static final String ID_REPETITIONS_NUMBER= "REPETITIONS_NUMBER";	// Número de intentos para hacer un requerimiento a una DB
		// Estados de los documentos(subsidios Comfandi) - PROYECTO: PAGO ELECTRONIO COMFANDI 
		public static final String ID_DOC_EMITED_STATUS	= "DOC_EMITED_STATUS";
		public static final String ID_DOC_PAYED_STATUS	= "DOC_PAYED_STATUS";
		public static final String ID_DOC_BLOQ_STATUS	= "DOC_BLOQ_STATUS";
		public static final String ID_DB_USER			= "DB_USER";
		public static final String ID_ST_COB			= "ST_COB";
		// Estados de las credenciales (documentos para cobro de subsidio Comfandi)  - PROYECTO: PAGO ELECTRONIO COMFANDI		
		public static final String ID_CRED_DELIVERED_STATUS						= "CRED_DELIVERED_STATUS";
		public static final String ID_CRED_CANCELED_STATUS						= "CRED_CANCELED_STATUS";
		public static final String ID_BLOOD_RELATIONSHIP_WORKER_STATUS			= "BLOOD_RELATIONSHIP_WORKER_STATUS";
		public static final String ID_BLOOD_RELATIONSHIP_THIRD_PART_STATUS		= "BLOOD_RELATIONSHIP_THIRD_PART_STATUS";
		//	Tipo de documentos de pago - PROYECTO: PAGO ELECTRONIO COMFANDI
		public static final String ID_BON_DOC_PAYMENT_TYPE	= "BONO_DOC_PYMT_TYPE"; //Tipo de documento "BONO"		
	
		// Parámetros varios
		public static final String ID_PAR_CENTURY								= "PAR_CENTURY";//Siglo		
		
		protected static Hashtable aHashBusinessLogicParams;
		public static final String BUSINESSSETTINGS_FILENAME = "UserDatas";

		private String aName;
		private Object aValue;
	
		public UserDatasParams() {
		}
	
		public UserDatasParams(String pName,String pValue) {
			setName(pName);
			setValue(pValue);
		}

		/**
		 * @return
		 */
		public String getName() {
			return aName;
		}
		
				/**
				 * @return
				 */
		public Object getValue() {
			return aValue;
		}
		
		/**
		 * @param string
		 */
		public void setName(String string) {
			aName = string;
		}
		
		/**
		 * @param string
		*/
		public void setValue(String string) {
			aValue = string;
		}

		public static Object getUserDataParam(String pIdParam) {
			try{
				Hashtable hash_ = getHashBusinessLogicParams();
				Object answerParam_=null;
				if (hash_ != null) {
					answerParam_=(Object)hash_.get(pIdParam);
				}
				if (answerParam_ == null) {
					loadBusinessParam(pIdParam);
					answerParam_=(Object)getHashBusinessLogicParams().get(pIdParam);
				}
				/*if (answerParam_ == null) {	
					return new UserDatasParams("PAR_NO_FOUND","XX");
				} else {*/
					return answerParam_;
				//}
			}catch(Exception e){		
				//return new UserDatasParams("PAR_NO_FOUND","XX");
				return null;
			}
		}

		public static Hashtable getHashBusinessLogicParams() {
	
			return aHashBusinessLogicParams;
		}
		
		private static void loadBusinessParam(String pParamId) {
			/*aHashBusinessLogicParams = new Hashtable();
			
			String sentencia_ = "SELECT " +
				ParametrosWas.DB_COLUM_BLP_NAME+", "+
				ParametrosWas.DB_COLUM_BLP_VALUE+" "+ 
				"FROM "+
				ParametrosWas.DB_TABLA_BUSINESS_LOGIC_PARAMS; 
			
			Vector vector_ = SqlUtils.consultaTabla(
				sentencia_,
				Handler.getCnxClassName(),
				Handler.getCnxUrl(),
				Handler.getCnxUserID(),
				Handler.getCnxPassword()
			);
			
			for (Enumeration enum_ = vector_.elements() ; enum_.hasMoreElements() ;) {
				Vector row_ = (Vector)enum_.nextElement();
				String id_ = ((String)row_.elementAt(0)).trim();
				BusinessLogicParam param_ = new BusinessLogicParam(
					id_,
					(String)row_.elementAt(1)
				);
				aHashBusinessLogicParams.put(id_,param_);
			}*/
			String paramValue_=null;										   	
			UserDatasParams param_=null; 
			try {
				ResourceBundle bundle_ = ResourceLocator.get(BUSINESSSETTINGS_FILENAME);
				paramValue_ = bundle_.getString(pParamId);
				if (aHashBusinessLogicParams==null)
					aHashBusinessLogicParams = new Hashtable();
				if (pParamId.startsWith("UDD") && paramValue_!=null){
					paramValue_ = paramValue_.trim();
					StringTokenizer tokenizer_ = new StringTokenizer(paramValue_,":");
					if (tokenizer_.countTokens()>0){
						List array_ = new ArrayList(); 
						while (tokenizer_.hasMoreElements()){
							String temp_ = (String)tokenizer_.nextElement();
							array_.add(temp_);
						}	
						aHashBusinessLogicParams.put(pParamId,array_);
					}else
						aHashBusinessLogicParams.put(pParamId,null);
				}else{
					if (paramValue_!=null)
						paramValue_ = paramValue_.trim();
					aHashBusinessLogicParams.put(pParamId,paramValue_);
				}
					
				/*param_=new UserDatasParams();
				param_.setName(pParamId);
				param_.setValue(paramValue_.trim());		
				aHashBusinessLogicParams.put(pParamId,param_);
				aHashBusinessLogicParams.put(pParamId,param_);
				aHashBusinessLogicParams.put(pParamId,param_);*/
			}catch (NoSuchElementException ex1){
				System.out.println ("Elemento no definido correctamente en el archivo de parametros de negocio ");
				ex1.printStackTrace();
			}catch (Exception ex)  {
				System.out.println("ERROR: Parameter "+pParamId+" not properly defined in parameters file..." + ex);
			}		
		}			
		
}

