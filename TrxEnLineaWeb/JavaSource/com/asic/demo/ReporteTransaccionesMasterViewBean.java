/*
 * Creado el 23/06/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.demo;

/**
 * @author ACadena
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */

import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import org.ramm.jwaf.locator.FailedLocatingPropertiesFileException;
import org.ramm.jwaf.locator.ResourceLocator;

import com.asic.ac.utils.NumberFormatter;
import com.asic.demo.vos.NumeroRegistros;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TPOS_ITEMENTRY;
//import com.asic.transacciones.vo.TRANSACCION;
//import com.asic.transacciones.vo.TRANSACCION;

/**
 * @author Administrator
 *
 * To change this generated comment edit the template variable "typecomment":
 * Window>Preferences>Java>Templates.
 * To enable and disable the creation of type comments go to
 * Window>Preferences>Java>Code Generation.
 */
public class ReporteTransaccionesMasterViewBean {
	
	private List transaccionesList;
	private List HeadersList;
	private List ItemsList;
	private List numeroRegList;
	
	private Iterator clientesIterator;
	private Iterator numRegIterator;
	private TPOS_HEADER transaccionObj;
	private TPOS_HEADER HeaderObj;
	private TPOS_ITEMENTRY ItemObj;
	private NumeroRegistros numeroRegistrosObj;
	
	
	private String filterNumBono;
	private String filterAlmacen;
	private String filterFrom;
	private String filterTo;
	private ResourceBundle bundle_;
	private int numeroRegistros;
	
	public static final String DBSETTINGS_FILENAME	= "OtrosParametros";
	
	public ReporteTransaccionesMasterViewBean()
	{
		try{	
			bundle_ = ResourceLocator.get(DBSETTINGS_FILENAME);
		}catch (FailedLocatingPropertiesFileException ex) {
			System.out.println(ex);
		}
	}
	
	public void execute(String limInf, String limSup) {
		
		try {
	
			// Ejecucion
			TransaccionesDAO_DBUtil trxDBUtilDAO_ = new TransaccionesDAO_DBUtil();
			trxDBUtilDAO_.setFilterNumBono(filterNumBono);
			trxDBUtilDAO_.setFilterAlmacen(filterAlmacen);
			trxDBUtilDAO_.setFilterFrom(filterFrom);
			trxDBUtilDAO_.setFilterTo(filterTo);
			numeroRegList= trxDBUtilDAO_.contarRegistros();
			setNumeroRegistros(obtenerNumeroRegistros());
			transaccionesList = trxDBUtilDAO_.selectVO(limInf,limSup);
			
		} catch (Exception ex) {
		}
		
		
	}

	public void executeDetalle(String pTienda, String pTerminal, String pTrx) {
		
		try {
	
			// Ejecucion
			TransaccionesDAO_DBUtil trxDBUtilDAO_ = new TransaccionesDAO_DBUtil();
			//trxDBUtilDAO_.setFilterNumBono(filterNumBono);
			//trxDBUtilDAO_.setFilterAlmacen(filterAlmacen);
			//trxDBUtilDAO_.setFilterFrom(filterFrom);
			//trxDBUtilDAO_.setFilterTo(filterTo);
			//numeroRegList= trxDBUtilDAO_.contarRegistros();
			//setNumeroRegistros(obtenerNumeroRegistros());
			HeadersList = trxDBUtilDAO_.getHeader(pTienda,pTerminal,pTrx);
			ItemsList= trxDBUtilDAO_.getItems(pTienda,pTerminal,pTrx);
			
		} catch (Exception ex) {
		}
		
		
	}
	
	public void setNumeroRegistros (int numReg){
		numeroRegistros=numReg;
	}
	
	public int getNumeroRegistros (){
		return numeroRegistros;
	}	
	
	private int obtenerNumeroRegistros(){
		int answer_=0;
		if (numeroRegList != null) {
				numRegIterator = numeroRegList.iterator();
			}
			if (numRegIterator.hasNext()) {
				numeroRegistrosObj =  (NumeroRegistros)numRegIterator.next();
				answer_=numeroRegistrosObj.getNum_reg();
				return answer_;

			}
		return answer_;		
	}
	
	public boolean next() {
		if (transaccionesList != null) {
			if (clientesIterator == null) {
				clientesIterator = transaccionesList.iterator();
			}
			if (clientesIterator.hasNext()) {
				transaccionObj =  (TPOS_HEADER)clientesIterator.next();
				return true;
			}
		}
		return false;
	}

	public boolean nextHeader() {
		if (HeadersList != null) {
			if (clientesIterator == null) {
				clientesIterator = HeadersList.iterator();
			}
			if (clientesIterator.hasNext()) {
				HeaderObj =  (TPOS_HEADER)clientesIterator.next();
				return true;
			}
		}
		return false;
	}

	public boolean IEnext() {
		if (ItemsList != null) {
			if (clientesIterator == null) {
				clientesIterator = ItemsList.iterator();
			}
			if (clientesIterator.hasNext()) {
				ItemObj =  (TPOS_ITEMENTRY)clientesIterator.next();
				return true;
			}
		}
		return false;
	}
		
	public boolean first() {
		if (transaccionesList != null) {
			clientesIterator = transaccionesList.iterator();
			return next();
		} else {
			return false;
		}
	}

	public boolean firstHeader() {
		if (HeadersList != null) {
			clientesIterator = HeadersList.iterator();
			return nextHeader();
		} else {
			return false;
		}
	}

	public boolean IEfirst() {
		if (ItemsList != null) {
			clientesIterator = ItemsList.iterator();
			return IEnext();
		} else {
			return false;
		}
	}

	public String getTransNum(){
		String answer_ = "";
		if (transaccionObj != null){
			answer_ = ""+transaccionObj.getTRANSNUM().intValue();
		}
		return answer_;
	}	

	public String getHTransNum(){
		String answer_ = "";
		if (HeaderObj != null){
			answer_ = ""+HeaderObj.getTRANSNUM().intValue();
		}
		return answer_;
	}		
	public String getIECodigoItem(){
		String answer_ = "";
		if (ItemObj != null){
			answer_ = ""+ItemObj.getITEMCODE().intValue();
		}
		return answer_;		
	}
	
	public String getIEPrecio(){
		String answer_ = "";
		if (ItemObj != null){
			answer_ = NumberFormatter.formatoMoneda(ItemObj.getXPRICE().intValue());
		}
		return answer_;		
	}	
	
	public String getIEMpgroup(){
		String answer_ = "";
		if (ItemObj != null){
			answer_ = ""+ItemObj.getMPGROUP().intValue();
		}
		return answer_;		
	}	
	
	public String getIEDealquan(){
		String answer_ = "";
		if (ItemObj != null){
			answer_ = NumberFormatter.formatoMoneda(ItemObj.getSALEPRICE().intValue());
		}
		return answer_;		
	}
	
	public String getIESalequan(){
		String answer_ = "";
		if (ItemObj != null){
			answer_ = ""+ItemObj.getQTYORWGT().intValue();
		}
		return answer_;		
	}
	public String getAplicacion(){
		String answer_ = null;
		/*if (transaccionObj != null){
			answer_ = transaccionObj.getAplicacion();
		}*/
		return answer_;
	}
	
	public String getFuncion(){
		String answer_ = null;
		/*if (transaccionObj != null){
			answer_ = transaccionObj.getFuncion();
		}*/
		return answer_;
	}
	

	public String getTerminal(){
		String answer_ = null;
		if (transaccionObj != null){
			answer_ = ""+transaccionObj.getTERMINAL().intValue();
		}
		return answer_;
	}

	public String getHTerminal(){
		String answer_ = null;
		if (HeaderObj != null){
			answer_ = ""+HeaderObj.getTERMINAL().intValue();
		}
		return answer_;
	}

	public String getConsecut_retail(){
		String answer_ = null;
		/*if (transaccionObj != null){
			answer_ = transaccionObj.getConsecut_retail();
		}*/
		return answer_;
	}
	
	public String getFecha_hora_trx_pos(){
		String answer_ = null;
		/*if (transaccionObj != null){
			answer_ = transaccionObj.getFecha_hora_trx_pos();
		}*/
		return answer_;
	}

	public String getEstado(){
		String answer_ = null;
		/*if (transaccionObj != null){
			answer_ = transaccionObj.getEstado();
		}*/
		return answer_;
	}

	public String getNum_bonos(){
		String answer_ = null;
		/*if (transaccionObj != null){
			answer_ =transaccionObj.getNum_bonos();
		}*/
		return answer_;
	}
	
	public String getValor_unitario(){
		String answer_ = null;
		Double tmp;
		if (transaccionObj != null){
		//	try{
		//		tmp=new Double(transaccionObj.getValor_unitario());				
		//	}catch(Exception e){
				tmp=new Double(0);
		//	}

			answer_ = NumberFormatter.formatoMoneda(tmp.doubleValue());
		}
		return answer_;

	}
	
	public String getFecha_hora_tran(){
		String answer_ = null;
		if (transaccionObj != null){
			answer_ = transaccionObj.getDAY()+transaccionObj.getTIME();
		}
		return answer_;

	}

	public String getHFecha_hora_tran(){
		String answer_ = null;
		if (HeaderObj != null){
			answer_ = HeaderObj.getDAY()+HeaderObj.getTIME();
		}
		return answer_;

	}

	public String getCadena(){
		String answer_ = null;
		/*if (transaccionObj != null){
			answer_ = ""+transaccionObj.getSTORE().intValue();
		}*/
		return answer_;

	}	
	
	public String getTienda(){
		String answer_ = null;
		if (transaccionObj != null){
			answer_ = ""+transaccionObj.getSTORE().intValue();
		}
		return answer_;

	}

	public String getHTienda(){
		String answer_ = null;
		if (HeaderObj != null){
			answer_ = ""+HeaderObj.getSTORE().intValue();
		}
		return answer_;

	}
	
	public String getFecha_hora_trx(){
		String answer_ = null;
		/*if (transaccionObj != null){
			answer_ = transaccionObj.getFecha_hora_tran();
		}*/
		return answer_;

	}
		
	public String getOperador(){
		String answer_ = null;
		if (transaccionObj != null){
			answer_ = ""+transaccionObj.getOPERATOR().intValue();
		}
		return answer_;

	}

	public String getHOperador(){
		String answer_ = null;
		if (HeaderObj != null){
			answer_ = ""+HeaderObj.getOPERATOR().intValue();
		}
		return answer_;

	}
	public String getGrossPositivo(){
		String answer_ = null;
		if (transaccionObj != null){
			answer_ = NumberFormatter.formatoMoneda(transaccionObj.getGROSSPOS().doubleValue());
		}
		return answer_;

	}			

	public String getHGrossPositivo(){
		String answer_ = null;
		if (HeaderObj != null){
			answer_ = NumberFormatter.formatoMoneda(HeaderObj.getGROSSPOS().doubleValue());
		}
		return answer_;

	}

	public String getGrossNegativo(){
		String answer_ = null;
		if (transaccionObj != null){
			answer_ = NumberFormatter.formatoMoneda(transaccionObj.getGROSSNEG().doubleValue());
		}
		return answer_;

	}

	public String getHGrossNegativo(){
		String answer_ = null;
		if (HeaderObj != null){
			answer_ = NumberFormatter.formatoMoneda(HeaderObj.getGROSSNEG().doubleValue());
		}
		return answer_;

	}
		
	/**
	 * Returns the filterNumBono.
	 * @return String
	 */
	public String getFilterNumBono() {
		return filterNumBono;
	}

	/**
	 * Returns the filterAlmacen.
	 * @return String
	 */
	public String getFilterAlmacen() {
		return filterAlmacen;
	}

	/**
	 * Returns the filterFrom.
	 * @return String
	 */
	public String getFilterFrom() {
		return filterFrom;
	}
	
	/**
	 * Returns the filterTo.
	 * @return String
	 */
	public String getFilterTo() {
		return filterTo;
	}	
	
	public ResourceBundle getBundle(){
		return bundle_;
	}

	/**
	 * Sets the filterNumBono.
	 * @param filterNumBono The filterNumBono to set
	 */
	public void setFilterNumBono(String filterNumBono) {
		this.filterNumBono = filterNumBono;
	}

	/**
	 * Sets the filterAlmacen.
	 * @param filterAlmacen The filterAlmacen to set
	 */
	public void setFilterAlmacen(String filterAlmacen) {
		this.filterAlmacen = filterAlmacen;
	}

	/**
	 * Sets the filterFrom.
	 * @param filterFrom The filterFrom to set
	 */
	public void setFilterFrom(String filterFrom) {
		this.filterFrom = filterFrom;
	}
	
	/**
	 * Sets the filterTo.
	 * @param filterTo The filterTo to set
	 */
	public void setFilterTo(String filterTo) {
		this.filterTo = filterTo;
	}	

}