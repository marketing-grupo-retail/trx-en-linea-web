/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: DetalleReporteTrxsAction.java,v 1.1 2019/12/18 17:31:06 Alfonso Exp $
 *
 */
package com.grpretail.trxonline.actions;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.asic.framework.actions.BaseAction;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TRANSACCION;
import com.grpretail.trxonline.forms.ReporteTrxForm;
import com.grpretail.trxonline.helpers.TransaccionHelper;


/**
 * Clase encargada de ejecutar el bean para el RequestHelper
 * y retornar la página siguiente, creando antes el array que
 * contiene el listado que se va a desplegar
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */
public class DetalleReporteTrxsAction extends BaseAction {
	
	private static final int NUM_FILAS = 11;
	
    /**
     * Retorna el nombre de la página a desplegar
     *
     * @see org.ramm.jwaf.controller.command.Command#doIt(RequestHelper)
     */
    public DetalleReporteTrxsAction() {
        super();
    }

    /**
     * JDOC Method Def
     *
     * @param mapping DOCUMENT ME!
     * @param form DOCUMENT ME!
     * @param request DOCUMENT ME!
     * @param response DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
        HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        ActionErrors errors = new ActionErrors();
        ActionForward forward = new ActionForward();

        String next_ = "detalle_reporteTrxs.success";
		String resp_ = (String)request.getAttribute("mensaje")!=null?(String)request.getAttribute("mensaje"):"";

        try {
			//			crea la sesion del usuario
			HttpSession session_ = request.getSession(false);
			ReporteTrxForm form_ = (ReporteTrxForm) form;
			
			//Ini Paginacion
			String numFilasParam_ = request.getParameter("numFilas");
			int numFilas_ = NUM_FILAS;
			// si es la segunda vez
			if(numFilasParam_ != null && !numFilasParam_.equals("")){
				numFilas_ = Integer.parseInt(numFilasParam_)+1;
			}
			String posIndex_ = request.getParameter("posIndex");
			Boolean paging_ = Boolean.valueOf(request.getParameter("paging"));
			request.setAttribute("paging", paging_);
			// la primera vez
			if(posIndex_ == null || !paging_.booleanValue()){
				posIndex_ = "1";
			}
			int posIni_ = Integer.parseInt(posIndex_);
			request.setAttribute("numFilas", numFilasParam_);
			//Fin Paginacion
			
			TRANSACCION clientTrxs_ = null;
			TransaccionHelper helper_ = new TransaccionHelper();
			
			TPOS_HEADER object_ = (TPOS_HEADER) getVO(TPOS_HEADER.class);
			
			object_.setSTORE(Double.valueOf(request.getParameter("pTienda")));
			object_.setTERMINAL(Double.valueOf(request.getParameter("pTerminal")));
			object_.setTRANSNUM(Double.valueOf(request.getParameter("pNumeroTrx")));
			object_.setDAY(Timestamp.valueOf(request.getParameter("pFecha")));
			object_.setTIME(request.getParameter("pHora"));
			object_.setTRANSTYPE(Double.valueOf(request.getParameter("pTipoTrx")));
			object_.setGROSSPOS(Double.valueOf(request.getParameter("pGrossPos")));
			object_.setGROSSNEG(Double.valueOf(request.getParameter("pGrossNeg")));
				
				//Consulta las transacciones del cliente
			clientTrxs_ = helper_.getDetalleTransacciones(object_,posIni_, numFilas_);	
			request.setAttribute("transacciones", clientTrxs_);			   
			next_ = "detalle_reporteTrxs.success";
	
			   
			request.setAttribute("mensaje",resp_);
			
			System.out.println("Desde ReporteTrxsAction");
			request.setAttribute("reporteTrxForm", form_);

        } catch (Exception e) {
			next_ = errorProcess(this,request, errors, e);
        }

        return redirect(mapping, request, errors, next_);
    }
    
}
