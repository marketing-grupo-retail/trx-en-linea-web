/*
 * Creado el 03-jun-07
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.grpretail.business.transacciones.almacen;

import java.util.List;

import com.grpretail.business.transacciones.vo.ALMACEN;
import com.grpretail.business.transacciones.vo.STORE_CLOSING;
import com.grpretail.business.transacciones.vo.STORE_CONCILIATION;
//import com.grpretail.business.market.vo.ALM_X_GRPALM;
import com.asic.framework.exception.ServiceException;
import com.asic.transacciones.facade.ConciliacionFacadeAdapter;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class ConciliacionBusinessDelegate_Imp implements ConciliacionBusinessDelegate {
	
	private ConciliacionFacadeAdapter facade_ = null;
	

	public int createAlmacen(ALMACEN pAlmacen) throws ServiceException {
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.createAlmacen(pAlmacen);
	}

	public int modifyAlmacen(ALMACEN pAlmacen) throws ServiceException {
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.modifyAlmacen(pAlmacen);
	}


	public void deleteDatosAlmacen(List pAlmacen) throws ServiceException {
		

	}


	public void updateDatosAlmacen(ALMACEN pAlmacen) throws ServiceException {
		

	}


	public List buscarAlmacenes(ALMACEN pUser,String pCompany) throws ServiceException{
		ConciliacionFacadeAdapter facade_ = new ConciliacionFacadeAdapter();

		 return facade_.buscarAlmacenes(pUser, pCompany);
	}	
	
	public ALMACEN buscarAlmacen(ALMACEN pAlmacen,String pCompany) throws ServiceException{
		ConciliacionFacadeAdapter facade_ = new ConciliacionFacadeAdapter();
	 	return facade_.buscarAlmacen(pAlmacen,pCompany);
	}

	public void deleteStores(List pAlmacenes) throws ServiceException{
		ConciliacionFacadeAdapter facade_ = new ConciliacionFacadeAdapter();
		facade_.deleteStores(pAlmacenes);
	}

	/*
	public List searchAlmacenesXGruposAlmacenes(ALM_X_GRPALM pAlmacenXGrupoAlmacenes) throws ServiceException{
		AlmacenFacadeAdapter facade_ = new AlmacenFacadeAdapter();
		return facade_.searchAlmacenesXGruposAlmacenes(pAlmacenXGrupoAlmacenes);
	}
	*/

	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#buscarAlmacenesAsociadosAGrupos(java.lang.String[])
	 */
	public List buscarAlmacenesAsociadosAGrupos(String[] pIDAlmacen) throws ServiceException {
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.buscarAlmacenesAsociadosAGrupos(pIDAlmacen);
	}

	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#buscarAlmacenes(com.grpretail.business.market.vo.ALMACEN, int, int)
	 */
	public List buscarAlmacenes(ALMACEN pAlmacen, int pPosIni, int pPosFin,String pCompany) throws ServiceException {
		facade_ = new ConciliacionFacadeAdapter();
		//return facade_.buscarAlmacenes(pAlmacen, pPosIni, pPosFin,pCompany);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#buscarAlmacenesAsociadosAGrupo(java.lang.String)
	 */
	public List buscarAlmacenesAsociadosAGrupo(String pIDAlmacen,String pCompany) throws ServiceException {
		facade_ = new ConciliacionFacadeAdapter();
		//return facade_.buscarAlmacenesAsociadosAGrupo(pIDAlmacen,pCompany);
		return null;
	}

	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#getAlmacenes(com.grpretail.business.market.vo.ALMACEN, java.lang.String, int, int)
	 */
	public List getAlmacenes(ALMACEN pAlmacen, String pAddFilter, int pPosIni, int pPosFin,String pCompany) throws ServiceException {
		facade_ = new ConciliacionFacadeAdapter();
		//return facade_.getAlmacenes(pAlmacen, pAddFilter, pPosIni, pPosFin,pCompany);
		return null;
	}
	
	public List getStoreClosings(STORE_CLOSING pStoreClosing, int pPosIni, int pPosFin, String pFechaHora) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getStoreClosings(pStoreClosing, pPosIni, pPosFin, pFechaHora);
	}
	
	public Long getGrossSales(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getGrossSales(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}
	
	public Long getVoidedItemsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getVoidedItemsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}	
	
	public Long getDiscountsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getDiscountsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}	
	
	public Long getMiscellaneous(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getMiscellaneous(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}
	
	public Long getRefundedItemsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getRefundedItemsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}
	
	public Long getVoidedTrxsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getVoidedTrxsAmount(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}
	
	public Long getGrossPositive(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getGrossPositive(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}

	public Long getGrossNegative(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getGrossNegative(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}
					
	public Long getCustomersOrTicketsNumber(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getCustomersOrTicketsNumber(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}
	
	public Long getSoldItemsNumber(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getSoldItemsNumber(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}
	
	public Long getStoreCoupons(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.getStoreCoupons(pAlmacen, pFechaHoraInicial, pFechaHoraFinal);		
	}		

	public boolean insertStoreConciliation(STORE_CONCILIATION objToInsert_) throws ServiceException{
		facade_ = new ConciliacionFacadeAdapter();
		return facade_.insertStoreConciliation(objToInsert_);		
	}

	/* (non-Javadoc)
	 * @see com.grpretail.business.marketonline.almacen.AlmacenBusinessDelegate#buscarAlmacenesXId(java.lang.String[])
	 */
	/* 
	public List buscarAlmacenesXId(String[] pIDAlmacen,String pCompany) throws ServiceException {
		facade_ = new AlmacenFacadeAdapter();
		return facade_.buscarAlmacenesXId(pIDAlmacen,pCompany);
	}
	*/

}
