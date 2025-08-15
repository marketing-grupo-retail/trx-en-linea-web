/*
 * Created on Mar 10, 2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.bean.AdminParametrosBean;
import com.asic.transacciones.vo.TX_PARAM_SIST;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ImportArchivosFacadeAdapter {
	
	/*insertar en las tablas*/
	
	/*insertTablaHeader(List contArchivo)*/
	
	public void existeRuta() throws ServiceException {
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
		String ruta_ = txparamst_.getPARAM_VLR();
		File arch_ = new File(ruta_);
		if (!arch_.exists()){
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, " NO EXISTE LA RUTA: " + ruta_);
			throw new ServiceException("", "error.generar_archivo");
		}		
	}
	
	public void existeArchivo(List pNomArchivo, String pFecha, List pStore ) throws ServiceException {
		
		/*listado con las iniciales de los archivos = NomArchivo 
		 *en un ciclo, que revise todos los nombres */
		List lst_ = null/*properties*/;
		Iterator it_= lst_.iterator();
		while (it_.hasNext()){
			AdminParametrosBean parametro_ = new AdminParametrosBean();
			String archivo_ = lst_+pFecha+"."+pStore;
			File arch_ = new File(archivo_);
			int i_ = 0;
			if (!arch_.exists()){
				i_ = i_++;
				if(i_== 15)
					LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.INFO, " No existen Archivos para esta Tienda ");
			}	
		} 
	}
}
