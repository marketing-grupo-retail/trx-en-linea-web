/*
 * Proyecto: VisaPagos
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 *
 * $Id: ValidadorFormato.java,v 1.1 2019/12/18 17:09:00 Alfonso Exp $
 *
 */
package com.asic.transacciones.util;

/**
 * Implementacion ValidadorFormato
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class ValidadorFormato {

	private final static Character PUNTO = new Character('.');
	private final static Character GUION = new Character('-');
	private final static Character GUION_PISO = new Character('_');
	private final static Character ARROBA = new Character('@');
	private final static Character PAR_ABIERTO = new Character('(');
	private final static Character PAR_CERRADO = new Character(')');

	public static boolean esNumero(String pValor) {

		for (int i = 0; i < pValor.length(); i++) {
			if (!Character.isDigit(pValor.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean esNumeroConSigno(String pValor) {

		for (int i = 0; i < pValor.length(); i++) {
			if (pValor.charAt(i) != '0') {
				if (GUION.charValue() == pValor.charAt(i))
					return esNumero(pValor.substring(i+1, pValor.length()));
				else
					return esNumero(pValor);
			}
		}
		return true;
	}

	/**
	 * 
	 *Determina si es letra(A-Z,a-z), es digito o caracteres:'.','-','@','(',')','_'.
	 *Acepta Espacios. 
	 * @param pValor
	 * @return
	 */
	public static boolean esAlfanumerico(String pValor) {

		for (int i = 0; i < pValor.length(); i++) {
			if (!Character.isLetterOrDigit(pValor.charAt(i))
				&& !(PUNTO.charValue() == pValor.charAt(i))
				&& !(GUION.charValue() == pValor.charAt(i))
				&& !Character.isWhitespace(pValor.charAt(i))
				&& !(ARROBA.charValue() == pValor.charAt(i))
				&& !(PAR_ABIERTO.charValue() == pValor.charAt(i))
				&& !(PAR_CERRADO.charValue() == pValor.charAt(i))
				&& !(GUION_PISO.charValue() == pValor.charAt(i)))
				return false;
		}
		return true;
	}

	/**
	 * 
	 * Valida si es una letra.
	 * 
	 * @param pValor
	 * @return
	 */
	public static boolean esAlfabetico(String pValor) {

		for (int i = 0; i < pValor.length(); i++) {
			if (!Character.isLetter(pValor.charAt(i)))
				return false;
		}
		return true;
	}

	/**
	 * 
	 * Valida si es una letra o es espacio en blanco.
	 * 
	 * @param pValor
	 * @return
	 */
	public static boolean esAlfabeticoEspacios(String pValor) {

		for (int i = 0; i < pValor.length(); i++) {
			if (!Character.isLetter(pValor.charAt(i)) && !Character.isWhitespace(pValor.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean esBlanco(String pValor) {

		for (int i = 0; i < pValor.length(); i++) {
			if (!Character.isWhitespace(pValor.charAt(i)))
				return false;
		}
		return true;
	}

	public static boolean esLetraMysclDigito(String pValor) {

		int i;
		for (i = 0; i < pValor.length(); i++) {
			if (!Character.isDigit(pValor.charAt(i))) {
				if (!Character.isLetter(pValor.charAt(i)) || !Character.isUpperCase(pValor.charAt(i)))
					return false;
			}
		}
		return true;
	}

}
