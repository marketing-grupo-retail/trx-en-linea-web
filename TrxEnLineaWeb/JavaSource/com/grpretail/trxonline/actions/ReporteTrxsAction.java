/*
 ** Proyecto:
 *
 * Copyriht (C) 2003-2004 Asic S.A. Bogotá, Colombia.
 * * All rights Reserved.
 *
 * $Id: ReporteTrxsAction.java,v 1.1 2019/12/18 17:31:06 Alfonso Exp $
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
public class ReporteTrxsAction extends BaseAction {
	
	private static final int NUM_FILAS = 11;
	
    /**
     * Retorna el nombre de la página a desplegar
     *
     * @see org.ramm.jwaf.controller.command.Command#doIt(RequestHelper)
     */
    public ReporteTrxsAction() {
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

        String next_ = "reporte_trxs.success";
		String resp_ = (String)request.getAttribute("mensaje")!=null?(String)request.getAttribute("mensaje"):"";

        try {
			//			crea la sesion del usuario
			HttpSession session_ = request.getSession(false);
			ReporteTrxForm form_ = (ReporteTrxForm) form;

			/*StringTokenizer clienteSeleccionado_ = new StringTokenizer(form_.getListClientesSeleccionados(),",");
			String idObject_ = clienteSeleccionado_.nextToken();
			String cedula_ = clienteSeleccionado_.nextToken();
			String nombre_ = clienteSeleccionado_.nextToken();
			form_.setCedula(cedula_);
			form_.setNombre(nombre_);

			request.setAttribute("pListClientesSeleccionados",idObject_+","+cedula_+","+nombre_);*/
			
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
			
			boolean searchTrxs_	= Boolean.valueOf(request.getParameter("search")).booleanValue();
			if (searchTrxs_) {
				TPOS_HEADER object_ = (TPOS_HEADER) getVO(TPOS_HEADER.class);
				if (form_.getTienda()!=null && !form_.getTienda().equals(""))
					object_.setSTORE(Double.valueOf(form_.getTienda()));
				
				if (form_.getTerminal()!=null && !form_.getTerminal().equals(""))
					object_.setTERMINAL(Double.valueOf(form_.getTerminal()));
					
				if (form_.getNumeroTrx()!=null && !form_.getNumeroTrx().equals(""))
					object_.setTRANSNUM(Double.valueOf(form_.getNumeroTrx()));
				
				if (form_.getFecha()!=null && !form_.getFecha().equals(""))
					object_.setDAY(new Timestamp(Date.valueOf(form_.getFecha()).getTime()));
				
				List clientTrxs_ = null;
				TransaccionHelper helper_ = new TransaccionHelper();
				/*List clientPoints_ = null;
				
				
				//Consulta los puntos del cliente
				clientPoints_ = helper_.getClientPoints(object_);
				if (!clientPoints_.isEmpty()) {
					TPOS_HEADER puntosCliete_ = (TPOS_HEADER)clientPoints_.iterator().next();
					form_.setPtsDisponibles(puntosCliete_.getPTOACU().longValue()-puntosCliete_.getPTOARD().longValue());
					form_.setPtsTotales(puntosCliete_.getPTOACU().longValue());
					form_.setPtsRedimidos(puntosCliete_.getPTOARD().longValue());
					form_.setPtsRedimidosUltTrx(puntosCliete_.getPTORED().longValue());
				} else {
					form_.setTienda(0);
					form_.setTerminal(0);
					form_.setNumeroTrx(0);
					form_.setIdObject(null);
					form_.setFecha(null);
				}*/
				
				//Consulta las transacciones del cliente
				clientTrxs_ = helper_.getTransacciones(object_,posIni_, numFilas_);	
				if(clientTrxs_ != null && clientTrxs_.size() != 0){
				   request.setAttribute("transacciones", clientTrxs_);			   
				   next_ = "reporte_trxs.success";
	
		   
					if((clientTrxs_ != null) && (clientTrxs_.size() != 0) ){
						//Ini paginacion
						if(clientTrxs_.size() == NUM_FILAS){
							// quita el ultimo
							((List)clientTrxs_).remove(clientTrxs_.size() - 1);
							request.setAttribute("pag_hasNext", "true");
						}else{
							request.setAttribute("pag_hasNext", "false");
						}
						int size_ = clientTrxs_ .size();
						request.setAttribute("collectionSize", ""+size_);
						//Fin paginacion
					}
		   
					  // session_.setAttribute("AdminClienteForm", form);
			   } else {
				   resp_ = "No existen transacciones";
				   next_ = "reporte_trxs.success";
			   }
			}
			request.setAttribute("mensaje",resp_);
			
			System.out.println("Desde ReporteTrxsAction");
			request.setAttribute("reporteTrxForm", form_);

        } catch (Exception e) {
			next_ = errorProcess(this,request, errors, e);
        }

        return redirect(mapping, request, errors, next_);
    }
    
}
