/*
 * Creado el 8/11/2005
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.trxonline.tramas.SodimacVOs;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.transacciones.vo.TX_USER_DATA;
import com.asic.trxonline.sma.strings.UserDataReservedString;
import com.general.utils.KeyedFileUtils;
import com.general.utils.StringFormatter;
import com.general.utils.UserDatasParams;


public class SodUserDataReservedTrama extends UserDataReservedString {
	public static final String USER_DATA_IVA="22082002";
	public static final String USER_DATA_2="50";
	public static final String USER_DATA_3="00";
	public static final String USER_DATA_4="06052003";
	public static final String USER_DATA_5="20021116";
	public static final String USER_DATA_6="15";
	public static final String USER_DATA_7="53"; //CMR
	public static final String USER_DATA_8="24062004"; // Cargo bono devolución
	public static final String USER_DATA_9="08072002";
	public static final String USER_DATA_10="20030131";
	public static final String USER_DATA_11="20041023";
	public static final String USER_DATA_12="25062004"; // Reverso bono devolución
	public static final String USER_DATA_13="14";// Venta institucional
	public static final String USER_DATA_14="18";// Venta institucional
	private List dataTypes; // Guarda la configuración de tipos de datos de los strings
	public static String keyFields = null; // Indica si la clave del string es el primero(1) el primero y segundo datos del string(2)
	
	/*public static final int[][] PARSE_ARRAY = {
		{1,TYPE_PACKED},	// type

		{1,TYPE_PACKED},	// Tipo String
		{1,TYPE_CHARACTER},// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		{1,TYPE_CHARACTER},	// user-defined data
		
	};	*/

	/*public static int [][] getPARSE_ARRAY(){
		return PARSE_ARRAY;
	}*/

	private TX_USER_DATA stringRecord;
	
	public SodUserDataReservedTrama(String pRecord) {
		super(pRecord,new int [][] {{1,TYPE_PACKED},{0,TYPE_PACKED},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},
		{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},
		{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},
		{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},{0,TYPE_CHARACTER},
		{0,TYPE_CHARACTER} });
		//if (UserDatasParams.getUserDataParam(UserDatasParams.KEY_FIELDS_ID)!=null){
			if (keyFields==null){
				keyFields = (String)UserDatasParams.getUserDataParam(UserDatasParams.KEY_FIELDS_ID);
				if (keyFields==null)
					keyFields = "1";
			}
			if (keyFields.equals("1")){
				String strKey_ = "UDD"+getInfo(1);
				if (UserDatasParams.getUserDataParam(strKey_)!=null){
					dataTypes = (List)UserDatasParams.getUserDataParam(strKey_);
				}
			}else if (keyFields.equals("0")){
				String strKey_ = "UDD"+getInfo(1)+KeyedFileUtils.unPack2(getInfo(2));
				if (UserDatasParams.getUserDataParam(strKey_)!=null){
					dataTypes = (List)UserDatasParams.getUserDataParam(strKey_);
				}					
			}
		//}	
	}

	public void fillData() throws ServiceException {
			stringRecord = (TX_USER_DATA) ServiceLocator.getVO(TX_USER_DATA.class);
			Class clase_ = stringRecord.getClass();
			Object retObj_ = null;
			Field[] fields_ = clase_.getDeclaredFields();

			for (int i = 0; i < fields_.length; i++) {
				Field fd_ = fields_[i];
				String fdName_ = fd_.getName();

				if (fdName_.startsWith("_") && !fdName_.equals("_ID_RECHAZO")) {
					try {
						String retorno_ = (String) invocarMetodo(this, "get" + fdName_.substring(1), new Class[] {
						}, null);
						invocarMetodo(stringRecord, "set" + fdName_.substring(1), new Class[] { String.class }, new Object[] { retorno_ });
					} catch (ServiceException e) {
						LogWriter.getLog().log(LogWriter.FINEST, "[fillData(...), Metodo set/get no hallado para el atributo :" + fdName_, e);
						//throw new ServiceException("Exception", e);
					}
				}
			}

		}

		private Object invocarMetodo(Object pObject, String pMetodo, Class[] pParametros, Object[] pObjetos) throws ServiceException {

			try {
				Method method_ = pObject.getClass().getMethod(pMetodo, pParametros);
				return method_.invoke(pObject, pObjetos);

			} catch (IllegalArgumentException e) {
				LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
				throw new ServiceException("Exception", e);
			} catch (SecurityException e) {
				LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
				throw new ServiceException("Exception", e);
			} catch (NoSuchMethodException e) {
				LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
				throw new ServiceException("Exception", e);
			} catch (IllegalAccessException e) {
				LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
				throw new ServiceException("Exception", e);
			} catch (InvocationTargetException e) {
				LogWriter.getLog().log(LogWriter.FINEST, "[invocarMetodo(...)", e);
				throw new ServiceException("Exception", e);
			}
		}


	/**
	 * @return
	 */
	public TX_USER_DATA getStringRecord() {
		return stringRecord;
	}
	
	public String getData1(){
		return getInfo(1);
	}

	/*public String getData2(){
		if (getData1().equals(USER_DATA_IVA))
			return getUserDataIva();
		else if (getData1().equals(USER_DATA_2))
			return getUserData2();
		else if (getData1().equals(USER_DATA_3))
			return getUserData3();
		else if (getData1().equals(USER_DATA_4))
			return getUserData4();
		else if (getData1().equals(USER_DATA_5))
			return getUserData5();
		else if (getData1().equals(USER_DATA_6))
			return getUserData6();
		else if (getData1().equals(USER_DATA_7))
			return getUserData7();
		else if (getData1().equals(USER_DATA_8))
			return getUserData8();
		else if (getData1().equals(USER_DATA_9))
			return getUserData9();
		else if (getData1().equals(USER_DATA_10))
			return getUserData10();
		else if (getData1().equals(USER_DATA_11))
			return getUserData11();
		else if (getData1().equals(USER_DATA_12))
			return getUserData12();
		else if (getData1().equals(USER_DATA_13))
			return getUserData13();			
		else if (getData1().equals(USER_DATA_14))
			return getUserData14();			
		else	
			return getInfo(2);
	}*/	

	public String getData3(){
		return getInfo(3);
	}

	/*public String getData4(){
		return getInfo(4);
	}*/	

	public String getUserDataIva(){
		String answer_="";
			answer_=StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2)),12,'0',0,12)+","+
					KeyedFileUtils.unPack2(getInfo(3));
		return answer_;
	}
	
	public String getUserData2(){
		String answer_="";
		//System.out.println("pCadena->"+pCadena);
		//for(StringTokenizer t1 = new StringTokenizer(pCadena,":");t1.hasMoreTokens();){
			answer_=getInfo(2)+","+getInfo(3)+","+getInfo(4)+","+getInfo(5)+","+getInfo(6)+","+getInfo(7)+","+getInfo(8);
			
		//}	
		return answer_;
	}
	
	public String getUserData3(){
		String answer_="";
		//System.out.println("pCadena->"+pCadena);
		//for(StringTokenizer t1 = new StringTokenizer(pCadena,":");t1.hasMoreTokens();){
			answer_=getInfo(2).substring(0,6)+StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2).substring(6)),16,'0',0,16);
			
		//}	
		return answer_;
	}	

	public String getUserData4(){
		String answer_="";
		//System.out.println("pCadena->"+pCadena);
		//for(StringTokenizer t1 = new StringTokenizer(pCadena,":");t1.hasMoreTokens();){
			answer_=StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2)),12,'0',0,12)+","+
			StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(3)),10,'0',0,10)+","+
			StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(4)),8,'0',0,8);
			
		//}	
		return answer_;
	}

	public String getUserData5(){
		String answer_="";
		answer_=KeyedFileUtils.unPack2(getInfo(2))+","+
		StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(3)),8,'0',0,8);
		return answer_;
	}

	public String getUserData6(){
		String answer_="";
		answer_=KeyedFileUtils.unPack2(getInfo(2))+","+
		        KeyedFileUtils.unPack2(getInfo(3))+","+
				KeyedFileUtils.unPack2(getInfo(4));
		return answer_;
	}

	public String getUserData7(){
		String answer_="";
		answer_=getInfo(2)+","+
				getInfo(3)+","+
				getInfo(4);
		return answer_;
	}

	public String getUserData8(){
		String answer_="";
		answer_=StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2)),18,'0',0,18)+","+
		        KeyedFileUtils.unPack2(getInfo(3))+","+
				KeyedFileUtils.unPack2(getInfo(4))+","+
				KeyedFileUtils.unPack2(getInfo(5))+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(6)),12,'0',0,12)+","+
				KeyedFileUtils.unPack2(getInfo(7))+","+
				KeyedFileUtils.unPack2(getInfo(8))+","+
				KeyedFileUtils.unPack2(getInfo(9))+","+
				StringFormatter.align(KeyedFileUtils.unPack2(getInfo(10)),10,'0',0,10)+","+
				StringFormatter.align(KeyedFileUtils.unPack2(getInfo(11)),8,'0',0,8)+","+
				StringFormatter.align(KeyedFileUtils.unPack2(getInfo(12)),12,'0',0,12);		
		return answer_;
	}	

	public String getUserData9(){
		String answer_="";
		answer_=StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2)),10,'0',0,10)+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(3)),8,'0',0,8)+","+
				KeyedFileUtils.unPack2(getInfo(4))+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(5)),8,'0',0,8)+","+
				KeyedFileUtils.unPack2(getInfo(6));		
		return answer_;
	}

	public String getUserData10(){
		String answer_="";
		answer_=StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2)),8,'0',0,8)+","+
				KeyedFileUtils.unPack2(getInfo(3))+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(4)),8,'0',0,8)+","+
				KeyedFileUtils.unPack2(getInfo(5))+","+
				KeyedFileUtils.unPack2(getInfo(6))+","+
				KeyedFileUtils.unPack2(getInfo(7))+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(8)),8,'0',0,8);		
		return answer_;
	}	

	public String getUserData11(){
		String answer_="";
		answer_=StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2)),12,'0',0,12);		
		return answer_;
	}

	public String getUserData12(){
		String answer_="";
		answer_=StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2)),18,'0',0,18)+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(3)),6,'0',0,6)+","+
				KeyedFileUtils.unPack2(getInfo(4))+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(5)),12,'0',0,12)+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(6)),6,'0',0,6)+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(7)),4,'0',0,4)+","+
				KeyedFileUtils.unPack2(getInfo(8))+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(9)),10,'0',0,10)+","+
				StringFormatter.align(KeyedFileUtils.unPack2(getInfo(10)),8,'0',0,8)+","+
				StringFormatter.align(KeyedFileUtils.unPack2(getInfo(11)),12,'0',0,12);
		
		return answer_;
	}

	public String getUserData13(){
		String answer_="";
		answer_=StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(2)),10,'0',0,10)+","+
				KeyedFileUtils.unPack2(getInfo(3))+","+
				StringFormatter.align(""+KeyedFileUtils.unPack2(getInfo(4)),10,'0',0,10)+","+
				KeyedFileUtils.unPack2(getInfo(5))+","+
				KeyedFileUtils.unPack2(getInfo(6))+","+
				KeyedFileUtils.unPack2(getInfo(7));
		return answer_;
	}

	public String getUserData14(){
		String answer_="";
		answer_=KeyedFileUtils.unPack2(getInfo(2))+","+
				KeyedFileUtils.unPack2(getInfo(3))+","+
				KeyedFileUtils.unPack2(getInfo(4))+","+
				KeyedFileUtils.unPack2(getInfo(5))+","+
				KeyedFileUtils.unPack2(getInfo(6))+","+
				KeyedFileUtils.unPack2(getInfo(7))+","+
				KeyedFileUtils.unPack2(getInfo(8))+","+
				KeyedFileUtils.unPack2(getInfo(9))+","+
				KeyedFileUtils.unPack2(getInfo(10))+","+
				KeyedFileUtils.unPack2(getInfo(11))+","+
				"00"+","+
				"00";
				
		return answer_;
	}
	

	public String getData2(){
		String answer_="";
			answer_=getDATA1()+","+
					getDATA2()+","+
					getDATA3()+","+
					getDATA4()+","+
					getDATA5()+","+
					getDATA6()+","+
					getDATA7()+","+
					getDATA8()+","+
					getDATA9()+","+
					getDATA10()+","+
					getDATA11()+","+
					getDATA12();
					if (getData1().equals(USER_DATA_7))
						answer_+=","+getDATA13();/*+","+
					getDATA13()+","+
					getDATA14()+","+
					getDATA15()+","+
					getDATA16()+","+
					getDATA17()+","+
					getDATA18()+","+
					getDATA19()+","+
					getDATA20();*/
		return answer_;
	}
	
	public String getTYPE(){
		//return getInfo(1);
		return "00";
	}	

	public String getDATA1(){
		String answer_="00";
		int pos_ = 1;
		if (getInfo(pos_)!=null && getInfo(pos_).length()>1024)
			return getInfo(pos_).substring(0,1024);	
		return getInfo(pos_);

	}

	public String getDATA2(){
		int pos_ = 2;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>1024)
			return getDATA(pos_).substring(0,1024);			
		return getDATA(2); 
	}
	
	public String getDATA(int pPOS){
		String answer_="";
		//int pos_ = 2;
		if (dataTypes!=null && dataTypes.size()>=pPOS){
			if (getInfo(pPOS)!=null && !getInfo(pPOS).equals("")){
				//System.out.println("getInfo(pPOS).length()->"+getInfo(pPOS).length());
				if (((String)dataTypes.get(pPOS-1)).equals("PD")){
					return KeyedFileUtils.unPack2(getInfo(pPOS));
				}else 
					return getInfo(pPOS);
			}		
		}else{
			if (getInfo(pPOS)!=null && !getInfo(pPOS).equals("")){
				//System.out.println("getInfo(pPOS).length()->"+getInfo(pPOS).length());	
				if (isStringData(getInfo(pPOS)))
					return getInfo(pPOS);
				else
					return KeyedFileUtils.unPack2(getInfo(pPOS));
			}			
		}
		return answer_;	
	}
	
	public String getDATA3(){
		int pos_ = 3;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(3);
	}	

	public String getDATA4(){
		int pos_ = 4;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(4);
	}
	
	public String getDATA5(){
		int pos_ = 5;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(5);
	}	

	public String getDATA6(){
		int pos_ = 6;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(6);
	}

	public String getDATA7(){
		int pos_ = 7;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(7);
	}
	
	public String getDATA8(){
		int pos_ = 8;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(8);
	}	
	
	public String getDATA9(){
		int pos_ = 9;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(9);
	}
	
	public String getDATA10(){
		int pos_ = 10;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(10);
	}	
	
	public String getDATA11(){
		int pos_ = 11;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(11);
	}	
	
	public String getDATA12(){
		int pos_ = 12;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(12);
	}	
	
	public String getDATA13(){
		int pos_ = 13;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(13);
	}	
	
	public String getDATA14(){
		int pos_ = 14;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(14);
	}	
	
	public String getDATA15(){
		int pos_ = 15;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(15);
	}	
	
	public String getDATA16(){
		int pos_ = 16;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(16);
	}	
	
	public String getDATA17(){
		int pos_ = 17;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(17);
	}	
	
	public String getDATA18(){
		int pos_ = 18;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(18);
	}	
	
	public String getDATA19(){
		int pos_ = 19;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(19);
	}	
	
	public String getDATA20(){
		int pos_ = 20;
		if (getDATA(pos_)!=null && getDATA(pos_).length()>150)
			return getDATA(pos_).substring(0,150);		
		return getDATA(20);
	}	
	
	static boolean isStringData(String pData){
		boolean answer_ = false;
		int count_ = 0;
		//int count2_ = 0;
		try{
			if (pData.length()>4){
				for (int i=0;i<pData.length();i++){
					if (isAlphaNumeric(pData.charAt(i)))
						count_++;
				}
				/*pData = KeyedFileUtils.unPack2(pData);
				char c_;
				for (int j=0;j<(pData.length()-1);j=j+2){
					System.out.println(pData.substring(j,j+2));
					c_ = (char)Integer.parseInt(pData.substring(j,j+2));
					if (isAlphaNumeric(c_))
						count2_++;						
				}
				System.out.println(count2_);*/
				int percen_ = count_*100/pData.length();
				if (percen_>=90)
					return true;
				/*if (pData.length()>10 && pData.length()<=50 && percen_>=40)
					return true;
				if (pData.length()>50 && pData.length()<=100 && percen_>=30)
					return true;					
				if (pData.length()>100 && percen_>=25)
					return true;*/
			}	
		}catch (Exception e){
			e.printStackTrace();	
		}
		return answer_;
	}	
	
	static boolean isAlphaNumeric(char pChar){
		//System.out.println(pChar+1);
		if (pChar>=48 && pChar<=57) // Números
			return true;
		if (pChar>=65 && pChar<=90) // Letras mayúsculas
			return true;			
		if (pChar>=97 && pChar<=122) // Letras minúsculas
			return true;
		if (pChar==32) // Espacio
			return true;			
		if (pChar==193)
			return true;
		if (pChar==201)
			return true;
		if (pChar=='á'||pChar=='é'||pChar=='í'||pChar=='ó'||pChar=='ú') // Í
			return true;
		if (pChar=='Á'||pChar=='É'||pChar=='Í'||pChar=='Ó'||pChar=='Ú') // Í
			return true;
		return false;	
	}	
	
}
