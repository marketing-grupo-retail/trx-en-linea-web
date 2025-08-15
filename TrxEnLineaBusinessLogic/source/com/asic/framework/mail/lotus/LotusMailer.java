/*
 * Created on Sep 29, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.framework.mail.lotus;

import java.util.ResourceBundle;
import java.util.Vector;

import org.ramm.jwaf.logger.LogWriter;

import com.asic.framework.exception.ServiceException;

import lotus.domino.Database;
import lotus.domino.Document;
import lotus.domino.NotesException;
import lotus.domino.NotesFactory;
import lotus.domino.NotesThread;
import lotus.domino.Registration;
import lotus.domino.RichTextItem;
import lotus.domino.Session;

/**
 * com.asic.utils.mail - LotusMailer.java
 * @author Jaime Flautero
 * ACG ASIC CONSULTING GROUP
 * Sep 29, 2005
 */
public class LotusMailer {
	
	Database db;
	String host;

	/**
	 * Envia correo a traves de un servidor Lotus Domino.
	 * @param pRecipent_ Vector con los correos destinatarios
	 * @param pSubject_ Asunto del correo
	 * @param pBody_ Cuerpo del correo 
	 * @return resultado de la operación de envio
	 * @author Jaime Flautero
	 */
	public void sendMail(Vector pRecipent_, String pSubject_, Vector pBody_) throws ServiceException {
		try {
			
			Document memo = db.createDocument();
			memo.replaceItemValue("Form", "Memo");
			memo.replaceItemValue("Subject", pSubject_);
			RichTextItem rich = memo.createRichTextItem("Body");
			for (int i = 0; i < pBody_.size(); i++) {
				rich.appendText(pBody_.get(i).toString());
				rich.addNewLine();
			}
			// replicate with mail home server
			memo.send(pRecipent_);
			db.replicate(host);
			db.recycle();
			NotesThread.stermThread();
			
		} catch (Exception e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [sendMail(...)]:" + e.getMessage(), e);
			throw new ServiceException("", e);
		}
	}

	public void initLotusMailer(EmailClientLotusConfig pConfig) throws ServiceException {
		
		try {
			NotesThread.sinitThread();
			Session s;
			host = pConfig.getServidor();
			s = NotesFactory.createSession();
			Registration reg = s.createRegistration();
			reg.switchToID(pConfig.getUserId(), pConfig.getPassword());
			db = s.getDatabase(pConfig.getServidor(), pConfig.getDbUser());
		} catch (NotesException e) {
			LogWriter.getLog().log(this, LogWriter.SEVERE, "En [sendMail(...)]:" + e.getMessage(), e);
			throw new ServiceException("", e);
		}
		finally{
		//	NotesThread.stermThread();
		}

	}
	
	
}
