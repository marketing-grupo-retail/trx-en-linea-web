/*
 * Creado el 16/09/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.grpretail.transacciones.update_controllers;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//import com.grpretail.promociones.update_controllers.vo.ObjectListSize;
import com.grpretail.utils.RunTimeOut;
//import com.grpretail.utils.StringFormatter;


public class ControllerMessenger {
	
	public static final int FUNCION_INSERT_CONTROL_REG		= 4099; // Inserción de registro de control
	public static final int FUNCION_UPDATE_PROMO_TIPO1		= 4011;
	public static final int FUNCION_UPDATE_PROMO_TIPO2		= 4012;
	public static final int FUNCION_UPDATE_PROMO_TIPO3		= 4013;
	public static final int FUNCION_UPDATE_PROMO_TIPO4		= 4014;
	public static final int FUNCION_UPDATE_PROMO_TIPO5		= 4015;	
	public static final int FUNCION_UPDATE_PROMO_TIPO6		= 4016;
	public static final int FUNCION_UPDATE_PROMO_TIPO6_2	= 4028;
	public static final int FUNCION_UPDATE_PROMO_TIPO7		= 4017;
	public static final int FUNCION_UPDATE_PROMO_TIPO8		= 4018;
	public static final int FUNCION_UPDATE_PROMO_TIPO9		= 4019;	
	public static final int FUNCION_UPDATE_PROMO_TIPO10		= 4020;
	public static final int FUNCION_UPDATE_PROMO_TIPO11		= 4021;
	
	public static final int FUNCION_UPDATE_PROMO_TIPO12_1	= 4022;	
	public static final int FUNCION_UPDATE_PROMO_TIPO12_2	= 4023;	
	public static final int FUNCION_UPDATE_PROMO_TIPO12_3	= 4024;
	public static final int FUNCION_UPDATE_PROMO_TIPO13_1	= 4025;
	
	public static final int FUNCION_UPDATE_CUSTOMERS_PROMO	= 4026;
	public static final int FUNCION_UPDATE_PROMO_TIPO13_2	= 4027;
	public static final int FUNCION_UPDATE_PROMO_TIPO14		= 4029;		
	public static final int FUNCION_UPDATE_PROMO_TIPO15_1			= 4030; // Condiciones y beneficio de una promoción en una carga total
	public static final int FUNCION_UPDATE_PROMO_TIPO15_2			= 4031; // Envio de artículos a la controladora
	public static final int FUNCION_INSERT_ITEMS_LIST_CONTROL_REG	= 4032; // Inserción de registro de control para lista de ítems
	public static final int FUNCION_UPDATE_PROMO_TIPO15_3			= 4033; // XML de definición de una promoción en carga individual
	public static final int FUNCION_INSERT_MESSAGE_LIST_CONTROL_REG	= 4034; // Inserción de registro de control para mensaje
	public static final int FUNCION_UPDATE_PROMO_TIPO15_31			= 4035; // XML de definición de una promoción en carga total
	public static final int FUNCION_END_PROMO_TOTAL_LOAD			= 4036; // Fin de terminación de proceoso de carga total de promociones
	// CACS: Las promociones tipo 16 son bonos recompra
	public static final int FUNCION_UPDATE_PROMO_TIPO16_1			= 4040; // Definición bono recompra 
	public static final int FUNCION_UPDATE_PROMO_TIPO16_2			= 4041; // Envio de lista de ítems para un bono recompra tipo 01(Tipificaciones-porcentajes) y validación tipo 1 (lista ítems)
	public static final int FUNCION_UPDATE_PROMO_TIPO16_3			= 4042; // Renombramiento el achivo temporal de bono recompra al definitivo
	public static final int FUNCION_UPDATE_PROMO_TIPO16_4			= 4043; // Inserta un registro de control para que el archivo de Bono recompra Tipificaciones sea cargado por el POS
	public static final int FUNCION_UPDATE_PROMO_TIPO16_5			= 4044; // Inserta un registro de control para que el archivo de Bono recompra Medios de Pago sea cargado por el POS
	
	public static final int FUNCION_TOL_GET_SELL_TOTALS				= 4101;
	
	public static final int FUNCION_UPDATENPSTATUS					= 501;
	public static final int FUNCION_UPDATEALISTAM					= 502;
	public static final int FUNCION_UPDATEIPCTRL					= 503;
	public static final int FUNCION_UPDATEUSERS						= 504;
  	public static final int FUNCION_DELETEDETALIS					= 505;
  	// Aplicación de devoluciones en línea
	public static final int FUNCION_UPDATESALDOBONODEV				= 601;
  	
	
	public static Socket getSocket(String pUrl,int pPort) throws IOException {
		return new Socket(pUrl,pPort);
	}	
	
	private static void sendObjectBySocket(String[] pUrl,int pPort,Object pObj) 
		throws Exception {
			
		boolean error_ = false;
		
		boolean atLeastOne_ = false;
	
		for (int i = 0 ; i < pUrl.length && !atLeastOne_ ; i++) {
			Socket socket_ = null;
			OutputStream out_ = null;
			ObjectOutputStream objectOut_ = null;
			
			if (pUrl[i] != null && !pUrl[i].trim().equals("")) {
	
				try {
					// Para correr con time out
					
					Object[] obj_ = RunTimeOut.execute(
						ControllerMessenger.class,
						"getSocket",
						new Object[]{pUrl[i],new Integer(pPort)},
						5
					);
					int status_ = ((Integer)obj_[0]).intValue();
					if (status_ != 0) {
						throw new IOException("Unable to open socket");
					}
					socket_ = (Socket)obj_[1];
					
					// Para correr sin time out
					//socket_ = new Socket(pUrl[i],pPort);
					
	
					out_ = socket_.getOutputStream();
	
					objectOut_ = new ObjectOutputStream(out_);
							
					objectOut_.writeObject(pObj);
					
					atLeastOne_ = true;
	
	
				} catch (UnknownHostException e) {
					error_ = true;
				} catch (IOException e) {
					error_ = true;
				} catch (Exception e) {
					error_ = true;
				} finally {
				
					// Arreglo de streams que hay que cerrar
					OutputStream[] outArray_ = new OutputStream[] {
						objectOut_,
						out_
					};
					
					for (int j = 0 ; j < outArray_.length ; j++) {
						try {
							if (outArray_[j] != null) {
								System.out.println("Trying to close stream " + outArray_[j] + "...");
								outArray_[j].close();
								System.out.println("Stream " + outArray_[j] + " closed succesfully");
							}
						} catch (IOException e) {
							System.out.println("Unable to close stream " + outArray_[j] + ": " + e);
						}
					}
					
					// Cerrar el socket
					try {
						System.out.println("Trying to close socket...");
						socket_.close();
						System.out.println("Socket closed succesfully");
					} catch (IOException e) {
						System.out.println("Unable to close socket: " + e);
					}
				}
			}

		}
		
//		if (error_) {
		if (!atLeastOne_) {
			throw new Exception("Unable to open socket");
		}
		

	}

	private static int sendObjBySocketWithAnswer(String[] pUrl,int pPort,Object pObj) 
		throws Exception {
			
		boolean error_ = false;
		int anwser=0;		
		boolean atLeastOne_ = false;
	
		for (int i = 0 ; i < pUrl.length && !atLeastOne_ ; i++) {
			Socket socket_ = null;
			OutputStream out_ = null;
			InputStream in_ = null;
			ObjectOutputStream objectOut_ = null;
			ObjectInputStream objectIn_=null;

			
			if (pUrl[i] != null && !pUrl[i].trim().equals("")) {
	
				try {
					// Para correr con time out
					
					Object[] obj_ = RunTimeOut.execute(
						ControllerMessenger.class,
						"getSocket",
						new Object[]{pUrl[i],new Integer(pPort)},
						20
					);
					int status_ = ((Integer)obj_[0]).intValue();
					if (status_ != 0) {
						throw new IOException("Unable to open socket");
					}
					socket_ = (Socket)obj_[1];
					
					// Para correr sin time out
					//socket_ = new Socket(pUrl[i],pPort);
					
	
					out_ = socket_.getOutputStream();
	
					objectOut_ = new ObjectOutputStream(out_);
							
					objectOut_.writeObject(pObj);
					objectOut_.flush();
					in_=socket_.getInputStream();
					objectIn_=new ObjectInputStream(in_);
					Object[] objArray_=(Object[])objectIn_.readObject();
					System.out.println("objArray_[0]->"+objArray_[0]);
					System.out.println("objArray_[1]->"+objArray_[1]);
					anwser=((String)objArray_[1]).equals("Ok")?1:0;
					
					atLeastOne_ = true;
	
	
				} catch (UnknownHostException e) {
					e.printStackTrace();
					error_ = true;
				} catch (IOException e) {
					error_ = true;
				} catch (Exception e) {
					error_ = true;
				} finally {
				
					// Arreglo de streams que hay que cerrar
					OutputStream[] outArray_ = new OutputStream[] {
						objectOut_,
						out_
					};
					
					for (int j = 0 ; j < outArray_.length ; j++) {
						try {
							if (outArray_[j] != null) {
								System.out.println("Trying to close stream " + outArray_[j] + "...");
								outArray_[j].close();
								System.out.println("Stream " + outArray_[j] + " closed succesfully");
							}
						} catch (IOException e) {
							System.out.println("Unable to close stream " + outArray_[j] + ": " + e);
						}
					}
					
					// Cerrar el socket
					try {
						System.out.println("Trying to close socket...");
						socket_.close();
						System.out.println("Socket closed succesfully");
					} catch (IOException e) {
						System.out.println("Unable to close socket: " + e);
					} catch (Exception e){
						//e.printStackTrace();
					}
				}
			}

		}
		
//		if (error_) {
		if (!atLeastOne_) {
			throw new Exception("Unable to open socket");
		}
		return anwser;
		

	}
	
	private static Object[] sendObjBySocketWithAnswerObj(String[] pUrl,int pPort,Object pObj) 
		throws Exception {
			
		boolean error_ = false;
		Object[] anwser = null;		
		boolean atLeastOne_ = false;
	
		for (int i = 0 ; i < pUrl.length && !atLeastOne_ ; i++) {
			Socket socket_ = null;
			OutputStream out_ = null;
			InputStream in_ = null;
			ObjectOutputStream objectOut_ = null;
			ObjectInputStream objectIn_=null;

			
			if (pUrl[i] != null && !pUrl[i].trim().equals("")) {
	
				try {
					// Para correr con time out
					
					Object[] obj_ = RunTimeOut.execute(
						ControllerMessenger.class,
						"getSocket",
						new Object[]{pUrl[i],new Integer(pPort)},
						20
					);
					int status_ = ((Integer)obj_[0]).intValue();
					if (status_ != 0) {
						throw new IOException("Unable to open socket");
					}
					socket_ = (Socket)obj_[1];
					
					// Para correr sin time out
					//socket_ = new Socket(pUrl[i],pPort);
					
	
					out_ = socket_.getOutputStream();
	
					objectOut_ = new ObjectOutputStream(out_);
							
					objectOut_.writeObject(pObj);
					objectOut_.flush();
					in_=socket_.getInputStream();
					objectIn_=new ObjectInputStream(in_);
					anwser=(Object[])objectIn_.readObject();
					System.out.println("objArray_[0]->"+anwser[0]);
					System.out.println("objArray_[1]->"+anwser[1]);
					//anwser=((String)objArray_[1]).equals("Ok")?1:0;
					
					atLeastOne_ = true;
	
	
				} catch (UnknownHostException e) {
					e.printStackTrace();
					error_ = true;
				} catch (IOException e) {
					error_ = true;
				} catch (Exception e) {
					error_ = true;
				} finally {
				
					// Arreglo de streams que hay que cerrar
					OutputStream[] outArray_ = new OutputStream[] {
						objectOut_,
						out_
					};
					
					for (int j = 0 ; j < outArray_.length ; j++) {
						try {
							if (outArray_[j] != null) {
								System.out.println("Trying to close stream " + outArray_[j] + "...");
								outArray_[j].close();
								System.out.println("Stream " + outArray_[j] + " closed succesfully");
							}
						} catch (IOException e) {
							System.out.println("Unable to close stream " + outArray_[j] + ": " + e);
						}
					}
					
					// Cerrar el socket
					try {
						System.out.println("Trying to close socket...");
						socket_.close();
						System.out.println("Socket closed succesfully");
					} catch (IOException e) {
						System.out.println("Unable to close socket: " + e);
					} catch (Exception e){
						//e.printStackTrace();
					}
				}
			}

		}
		
//		if (error_) {
		if (!atLeastOne_) {
			throw new Exception("Unable to open socket");
		}
		return anwser;
		

	}	

	
	public static void updateNotaPedidoStatus (
		String pUrl1,
		String pUrl2,
		String pPort,
		String pIdNp,
		String pStatusNp,
		String pConsecNp
	) throws Exception {
		updateNotaPedidoStatus(
			new String[] {pUrl1,pUrl2},
			Integer.parseInt(pPort),
			pIdNp,
			pStatusNp,
			pConsecNp
		);
	}
	
	public static int updateBonoDevolucion (
		String pUrl1, // Controladora cc
		String pUrl2, // Controladora dd
		String pPort, // Puerto por el que se va a conectar en la app de la controladora
		String pNumBono, // Número del bono a actualizar 
		String pValTotalBono, // Monto total bono
		String pValUtilizado, // Monto utilizado del bono
		String pEstado	// Estado del bono
	) throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATESALDOBONODEV),
			pNumBono,
			pValTotalBono,
			pValUtilizado,
			pEstado
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);		
	}	

	public static int updatePromocionTipo1(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pProductIDs,
		String pCodPromocion,
		String pTipoPromocion,
		String pValor,
		String pLiga,
		String pPromocode,
		String pFilePromocode)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO1),
			pProductIDs,
			pCodPromocion,
			pTipoPromocion,
			pValor,
			pLiga,
			pPromocode,
			"1", //Adicionar registro
			pRegNum,			
			pFilePromocode,
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	public static int insertControlReg(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pPromoCode,
		String pFechaInicial,
		String pFechaFinal,
		String pActiveFlag
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_INSERT_CONTROL_REG),
			pPromoCode,
			pFechaInicial,
			pFechaFinal,
			pActiveFlag
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	// CACS: Envia un registro de control para insertar en el archivo TF:LSTCAR en nombre del archivo que tiene la lista de ítems
	public static int insertItemsListControlReg(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pItmsListId_
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_INSERT_ITEMS_LIST_CONTROL_REG),
			pItmsListId_
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	// CACS: Envia un registro de control para insertar en el archivo TF:LSTCAR en nombre del archivo que tiene el mensaje
	public static int insertMessageControlReg(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pItmsListId
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_INSERT_MESSAGE_LIST_CONTROL_REG),
			pItmsListId
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	
	
	// CACS: Envia un registro de control para insertar en el archivo TF:LSTCAR el nombre del archivo de bono a tipificaciones que tiene el mensaje
	public static int insertRepurchaseBonusControlReg(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRepurchaseBonusPromoId
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO16_4),
			pRepurchaseBonusPromoId
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
//	//CACS: Envia un registro de control para insertar en el archivo TF:LSTCAR el nombre del archivo de bono a medios de pago que tiene el mensaje
	 public static int insertTenderRepurchaseBonusControlReg(
		 String pUrl1,
		 String pUrl2,
		 String pPort,
		 String pRepurchaseBonusPromoId
		 )throws Exception {
		 Object[] objArray_ =  new Object[] {
			 new Integer(FUNCION_UPDATE_PROMO_TIPO16_5),
			 pRepurchaseBonusPromoId
		 };		
		 int port=Integer.parseInt(pPort);
		 return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	 }		

	public static int updatePromocionTipo2TF1(
		String pUrl1,
		String pUrl2,
		String pPort,
		//String pRegNum,
		String pFileType,
		String pPromoCode,
		String pItemCode,
		String pLinkedTo,
		String pItemPromocode,
		String pFiller,
		String pItemCode2,
		String pLinkedTo2,
		String pItemPromocode2		
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO2),
			//pRegNum,
			pFileType,
			pPromoCode,
			pItemCode,
			pLinkedTo,
			pItemPromocode,
			pFiller,
			pItemCode2,
			pLinkedTo2,
			pItemPromocode2,
			pFiller			
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	public static int updatePromocionTipo4TF1(
		String pUrl1,
		String pUrl2,
		String pPort,
		//String pRegNum,
		String pFileType,
		String pPromoCode,
		String pItemCode,
		String pLinkedTo,
		String pItemPromocode,
		String pFiller,
		String pItemCode2,
		String pLinkedTo2,
		String pItemPromocode2,
		String pItemCode3,
		String pLinkedTo3,
		String pItemPromocode3	
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO4),
			//pRegNum,
			pFileType,
			pPromoCode,
			pItemCode,
			pLinkedTo,
			pItemPromocode,
			pFiller,
			pItemCode2,
			pLinkedTo2,
			pItemPromocode2,
			pFiller,
			pItemCode3,
			pLinkedTo3,
			pItemPromocode3,
			pFiller	
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	

	public static int updatePromocionTipo5(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pItemCode,
		String pMessageCode,
		String pFiller1,
		String pFiller2
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO5),
			pRegNum,
			pPromoCode,
			pRegKey,
			pItemCode,
			pMessageCode,
			pFiller1,
			pFiller2
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}

	public static int updatePromocionTipo6( // Enviar un mensaje a un grupo de clientes
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pCustList,
		String pMessageCode,
		String pCustListCode,
		String pFiller1
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO6),
			pRegNum,
			pPromoCode,
			pRegKey,
			pCustList,
			pMessageCode,
			pCustListCode,
			pFiller1
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	public static int updatePromocionTipo6_2( //  Enviar un mensaje a un tipo de cliente
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pCustList1,
		String pMessageCode,
		String pFiller1,
		String pFiller2 // Realmente es una copia de pCustList1
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO6_2),
			pRegNum,
			pPromoCode,
			pRegKey,
			pCustList1,
			pMessageCode,
			pFiller1,
			pFiller2
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	
	
	public static int updateCustMessagesPromocion( // Enviar un mensaje a un grupo de clientes
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pCustCode,
		String pUpdateType,
		String pCustList,
		String pFiller1
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO6),
			pRegNum,
			pPromoCode,
			pRegKey,
			pCustCode,
			pUpdateType,
			pCustList,
			pFiller1
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	
	
	public static int updateCustomersPromocion(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pTipoPromo, // 31 tipo de promocion = presencia de cliente
		String pCustomersIDs,
		String pMessage,
		String pCompareValue,
		String pCustomersList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_CUSTOMERS_PROMO),
			pRegNum,
			pPromoCode,
			pTipoPromo,
			pCustomersIDs,
			pMessage,
			pCustomersList,
			pCompareValue
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	
	
	public static int updatePromocionTipo7( // Enviar un mensaje a un grupo de clientes
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pDepartCode,
		String pMessageCode,
		String pFiller1,
		String pCustList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO7),
			pRegNum,
			pPromoCode,
			pRegKey,
			pDepartCode,
			pMessageCode,
			pFiller1,
			pCustList
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	

	public static int updatePromocionTipo8( // Enviar un mensaje a un grupo de clientes
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pDepartCode,
		String pMessageCode,
		String pMinAmount,
		String pCustList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO8),
			pRegNum,
			pPromoCode,
			pRegKey,
			pDepartCode,
			pMessageCode,
			pMinAmount,
			pCustList
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	

	public static int updatePromocionTipo9( // Enviar un mensaje a un grupo de clientes
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pFiller1,
		String pMessageCode,
		String pMinAmount,
		String pCustList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO9),
			pRegNum,
			pPromoCode,
			pRegKey,
			pFiller1,
			pMessageCode,
			pMinAmount,
			pCustList
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}

	public static int updatePromocionTipo10( // Enviar un mensaje a un grupo de clientes
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pArtiPLU,
		String pMessageCode,
		String pFiller1,
		String pCustList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO10),
			pRegNum,
			pPromoCode,
			pRegKey,
			pArtiPLU,
			pMessageCode,
			pFiller1,
			pCustList
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}

	public static int updatePromocionTipo11( // Enviar un mensaje a un grupo de clientes
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegNum,
		String pPromoCode,
		String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pPayType,
		String pMessageCode,
		String pMinAmount,
		String pCustList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO11),
			pRegNum,
			pPromoCode,
			pRegKey,
			pPayType,
			pMessageCode,
			pMinAmount,
			pCustList
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}

	public static int updateDefinitionPromocionTipo12( // Enviar un mensaje por venta de un monto específico de un grupo de artículos
		String pUrl1,
		String pUrl2,
		String pPort,
		//String pRegNum,
		String pPromoCode,
		//String pRegKey, // Clave que identifica el registro en la POS de acuerdo al tipo de promoción		
		String pPromoName,
		String pMessageCode,
		String pMinAmount,
		String pNumBenef,
		String pNumApplyes,
		String pCustList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO12_1),
			//pRegNum,
			pPromoCode,
			//pRegKey,
			pPromoName,
			pMessageCode,
			pMinAmount,
			pNumBenef,
			pNumApplyes,
			pCustList
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	public static int updateProductsPromocionTipo12( // Enviar un mensaje por venta de un monto específico de un grupo de artículos
		String pUrl1,
		String pUrl2,
		String pPort,
		String pGrpCounter,
		String pPromoCode,
		String pArts
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO12_2),
			pGrpCounter,
			pPromoCode,
			//pRegKey,
			pArts
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	

	
	public static int updatePromocionTipo13(
		String pUrl1, String pUrl2, String pPort, String pRegNum, String pPromoCode, 
		String pPayType, String pTipoDcto, String pFechaIni, String pFechaFin, //formato aammdd 
			String pValor, String pCustList)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO13_1),
			pRegNum,
			pPromoCode,
			pPayType,
			pTipoDcto,
			pFechaIni,
			pFechaFin,
			pValor,
			pCustList
		};		
		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);	
	}
	
	public static int updateProductsPromocionTipo13(
		String pUrl1, String pUrl2, String pPort, String pRegNum, String pPromoCode, 
		String pPayType, String pTipoDcto, String pFechaIni, String pFechaFin, //formato aammdd 
			String pValor, String pCustList)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO13_2),
			pRegNum,
			pPromoCode,
			pPayType,
			pTipoDcto,
			pFechaIni,
			pFechaFin,
			pValor,
			pCustList
		};		
		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);	
	}	
	
	public static int updateMessagePromocion( // Enviar un mensaje por venta de un monto específico de un grupo de artículos
		String pUrl1,
		String pUrl2,
		String pPort,
		String pMessageCode,
		/*String pFlags,
		String pLogoCode,
		String pCuponCode,
		String pOperatorMsg1,
		String pOperatorMsg2,
		String pCustomerMsg1,
		String pCustomerMsg2,*/
		String pTicketMsg1
		/*String pTicketMsg2,
		String pTicketMsg3,
		String pTicketMsg4,
		String pTicketMsg5*/
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO12_3),
			pMessageCode,
			//pFlags,
			//pLogoCode,
			//pCuponCode,			
			//pOperatorMsg1,
			//pOperatorMsg2,
			//pCustomerMsg1,
			//pCustomerMsg2,
			//pMessageCode,
			pTicketMsg1,
			//pTicketMsg2,
			//pTicketMsg3,
			//pTicketMsg4,
			//pTicketMsg5
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}


	
	public static int updatePromocionTipo2TF2(
		String pUrl1,
		String pUrl2,
		String pPort,
		//String pRegNum,
		String pFileType,
		String pPromoCode,
		String pCouponType,
		String pCouponCode,
		String pCouponValue,
		String pCouponDescription, 
		String pItemPromocode,
		String pFiller,
		String pDepartament,
		String pAmount,
		String pLinkedTo,
		
		String pCouponType2,
		String pCouponCode2,
		String pCouponValue2,
		String pCouponDescription2, 
		String pItemPromocode2,
		String pFiller2,
		String pDepartament2,
		String pAmount2,
		String pLinkedTo2	
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO2),
			//pRegNum,
			pFileType,
			pPromoCode,
			pCouponType,
			pCouponCode,
			pCouponValue,
			pCouponDescription, 
			pItemPromocode,
			pFiller,
			pDepartament,
			pAmount,
			pLinkedTo,
			
			pCouponType2,
			pCouponCode2,
			pCouponValue2,
			pCouponDescription2, 
			pItemPromocode2,
			pFiller2,
			pDepartament2,
			pAmount2,
			pLinkedTo2			
			
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	public static int updatePromocionTipo4TF2(
		String pUrl1,
		String pUrl2,
		String pPort,
		//String pRegNum,
		String pFileType,
		String pPromoCode,
		String pCouponType,
		String pCouponCode,
		String pCouponValue,
		String pCouponDescription, 
		String pItemPromocode,
		String pFiller,
		String pDepartament,
		String pAmount,
		String pLinkedTo,
		
		String pCouponType2,
		String pCouponCode2,
		String pCouponValue2,
		String pCouponDescription2, 
		String pItemPromocode2,
		String pFiller2,
		String pDepartament2,
		String pAmount2,
		String pLinkedTo2,

		String pCouponType3,
		String pCouponCode3,
		String pCouponValue3,
		String pCouponDescription3, 
		String pItemPromocode3,
		String pFiller3,
		String pDepartament3,
		String pAmount3,
		String pLinkedTo3		
			
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO4),
			//pRegNum,
			pFileType,
			pPromoCode,
			pCouponType,
			pCouponCode,
			pCouponValue,
			pCouponDescription, 
			pItemPromocode,
			pFiller,
			pDepartament,
			pAmount,
			pLinkedTo,
			
			pCouponType2,
			pCouponCode2,
			pCouponValue2,
			pCouponDescription2, 
			pItemPromocode2,
			pFiller2,
			pDepartament2,
			pAmount2,
			pLinkedTo2,			
			
			pCouponType3,
			pCouponCode3,
			pCouponValue3,
			pCouponDescription3, 
			pItemPromocode3,
			pFiller3,
			pDepartament3,
			pAmount3,
			pLinkedTo3
			
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	

	public static int updatePromocionTipo3(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pPromocode,
		String cod_dep_,
		String cupon,
		String porcentaje,
		String DIA1,
		String HORAINICIAL1,
		String HORAFINAL1,
		String DIA2 ,
		String 			 HORAINICIAL2,
		String 			 HORAFINAL2,
		String 			 DIA3,
		String 			 HORAINICIAL3,
		String 			 HORAFINAL3,
		String 			 DIA4,
		String 			 HORAINICIAL4,
		String 			 HORAFINAL4,
		String 			 DIA5,
		String 		 HORAINICIAL5,
		String 		 HORAFINAL5,
		String 		 DIA6,
		String 		 HORAINICIAL6,
		String 		 HORAFINAL6,
		String 		 DIA7,
		String 		 HORAINICIAL7,
		String 		 HORAFINAL7,	
		String 		 pCustList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO3),
			pPromocode,
			cod_dep_,
			 cupon,
			 porcentaje,
			 DIA1,
			 HORAINICIAL1,
			 HORAFINAL1,
			 DIA2 ,
			 HORAINICIAL2,
			 HORAFINAL2,
			 DIA3,
			 HORAINICIAL3,
			 HORAFINAL3,
			 DIA4,
			 HORAINICIAL4,
			 HORAFINAL4,
			 DIA5,
			 HORAINICIAL5,
			 HORAFINAL5,
			 DIA6,
			 HORAINICIAL6,
			 HORAFINAL6,
			 DIA7,
			 HORAINICIAL7,
			 HORAFINAL7,
			 pCustList	
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	private static void updateNotaPedidoStatus (
		String[] pUrl,
		int pPort,
		String pIdNp,
		String pStatusNp,
		String pConsecNp
	) throws Exception {
		
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATENPSTATUS),
			pIdNp,
			pConsecNp,
			pStatusNp
		};
		
		sendObjectBySocket(pUrl,pPort,objArray_);

		
	}
	
	public static void updateIpControllers(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pIdAlmacen,
		String pDescripAlmacen,
		String pIpCC,
		String pPortCC,
		String pIpDD,
		String pPortDD
	) throws Exception {
		Object[] objArray_ = null;
		if ((pIpCC == null || pIpCC.trim().equals("")) && 
			(pIpDD == null || pIpDD.trim().equals(""))) {
			// Se esta eliminando el controlador
			objArray_ = new Object[] {
				new Integer(FUNCION_UPDATEIPCTRL),
				pIdAlmacen,
				null,
				null,
				null,
				null,
				null
			};
		} else {
			objArray_ = new Object[] {
				new Integer(FUNCION_UPDATEIPCTRL),
				pIdAlmacen,
				pDescripAlmacen,
				pIpCC,
				pPortCC,
				pIpDD,
				pPortDD
			};
		}
		sendObjectBySocket(new String[]{pUrl1,pUrl2},Integer.parseInt(pPort),objArray_);
	}
	
	public static void updateUsers(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pIdUser,
		String pNameUser,
		String pSNameUser,
		String pPassword
	) throws Exception {
		Object[] objArray_ = new Object[] {
			new Integer(FUNCION_UPDATEUSERS),
			pIdUser,
			pNameUser.trim() + " " + pSNameUser,
			pPassword
		};
		sendObjectBySocket(new String[]{pUrl1,pUrl2},Integer.parseInt(pPort),objArray_);
	}
	
	/*
	public static void updateAlistamiento(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pIdNp,
		String pIdDetalle,
		String pConsecNp,
		String pStatusNp,
		String pTipoEntrega,
		String pFechaEntrega,
		String pObservaciones,
		String pIdCliente,
		String pNombreCliente,
		String pApellidoCliente,
		String pTelefonoCliente,
		String pBarrioCliente,
		String pEmpleado,
		String pNombreEmpleado,
		String pApellidoEmpleado,
		String pIdArticulo,
		String pBarras,
		String pRefPrv,
		String pCant,
		String pCantPedida,
	String pDireccion,
	String pTipoEntregaDescrip,
	String pFechaCreacion,
	String pDpto,
	String pSubDpto
	) throws Exception {
		Object[] objArray_ = new Object[] {
			new Integer(FUNCION_UPDATEALISTAM),
			StringFormatter.align(pIdNp,12,'0',0,12) + StringFormatter.align(pIdDetalle,5,'0',0,5),
			pConsecNp,
			pStatusNp,
			pTipoEntrega,
			pFechaEntrega,
			pObservaciones,
			pIdCliente,
			pNombreCliente,
			pApellidoCliente,
			pTelefonoCliente,
			pBarrioCliente,
			pEmpleado,
			pNombreEmpleado.trim() + " " + pApellidoEmpleado.trim(),
			pIdArticulo,
			pBarras,
			pRefPrv,
			pCant,
			pCantPedida,
	  pDireccion,
	  pTipoEntregaDescrip,
	  pFechaCreacion,
	  pDpto,
	  pSubDpto
		};
		
		sendObjectBySocket(new String[]{pUrl1,pUrl2},Integer.parseInt(pPort),objArray_);
	}
	*/
  
  	/*
	public static void deleteDetalis(String pUrl1,String pUrl2,String pPort,String pIdNp,String pIdDetalle) throws Exception {
		Object[] objArray_ = new Object[] {
			new Integer(FUNCION_DELETEDETALIS),
			StringFormatter.align(pIdNp,12,'0',0,12) + StringFormatter.align(pIdDetalle,5,'0',0,5)
		};
		sendObjectBySocket(new String[]{pUrl1,pUrl2},Integer.parseInt(pPort),objArray_);
	} 
	*/ 
	
	public static void main(String[] args) {
		try {
			updateBonoDevolucion(
				"192.168.0.53",
				"10.23.18.51",
				"5001",
				"583",
				"1",
				"1",
				"USADO PARCIALMENTE"
			);
			
/*			PURL1 := '1';
			PURL2 := '2';
			PPORT := '3';
			NUMBONO := '4';
			VALORTOTAL := 5;
			VALORUTILIZADO := 6;
			ESTADO := '7';*/			
		} catch (Exception e) {
			System.out.println("Unable to execute task");
		}
	}
	
	public static int updatePromocionTipo14(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pPromocode,
		String pVlrMinimo,
		String pPorcentaje,
		String pCustList
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO14),
			pPromocode,
			pCustList,
			pVlrMinimo,
			pPorcentaje
				
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	public static Object[] getStoreSellTotals(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pRegKey
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_TOL_GET_SELL_TOTALS),
			pRegKey
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswerObj(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	// Actualiza una promoción en una carga total	
	public static int updatePromocionTipo15_1(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pPromoString
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO15_1),
			pPromoString
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	//	Envia el XML de definición de una promoción de forma individual
	public static int updatePromocionTipo15_3(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pPromocode,
		String pPromoString		
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO15_3),
			pPromocode,
			pPromoString
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	
	
	//	Envia el XML de definición de una promoción en una carga completa
	public static int updatePromocionTipo15_31(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pPromocode,
		String pPromoString,
		String regNum // Número promo enviada	
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO15_31),
			pPromocode,
			pPromoString,
			regNum
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}

	// Inserta la definición de un bono recompra	
	public static int updatePromocionTipo16_1(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pFileLine1,
		String pMsgLine1,
		String pMsgLine2,
		String pMsgLine3,
		String pPromoCode,
		String pBonusType
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO16_1),
			pFileLine1,
			pMsgLine1,
			pMsgLine2,
			pMsgLine3,
			pPromoCode,
			pBonusType
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}

	// Inserta en el archivo temporal de definición de bono recompra, todos los productos asociados a dicho bono recompra. TLDIxxxx.yyy (donde xxxxyyy es el código de la promoción ajustado con ceros a la izquierda)
	public static int updatePromocionTipo16_2(
		String pUrl1,
		String pUrl2,
		String pPort,
		//String pRegNum,
		String pProductIDs,
		String pPromoCode,
		String pBonusType
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO16_2),
			//pRegNum,
			pProductIDs,
			pPromoCode,
			pBonusType
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	
	// Renombra el archivo temporal de de bono recompra al definitivo LDITxxxx.yyy (donde xxxxyyy es el código de la promoción ajustado con ceros a la izquierda)
	/*
	public static int updatePromocionTipo16_3(
		String pUrl1,
		String pUrl2,
		String pPort,
		String pPromoCode,
		String pBonusType,
		ObjectListSize pObjDataSizes
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_UPDATE_PROMO_TIPO16_3),
			pPromoCode,
			pBonusType,
			new Long (pObjDataSizes.getSize())
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}
	*/

	//	Envia un requerimiento para que borre el archivo PROMOTIO.DAT y renombre el archivo TPROMOTI.DAT como un nuevo PROMOTIO.DAT. 
	// Además, debe borrar todos los PROMxxxx.yyy (donde xxxxyyy es el código de la promoción ajustado con ceros a la izquierda)
	
	public static int endPromotionsTotalLoad(
		String pUrl1,
		String pUrl2,
		String pPort
		)throws Exception {
		Object[] objArray_ =  new Object[] {
			new Integer(FUNCION_END_PROMO_TOTAL_LOAD)
		};		
		int port=Integer.parseInt(pPort);
		return sendObjBySocketWithAnswer(new String[] {pUrl1,pUrl2},port,objArray_);			
	}	
	
	
}

