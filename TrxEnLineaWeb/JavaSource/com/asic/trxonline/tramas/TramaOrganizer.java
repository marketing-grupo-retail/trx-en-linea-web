/*
 * Creado el 8/11/2005
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.trxonline.tramas;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;

import com.asic.trxonline.sma.strings.AbstractTrxString;
import com.asic.trxonline.sma.strings.ItemEntryExtString;
import com.asic.trxonline.tramas.SodimacVOs.SodDataEntryTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodDiscountTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodExceptionLogTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodFoodStampChangeTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodHeaderTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodItemEntryTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodItemRecordChargeTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodManagerOverrideTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodMiscellaneousCashItemTrackingTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodOperatorTrainingTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodPriceChangeTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodStoreClosingTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodTaxTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodTenderTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodTillChangeTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodTradingStampsTrama;
import com.asic.trxonline.tramas.SodimacVOs.SodUserDataReservedTrama;
import com.general.utils.ClassUtils;
import com.general.utils.KeyedFileUtils;

/**
 * @author Javier
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class TramaOrganizer {
	private final static int MAX_NODOS_ENCOLADOS=800;
	private final static boolean DEBUG=true;
	private static Hashtable tramaParts;
	private static String IVAValue_=null;
	
	private static Hashtable tramaTable = new Hashtable();
	static{
		// Tipos de registros en el tlog
		tramaTable.put("00",SodHeaderTrama.class);
		tramaTable.put("01",SodItemEntryTrama.class);
		tramaTable.put("02",ItemEntryExtString.class);
		tramaTable.put("03",SodDiscountTrama.class);
		tramaTable.put("04",SodDiscountTrama.class);
		tramaTable.put("05",SodTenderTrama.class);
		tramaTable.put("06",SodTenderTrama.class);
		tramaTable.put("07",SodTaxTrama.class);
		tramaTable.put("08",SodTaxTrama.class);
		tramaTable.put("09",SodTenderTrama.class);
		//tramaTable.put("09",SodFoodStampChangeTrama.class);
		tramaTable.put("10",SodManagerOverrideTrama.class);
		tramaTable.put("11",SodDataEntryTrama.class);
		tramaTable.put("12",SodPriceChangeTrama.class);
		tramaTable.put("13",SodTillChangeTrama.class);
		tramaTable.put("14",SodItemRecordChargeTrama.class);
		tramaTable.put("15",SodTradingStampsTrama.class);
		tramaTable.put("17",SodMiscellaneousCashItemTrackingTrama.class);		
		tramaTable.put("20",SodExceptionLogTrama.class);
		tramaTable.put("21",SodStoreClosingTrama.class);
		tramaTable.put("98",SodOperatorTrainingTrama.class);
		tramaTable.put("99",SodUserDataReservedTrama.class);
	}
	

	

	public static AbstractTrxString getTrxTrama(String pRecord){
		AbstractTrxString answer_ = null;
		try{		
		StringTokenizer str_ = new StringTokenizer(pRecord,AbstractTrxString.FIELD_SEPARATOR);
		//System.out.println("Token->"+str_.nextToken());
		//System.out.println("Token->"+str_.nextToken());
		//System.out.println("Longitud de todo el record->"+pRecord.length()); 
		String tmp_=str_.nextToken();
		/*if(tmp_.length()>1){
			tmp_=tmp_.substring(tmp_.length()-1,tmp_.length());
			System.out.println(tmp_);
		}*/			
		//System.out.println("Clave del String->"+tmp_+"-"+tmp_.length());
		//long tmp2_=KeyedFileUtils.unPack(tmp_);
		String trxType_=KeyedFileUtils.unPack2(tmp_);
		//System.out.println("Token desempacado->"+tmp2_);
		/*while (str_.hasMoreElements())
			System.out.println("Token->"+str_.nextToken());*/		
		/*String trxType_ = NumberFormatter.formatoNumero( 
			tmp2_,
			"00"
		);*/
		//if(trxType_.equals("01") || trxType_.equals("01"))
			//System.out.println("Trx type: *" + trxType_ + "*");
		Class class_ = (Class)tramaTable.get(trxType_);
		if(class_ != null)
			try {
				answer_ = (AbstractTrxString)ClassUtils.newInstance(class_,new Object[]{pRecord});
//				System.out.println("Clase intanciada->"+class_.getName());
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				System.out.println("Exception creating instance of " + class_.getName());
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}catch (Throwable e){
			e.printStackTrace();
		}
		//System.out.println("Answer_->"+answer_);
		return answer_;		
	}
	
	public static AbstractTrxString[] getTrxTramaArray(String pLogRecord, int pStore, int pNumLinea) throws Exception{
		String offSetY_=null,terminal_=null,transNum_=null,day_=null, time_=null, tipo_=null;
		int stringTotalNum_ = 0;
		int numStrings_=0;
		String trxType_ = "";
				
		//System.out.println(pLogRecord.length());
		// Se remueven las comillas de los extremos
				
		String line_ = pLogRecord;//AbstractTrxTrama.removeQuotes(pLogRecord);
		char arrayChar[]=line_.toCharArray();
		//System.out.println(line_);
		boolean PendingExt_=false;
		/*for (int i = 0; i < arrayChar.length; i++) {
			System.out.print((int)arrayChar[i]+" ");
		}*/
		
		StringTokenizer str_ = new StringTokenizer(line_,AbstractTrxString.FIELD_SEPARATOR);
		//System.out.println("Longitud de todo el record->"+line_.length()); 
		String tmp_=str_.nextToken();
		
		Vector vector_ = new Vector();
		AbstractTrxString trxAux_=null;
		int items_=0;
		for(StringTokenizer t1 = new StringTokenizer(line_,",");t1.hasMoreTokens();){
			numStrings_++;
			String currentString_=t1.nextToken();
			currentString_ = AbstractTrxString.removeQuotes(currentString_);


			//System.out.println("Registro sin comillas->"+currentString_);
			AbstractTrxString trx_ = getTrxTrama(currentString_);
			
			if(trx_ instanceof SodUserDataReservedTrama){
				/*System.out.println("Data 1->"+((SodUserDataReservedTrama)trx_).getData1());
				System.out.println("Data 2->"+((SodUserDataReservedTrama)trx_).getData22());
				System.out.println("Data 3->"+((SodUserDataReservedTrama)trx_).getData32());
				System.out.println("Data 4->"+((SodUserDataReservedTrama)trx_).getData42());
				System.out.println("Data 5->"+((SodUserDataReservedTrama)trx_).getData52());
				System.out.println("Data 6->"+((SodUserDataReservedTrama)trx_).getData62());
				System.out.println("Data 7->"+((SodUserDataReservedTrama)trx_).getData72());				
				if (((SodUserDataReservedTrama)trx_).getData1().equals("20061011")||((SodUserDataReservedTrama)trx_).getData1().equals("20061012")){
					System.out.println("Data 1->"+((SodUserDataReservedTrama)trx_).getData1());
					System.out.println("Data 2->"+((SodUserDataReservedTrama)trx_).getData22());
					System.out.println("Data 3->"+((SodUserDataReservedTrama)trx_).getData32());
					System.out.println("Data 4->"+((SodUserDataReservedTrama)trx_).getData42());
					System.out.println("Data 5->"+((SodUserDataReservedTrama)trx_).getData52());
					System.out.println("Data 6->"+((SodUserDataReservedTrama)trx_).getData62());
					System.out.println("Data 7->"+((SodUserDataReservedTrama)trx_).getData72());
				}
				if (((SodUserDataReservedTrama)trx_).getData1().equals("20070626")){
					System.out.println("Data 1->"+((SodUserDataReservedTrama)trx_).getData1());
					System.out.println("Data 2->"+((SodUserDataReservedTrama)trx_).getData22());
					System.out.println("Data 3->"+((SodUserDataReservedTrama)trx_).getData32());
					System.out.println("Data 4->"+((SodUserDataReservedTrama)trx_).getData42());
					System.out.println("Data 5->"+((SodUserDataReservedTrama)trx_).getData52());
					System.out.println("Data 6->"+((SodUserDataReservedTrama)trx_).getData62());
					System.out.println("Data 7->"+((SodUserDataReservedTrama)trx_).getData72());					
				}
				
				if (((SodUserDataReservedTrama)trx_).getData1().equals("22082002")){
					IVAValue_=KeyedFileUtils.unPack2(((SodUserDataReservedTrama)trx_).getData3());

				}else	
					IVAValue_=null;*/
			}/*else{
				if(!(trx_ instanceof ItemEntryTrama))				
					IVAValue_=null;
			}*/
				
			if(trx_ instanceof SodHeaderTrama){
				//System.out.println("Header");
				//System.out.println(trx_);
				terminal_=((SodHeaderTrama)trx_).getTERMINAL();
				if (terminal_.equals("0003"))
					System.out.println("Termina->"+terminal_);
				//if (terminal_.equals("0011"))
				//	System.out.println("Esta es la terminal");
				transNum_=((SodHeaderTrama)trx_).getTRANSNUM();
				if (transNum_.equals("0312"))
					System.out.println("Trx->"+transNum_);
				day_=((SodHeaderTrama)trx_).getDAY();
				System.out.println(day_);
				time_=((SodHeaderTrama)trx_).getTIME();
				//if (  ((SodHeaderTrama)trx_).getStringType().equals("00")  )
				stringTotalNum_ = Integer.parseInt(((SodHeaderTrama)trx_).getNUMSTRIN()) + 1;
				trxType_ = ((SodHeaderTrama)trx_).getTRANSTYPE();
				System.out.println("Procesando movimiento de almacEn:"+pStore+" caja:"+terminal_+" trx:"+transNum_+" fecha:"+day_+" time:"+time_);
				//if (terminal_.equals("0052")&& transNum_.equals("0050"))
					//System.out.println(terminal_);				
				
			}else if (trx_ instanceof SodStoreClosingTrama){
					stringTotalNum_ = 1;				
			}else if (trx_ instanceof SodOperatorTrainingTrama){
				//System.out.println("Es un till change");
				stringTotalNum_ = 1;
			}/*else if (trx_ instanceof SodTenderTrama){
				//System.out.println("Tender String");
				//System.out.println(trx_);				
			}else if (trx_ instanceof SodDiscountTrama){
				System.out.println("SodDiscountTrama");
				System.out.println(trx_);			
			}else if (trx_ instanceof SodTaxTrama){
				System.out.println("SodTaxTrama");
				System.out.println(trx_);				
			}else if (trx_ instanceof SodFoodStampChangeTrama){
				System.out.println("SodFoodStampChangeTrama");
				System.out.println(trx_);				
			}else if (trx_ instanceof SodPriceChangeTrama){
				System.out.println("SodPriceChangeTrama");
				System.out.println(trx_);				
			}else if (trx_ instanceof SodTillChangeTrama){
				System.out.println("SodTillChangeTrama");
				System.out.println(trx_);				
			}else if (trx_ instanceof SodItemRecordChargeTrama){
				System.out.println("SodItemRecordChargeTrama");
				System.out.println(trx_);				
			}*/else{
				//if (trx_ instanceof SodTillChangeTrama)
					//System.out.println("Esta es la trama");
					
				if (trx_!=null){
					trx_.setTERMINAL(terminal_);
					trx_.setTRANSNUM(transNum_);
					trx_.setDAY(day_);
					trx_.setTIME(time_);
				
				}	
			}
			if (trx_!=null){
				trx_.setOFFSETY(""+pNumLinea);
				trx_.setOFFSETX(""+numStrings_);
				trx_.setSTORE(""+pStore);
				//trx_.setTIPO(pTipo);
			}else
				System.out.println("ERROR-Procesando trama");
							
			if (PendingExt_){				
				if (trx_ instanceof ItemEntryExtString){
					//System.out.println("ItemEntryExt");
					//System.out.println(trx_);
					((SodItemEntryTrama)trxAux_).setItemEntryExt((ItemEntryExtString)trx_);// Se adiciona la extensión al IE String
					vector_.addElement(trxAux_);
					stringTotalNum_ --;
					
					/*if(DEBUG){
						if (trx_!=null){
							CreateFilesUtils.printString(trxAux_);
							CreateFilesUtils.insertTrxInFile(trxAux_);
						}
					}*/
										
					PendingExt_=false;
				}else{
					vector_.addElement(trxAux_);// Se inserta el que estaba pendiente
					
					/*if(DEBUG){
						if (trx_!=null){
							CreateFilesUtils.printString(trxAux_);
							CreateFilesUtils.insertTrxInFile(trxAux_);
						}
					}*/
					
					if (trx_ instanceof SodItemEntryTrama){
						items_++;
						//System.out.println("ItemEntry");
						//System.out.println(trx_);
						PendingExt_=true; // Se coloca un flag de pendiente para el proximo string.
						trxAux_=trx_; // El actual ItemEntry es igual al auxiliar para la proxima iteración.
						//if (IVAValue_!=null)
							//((SodItemEntryTrama)trx_).setPRCIVA(IVAValue_);						
					}else{					
						vector_.addElement(trx_); // se adiciona el nuevo string que no es ni IE ni IE extension.
						PendingExt_=false;
					}
				}
				
			}else{
				// El item entry se maneja de forma diferente ya que puede venir o no 
				// acompañado de un item entry extension.
				if (trx_ instanceof SodItemEntryTrama){
					items_++;
					//System.out.println("ItemEntry");
					//System.out.println(trx_);
					PendingExt_=true;
					trxAux_=trx_;
					//if (IVAValue_!=null)
						//((ComfSodItemEntryTrama)trx_).setPRCIVA(IVAValue_);
				}else{
					vector_.addElement(trx_);					
				}

			}
			/*if(DEBUG && !PendingExt_){
				if (trx_!=null){
					CreateFilesUtils.printString(trx_);
					CreateFilesUtils.insertTrxInFile(trx_);
				}
			}*/			
		}
		System.out.println("Total items->"+items_);
		if (PendingExt_)
			vector_.addElement(trxAux_);// Se inserta el IE String que estaba pendiente
		
		AbstractTrxString[] arrayAnswer_ = new AbstractTrxString[vector_.size()];
		int i = 0;
		if (trxType_.equals("07")){
			int defLength_ = 0;
			for(Enumeration en = vector_.elements();en.hasMoreElements();i++){
				AbstractTrxString currElement_ = (AbstractTrxString)en.nextElement();
				if (currElement_ instanceof SodHeaderTrama || currElement_ instanceof SodUserDataReservedTrama){
					arrayAnswer_[defLength_] = currElement_;
					defLength_ ++;
					
				}	
			}
			AbstractTrxString[] arrayAnswer2_ = new AbstractTrxString[defLength_];
			for (int j=0; j<defLength_;j++)
				arrayAnswer2_[j] = arrayAnswer_[j];
			return 	arrayAnswer2_;
		}else{
			for(Enumeration en = vector_.elements();en.hasMoreElements();i++){
				arrayAnswer_[i] = (AbstractTrxString)en.nextElement();
			}
			if (!trxType_.equals("17") && !trxType_.equals("18")&& !trxType_.equals("05")){			
				if (arrayAnswer_.length != stringTotalNum_){
					System.out.println("Strings en el arreglo->"+arrayAnswer_.length);
					System.out.println("Strings en el header->"+stringTotalNum_);
					throw new Exception ("Trama no tiene el número correcto de strings");
				}	
			}		
		}		
		return arrayAnswer_;
	}
	
	public static String composeTrama(String pSubTrama, String pKey, int pCurrPart, int pTotalPart){
		String totalTrama_="";
		pSubTrama=AbstractTrxString.removeQuotes(pSubTrama);
		//System.out.println("Longitud Subtrama->"+pSubTrama.length());
		//System.out.println("Pedazo de trama->"+pSubTrama);
		
		if (pTotalPart>1){
			if(tramaParts==null)
				tramaParts=new Hashtable();
			//System.out.println("tramaParts.size()->"+tramaParts.size());	
			if(tramaParts.size()>=MAX_NODOS_ENCOLADOS)
				tramaParts.clear();//Para evitar que se llene de basura.
			if(tramaParts.get(pKey+pCurrPart)==null)
				tramaParts.put(pKey+pCurrPart,pSubTrama);
			for(int i=1;i<=pTotalPart;i++){
				if(tramaParts.get(pKey+i)==null)
					return null;
				else
					totalTrama_+=(String)tramaParts.get(pKey+i);
			}
			for(int i=1;i<=pTotalPart;i++)
				tramaParts.remove(pKey+i);
			//System.out.println("tramaParts.size()->"+tramaParts.size());				
		}else
			totalTrama_=pSubTrama;

		//System.out.println("Total Trama->"+pSubTrama);		
		return totalTrama_;
	}
	
	//Se debe revisar que la trama no ha sido encolada anteriormente
	public static boolean TramaInQueue(String pTotalTrama){
		return false;
	}

	/*public static TransaccionVo getVOsList(AbstractTrxString[] pStrings,String pStore){
			TransaccionVo answer_=new TransaccionVo();
			ArrayList lstPagosServicios_= new ArrayList();
			ArrayList lstMediosPago_= new ArrayList();
			String terminal_="0",transNum_="0",operator_="0",fechaHora_="";
			long numLote_=0;
			for (int i=0;i<pStrings.length;i++){
				if(pStrings[i] instanceof SodHeaderTrama){
					terminal_=((SodHeaderTrama)pStrings[i]).getTERMINAL();
					//if (terminal_.equals("0011"))
					//	System.out.println("Esta es la terminal");
					transNum_=((SodHeaderTrama)pStrings[i]).getTRANSNUM();
					operator_=((SodHeaderTrama)pStrings[i]).getOPERATOR();
					fechaHora_=((SodHeaderTrama)pStrings[i]).getDAY()+((SodHeaderTrama)pStrings[i]).getTIME();									
				
					//day_=((SodHeaderTrama)trx_).getDAY();
					//time_=((SodHeaderTrama)trx_).getTIME();
				}else if(pStrings[i] instanceof SodUserDataReservedTrama){
					if (((SodUserDataReservedTrama)pStrings[i]).getData1().equals("20071107")){// Transacci'on de pago de servicios EMCALI
						try{
							String otrosDatos_=((SodUserDataReservedTrama)pStrings[i]).getInfo(8);
							TrxPagoServiciosVO detPagoServicio_= new TrxPagoServiciosVO();
							//detPagoServicio_.setEANProveedor(((SodUserDataReservedTrama)pStrings[i]).getData22().trim());
							detPagoServicio_.setTipoTrx(((SodUserDataReservedTrama)pStrings[i]).getData32().trim());
							detPagoServicio_.setNumReferencia(((SodUserDataReservedTrama)pStrings[i]).getData42().trim());
							detPagoServicio_.setMonto(new Long(((SodUserDataReservedTrama)pStrings[i]).getData52()));
							detPagoServicio_.setFechaValidacion(((SodUserDataReservedTrama)pStrings[i]).getData62().trim());
							//detPagoServicio_.setNITEntidadRecau(((SodUserDataReservedTrama)pStrings[i]).getData72().trim());
							detPagoServicio_.setNITEntidadRecau(((SodUserDataReservedTrama)pStrings[i]).getData72().trim());
							detPagoServicio_.setEANProveedor(otrosDatos_.substring(16,29).trim());
							detPagoServicio_.setFechaVencimiento(otrosDatos_.substring(8,16).trim());
							detPagoServicio_.setFechaHoraTrx(fechaHora_);
							detPagoServicio_.setAlmacen(pStore);
							detPagoServicio_.setNumTrx(transNum_);
							detPagoServicio_.setTerminal(terminal_);
							detPagoServicio_.setOperador(operator_);
							lstPagosServicios_.add(detPagoServicio_);
						
							//numLote_= Long.parseLong(((SodUserDataReservedString)pStrings[i]).getData22());//.substring(0,((SodUserDataReservedString)pStrings[i]).getData22().length()-1));
						}catch(Exception e){
							System.out.println("El string llegó con un detalle de descripción del lote no válido");
							e.printStackTrace();
						}
					}
				}else if(pStrings[i] instanceof SodTenderTrama){
					try {

						TenderVo vo_ =  new TenderVo();
						vo_.setTipo(((SodTenderTrama)pStrings[i]).getTENDTYPE().substring(0,1));
						vo_.setVariedad(((SodTenderTrama)pStrings[i]).getTENDTYPE().substring(1,2));
						lstMediosPago_.add(vo_);
					} catch (Exception e) {
						// TODO Bloque catch generado automáticamente
						e.printStackTrace();
					}
				}
			}
	  
			answer_.setMediosPago(lstMediosPago_);
			answer_.setPagos(lstPagosServicios_);
			return answer_;		
		}*/
	
		private static Timestamp fechaTimestamp(String pFecha){
			try {
				SimpleDateFormat sdf_ = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String newFecha_ = "20"+pFecha.substring(0,2)+"-"+
								  pFecha.substring(2,4)+"-"+
								  pFecha.substring(4,6)+" "+
								  pFecha.substring(6,8)+":"+
								  pFecha.substring(8,10)+":00";
				Date date_ = sdf_.parse(newFecha_);
				return new Timestamp (date_.getTime());	
			} catch (ParseException e) {			
				e.printStackTrace();
				return null;
			}		
		}

	/*public static TrxVentaPosCVO getVOsListTrxVentaBRPOS(AbstractTrxString[] pStrings,String pStore){
		TrxVentaPosCVO trxVentaPosCVO_=new TrxVentaPosCVO_Imp();

		ArrayList lstMediosPago_= new ArrayList();
		ArrayList lstBono_= new ArrayList();
		String terminal_="0",transNum_="0",operator_="0",fechaHora_="";

		for (int i=0;i<pStrings.length;i++){
			if(pStrings[i] instanceof SodHeaderTrama){
				terminal_=((SodHeaderTrama)pStrings[i]).getTERMINAL();
				//if (terminal_.equals("0011"))
				//	System.out.println("Esta es la terminal");
				transNum_=((SodHeaderTrama)pStrings[i]).getTRANSNUM();
				operator_=((SodHeaderTrama)pStrings[i]).getOPERATOR();
				fechaHora_=((SodHeaderTrama)pStrings[i]).getDAY()+((SodHeaderTrama)pStrings[i]).getTIME();
									
				//trxVentaPosCVO_.setBonosList(  );		//Lista de Bonos.class donde va la informacion (codigo ean, valor) de los bonos que se vendieron en la transaccion
				trxVentaPosCVO_.setCedulaOperador( new Double(operator_) );
				trxVentaPosCVO_.setFechaHora( fechaTimestamp(fechaHora_) );
				trxVentaPosCVO_.setIdAlmacen( new Double(pStore) );
				//trxVentaPos_.setIdTrxVentaPos(  );	//No aplica, esto se llena al insertar los datos en la DB
				//;trxVentaPosCVO_.setMediosPagoList(  );//Lista de TrxMedioPagoBono.class donde va la informacion de los medios de pago con la que se pago la transaccion
				trxVentaPosCVO_.setNumTrx( transNum_ );	
				//trxVentaPos_.setObservaciones(  );	//No aplica				
				trxVentaPosCVO_.setTerminal( new Double(terminal_) );
				
				//day_=((SodHeaderTrama)trx_).getDAY();
				//time_=((SodHeaderTrama)trx_).getTIME();
			}else if(pStrings[i] instanceof SodUserDataReservedTrama){
				if (((SodUserDataReservedTrama)pStrings[i]).getData1().equals("20070626")){
					try{
						com.sodimac.bonos.bono.Bono bono_ = (com.sodimac.bonos.bono.Bono) new Bono_Imp();
						String numBono_ = ((SodUserDataReservedTrama)pStrings[i]).getData22();
						System.out.println(numBono_.length()); 
						if(numBono_.trim().length()==14 && numBono_.startsWith("0"))
							numBono_ = numBono_.substring(1,numBono_.length());
						bono_.setCodigoEAN( numBono_ );
						String tmp_=((SodUserDataReservedTrama)pStrings[i]).getData32();
						tmp_=((SodUserDataReservedTrama)pStrings[i]).getData42();
						if (((SodUserDataReservedTrama)pStrings[i]).getData42().equals("01"))
							bono_.setValorBono( new Double(-Double.parseDouble(((SodUserDataReservedTrama)pStrings[i]).getData32())));
						else
							bono_.setValorBono( new Double(((SodUserDataReservedTrama)pStrings[i]).getData32()));
						lstBono_.add( bono_ );
					}catch(Exception e){
						System.out.println("El string llegó con un número de lote no válido");
						e.printStackTrace();
					}
				}
			}else if(pStrings[i] instanceof SodTenderTrama){
					
				TrxMedioPagoBono trxMedioPagoBono_ = new TrxMedioPagoBono_Imp();
				trxMedioPagoBono_.setIdFormaPago( new Double(((SodTenderTrama)pStrings[i]).getTENDTYPE().substring(1,2)) );
				trxMedioPagoBono_.setIdTipoPago( new Double(((SodTenderTrama)pStrings[i]).getTENDTYPE().substring(0,1)) );
				trxMedioPagoBono_.setValor( new Double(((SodTenderTrama)pStrings[i]).getAMTTENDE()) );
				
				lstMediosPago_.add( trxMedioPagoBono_ );										
					

			}else if(pStrings[i] instanceof SodFoodStampChangeTrama){
				
				TrxMedioPagoBono trxMedioPagoBono_ = new TrxMedioPagoBono_Imp();
				trxMedioPagoBono_.setIdFormaPago( new Double(((SodFoodStampChangeTrama)pStrings[i]).getTendType().substring(1,2)) );
				trxMedioPagoBono_.setIdTipoPago( new Double(((SodFoodStampChangeTrama)pStrings[i]).getTendType().substring(0,1)) );
				trxMedioPagoBono_.setValor( new Double(((SodFoodStampChangeTrama)pStrings[i]).getAmtChange()) );
				
				lstMediosPago_.add( trxMedioPagoBono_ );
						
			}
		}
		lstBono_ = depurarLista (lstBono_);
		trxVentaPosCVO_.setMediosPagoList( lstMediosPago_ );
		trxVentaPosCVO_.setBonosList( lstBono_ );
		//comando:
		//ventaPosBonosSinLoteCommand ventaPosBonosSinLoteCommand_ = (ventaPosBonosSinLoteCommand)TarimaFacade.getCommand(ventaPosBonosSinLoteCommand.class);
		//ventaPosBonosSinLoteCommand_.setParams(trxVentaPosCVO_);
						  
		return trxVentaPosCVO_;		
	}*/
	
	/*public static ArrayList depurarLista(ArrayList pLstBonos){
		Hashtable hs_=new Hashtable();
		if (pLstBonos!=null && pLstBonos.size()>0){
			Iterator it_ = pLstBonos.iterator();
			while (it_.hasNext()){
				com.sodimac.bonos.bono.Bono tmpBono_ = (com.sodimac.bonos.bono.Bono)it_.next();
				com.sodimac.bonos.bono.Bono auxBono_=null;
				auxBono_=(com.sodimac.bonos.bono.Bono)hs_.get(tmpBono_.getCodigoEAN());
				if (auxBono_!=null){
					tmpBono_.setValorBono(  new Double ( auxBono_.getValorBono().longValue() + tmpBono_.getValorBono().longValue() ));
				}
				hs_.put(tmpBono_.getCodigoEAN(),tmpBono_);
			}
			pLstBonos = new ArrayList();
			Enumeration enum_=hs_.keys();
			while(enum_.hasMoreElements()){
				Object tmp_=enum_.nextElement();
				com.sodimac.bonos.bono.Bono tenderTmp_=(com.sodimac.bonos.bono.Bono)hs_.get(tmp_);
				if (tenderTmp_.getValorBono().doubleValue()>0)
					pLstBonos.add(tenderTmp_);
			}	
		}
		return pLstBonos;
	}*/
	
}
