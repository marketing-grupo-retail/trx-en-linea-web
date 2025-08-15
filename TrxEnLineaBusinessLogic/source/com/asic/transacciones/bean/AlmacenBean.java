/*
 * Creado el 03-jun-07
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.transacciones.bean;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.patterns.dao.DAOClassNotFoundException;
import org.ramm.jwaf.patterns.dao.DAOCreationException;
import org.ramm.jwaf.patterns.dao.DAOLocator;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.grpretail.business.admin.vo.Usuario_Ext_Imp;
import com.grpretail.business.transacciones.vo.ALMACEN;
import com.grpretail.business.transacciones.vo.ALMACEN_Imp;
//import com.grpretail.business.market.vo.ALM_X_GRPALM;
//import com.grpretail.business.market.vo.Almacen_Ext_Imp;
import com.asic.transacciones.dao.ALMACEN_DAO;
//import com.grpretail.business.marketonline.dao.ALM_X_GRPALM_DAO;
import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationResources;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class AlmacenBean {

	public int createAlmacen(ALMACEN pAlmacen) throws ServiceException {
		ALMACEN_DAO dao_ = (ALMACEN_DAO)getDAO(ALMACEN_DAO.class);
		try {
			int ret_ = dao_.insert(pAlmacen);
			return ret_;
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException",e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException",e);
		}
	}

	public int modifyAlmacen(ALMACEN pAlmacen) throws ServiceException {
		ALMACEN_DAO dao_ = (ALMACEN_DAO)getDAO(ALMACEN_DAO.class);
		try {
			int ret_ = dao_.update(pAlmacen);
			return ret_;
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException",e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException",e);
		}
	}
	
	private Object getDAO(Class pClase) throws ServiceException{
		try {
			return DAOLocator.getDAO(pClase);
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException",e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException",e);
		}
	}

	public ALMACEN buscarAlmacen(ALMACEN pAlmacen,String pCompany)
		throws  ServiceException {
		List res_ = null;
		try {
			String where_= "a.CODCCO =" +pAlmacen.getCODCCO() + " AND a.CODEMP = b.CODEMP AND a.CODCCO=b.CODCCO AND a.CODEMP ="+pCompany;
					
			res_ = DBUtil.select(" a.CODCCO, a.DIRIP IP, b.DSCECO NOMBRE,b.SOCMUN CITY_NAME,b.SOCDIR DIRECC, b.NADMON ADM_NAME ",
					"gcposaf1 a, gccecof b",
					where_,
					ALMACEN_Imp.class,
					ApplicationResources.TXONLINE_DB);
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		if (res_!=null && res_.size()>0)
			return (ALMACEN)res_.get(0);
			
		return new ALMACEN_Imp();
	}



	public List buscarAlmacenes(ALMACEN pAlmacen,String pCompany) throws ServiceException{

		List res_ = null;
		//adapter_ = new ApplicationConfigFacadeAdapter();
		String nombreE_ = "";
		Usuario_Ext_Imp element = null;

		String nombre_ = pAlmacen.getNOMBRE();
//		if(nombre_==null){
//			nombre_ = "";
//		}
//		String idCiudad_=null;
//		if(pAlmacen.getID_CITY()!=null)
//			idCiudad_ = pAlmacen.getID_CITY().toString();
		/*String apellido_ = pUser.getAPELLIDO();
		if(apellido_==null){
			apellido_ = "";
		}

		String setEstado_ = pUser.getESTADO();
		String estado_ = "";
		if(setEstado_ != null){
			estado_ = "USUARIO.ESTADO='" + setEstado_ + "' AND ";
		}*/

		try {

//			String where_= "a.CODCCO =" +pAlmacen.getCODCCO() + " AND a.CODEMP = b.CODEMP AND a.CODCCO=b.CODCCO AND a.CODEMP ="+pCompany;
//					
//			res_ = DBUtil.select(" a.CODCCO, a.DIRIP IP, b.DSCECO NOMBRE,b.SOCMUN CITY_NAME,b.SOCDIR DIRECC ",
//					"gcposaf1 a, gccecof b",
//					where_,
//					ALMACEN_Imp.class,
//					ApplicationResources.COMFA_PRODS_DB);
					
			
			String select_ = "a.CODCCO, a.DIRIP IP, b.DSCECO NOMBRE,b.SOCMUN CITY_NAME,b.SOCDIR DIRECC ";
			String where_= " a.CODEMP = b.CODEMP AND a.CODCCO=b.CODCCO AND a.CODEMP ="+pCompany;
			if (nombre_!=null)
				where_+= "UPPER(b.DSCECO) LIKE '%" + nombre_.toUpperCase()+"%'";
//			if (idCiudad_!=null && !idCiudad_.equals("-1"))
//				where_+= " AND a.ID_CITY = " + idCiudad_;
			//%' AND " +
						   //"UPPER(USUARIO.APELLIDO) LIKE '" + apellido_.toUpperCase() + "%'"							
			res_ = DBUtil.select(select_,
					/*adapter_.getAsicGOwner() +*/ "gcposaf1 a, gccecof b",
					where_,
					ALMACEN_Imp.class,
					ApplicationResources.GR_DB);

		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}

		return res_;
	}
	
	public List buscarAlmacenesAsociadosAGrupos(String [] pIDAlmacen) throws  ServiceException {
		List res_ = null;
		try {
			//select * from MOL_ALMACEN 
			//where ID  in (select ID_ALMACEN from MOL_ALM_X_GRPALM where ID_ALMACEN in (3, 5, 6) )
			StringBuffer idsAlmacenes = new StringBuffer();
			for (int i = 0; i < pIDAlmacen.length; i++) {
				idsAlmacenes.append(pIDAlmacen[i]);
				idsAlmacenes.append(", ");
			}
			idsAlmacenes.delete(idsAlmacenes.toString().lastIndexOf(","),idsAlmacenes.length());
			String where_= "ID  in (select ID_ALMACEN from MOL_ALM_X_GRPALM where ID_ALMACEN in (" + idsAlmacenes + ") )";
						
			res_ = DBUtil.select(" * ",
					"MOL_ALMACEN",
					where_,
					ALMACEN_Imp.class,
					ApplicationResources.GR_DB);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		return res_;
	}
	
	/*
	public List buscarAlmacenesXId(String [] pIDAlmacen,String pCompany) throws  ServiceException {
		List res_ = null;
		try {
			//select * from MOL_ALMACEN 
			//where ID  in (select ID_ALMACEN from MOL_ALM_X_GRPALM where ID_ALMACEN in (3, 5, 6) )
			StringBuffer idsAlmacenes = new StringBuffer();
			for (int i = 0; i < pIDAlmacen.length; i++) {
				idsAlmacenes.append(pIDAlmacen[i]);
				idsAlmacenes.append(", ");
			}
			idsAlmacenes.delete(idsAlmacenes.toString().lastIndexOf(","),idsAlmacenes.length());
			String where_= "a.CODCCO  in (" + idsAlmacenes + ") AND a.CODEMP = b.CODEMP AND a.CODCCO=b.CODCCO AND a.CODEMP ="+pCompany;
						
			res_ = DBUtil.select(" a.CODCCO, a.DIRIP IP, b.DSCECO NOMBRE,b.SOCMUN CITY_NAME,b.SOCDIR DIRECC, concat(concat(CHAR(b.codcco), ' '), b.dsceco)CENTROCOSTO_ALMACEN ",
					"gcposaf1 a, gccecof b",
					where_,
					Almacen_Ext_Imp.class,
					ApplicationResources.COMFA_PRODS_DB);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		return res_;
	}
	*/
	
	/*
	public List buscarAlmacenesAsociadosAGrupo(String pIDGrupo,String pCompany) throws  ServiceException {
		List res_ = null;
		try {
			//String where_= "a.ID  in (select ID_ALMACEN from MOL_ALM_X_GRPALM where ID_GRPALMACEN = " + pIDGrupo + " ) AND a.ID_CITY = b.ID";
			String where_= " ID_GRPALMACEN = " + pIDGrupo + " AND a.CODEMP = b.CODEMP AND a.CODCCO=b.CODCCO"+
			               " AND c.ID_ALMACEN=a.CODCCO AND a.CODEMP="+ pCompany  ;
			
			//res_ = DBUtil.select(" * ",
			res_ = DBUtil.select(" a.CODCCO,b.DSCECO NOMBRE,b.SOCMUN CITY_NAME,b.SOCDIR DIRECC, concat(concat(CHAR(b.codcco), ' '), b.dsceco)CENTROCOSTO_ALMACEN ",
					"gcposaf1 a, gccecof b, MOL_ALM_X_GRPALM c",
					where_,
					Almacen_Ext_Imp.class,
					ApplicationResources.COMFA_PRODS_DB);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
		return res_;
	}
	*/
	
	public void deleteStores(List pAlmacenes) throws ServiceException{

		ALMACEN_DAO almacenDao_ = null;
		ALMACEN_Imp almacen_ = null;
		List res_ = null;
		Integer idAlmacen_;

		try {
			almacenDao_ = (ALMACEN_DAO)DAOLocator.getDAO(ALMACEN_DAO.class);
			long time_ = System.currentTimeMillis();
			Timestamp ts_ = new Timestamp(time_);

			for (Iterator iter = pAlmacenes.iterator(); iter.hasNext();) {
				idAlmacen_ = (Integer) iter.next();
				almacen_ = new ALMACEN_Imp();
				almacen_.setCODCCO(idAlmacen_);
				almacenDao_.delete(almacen_);
			}

		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
	}

	/*
	public List searchAlmacenesXGruposAlmacenes(ALM_X_GRPALM pObject) throws ServiceException{
		ALM_X_GRPALM_DAO objectDao_ = null;
		List res_ = null;
		try {
			objectDao_ = (ALM_X_GRPALM_DAO)DAOLocator.getDAO(ALM_X_GRPALM_DAO.class);
			res_ = objectDao_.selectVO(pObject);
			return res_;
		} catch (DAOClassNotFoundException e) {
			throw new ServiceException("DAOClassNotFoundException", e);
		} catch (DAOCreationException e) {
			throw new ServiceException("DAOCreationException", e);
		} catch (ConnectionFailedException e) {
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			throw new ServiceException("DBAccessException", e);
		}
	}
	*/

	/**
	 * @param pAlmacen
	 * @param pPosIni
	 * @param pPosFin
	 * @return
	 */
	/*
	public List buscarAlmacenes(ALMACEN pAlmacen, int pPosIni, int pPosFin,String pCompany) throws ServiceException {
		List res_ = null;
		
		String nombre_ = pAlmacen.getNOMBRE();
		if(nombre_==null)
			nombre_ = "";
			
		String idCiudad_=null;
		if(pAlmacen.getID_CITY()!=null)
			idCiudad_ = pAlmacen.getID_CITY().toString();

		try {
			//String select_ = "a.ID, a.ID_CITY, a.IP, a.AL_USER, a.PASSWORD, a.NOMBRE, a.DIRECC, a.TELEFONO, a.EMAIL, a.ADM_NAME, b.NOMBRE CITY_NAME";
			String select_ = "a.CODCCO, b.SOCMUN CITY_NAME, a.DIRIP IP, b.DSCECO NOMBRE, b.SOCDIR DIRECC, b.NADMON ADM_NAME, concat(concat(CHAR(b.codcco), ' '), b.dsceco)CENTROCOSTO_ALMACEN";
			String where_= "a.CODEMP = b.CODEMP AND a.CODCCO=b.CODCCO AND b.coddst=c.coddst AND a.CODEMP="+pCompany;
			if (nombre_!=null && !nombre_.equals(""))
				where_+= " AND UPPER(b.DSCECO) LIKE '%" + nombre_.toUpperCase() + "%'";
			if (idCiudad_!=null && !idCiudad_.equals("-1"))
				where_+= " AND b.coddst = " + idCiudad_;
									
			res_ = DBUtil.select(select_,
					"gcposaf1 a, gccecof b,gctdisf c",
					where_,
					" ",
					Almacen_Ext_Imp.class,
					ApplicationResources.COMFA_PRODS_DB,
					pPosIni, pPosFin);

		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return res_;
	}
	*/

	/**
	 * @param pAlmacen
	 * @param pAddFilter
	 * @param pPosIni
	 * @param pPosFin
	 * @return
	 */
	/*
	public List getAlmacenes(ALMACEN pAlmacen, String pAddFilter, int pPosIni, int pPosFin,String pCompany) throws ServiceException {
		List res_ = null;
		
		String nombre_ = pAlmacen.getNOMBRE();
		if(nombre_==null)
			nombre_ = "";
			
		String idCiudad_=null;
		if(pAlmacen.getID_CITY()!=null)
			idCiudad_ = pAlmacen.getID_CITY().toString();
			
		String filtroNoIds_ = pAddFilter;
		if(filtroNoIds_!=null && !filtroNoIds_.equals("")){
			filtroNoIds_ = " AND a.CODCCO NOT IN ( "+filtroNoIds_+" ) "; 
		}else{
			filtroNoIds_="";
		}			

		try {
			String select_ = "a.CODCCO, b.SOCMUN CITY_NAME, a.DIRIP IP, b.DSCECO NOMBRE, b.SOCDIR DIRECC, b.NADMON ADM_NAME, concat(concat(CHAR(b.codcco), ' '), b.dsceco)CENTROCOSTO_ALMACEN";			  
			String where_= " a.CODEMP = b.CODEMP AND a.CODCCO=b.CODCCO AND b.coddst=c.coddst AND a.CODEMP="+pCompany + filtroNoIds_ + " ";			   
			if (nombre_!=null && !nombre_.equals(""))			   			
				where_+= " AND UPPER(b.DSCECO) LIKE '%" + nombre_.toUpperCase() + "%' ";
			if (idCiudad_!=null && !idCiudad_.equals("-1"))
				where_+= " AND b.coddst = " + idCiudad_;
									
			res_ = DBUtil.select(select_,
					"gcposaf1 a, gccecof b,gctdisf c",
					where_,
					" ",
					Almacen_Ext_Imp.class,
					ApplicationResources.COMFA_PRODS_DB,
					pPosIni, pPosFin);

		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return res_;
	}
	*/
	
}
