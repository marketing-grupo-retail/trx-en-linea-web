/*
 * Proyecto: VisaWeb
 * 
 * Copyriht (C) 2003-2004 Asic S.A. Bogot�, Colombia.
 * All riths Reserved.
 * 
 * Id:
 * 
 */
package com.asic.framework.actions;

/**
 * @author LuisL
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generaci�n de c�digo&gt;C�digo y comentarios
 */
public class InputDataValidator {
	
	/**
	 * Verifica si el string es nulo.
	 * @param string
	 * @return
	 */
	public static boolean isNull(String string){
		
		if (string == null || string.trim().length()==0)
			return true;
		return false;
	} 


	/**
	 * Verifica si el string es num�rico entero.
	 * @param string
	 * @return
	 */
	public static boolean isInteger(String string){
		try{
			new Integer(string);
			return true;
		}catch(Exception e)
		{
			return false;
		}
		
	} 
	
	/**
	 * 
	 * @author Pedro
	 *
	 * Convierte un String de fecha en formato YYYYMMDD a un Strin en formato YYYY-MM-DD 
	 */
	public static String convertYYYYMMDD(String fecha)
	{
		String result = null;
		result = fecha.substring(0,4)+"-"+fecha.substring(4,6)+"-"+fecha.substring(6,8);
		return result;
	} 	
		
}
