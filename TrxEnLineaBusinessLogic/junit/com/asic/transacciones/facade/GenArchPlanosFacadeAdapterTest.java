/*
 * Created on Mar 1, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.util.List;

import com.asic.framework.resources.ApplicationResources;
import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.ConsultasComunesBean;

import junit.framework.TestCase;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class GenArchPlanosFacadeAdapterTest extends TestCase{

	public GenArchPlanosFacadeAdapterTest(String arg0) {
		super(arg0);
	}
	
	public void testInsertEnArchivo(){
		CrearArchPlanosFacadeAdapter facade_ = new CrearArchPlanosFacadeAdapter();
		ConsultasComunesBean bean_ = new ConsultasComunesBean();
		
		List list_;
		try{
			facade_.insertEnArchivo("2006-01-16", "V");		
			list_ = bean_.getAlmacen();
			System.out.println("Archivos Generados Exitosamente");
		}catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
