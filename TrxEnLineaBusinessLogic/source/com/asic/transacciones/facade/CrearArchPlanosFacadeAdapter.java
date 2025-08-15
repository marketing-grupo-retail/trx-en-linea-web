/*
 * Created on Feb 28, 2006
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.facade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.bean.AdminParametrosBean;
import com.asic.transacciones.bean.ConsultasComunesBean;
import com.asic.transacciones.vo.ORGMSTEE_Imp;
import com.asic.transacciones.vo.TX_PARAM_SIST;

/**
 * @author Kcadena
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class CrearArchPlanosFacadeAdapter {
	
	FileOutputStream os_ ;
	FileInputStream  is_ ;
	BufferedWriter   bw_ ;	
	BufferedReader   br_ ;
			
	public void insertEnArchivo(String pDay, String pTipo) throws ServiceException{
		
		CrearArchPlanosFacadeAdapter facade_ = new CrearArchPlanosFacadeAdapter();
		ConsultasComunesBean bean_ = new ConsultasComunesBean();
		existeRuta();
		String cadena_;
		ORGMSTEE_Imp tmp_;
		try{
			List lAlma_ = bean_.getAlmacen();
			Iterator it_= lAlma_.iterator();
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.INFO, " Inicio, Generar archivos planos por tienda...");
			while (it_.hasNext()){
				tmp_=(ORGMSTEE_Imp)it_.next();
			
					cadena_ = facade_.insertArchHeader			(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchItemEntry		(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchDataEntry		(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchDiscount		(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchExceptionLog	(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchItemRecordChange(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchOperatorTraining(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchPriceChange		(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchStoreClosing	(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchTax				(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchTender			(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchTillChange		(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchTradingStamps	(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchUserData		(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
					cadena_ = facade_.insertArchManagerOverride	(pDay, tmp_.getORG_LVL_NUMBER(), pTipo);
			}
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.INFO, " Fin, Archivos Generados Exitosamente.");
		}catch (ServiceException e) {
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generar_archivo", e);
		}
	}
	
	public String insertArchHeader(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		//parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
		String escrivirArch_ = strToInsert_.getHeader(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();			
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				//os_= new FileOutputStream(txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate(),true);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);			
				//bw_.write(strToInsert_.getHeader(pDay,pStore,pTipo));
				bw_.newLine();
				bw_.flush(); // esto solo sirve para que grabe
				System.out.println(ruta_);
			
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
	
	public String insertArchItemEntry(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getItemEntry(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
	
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true);  
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);			
				bw_.newLine();
				bw_.flush(); 
				System.out.println(ruta_);
			
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
	
	public String insertArchDataEntry(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getDataEntry(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);			
				bw_.newLine();
				bw_.flush(); 
				System.out.println(ruta_);
			
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
		
	public String insertArchDiscount(String pDay, String pStore, String pTipo) throws ServiceException{
	
		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getDiscount(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);			
				bw_.newLine();
				bw_.flush();
				System.out.println(ruta_);
			
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchExceptionLog(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getExceptionLog(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush();
				System.out.println(ruta_);
			
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchItemRecordChange(String pDay, String pStore, String pTipo) throws ServiceException{
	
		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getItemRecordChange(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush(); 
				System.out.println(ruta_);
				
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchManagerOverride(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getManagerOverride(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush(); 
				System.out.println(ruta_);
			
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchOperatorTraining(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getOperatorTraining(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush(); 
				System.out.println(ruta_);
		
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchPriceChange(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getPriceChange(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
	
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush();
				System.out.println(ruta_);
	
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchStoreClosing(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getStoreClosing(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
	
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush(); 
				System.out.println(ruta_);
		
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchTax(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getTax(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush();
				System.out.println(ruta_);
	
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchTender(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getTender(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
	
		try{
			TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
			String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
			existeArchivo(pStore, nomArchivo_);
			os_= new FileOutputStream(ruta_,true); 
			bw_= new BufferedWriter(new OutputStreamWriter(os_));
			bw_.write(escrivirArch_);
			bw_.newLine();
			bw_.flush();
			System.out.println(ruta_); 
			
		}catch(Exception e){
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchTillChange(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getTillChange(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
		try{
			TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
			String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
			existeArchivo(pStore, nomArchivo_);
			os_= new FileOutputStream(ruta_,true); 
			bw_= new BufferedWriter(new OutputStreamWriter(os_));
			bw_.write(escrivirArch_);
			bw_.newLine();
			bw_.flush();
			System.out.println(ruta_);
		
		}catch(Exception e){
			LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
			throw new ServiceException("", "error.generar_archivo", e);
		}finally{
			if (bw_!=null){
				try {
					bw_.close();
				} catch (IOException ex) {
					LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
					throw new ServiceException("", "error.cerrar_archivo", ex);
				}
			}		
		}
	return escrivirArch_;
	}
			
	public String insertArchTradingStamps(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getTradingStamps(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
	
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush(); 
				System.out.println(ruta_);
			
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
			
	public String insertArchUserData(String pDay, String pStore, String pTipo) throws ServiceException{

		GenArchPlanosFacadeAdapter strToInsert_ = new GenArchPlanosFacadeAdapter();
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		String escrivirArch_ = strToInsert_.getUserData(pDay, pStore, pTipo);
		String nomArchivo_ = strToInsert_.getName();
		
			try{
				TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
				String ruta_ = txparamst_.getPARAM_VLR()+nomArchivo_+getActualDate()+"."+pStore;
				existeArchivo(pStore, nomArchivo_);
				os_= new FileOutputStream(ruta_,true); 
				bw_= new BufferedWriter(new OutputStreamWriter(os_));
				bw_.write(escrivirArch_);
				bw_.newLine();
				bw_.flush();
				System.out.println(ruta_);
			
			}catch(Exception e){
				LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + e.getMessage(), e);
				throw new ServiceException("", "error.generar_archivo", e);
			}finally{
				if (bw_!=null){
					try {
						bw_.close();
					} catch (IOException ex) {
						LogWriter.getLog(ApplicationResources.LOG_ARCHIVOS).log(this, LogWriter.SEVERE, "En [getPaginas(...)]: " + ex.getMessage(), ex);
						throw new ServiceException("", "error.cerrar_archivo", ex);
					}
				}		
			}
		return escrivirArch_;
	}
	
	public static String getActualDate() {
		Calendar cal_ = Calendar.getInstance();
		int year_	= cal_.get(Calendar.YEAR);		
		int month_	= cal_.get(Calendar.MONTH) + 1;
		int day_	= cal_.get(Calendar.DAY_OF_MONTH);
		if ((month_)< 10||(day_)< 10)
			return String.valueOf(year_).substring(2)+"0"+String.valueOf(month_)+"0"+String.valueOf(day_);
		else{ 
			return String.valueOf(year_).substring(2)+String.valueOf(month_)+ String.valueOf(day_);
		}
	}
	
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
	
	public void existeArchivo(String pStore, String pNomArchivo) throws ServiceException {
		
		AdminParametrosBean parametro_ = new AdminParametrosBean();
		TX_PARAM_SIST txparamst_= parametro_.getParametro(AdminParametrosBean.ALMACEN_ARCHIVOS);
		String archivo_ = txparamst_.getPARAM_VLR()+pNomArchivo+getActualDate()+"."+pStore;
		File arch_ = new File(archivo_);
		if (arch_.exists()){
			arch_.delete();
		}		
	}
}
