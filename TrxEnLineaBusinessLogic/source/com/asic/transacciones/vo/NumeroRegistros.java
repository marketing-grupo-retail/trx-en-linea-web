/*
 * Creado el 24/06/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.transacciones.vo;

import java.io.Serializable;

import com.asic.objetos.IValueObject;
/**
 * @author ACadena
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class NumeroRegistros  implements Serializable, IValueObject {
	int num_reg;
	/**
	 * @return
	 */
	public IValueObject copy(IValueObject vo){
		NumeroRegistros tmp = (NumeroRegistros)vo;
		if (vo == null) return this;
		
		setNum_reg(tmp.getNum_reg());
		return this;
	}	
	
	public int getNum_reg() {
		return num_reg;
	}

	/**
	 * @param i
	 */
	public void setNum_reg(int i) {
		num_reg = i;
	}

}
