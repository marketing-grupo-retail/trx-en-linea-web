/*
 * Creado el 19/10/2004
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
//import com.grpretail.framework.business.exception.ServiceException;
import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceProvider;
//import com.grpretail.framework.business.factory.ServiceProvider;

/**
 * com.grpretail.business.marketonline.articulo - AlmacenBusinessDelegate.java
 * Alfonso Cadena
 * Grupo Retail Ltda.
 */
public interface ConciliacionBusinessDelegate extends ServiceProvider {

	/**
	 * Crea un almacen en el sistema
	 * @param pAlmacen
	 * @throws ServiceException
	 */
	public int createAlmacen(ALMACEN pAlmacen) throws ServiceException;

	public int modifyAlmacen(ALMACEN pAlmacen) throws ServiceException;	
	
	
	/**
	 * Actualiza los datos  de la tabla ALMACEN
	 *
	 * @param pAlmacen
	 * @throws ServiceException
	 */
	public void updateDatosAlmacen(ALMACEN pAlmacen) throws ServiceException;

	/**
	* Lista los datos  de la tabla ALMACEN
	*
	* @param pAlmacen
	* @throws ServiceException
	*/	
	public abstract List buscarAlmacenes(ALMACEN pAlmacen,String pCompany) throws ServiceException;
		
	//public abstract List buscarAlmacenes(ALMACEN pAlmacen, int pPosIni, int pPosFin,String pCompany) throws ServiceException;
	
	public abstract ALMACEN buscarAlmacen(ALMACEN pAlmacen,String pCompany) throws ServiceException;

	public abstract void deleteStores(List pAlmacenes) throws ServiceException;
	
	//public abstract List searchAlmacenesXGruposAlmacenes(ALM_X_GRPALM pAlmacenXGrupoAlmacenes) throws ServiceException;	
	
	public abstract List buscarAlmacenesAsociadosAGrupos(String [] pIDAlmacen) throws ServiceException;
	
	//public abstract List buscarAlmacenesAsociadosAGrupo(String pIDAlmacen,String pCompany) throws ServiceException;

	/**
	 * @param pAlmacen
	 * @param pAddFilter
	 * @param pPosIni
	 * @param pPosFin
	 * @return
	 */
	//public abstract List getAlmacenes(ALMACEN pAlmacen, String pAddFilter, int pPosIni, int pPosFin,String pCompany) throws ServiceException;
	
	public abstract List getStoreClosings(STORE_CLOSING pStoreClosing, int pPosIni, int pPosFin, String pFechaHora) throws ServiceException;
	public abstract Long getGrossSales(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getVoidedItemsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getRefundedItemsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getDiscountsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getMiscellaneous(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getVoidedTrxsAmount(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getGrossPositive(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getGrossNegative(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getCustomersOrTicketsNumber(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getSoldItemsNumber(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract Long getStoreCoupons(String pAlmacen, String pFechaHoraInicial, String pFechaHoraFinal) throws ServiceException;
	public abstract boolean insertStoreConciliation(STORE_CONCILIATION objToInsert_) throws ServiceException;
	
	
	
	
	//public abstract List buscarAlmacenesXId (String [] pIDAlmacen, String pCompany) throws ServiceException;

}
