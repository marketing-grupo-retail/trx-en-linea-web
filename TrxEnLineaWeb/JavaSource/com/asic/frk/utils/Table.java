/*
 * Created on Jul 24, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.frk.utils;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts.taglib.bean.MessageTag;
import org.ramm.jwaf.logger.LogWriter;


/**
 * DOCUMENT ME!
 *
 * @author IsaG To change the template for this generated type comment go to
 *         Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and
 *         Comments
 */
public class Table extends TagSupport {
	String titulo;
	String tipoTitulo;
	int tipo;
	String width;
    /**
     * JDOC Method Def
     *
     * @return DOCUMENT ME!
     *
     * @throws javax.servlet.jsp.JspException DOCUMENT ME!
     */
    public int doStartTag() throws javax.servlet.jsp.JspException {
        try {
        	
        	switch (getTipo()){
        		case 2:printHeaderTipo2(pageContext.getOut());
						break;
        		case 3:printHeaderTipo3(pageContext.getOut());
						break;
        		default: printHeaderTipo1(pageContext.getOut());
        					break;
        	}
        	
        } catch (Exception e) {
            LogWriter.getLog().log(this, LogWriter.INFO,
                "Error la generación de la tabla:" + e.getMessage());
        }

        return Tag.EVAL_BODY_INCLUDE;
    }

        /**
	 * @return
	 */
	private void printHeaderTipo3(JspWriter out) throws IOException, JspException {
			out.println("" +
			"<table width='"+ (getWidth()!=null?getWidth():"100%") +"' border=0 ><tr><td>"+
			"<table width='"+ (getWidth()!=null?getWidth():"100%") +"' border='1' cellpadding='0' bordercolor='#789eba'>"+
			"<tr><td class='estiloPrincipal'><STRONG>");
			getTitulo(out);
			out.println("</STRONG></td></tr>" +
			"</table></td></tr>" +
			"<tr>"+ 
			"<td><TABLE width='"+ (getWidth()!=null?getWidth():"100%") +"' border=0 align=center cellPadding=1 "+ 
			" >");
		}
    
        
        
	private void printHeaderTipo2(JspWriter out) throws IOException, JspException {
		out.println("<CENTER>" +
		"<table width='"+ (getWidth()!=null?getWidth():"450") +"' cellspacing='1' border=0 bordercolor='#f9e6bf' align=center>"+
		"<tr><td class='estiloAlterno' align='center'><STRONG>");
		getTitulo(out);
		out.println("</STRONG></td></tr>" +
		"</td></tr>" +
		"<tr>"+ 
		"<td><TABLE width='100%' border=0 align=center cellPadding=2"+ 
		"bgColor=#FF5555>");
	}
    
        
        
	private void printHeaderTipo1(JspWriter out) throws IOException, JspException {
		out.println("<CENTER>" +
		"<table width='"+ (getWidth()!=null?getWidth():"600") +"' border=0 align=center><tr><td>"+
		"<table width='100%' border='0' cellpadding='0' bordercolor='#789eba'>"+
		"<tr><td class='estiloSecundario'><STRONG>");
		getTitulo(out);
		out.println("</STRONG></td></tr>" +
		"</table></td></tr>" +
		"<tr>"+ 
		"<td><TABLE width='"+ (getWidth()!=null?getWidth():"600") +"' border=0 align=center cellPadding=2"+ 
		"bgColor=#FFFFFF>");
	}

	/**
     * JDOC Method Def
     *
     * @return DOCUMENT ME!
     *
     * @throws JspException DOCUMENT ME!
     */
    public int doEndTag() throws JspException {
		try {
			switch (getTipo()){
				case 2:printFooterTipo2(pageContext.getOut());
						break;
				case 3:printFooterTipo3(pageContext.getOut());
						break;
				default: printFooterTipo1(pageContext.getOut());
							break;
			}
		
		} catch (Exception e) {
					LogWriter.getLog().log(this, LogWriter.INFO,
						"Error la generación de la tabla:" + e.getMessage());
				}
//		No body evaluation. 
        return Tag.EVAL_PAGE;
    }
   
      
	/**
	 * 
	 */
	private void printFooterTipo1(JspWriter out) throws IOException {
		out.println("</table></td></tr></table></CENTER>");
		
	}

	private void printFooterTipo2(JspWriter out) throws IOException {
		out.println("</table></td></tr></table></CENTER>");
	
	}

	private void printFooterTipo3(JspWriter out) throws IOException {
			out.println("</table></td></tr></table>");
		
		}
	/**
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	
	public void getTitulo(JspWriter out) throws JspException, IOException {
		if (getTipoTitulo()!= null && getTipoTitulo().equalsIgnoreCase("key"))
		{
			MessageTag tag_ = new MessageTag();
			tag_.setKey(getTitulo());
			tag_.setPageContext(pageContext);
			tag_.doStartTag();
			tag_.doEndTag();
		}else{
			out.print(getTitulo());
		}
	}

	/**
	 * @param string
	 */
	public void setTitulo(String string) {
		titulo = string;
	}

	/**
	 * @return
	 */
	public int getTipo() {
		return tipo;
	}

	/**
	 * @param string
	 */
	public void setTipo(int string) {
		tipo = string;
	}

	/**
	 * @return
	 */
	public String getTipoTitulo() {
		return tipoTitulo;
	}

	/**
	 * @param string
	 */
	public void setTipoTitulo(String string) {
		tipoTitulo = string;
	}

	/**
	 * @return
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * @param string
	 */
	public void setWidth(String string) {
		width = string;
	}

}
