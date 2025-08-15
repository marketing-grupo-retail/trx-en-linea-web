/*
 * Proyecto: VisaPagos
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: ValidadorCampo.java,v 1.1 2019/12/18 17:08:59 Alfonso Exp $
 *
 */
package com.asic.transacciones.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Implementacion ValidadorCampo
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class ValidadorCampo {
	protected final static int RQ_OBLIGATORIO = 1;
	protected final static int RQ_OPCIONAL = 2;
	protected final static int RQ_OBLIG_DOMICL = 3;
	public final static char F_NUMERO = 'N';
	public final static char F_ALF_NUM = 'L';
	public final static char F_BLANCO = 'B';
	public final static char F_ALFABETICO = 'A';
	public final static char F_NUM_SIGNO = 'S';
	public final static char F_FECHA = 'F';
	public final static char F_TODOS_CARACT = 'C';
	

	public static boolean validarFormato(String pValor, String pFormato) {
		boolean formValido_ = false;
	
		char opForm_ =pFormato.toCharArray()[0];

		switch (opForm_) {
			case F_NUMERO :
				formValido_ = ValidadorFormato.esNumero(pValor);
				break;
			case F_ALF_NUM :
				formValido_ = ValidadorFormato.esAlfanumerico(pValor.trim());
				break;
			case F_BLANCO :
				formValido_ = ValidadorFormato.esBlanco(pValor);
				break;
			case F_ALFABETICO :
				formValido_ = ValidadorFormato.esAlfabeticoEspacios(pValor);
				break;
			case F_NUM_SIGNO :
				formValido_ = ValidadorFormato.esNumeroConSigno(pValor);
				break;
			case F_FECHA :
				formValido_ = ValidadorFormato.esNumero(pValor)&& ValidadorCampo.validarFecha(pValor);
				break;
			case F_TODOS_CARACT :
				formValido_ = true;
				break;
		}
		return formValido_;

	}
	
	public static boolean validarLongitud(String pValor, int pLong) {
		
		if(pValor.length()<= pLong)
			return true;
		return false;
	}
/*
	protected boolean validarValor(String pValor, Short pCampo, int tipoReg) {

		String[] valores = (String[]) ValoresValidos.obtenerValoresRegistro(tipoReg, pCampo.toString());
		boolean valido = false;

		if (valores != null )
			if (valores[0].equals("AAAAMMDD")) {
				return validarFecha(pValor);
			} else if (valores[0].equals("HHMM")) {
				return validarHora(pValor);
			} else {
				for (int i = 0; i < valores.length; i++) {
					if (pValor.equals(valores[i]))
						return true;
				}
			}
		else
			valido = true;

		return valido;

	}
*/
	protected boolean validarRequisito(String pValor, String pReq, String pFto) {

		if (Integer.parseInt(pReq) == RQ_OBLIGATORIO && Integer.parseInt(pFto) == F_NUMERO)
			return (pValor.trim().length() != 0 && Long.parseLong(pValor) != 0);
		if (Integer.parseInt(pReq) == RQ_OBLIGATORIO && Integer.parseInt(pFto) == F_ALF_NUM)
			return pValor.trim().length() != 0;
		if (Integer.parseInt(pReq) == RQ_OBLIGATORIO && Integer.parseInt(pFto) == F_ALFABETICO)
			return pValor.trim().length() != 0;

		return true;

	}
	
	protected boolean validarRequisitoFact(String pValor, String pReq, String pFto) {

//			if ((Integer.parseInt(pReq) == RQ_OBLIGATORIO || Integer.parseInt(pReq) == RQ_OBLIG_DOMICL) && Integer.parseInt(pFto) == F_NUMERO)
//				return (pValor.trim().length() != 0 && Long.parseLong(pValor) != 0);
			if ((Integer.parseInt(pReq) == RQ_OBLIGATORIO || Integer.parseInt(pReq) == RQ_OBLIG_DOMICL) && Integer.parseInt(pFto) == F_ALF_NUM)
				return pValor.trim().length() != 0;
			if ((Integer.parseInt(pReq) == RQ_OBLIGATORIO || Integer.parseInt(pReq) == RQ_OBLIG_DOMICL)&& Integer.parseInt(pFto) == F_ALFABETICO)
				return pValor.trim().length() != 0;

			return true;

		}

	public static boolean validarFecha(String pValor) {

		boolean valido = false;
		int month_,year_,day_;
		Calendar c = Calendar.getInstance();
	

		/*if (pValor.length() == 8) {
			int year_ = Integer.parseInt(pValor.substring(0, 4));
			int day_ = Integer.parseInt(pValor.substring(6, 8));
			month_ = Integer.parseInt(pValor.substring(4, 6));
			if ((month_ <= 12 && month_ > 0) && (day_ <= 31 && day_ > 0)) 
				valido = validarBisiesto(year_, month_, day_);
		}*/
		SimpleDateFormat sdfFecha = new SimpleDateFormat("yyyy");
		if (pValor.length() == 6) {
			java.util.Date date_ =Calendar.getInstance().getTime();
			String yy_ = sdfFecha.format(date_).substring(0,2)+pValor.substring(0, 2);
		
			year_ = Integer.parseInt(yy_);
			month_ = Integer.parseInt(pValor.substring(2, 4));
			day_ = Integer.parseInt(pValor.substring(4, 6));
			if ((month_ <= 12 && month_ > 0) && (day_ <= 31 && day_ > 0))
				valido =  validarBisiesto(year_, month_, day_);
		}
		/*if (pValor.length() == 4) {
			month_ = Integer.parseInt(pValor.substring(0, 2));
			if ((month_ <= 12 && month_ > 0))
				valido = true;
		}*/
		return valido;
	}

	private boolean validarHora(String pValor) {

		Calendar c = Calendar.getInstance();
		int hora = Integer.parseInt(pValor.substring(0, 2));
		int minutos = Integer.parseInt(pValor.substring(2, 4));
		if (hora > 24 || hora < 1)
			return false;
		if (minutos > 59 || minutos < 0)
			return false;
		return true;

	}

	protected boolean verificarmaxFechaFact(String pValor) {

		Date fhFact_ = java.sql.Date.valueOf(pValor.substring(0, 4) + "-" + pValor.substring(4, 6) + "-" + pValor.substring(6, 8));
		//voEncabezado.setFULL_ENC_FEC_FACT(fhFact_);
		Date fhActual = java.sql.Date.valueOf(new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()));
		Calendar c = Calendar.getInstance();
		c.setTime(fhFact_);
		//int mesFact = c.get(Calendar.MONTH);
		//int mesAct = Calendar.getInstance().get(Calendar.MONTH);
		//return mesFact - mesAct <= 3 ? true : false;
		return fhFact_.before(fhActual) || fhFact_.equals(fhActual);

	}

	/**
	 * 
	 * Rellena con cero la cadena para completar la longitud deseada.
	 * 
	 * @param pValor
	 * @param pLong
	 * @param pAlinea 0 para alinear a la izq y 1 a la derecha
	 * @return
	 */
	public static String aplicarPadding(String pValor, int pLong, int pAlinea, String pCaracter) {
		String padding = new String();
		for (int i = 0; i < pLong - pValor.length(); i++)
			padding += pCaracter;
		if (pAlinea == 0)
			pValor = padding + pValor;
		if (pAlinea == 1)
			pValor += padding;

		return pValor;
	}

	/**
	 * 
	 * eliminar ceros
	 * 
	 * @param pValor
	 * @param pLong
	 * @param pAlinea
	 * @param pCaracter
	 * @return String
	 */
	public static String eliminarPadding(String pValor, int pAlinea, char pCaracter) {
		String padding = new String();
		char car;
		if (pAlinea == 1)
			for (int i = 0; i < pValor.length(); i++) {
				car = pValor.charAt(i);
				if (car != pCaracter) {
					pValor = pValor.substring(i, pValor.length());
					break;
				}

			}
		return pValor;
	}

	public static boolean validarBisiesto(int pYear, int pMonth, int pDay) {
		GregorianCalendar cl = new GregorianCalendar();
		int days_;

		Calendar cal = new GregorianCalendar(pYear, pMonth-1, 1);
		days_ = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		if (pDay > days_)
			return false;

		return true;

	}

}
