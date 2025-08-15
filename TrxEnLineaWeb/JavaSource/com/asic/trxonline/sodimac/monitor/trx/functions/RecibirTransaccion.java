/**
 * @author Alfonso Cadena ASIC Consuting Group
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.trxonline.sodimac.monitor.trx.functions;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import org.ramm.jwaf.logger.LogWriter;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.ac.utils.Manejaformato;
import com.asic.author.manager.trx.PosTransaction;
import com.asic.framework.exception.NoSaleTransactionException;
import com.asic.framework.exception.TransactionExistsException;
import com.asic.framework.servlets.ApplicationInitServlet;
import com.asic.transacciones.helpers.DemoHelper;
import com.asic.transacciones.helpers.GeneradorMensajeHelper;
import com.asic.transacciones.helpers.MQAdminHelper;
import com.asic.trxonline.sma.strings.AbstractTrxString;
import com.asic.trxonline.sodimac.monitor.trx.UserServerAnswer;
import com.asic.trxonline.tramas.TramaOrganizer;
import com.grpretail.trxonline.exception.StoreNotFoundException;
import com.grpretail.trxonline.helpers.AuthorizerDBHelper;
import com.grpretail.trxonline.vos.StoreVo;

public class RecibirTransaccion extends PosTransaction {
	static int cont_ = 0;
	protected int posOrigen; // Posición en la trama del origen de la trx.
	protected String Origen; // Posición del origen de la trx.
	//protected int posNumLineaTrxFile;   // Posición en la trama de la línea en el archivo de trx.
	//protected String NumLineaTrxFile;   // Posición de la trx en el archivo de transacciones
	protected int posCurrPartNum; // Posición del número de parte actual del mensaje
	protected String CurrPartNum; // Número de parte actual del mensaje.
	protected int posTotalPartNum; // Posición del número de partes total del mensaje.
	protected String totalPartNum; // Número de parte actual del mensaje.
	protected int posTramaProcesar; // Posición de la trama o segmento de trama a procesar.
	protected String tramaProcesar; // Trama o segmento de trama a procesar.	
	public static final int ANCHO_TOTAL_TRAMA;
	public static final double RECEIVE_CHECKOUT_QUEUED_TRXONLINE_FUNCTION_CODE = 9994;
	public static final double RECEIVE_QUEUED_TRXONLINE_FUNCTION_CODE = 9995;
	public static final double RECEIVE_TRXONLINE_FUNCTION_CODE = 9996;
	private static Hashtable stores;
	static List theStoresList;

	static {
		String codProcesarTramaEncoladaCheckout_ = Manejaformato.formatoNumero(RECEIVE_CHECKOUT_QUEUED_TRXONLINE_FUNCTION_CODE, "0000");
		String codProcesarTramaEncolada_ = Manejaformato.formatoNumero(RECEIVE_QUEUED_TRXONLINE_FUNCTION_CODE, "0000");
		String codProcesarTrama_ = Manejaformato.formatoNumero(RECEIVE_TRXONLINE_FUNCTION_CODE, "0000");

		int[] arregloDatosPtos_ = new int[] {
			1, // Origen de la trx, {1:En línea,2:Batch}
			2, // Trama actual 
			2, // Trama total
			10000 // Trama a procesar.
			//100000 // Trama a procesar.
		};
		aParseDatos.put(codProcesarTrama_, arregloDatosPtos_);
		aParseRespuesta.put(codProcesarTrama_, new int[] {
		});
		
		aParseDatos.put(codProcesarTramaEncolada_, arregloDatosPtos_);
		aParseRespuesta.put(codProcesarTramaEncolada_, new int[] {
		});	
		
		aParseDatos.put(codProcesarTramaEncoladaCheckout_, arregloDatosPtos_);
		aParseRespuesta.put(codProcesarTramaEncoladaCheckout_, new int[] {
		});				

		int ancho_ = 0;
		for (int i = 0; i < arregloDatosPtos_.length; i++) {
			ancho_ += arregloDatosPtos_[i];
		}
		ANCHO_TOTAL_TRAMA = ANCHO_SOLICITUD_GENERICA + ancho_;
	}

	/**
	 * Constructor for ActualizaPuntos
	 */
	public RecibirTransaccion() throws Exception {
		super();
	}

	public void setTrama(String pTrama) throws Exception {
		super.setTrama(pTrama);
	}

	public static int getLongitudTrama() {
		return ANCHO_TOTAL_TRAMA;
	}

	/**
	 * @see PosTransaction#execute()
	 */
	public Object execute() {
		List res_ = null;

		GeneradorMensajeHelper generador_ = new GeneradorMensajeHelper();
		//MQAdminHelper helperMQ_ = new MQAdminHelper();
		try {
			//ApplicationInitServlet init_ = new ApplicationInitServlet();
			//init_.init();
			//System.out.println("Desde el execute");
			//System.out.println("getFechaHoraInicioTrx()->"+getFechaHoraInicioTrx());

			System.out.println("getMod(getTramaProcesar())->"+getMod(getTramaProcesar()));
			System.out.println("Longitud de getTramaProcesar()->"+getTramaProcesar().length());
			//System.out.println("getMod(getTramaProcesar(.substring(4)))->"+getMod(getTramaProcesar().substring(4)));
			System.out.println("getMod que trae desde el POS->"+getLongitud());
			//System.out.println("Mod Trxonline V 1.6 Feb 07 de 2016");
			//System.out.println("Mod Trxonline V 1.6 Jun 27 de 2016");
			//System.out.println("Mod Trxonline V 1.7 Oct 21 de 2016");
			//System.out.println("Mod Trxonline V 1.8 Abr 28 de 2017");
			//System.out.println("Mod Trxonline V 1.9 Nov 10 de 2017");
			//System.out.println("Mod Trxonline V 2.0 Nov 16 de 2020");
			//System.out.println("Mod Trxonline V 2.1 Mayo 24 de 2023");
			//System.out.println("Mod Trxonline V 2.2 DESA Agosto 12 de 2023");
			//System.out.println("Mod Trxonline V 2.2 DESA Agosto 31 de 2023");
			//System.out.println("Mod Trxonline V 2.3 Julio 15 de 2024");
			System.out.println("Mod Trxonline V 2.4 Septiembre 30 de 2024");
			if (getMod(getTramaProcesar())==getLongitud()){
				if(getSupportStore(getTienda())){
					if (!getStore(getTienda())){
						setStore(getTienda());
						String key_ = getAplicacion() + getFuncion() + getTienda() + getConsecutivo() + getFechaHoraInicioTrx();
						//ReadTLogTest.printChars(getTramaProcesar());
						String tramToQueue_ = TramaOrganizer.composeTrama(getTramaProcesar(), key_, Integer.valueOf(getCurrPartNum()).intValue(), Integer.valueOf(getTotalPartNum()).intValue());
						byte[] tramaBytes_ = getTramaProcesar().getBytes();
						//String tramaBytesStr_ = "";
						//for (int i=0;i<tramaBytes_.length;i++)
							//tramaBytesStr_+="-"+tramaBytes_[i];
						//System.out.println("Trama en bytes->"+tramaBytesStr_);	
						    
						if (tramToQueue_ != null && !TramaOrganizer.TramaInQueue(tramToQueue_)) {
							tramToQueue_ = tramToQueue_.trim();
							System.out.println("************** Trama en el archivo:" + getConsecutivo() + "**************");
							//System.out.println("Trama a encolar->"+TramaOrganizer.getTrxTramaArray(tramToQueue_,(new Integer(getTienda())).intValue(),(new Integer(getConsecutivo())).intValue()));
							cont_++;
							LogWriter.getLog().log(LogWriter.INFO, "TRAMA GENERADA:" + cont_);
							//System.out.println("************** Trama en el archivo:"+getConsecutivo()+"**************");
							//System.out.println("Trama a encolar->"+TramaOrganizer.getTrxTramaArray(tramToQueue_,(new Integer(getTienda())).intValue(),(new Integer(getConsecutivo())).intValue()));
							
							//Generar VO TRANSACCION
							//generador_.generarMensaje(TramaOrganizer.getTrxTramaArray(tramToQueue_,getTienda(),getConsecutivo()));
							//@ TODO Enviar mensaje a la cola
							//System.out.println("Trama completa->"+tramToQueue_);
							AbstractTrxString[] trama_ = TramaOrganizer.getTrxTramaArray(tramToQueue_, (new Integer(getTienda())).intValue(), (new Integer(getConsecutivo())).intValue());
			
							Object mensaje_ = generador_.generarMensaje(trama_);
							DemoHelper dmp_=new DemoHelper();
							boolean answer_ = dmp_.insertRecord(mensaje_);
							if (!answer_){// CACS: Hubo un error insertando la trama
								/*if (mensaje_ != null) {
									LogWriter.getLog().log(LogWriter.WARNING, "MENSAJE GENERADO:" + cont_);
									//Enviar mensaje a la cola
									helperMQ_.enviarMensajeCola(mensaje_);
									LogWriter.getLog().log(LogWriter.WARNING, "MENSAJE ENVIADOS:" + cont_);
								}*/
								setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_ERROR_DESCONOCIDO));
								setCodRespuesta(ID_APPL_ERROR_CODE);
								setCodControl(ID_TRX_SUCCESS_CODE);						
							}else{
								setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_TOTAL_TRAMA_STORED));
								//setCodRespuesta(ID_APPL_ERROR_CODE);
								setCodRespuesta(ID_APPL_SUCCESS_CODE);
								setCodControl(ID_TRX_SUCCESS_CODE);						
							}
		
						} else {
							setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_PARTIAL_TRAMA_STORED));
							setCodRespuesta(ID_APPL_SUCCESS_CODE);
							setCodControl(ID_TRX_SUCCESS_CODE);
						}
						removeStore(getTienda());
					}else{
						setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_STORE_PENDING_TRX));
						setCodRespuesta(ID_APPL_ERROR_CODE);
						setCodControl(ID_TRX_SUCCESS_CODE);					
					}
				}else{
					setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_DB_STORE_GETTING_ERROR));
					setCodRespuesta(ID_APPL_ERROR_CODE);
					setCodControl(ID_TRX_SUCCESS_CODE);					
				}
			}else{ // Validar que no pasó la prueba del módulo 1000.
				setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_RECEIVED_BAD_TRAMA));
				setCodRespuesta(ID_APPL_ERROR_CODE);
				setCodControl(ID_TRX_SUCCESS_CODE);				
			}

		}catch (NoSaleTransactionException e){
			removeStore(getTienda());
			e.printStackTrace();
			setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_IS_NOT_SALES_TRANSACCION));
			setCodRespuesta(ID_APPL_SUCCESS_CODE);
			setCodControl(ID_TRX_SUCCESS_CODE);				 
		}catch (TransactionExistsException e) {
			removeStore(getTienda());
			//e.printStackTrace();
			setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_TRANSACCION_YA_REGISTRADA));
			setCodRespuesta(ID_APPL_SUCCESS_CODE);
			setCodControl(ID_TRX_SUCCESS_CODE);
			//LogWriter.getLog().log(LogWriter.WARNING, "Generando mensaje [execute(...) en RecibirTransaccion", e);
			
		}catch(StoreNotFoundException e){
			e.printStackTrace();
			setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_SUPPORT_STORE_NOT_FOUND_IN_DB));
			setCodRespuesta(ID_APPL_ERROR_CODE);
			setCodControl(ID_TRX_SUCCESS_CODE);			
			AuthorizerDBHelper.insertSupportStore(getTienda());
		}catch (Exception e) {
			removeStore(getTienda());
			e.printStackTrace();
			setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_ERROR_DESCONOCIDO));
			setCodRespuesta(ID_APPL_ERROR_CODE);
			setCodControl(ID_TRX_SUCCESS_CODE);
			//LogWriter.getLog().log(LogWriter.WARNING, "Generando mensaje [execute(...) en RecibirTransaccion", e);
			
		} catch (Throwable t){
			removeStore(getTienda());
			t.printStackTrace();
			setRespuestaServidor(getRespuestaServidor(UserServerAnswer.ID_ERROR_DESCONOCIDO));
			setCodRespuesta(ID_APPL_ERROR_CODE);
			setCodControl(ID_TRX_SUCCESS_CODE);
			//LogWriter.getLog().log(LogWriter.WARNING, "Generando mensaje [execute(...) en RecibirTransaccion", t);
		} finally {
			aRta.setRespuestaHost(getRespuestaServidor().getCodigo());
			aRta.setMensajeHost(getRespuestaServidor().getMensaje());
		}
		/*
		System.out.println("[Trama de entrada] "+getTotalTrama()+" [Salida]"+
		"toString->"+getRespuesta()+
		"CodRespuesta->"+getRespuesta().getCodRespuesta()+
		"CodRtaTrx->"+getRespuesta().getCodRtaTrans()+
		"Mensaje Host->"+getRespuesta().getMensajeHost()+
		"Rta Host->"+getRespuesta().getRespuestaHost()+
		"Rta no genérica->"+getRespuesta().getRespuestaNoGenerica());*/
		return (Object) getRespuesta();
	}

	/**
	 * @see PosTransaction#setOtrosParam(int)
	 */
	public void setOtrosParam(int pAF) {
		setPosOrigen(0);
		setOrigen(getDatosElement(getPosOrigen()).trim());
		setPosCurrPartNum(1);
		setCurrPartNum(getDatosElement(getPosCurrPartNum()).trim());
		setPosTotalPartNum(2);
		setTotalPartNum(getDatosElement(getPosTotalPartNum()).trim());
		setPosTramaProcesar(3);
		setTramaProcesar(getDatosElement(getPosTramaProcesar()).trim());
	}
	
	void setStore(String pStore){
		if(stores==null)
			stores=new Hashtable();		
		stores.put(pStore,new Date());
		
	}
	
	synchronized boolean getStore(String pStore){
		if(stores==null){
			stores=new Hashtable();
			setStore(pStore);
			return false;
		}
		System.out.println("No stores concurrentes->"+stores.size());
		if(stores.get(pStore)==null){
			setStore(pStore);
			return false;
		}else{
			Date dt_ = (Date)stores.get(pStore);
			Date currDt_ = new Date();
			if ((currDt_.getTime()-dt_.getTime())>3600000 || (currDt_.getTime()-dt_.getTime())<0)
				stores.remove(pStore);
		}
			
		return true;	
	}
	
	boolean getSupportStore(String pStoreNum) throws DBAccessException, StoreNotFoundException{
		//return true;
		boolean answer_ = false;
		if(theStoresList == null)
			theStoresList = new ArrayList();
		if(theStoresList.size()>0){
			long store_ = Long.parseLong(pStoreNum);
			for(int i=0;i<theStoresList.size();i++){
				StoreVo storeVo_ = (StoreVo)theStoresList.get(i);
				if(storeVo_ != null && storeVo_.getStoreNumber() == store_){
					answer_ = true;
					i = theStoresList.size();
				}		
			}	
		}		
		if(!answer_){
			try {
				if(AuthorizerDBHelper.existsDBStore(pStoreNum)){
					StoreVo store_ = new StoreVo();
					store_.setStoreNumber(Long.parseLong(pStoreNum));
					theStoresList.add(store_);
					answer_ = true;
				}
			} catch (DBAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return answer_;
	}	
	
	
	void removeStore(String pStore){
		if(stores==null)
			stores=new Hashtable();		
		stores.remove(pStore);
	}

	/**
	 * @return
	 */
	public String getTramaProcesar() {
		return tramaProcesar;
	}

	/**
	 * @param string
	 */
	public void setTramaProcesar(String string) {
		tramaProcesar = string;
	}

	/**
	 * @param i
	 */
	public void setPosTramaProcesar(int i) {
		posTramaProcesar = i;
	}

	/**
	 * @return
	 */
	public int getPosTramaProcesar() {
		return posTramaProcesar;
	}

	/**
	 * @return
	 */
	public String getCurrPartNum() {
		return CurrPartNum;
	}

	/**
	 * @return
	 */
	public int getPosCurrPartNum() {
		return posCurrPartNum;
	}

	/**
	 * @return
	 */
	public int getPosTotalPartNum() {
		return posTotalPartNum;
	}

	/**
	 * @return
	 */
	public String getTotalPartNum() {
		return totalPartNum;
	}

	/*	public String getNumLineaTrxFile() {
			return NumLineaTrxFile;
		}
	
		public int getPosNumLineaTrxFile() {
			return posNumLineaTrxFile;
		}	
	
		public void setNumLineaTrxFile(String string) {
			NumLineaTrxFile = string;
		}
	
		public void setPosNumLineaTrxFile(int i) {
			posNumLineaTrxFile = i;
		}*/

	/**
	 * @param string
	 */
	public void setCurrPartNum(String string) {
		CurrPartNum = string;
	}

	/**
	 * @param i
	 */
	public void setPosCurrPartNum(int i) {
		posCurrPartNum = i;
	}

	/**
	 * @param i
	 */
	public void setPosTotalPartNum(int i) {
		posTotalPartNum = i;
	}

	/**
	 * @param string
	 */
	public void setTotalPartNum(String string) {
		totalPartNum = string;
	}

	/**
	 * @return
	 */
	public String getOrigen() {
		return Origen;
	}

	/**
	 * @return
	 */
	public int getPosOrigen() {
		return posOrigen;
	}

	/**
	 * @param string
	 */
	public void setOrigen(String string) {
		Origen = string;
	}

	/**
	 * @param i
	 */
	public void setPosOrigen(int i) {
		posOrigen = i;
	}
	
	public long getMod(String pStr){
		long totMod_ = 0;
		for (int i=0;i<pStr.length();i++){
			char ch_ = pStr.charAt(i);
			totMod_+=ch_;
			//System.out.println(ch_);
			//System.out.println(str_.substring(i,i+1));
		}
		System.out.println("totMod_->"+totMod_);
		long mod_ = totMod_%999;
		return mod_;
	}	

	/**
	 * @return
	 */
	public List getTheStoresList() {
		return theStoresList;
	}

	/**
	 * @param list
	 */
	public void setTheStoresList(List list) {
		theStoresList = list;
	}

}
