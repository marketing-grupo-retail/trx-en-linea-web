/*
 * Creado el 24/06/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.grpretail.trxonline.vos;

import java.io.Serializable;
/**
 * @author ACadena
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class RegistersVo  implements Serializable {
	long number;
	/**
	 * @return
	 */
	/*
	public IValueObject copy(IValueObject vo){
		RegistersVo tmp = (RegistersVo)vo;
		if (vo == null) return this;
		
		setNumber(tmp.getNumber());
		return this;
	}
	*/	
	

	/**
	 * @return
	 */
	public long getNumber() {
		return number;
	}

	/**
	 * @param l
	 */
	public void setNumber(long l) {
		number = l;
	}

}
