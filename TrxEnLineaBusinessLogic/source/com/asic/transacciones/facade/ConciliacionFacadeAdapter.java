/*
 * Creado el 03-jun-07
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.transacciones.facade;

import java.util.List;

import com.grpretail.business.transacciones.almacen.ConciliacionBusinessDelegate;
import com.grpretail.business.transacciones.vo.ALMACEN;
import com.grpretail.business.transacciones.vo.STORE_CLOSING;
import com.grpretail.business.transacciones.vo.STORE_CONCILIATION;
//import com.grpretail.business.market.vo.ALM_X_GRPALM;
import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.bean.AlmacenBean;
import com.asic.transacciones.bean.ConciliacionBean;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class ConciliacionFacadeAdapter implements ConciliacionBusinessDelegate {

	private AlmacenBean bean_ = null;

	/* (no Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#createAlmacen(com.grpretail.business.market.vo.ALMACEN)
	 */
	public int createAlmacen(ALMACEN pAlmacen) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.createAlmacen(pAlmacen);
	}

	public int modifyAlmacen(ALMACEN pAlmacen) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.modifyAlmacen(pAlmacen);
	}


	/* (no Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#updateDatosAlmacen(com.grpretail.business.market.vo.ALMACEN)
	 */
	public void updateDatosAlmacen(ALMACEN pAlmacen) throws ServiceException {


	}

	/* (no Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#getAlmacenes(com.grpretail.business.market.vo.ALMACEN)
	 */
	public List buscarAlmacenes(ALMACEN pAlmacen,String pCompany) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.buscarAlmacenes(pAlmacen,pCompany);
	}

	public ALMACEN buscarAlmacen(ALMACEN pAlmacen,String pCompany) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.buscarAlmacen(pAlmacen,pCompany);
	}

	public void deleteStores(List pAlmacenes) throws ServiceException {
		bean_ = new AlmacenBean();
		bean_.deleteStores(pAlmacenes);
	}
	
	/*
	public List searchAlmacenesXGruposAlmacenes(ALM_X_GRPALM pAlmacenXGrupoAlmacen) throws ServiceException{
		bean_ = new AlmacenBean();
		return bean_.searchAlmacenesXGruposAlmacenes(pAlmacenXGrupoAlmacen);
	}
	*/
	
	public List buscarAlmacenesAsociadosAGrupos(String [] pIDAlmacen) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.buscarAlmacenesAsociadosAGrupos(pIDAlmacen);
	}
	
	public List getStoreClosings(STORE_CLOSING pStoreClosing, int pPosIni, int pPosFin, String pFechaHora) throws ServiceException{
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.buscarCierresAlmacenes(pStoreClosing, pPosIni, pPosFin, pFechaHora);
	}
	
	public Long getGrossSales(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getGrossSales(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}
	
	public Long getVoidedItemsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getVoidedItemsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}	
	
	public Long getRefundedItemsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getRefundedItemsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}

	public Long getDiscountsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getDiscountsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}
	
	public Long getMiscellaneous(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getMiscellaneous(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}
			
	public Long getVoidedTrxsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getVoidedTrxsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}

	public Long getGrossPositive(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getGrossPositive(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}
		
	public Long getGrossNegative(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getGrossNegative(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}
	
	public Long getCustomersOrTicketsNumber(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getCustomersOrTicketsNumber(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}
	
	public Long getSoldItemsNumber(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getSoldItemsNumber(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}
		
	public Long getStoreCoupons(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.getStoreCoupons(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);
	}
	
	public boolean insertStoreConciliation(STORE_CONCILIATION objToInsert_) throws ServiceException{	
		ConciliacionBean bean_ = new ConciliacionBean();
		return bean_.insertStoreConciliation(objToInsert_);
	}
	
	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#buscarAlmacenes(com.grpretail.business.market.vo.ALMACEN, int, int)
	 */
	/* 
	public List buscarAlmacenes(ALMACEN pAlmacen, int pPosIni, int pPosFin,String pCompany) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.buscarAlmacenes(pAlmacen, pPosIni, pPosFin,pCompany);
	}
	*/

	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#buscarAlmacenesAsociadosAGrupo(java.lang.String)
	 */
	/* 
	public List buscarAlmacenesAsociadosAGrupo(String pIDGrpAlmacen,String pCompany) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.buscarAlmacenesAsociadosAGrupo(pIDGrpAlmacen,pCompany);
	}
	*/

	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#getAlmacenes(com.grpretail.business.market.vo.ALMACEN, java.lang.String, int, int)
	 */
	/* 
	public List getAlmacenes(ALMACEN pAlmacen, String pAddFilter, int pPosIni, int pPosFin,String pCompany) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.getAlmacenes(pAlmacen, pAddFilter, pPosIni, pPosFin,pCompany);
	}
	*/

	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#buscarAlmacenesXId(java.lang.String[])
	 */
	/* 
	public List buscarAlmacenesXId(String[] pIDAlmacen,String pCompany) throws ServiceException {
		bean_ = new AlmacenBean();
		return bean_.buscarAlmacenesXId(pIDAlmacen,pCompany);
	}
	*/
}
