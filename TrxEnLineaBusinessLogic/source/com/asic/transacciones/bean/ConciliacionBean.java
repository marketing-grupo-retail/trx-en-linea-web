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
import com.grpretail.business.transacciones.vo.CUSTOMERS_Imp;
import com.grpretail.business.transacciones.vo.DISCOUNTS_Imp;
import com.grpretail.business.transacciones.vo.GROSS_NEGATIVE_Imp;
import com.grpretail.business.transacciones.vo.GROSS_POSITIVE_Imp;
import com.grpretail.business.transacciones.vo.MISCELLANEOUS_Imp;
import com.grpretail.business.transacciones.vo.REFUNDS_Imp;
import com.grpretail.business.transacciones.vo.SOLD_ITEMS_Imp;
import com.grpretail.business.transacciones.vo.STORE_CLOSING;
import com.grpretail.business.transacciones.vo.STORE_CLOSING_Imp;
import com.grpretail.business.transacciones.vo.STORE_CONCILIATION;
import com.grpretail.business.transacciones.vo.STORE_COUPONS_Imp;
import com.grpretail.business.transacciones.vo.VOIDS_Imp;
//import com.grpretail.business.market.vo.ALM_X_GRPALM;
//import com.grpretail.business.market.vo.Almacen_Ext_Imp;
import com.asic.transacciones.dao.ALMACEN_DAO;
import com.asic.utils.StringFormater;
//import com.grpretail.business.marketonline.dao.ALM_X_GRPALM_DAO;
import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationResources;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class ConciliacionBean {

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

	public Long getVoidedItemsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			String select_ = "coalesce (SUM(XPRICE), 0) AS VALUE";

			//FROM
			String where_= "INDICAT31=8 and STORE = "+pAlmacen+" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')";
			System.out.println("Select "+select_+" from TPOS_ITEMENTRY WHERE "+where_);
			//if (nombre_!=null && !nombre_.equals(""))
			//	where_+= " AND UPPER(b.DSCECO) LIKE '%" + nombre_.toUpperCase() + "%'";
			//if (idCiudad_!=null && !idCiudad_.equals("-1"))
			//	where_+= " AND b.coddst = " + idCiudad_;

			/*
			res_ = DBUtil.select(" a.CODCCO, a.DIRIP IP, b.DSCECO NOMBRE,b.SOCMUN CITY_NAME,b.SOCDIR DIRECC, b.NADMON ADM_NAME ",
					"gcposaf1 a, gccecof b",
					where_,
					ALMACEN_Imp.class,
					ApplicationResources.TXONLINE_DB);
			*/						
			List res_ = DBUtil.select(select_,
					"TPOS_ITEMENTRY",
					where_,
					VOIDS_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				VOIDS_Imp ansObj_ = (VOIDS_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}

	public Long getRefundedItemsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			String select_ = "coalesce (SUM(XPRICE), 0) AS VALUE";

			//FROM
			String where_= "INDICAT31=2 and STORE = "+pAlmacen+" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')";
			System.out.println("Select "+select_+" from TPOS_ITEMENTRY WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"TPOS_ITEMENTRY",
					where_,
					REFUNDS_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				REFUNDS_Imp ansObj_ = (REFUNDS_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}


	public Long getDiscountsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			/*
			SELECT
			coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = $P{pStore} AND  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin}) AND TYPE=3), 0) -
			coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = $P{pStore} AND  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin}) AND TYPE=4), 0)
			AS DESCUENTOS
			*/
			String select_ = "coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = "+pAlmacen+" AND  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"') AND TYPE=3), 0) - "+
							 "coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = "+pAlmacen+" AND  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"') AND TYPE=4), 0)"+
							 " AS VALUE";

			//FROM
			String where_= "";
			System.out.println("Select "+select_+" from SYSIBM.SYSDUMMY1 WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"SYSIBM.SYSDUMMY1",
					where_,
					DISCOUNTS_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				DISCOUNTS_Imp ansObj_ = (DISCOUNTS_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}

	public Long getMiscellaneous(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			//String select_ = "coalesce (SUM(XPRICE), 0) AS VALUE";
			String select_ = "coalesce((SELECT SUM(XPRICE)  FROM TPOS_ITEMENTRY WHERE  INDICAT31=4 AND INDICAT216=0 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ),0)-"+
							 "coalesce((SELECT SUM(XPRICE)  FROM TPOS_ITEMENTRY WHERE  INDICAT31=4 AND INDICAT216=1 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ),0)-"+
							 "coalesce((SELECT SUM(XPRICE)  FROM TPOS_ITEMENTRY WHERE  INDICAT31=5 AND INDICAT216=0 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ),0)+"+
							 "coalesce((SELECT SUM(XPRICE)  FROM TPOS_ITEMENTRY WHERE  INDICAT31=5 AND INDICAT216=1 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ),0)"+
							 " as VALUE";			
			
			/*
			String select_ = "coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = "+pAlmacen +" AND  DAY between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"') AND TYPE=3), 0) -"+
							 "coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = "+pAlmacen +" AND  DAY between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"') AND TYPE=4), 0)"+
							 "AS VALUE";
			*/				 
			//FROM
			//SYSIBM.SYSDUMMY1	
							 			
			//FROM
			String where_= "";
			System.out.println("Select "+select_+" from SYSIBM.SYSDUMMY1 WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"SYSIBM.SYSDUMMY1",
					where_,
					MISCELLANEOUS_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				MISCELLANEOUS_Imp ansObj_ = (MISCELLANEOUS_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}
			
	public Long getVoidedTrxsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			/*
			SELECT
				 coalesce (sum(GROSSPOS+GROSSNEG), 0) AS ANULACIONES
			FROM
				 TPOS_HEADER
			WHERE
			  TRANSTYPE = 16
			*/  

			String select_ = "coalesce (sum(GROSSPOS+GROSSNEG), 0) AS VALUE ";			
			
			String where_= "TRANSTYPE = 16 and STORE = "+pAlmacen+" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')";
			System.out.println("Select "+select_+" from TPOS_ITEMENTRY WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"TPOS_HEADER",
					where_,
					VOIDS_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				VOIDS_Imp ansObj_ = (VOIDS_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}

	public Long getGrossPositive(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			/*
			SELECT
				 coalesce (sum(GROSSPOS+GROSSNEG), 0) AS ANULACIONES
			FROM
				 TPOS_HEADER
			WHERE
			  TRANSTYPE = 16
			*/  

			String select_ = "coalesce (sum(GROSSPOS), 0) AS VALUE ";			
			
			String where_= "TRANSTYPE=0 and STORE = "+pAlmacen+" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')";
			System.out.println("Select "+select_+" from TPOS_ITEMENTRY WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"TPOS_HEADER",
					where_,
					GROSS_POSITIVE_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				GROSS_POSITIVE_Imp ansObj_ = (GROSS_POSITIVE_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}
	
	public Long getCustomersOrTicketsNumber(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			/*
				select count(*) CLIENTES  from tpos_header where TRANSTYPE=0
				 and STORE = $P{pStore}
				 and  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})
			*/  

			String select_ = "count(*) AS VALUE ";			
			
			String where_= "TRANSTYPE=0 and STORE = "+pAlmacen+" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')";
			System.out.println("Select "+select_+" from TPOS_HEADER WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"TPOS_HEADER",
					where_,
					CUSTOMERS_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				CUSTOMERS_Imp ansObj_ = (CUSTOMERS_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}
	
	public Long getSoldItemsNumber(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			/*
				SELECT
				coalesce((SELECT SUM(QTYORWGT)  FROM TPOS_ITEMENTRY WHERE INDICAT31=0 AND INDICAT17<>1  AND INDICAT210=1 and STORE = $P{pStore} and  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})  ), 0)+
				coalesce((SELECT COUNT(*)  FROM TPOS_ITEMENTRY WHERE INDICAT31=0 AND INDICAT17=1  AND INDICAT210=1 and STORE = $P{pStore} and  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})  ), 0)+
				coalesce((SELECT count(*)  FROM TPOS_ITEMENTRY WHERE INDICAT31=0 AND INDICAT210=0 and STORE = $P{pStore} and  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})  ), 0)-
				coalesce((SELECT count(*)  FROM TPOS_ITEMENTRY WHERE INDICAT31=8 AND INDICAT46<>1 and STORE = $P{pStore} and  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})  ), 0)-
				coalesce((SELECT SUM(QTYORWGT)  FROM TPOS_ITEMENTRY WHERE  INDICAT31=8 AND INDICAT46=1  AND INDICAT210=1 and STORE = $P{pStore} and  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})  ), 0) AS ITEMS
				FROM SYSIBM.SYSDUMMY1 
			 */


			String select_ = "coalesce((SELECT SUM(QTYORWGT)  FROM TPOS_ITEMENTRY WHERE INDICAT31=0 AND INDICAT17<>1  AND INDICAT210=1 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ), 0)+"+
							 "coalesce((SELECT COUNT(*)  FROM TPOS_ITEMENTRY WHERE INDICAT31=0 AND INDICAT17=1  AND INDICAT210=1 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ), 0)+"+
							 "coalesce((SELECT count(*)  FROM TPOS_ITEMENTRY WHERE INDICAT31=0 AND INDICAT210=0 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ), 0)-"+
							 "coalesce((SELECT count(*)  FROM TPOS_ITEMENTRY WHERE INDICAT31=8 AND INDICAT46<>1 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ), 0)-"+
							 "coalesce((SELECT SUM(QTYORWGT)  FROM TPOS_ITEMENTRY WHERE  INDICAT31=8 AND INDICAT46=1  AND INDICAT210=1 and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ), 0)"+
							 " AS VALUE";                        
			
			/*
			String select_ = "coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = "+pAlmacen +" AND  DAY between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"') AND TYPE=3), 0) -"+
							 "coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = "+pAlmacen +" AND  DAY between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"') AND TYPE=4), 0)"+
							 "AS VALUE";
			*/				 
			//FROM
			//SYSIBM.SYSDUMMY1	
							 			
			//FROM
			String where_= "";
			System.out.println("Select "+select_+" from TPOS_ITEMENTRY WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"SYSIBM.SYSDUMMY1",
					where_,
					SOLD_ITEMS_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				SOLD_ITEMS_Imp ansObj_ = (SOLD_ITEMS_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}
	
	public Long getStoreCoupons(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			/*
				SELECT (
				coalesce((SELECT COUNT(*) FROM TPOS_HEADER a,TPOS_ITEMENTRY b WHERE a.STORE=b.STORE AND a.TERMINAL=b.TERMINAL AND a.TRANSNUM=b.TRANSNUM AND a.DAY=b.DAY AND a.TIME=b.TIME AND
				     b.INDICAT31=7 AND b.INDICAT216=0 and b.STORE = $P{pStore} and  b.DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})),0)-
				coalesce((SELECT COUNT(*) FROM TPOS_HEADER a,TPOS_ITEMENTRY b WHERE a.STORE=b.STORE AND a.TERMINAL=b.TERMINAL AND a.TRANSNUM=b.TRANSNUM AND a.DAY=b.DAY AND a.TIME=b.TIME AND
				     b.INDICAT31=7 AND b.INDICAT216=1 and b.STORE = $P{pStore} and  b.DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})),0))
				AS CUPONES
				FROM SYSIBM.SYSDUMMY1 
			 */
							 
			String select_ = "coalesce((SELECT COUNT(*) FROM TPOS_HEADER a,TPOS_ITEMENTRY b WHERE a.STORE=b.STORE AND a.TERMINAL=b.TERMINAL AND a.TRANSNUM=b.TRANSNUM AND a.DAY=b.DAY AND a.TIME=b.TIME AND "+
				 			 " b.INDICAT31=7 AND b.INDICAT216=0 and b.STORE = "+pAlmacen +" and  b.FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')),0)- "+
							 " coalesce((SELECT COUNT(*) FROM TPOS_HEADER a,TPOS_ITEMENTRY b WHERE a.STORE=b.STORE AND a.TERMINAL=b.TERMINAL AND a.TRANSNUM=b.TRANSNUM AND a.DAY=b.DAY AND a.TIME=b.TIME AND "+
				 			 " b.INDICAT31=7 AND b.INDICAT216=1 and b.STORE = "+pAlmacen +" and  b.FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')),0) "+
							 " AS VALUE ";
                       
			
			/*
			String select_ = "coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = "+pAlmacen +" AND  DAY between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"') AND TYPE=3), 0) -"+
							 "coalesce ((select SUM(AMTDISCO) FROM TPOS_DISCOUNT WHERE STORE = "+pAlmacen +" AND  DAY between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"') AND TYPE=4), 0)"+
							 "AS VALUE";
			*/				 
			//FROM
			//SYSIBM.SYSDUMMY1	
							 			
			//FROM
			String where_= "";
			System.out.println("Select "+select_+" from SYSIBM.SYSDUMMY1 WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"SYSIBM.SYSDUMMY1",
					where_,
					STORE_COUPONS_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				STORE_COUPONS_Imp ansObj_ = (STORE_COUPONS_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}
	
	public boolean insertStoreConciliation(STORE_CONCILIATION objToInsert_){
		// Insertar en registro de la tabla llegadas_del_POS
		/*
		try{
			//int store_ = Integer.parseInt(pStoreNumber);
			String sentencia_ = "INSERT INTO TOL_STORE_CONCILIATION (" + 
									"TSC_STORE_ID,"+
									"TSC_GROSS_SALES,"+    
									"TSC_VOIDED_ITEMS,"+
									"TSC_REFUNDED_ITEMS,"+
									"TSC_TOTAL_DISCOUNTS,"+
									"TSC_MISCELLA_AMOUNT,"+
									"TSC_VOIDED_TRXS_AMT,"+
									"TSC_ITM_GROSS_POSIT,"+
									"TSC_ITM_GROSS_NEGAT,"+
									"TSC_CUST_TICKET_NUM,"+
									"TSC_STORE_COUPONS,"+
									"TSC_ITEMS_SOLDS_NUM,"+
									"TSC_FECHAHORA_INI,"+
									"TSC_FECHAHORA_FIN"+
 								")VALUES("+
									objToInsert_.getSTORE_ID().intValue()+","+ 
									objToInsert_.getGROSS_SALES().longValue()+","+    
									objToInsert_.getVOIDED_ITEMS().longValue()+","+
									objToInsert_.getREFUNDED_ITEMS().longValue()+","+
									objToInsert_.getTOTAL_DISCOUNTS().longValue()+","+
									objToInsert_.getMISCELLA_AMOUNT().longValue()+","+
									objToInsert_.getVOIDED_TRXS_AMT().longValue()+","+
									objToInsert_.getITM_GROSS_POSIT().longValue()+","+
									objToInsert_.getITM_GROSS_NEGAT().longValue()+","+
									objToInsert_.getCUST_TICKET_NUM().longValue()+","+
									objToInsert_.getSTORE_COUPONS().longValue()+","+
									objToInsert_.getITEMS_SOLDS_NUM()+","+
									objToInsert_.getFECHAHORA_INI()+","+
									objToInsert_.getFECHAHORA_FIN()+","+
								")";
			System.out.println("Sentencia de inserciOn:"+sentencia_);					 								

			int reintentos_=0;	
			boolean pending_=true;
			while(pending_ && reintentos_<2){
				pending_ = !SqlUtils.insertaRegistro(
					sentencia_,
					RequestsHandler.getCnxClassName(""),
					RequestsHandler.getCnxUrl(""),
					RequestsHandler.getCnxUserID(""),
					RequestsHandler.getCnxPassword("")
				);
				
				reintentos_++;
			}		
			if (pending_)
				return false;
			return true;		
		}catch(Exception e){
			return false;
		}catch(Throwable t){			
			t.printStackTrace();
			return false;
		}
		*/
		return true;		
	}	

	public Long getGrossNegative(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			/*
			SELECT
			coalesce((SELECT SUM(GROSSNEG) FROM TPOS_HEADER WHERE TRANSTYPE=0 AND INDICAT112=0 and STORE = $P{pStore} and  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})  ), 0)-
			coalesce((SELECT SUM(GROSSNEG) FROM TPOS_HEADER WHERE TRANSTYPE=0 AND INDICAT112=1 and STORE = $P{pStore} and  DAY between date ($P!{pFechaIni}) AND date ($P!{pFechaFin})  ), 0) AS GROSSNEGATIVO
			FROM SYSIBM.SYSDUMMY1
			*/  

			String select_ = "coalesce((SELECT SUM(GROSSNEG) FROM TPOS_HEADER WHERE TRANSTYPE=0 AND INDICAT112=0 and STORE = "+pAlmacen+" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ), 0)-"+
							 "coalesce((SELECT SUM(GROSSNEG) FROM TPOS_HEADER WHERE TRANSTYPE=0 AND INDICAT112=1 and STORE = "+pAlmacen+" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')  ), 0)"+
							 " AS VALUE";

			
			String where_= "";
			System.out.println("Select "+select_+" from SYSIBM.SYSDUMMY1 WHERE "+where_);
			List res_ = DBUtil.select(select_,
					"SYSIBM.SYSDUMMY1",
					where_,
					GROSS_NEGATIVE_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				GROSS_NEGATIVE_Imp ansObj_ = (GROSS_NEGATIVE_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}		

	public Long getGrossSales(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException {
		Long answer_ = null;
		
		String idCiudad_=null;

		try {
			String select_ = "coalesce ((SELECT SUM(XPRICE) AS VBRUTAS FROM TPOS_ITEMENTRY WHERE INDICAT31<>2 AND INDICAT31<>4 AND INDICAT31<>5 AND INDICAT31<>7 AND INDICAT31<>8 AND INDICAT211<>1 "+
			 				 "and STORE = "+pAlmacen +" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')),0)-"+
							 "coalesce ((SELECT SUM(XPRICE) AS VBRUTAS FROM TPOS_ITEMENTRY WHERE INDICAT31<>2 AND INDICAT31<>4 AND INDICAT31<>5 AND INDICAT31<>7 AND INDICAT31<>8 AND INDICAT211=1 "+
			 				 "and STORE = "+pAlmacen+" and  FECHAHORA between TIMESTAMP ('"+pFechaHoraInicial+"') AND TIMESTAMP ('"+pFechaHoraFinal+"')),0) as VALUE";
			//FROM
			String where_= "";
			System.out.println("Select "+select_+" from SYSIBM.SYSDUMMY1");
			//if (nombre_!=null && !nombre_.equals(""))
			//	where_+= " AND UPPER(b.DSCECO) LIKE '%" + nombre_.toUpperCase() + "%'";
			//if (idCiudad_!=null && !idCiudad_.equals("-1"))
			//	where_+= " AND b.coddst = " + idCiudad_;

			/*
			res_ = DBUtil.select(" a.CODCCO, a.DIRIP IP, b.DSCECO NOMBRE,b.SOCMUN CITY_NAME,b.SOCDIR DIRECC, b.NADMON ADM_NAME ",
					"gcposaf1 a, gccecof b",
					where_,
					ALMACEN_Imp.class,
					ApplicationResources.TXONLINE_DB);
			*/						
			List res_ = DBUtil.select(select_,
					"SYSIBM.SYSDUMMY1",
					where_,
					GROSS_POSITIVE_Imp.class,
					ApplicationResources.TXONLINE_DB);
			if(res_!=null && res_.size()>0){
				GROSS_POSITIVE_Imp ansObj_ = (GROSS_POSITIVE_Imp)res_.get(0);
				answer_ = ansObj_.getVALUE();
			}
			
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}
		return answer_;		
	}
	
	public List buscarCierresAlmacenes(STORE_CLOSING pStoreClosing, int pPosIni, int pPosFin, String pFechaHora) throws ServiceException {
		List res_ = null;
		
		//String nombre_ = pAlmacen.getNOMBRE();
		//if(nombre_==null)
		//	nombre_ = "";
			
		String idCiudad_=null;
		//if(pAlmacen.getID_CITY()!=null)
		//	idCiudad_ = pAlmacen.getID_CITY().toString();

		try {
			//String select_ = "a.ID, a.ID_CITY, a.IP, a.AL_USER, a.PASSWORD, a.NOMBRE, a.DIRECC, a.TELEFONO, a.EMAIL, a.ADM_NAME, b.NOMBRE CITY_NAME";
			//String strDateTime_ = date_.getYear()+StringFormater.date_.getMonth()-1,date_.getDay(),date_.getHours(),date_.getMinutes(),date_.getSeconds(),0
			String select_ = "a.STORE, a.DAY, a.TFECHAHORA FECHAHORA";
			String where_= "a.TFECHAHORA IS NOT NULL AND STORE="+pStoreClosing.getSTORE()+" AND TFECHAHORA<=('"+pFechaHora+"') ORDER BY TFECHAHORA DESC";
			//if (nombre_!=null && !nombre_.equals(""))
			//	where_+= " AND UPPER(b.DSCECO) LIKE '%" + nombre_.toUpperCase() + "%'";
			//if (idCiudad_!=null && !idCiudad_.equals("-1"))
			//	where_+= " AND b.coddst = " + idCiudad_;
			System.out.println("Select "+select_+" from TPOS_STORE_CLOSING a where"+where_);				
			res_ = DBUtil.select(select_,
					"TPOS_STORE_CLOSING a",
					where_,
					" ",
					STORE_CLOSING_Imp.class,
					ApplicationResources.TXONLINE_DB,
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
