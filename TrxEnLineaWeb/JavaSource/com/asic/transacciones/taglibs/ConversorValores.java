/*
 * Created on Jul 5, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.transacciones.taglibs;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts.util.LabelValueBean;
import org.ramm.jwaf.logger.LogWriter;


/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class ConversorValores extends TagSupport {

	String parametro="";
	/**
		* JDOC Method Def
		*
		* @return DOCUMENT ME!
		*
		* @throws javax.servlet.jsp.JspException DOCUMENT ME!
		*/
	public int doStartTag() throws javax.servlet.jsp.JspException {
		try {
			 boolean acceso = false;
			ServletContext sc_ =  pageContext.getServletContext();
			
			Hashtable hash_ = (Hashtable) sc_.getAttribute("parametros_trx");
			String par_ = (String) hash_.get(parametro);
			
			if(parametro.equalsIgnoreCase("strings")){
				List opcs_ =getOpciones(par_,",",".");
				sc_.setAttribute("strings",opcs_);
				par_="";
			}
			
			pageContext.getOut().println(par_);
		} catch (Exception e) {
			LogWriter.getLog().log(
				this,
				LogWriter.INFO,
				"Error al desplegar el estado:" + e.getMessage());
		}
		return Tag.EVAL_BODY_INCLUDE;
	}

	/**
	* JDOC Method Def
	*
	* @return DOCUMENT ME!
	*
	* @throws JspException DOCUMENT ME!
	*/
	public int doEndTag() throws JspException {

		//		   No body evaluation. 
		return Tag.EVAL_PAGE;
	}


	/**
	 * @return
	 */
	public String getParametro() {
		return parametro;
	}

	/**
	 * @param string
	 */
	public void setParametro(String string) {
		parametro = string;
	}


	public List getOpciones(String pValores, String pToken, String pSep) {
			ArrayList list_ = new ArrayList();
			
			StringTokenizer tok_ = new StringTokenizer(pValores.trim(), pToken);
			String total_, label_, valor_ = "";
			int indx_ = -1;

			while (tok_.hasMoreTokens()) {
				total_ = tok_.nextToken();
				indx_ = total_.indexOf(pSep);
				if (indx_ != -1) {
					valor_= total_.substring(0, indx_);
					label_= total_.substring(indx_ + 1, total_.length());
					list_.add(new LabelValueBean(label_, valor_));
				}
			}
			return list_;
		}
}
