<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><HTML>
<head>


<META http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<%
%><TITLE>DETALLE TRANSACCION</TITLE>
<META name="GENERATOR" content="IBM WebSphere Studio">

<!--Styles-->
<STYLE TYPE="text/css">
<!--H1
{
text-align: center;
}-->
</STYLE>

<!--Style Sheet-->
<LINK href="theme/Master.css" rel="stylesheet" type="text/css">
<!--<link href="../theme/comfandi.css" rel="stylesheet" type="text/css">-->
</head> 
<body  bgcolor="#EEDFA6" link="#996600" vlink="#666600" alink="#999999">

<%@ page import="com.asic.demo.ReporteTransaccionesMasterViewBean" %>
<%@ page import="com.asic.ac.utils.NumberFormatter" %>
<jsp:useBean id="masterViewDBBean" class="com.asic.demo.ReporteTransaccionesMasterViewBean" scope="request" />


<!--Java Script-->
<SCRIPT LANGUAGE="JavaScript" src="/TrxManagerWeb/js/CalendarPopup.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" src="/TrxManagerWeb/js/AnchorPosition.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" src="/TrxManagerWeb/js/date.js"></SCRIPT>
<SCRIPT LANGUAGE="JavaScript" src="/TrxManagerWeb/js/PopupWindow.js"></SCRIPT>

<SCRIPT LANGUAGE="JavaScript" TYPE="text/javascript">
var cal1 = new CalendarPopup();
  
<!--
<%
	String limInf_ = request.getParameter("lim_inf"); 	
	String limSup_ = request.getParameter("lim_sup"); 	
	String tmp="REGISTERS_NUMBER_TO_SHOW";
%>
function viewDetails(pRow) {
	if(myForm.elements["RECORDCOUNT"].value == "1") {
		myForm.elements["CURRENTCARD"].value = myForm.elements["CARD"].value;
		myForm.elements["CURRENTNOMBRECLIENTE"].value = myForm.elements["NOMBRECLIENTE"].value + " " + 
			myForm.elements["APELLIDOSCLIENTE"].value;
	} else {
		myForm.elements["CURRENTCARD"].value = myForm.elements["CARD"][pRow].value;
		myForm.elements["CURRENTNOMBRECLIENTE"].value = myForm.elements["NOMBRECLIENTE"][pRow].value + " " + 
			myForm.elements["APELLIDOSCLIENTE"][pRow].value;
	}
}

function editInfo(pRow) {
	myForm.elements["SELECTEDINDEX"].value = pRow;
	myForm.elements["ACTIONTODO"].value = "EDICION";
	myForm.elements["command"].value = "ReporteClientesMasterView";
	myForm.submit();
}

function updateInfo(){
	myForm.elements["ACTIONTODO"].value = "CONFIRM";
	myForm.elements["command"].value = "ReporteClientesMasterView";
	myForm.submit();
}

function cancelUpdateInfo(){
	myForm.elements["ACTIONTODO"].value = "CONSULTA";
	myForm.elements["command"].value = "ReporteClientesMasterView";
	myForm.submit();
}

function executeQueryCP(limInf,limSup){
	myForm.elements["lim_inf"].value =limInf;
	myForm.elements["lim_sup"].value = limSup;
	myForm.elements["ACTIONTODO"].value = "CONSULTA";
	myForm.elements["command"].value = "ReporteTransaccionesMasterView";
	myForm.submit();
	
}

function executeQuery(){
	var limInferior = <%= new Integer(1).toString()%>;
	var limSuperior = <%= new Integer(masterViewDBBean.getBundle().getString("REGISTERS_NUMBER_TO_SHOW")).toString()%>;
  	executeQueryCP(limInferior, limSuperior);	
}

function atras(){
	var limInferior = <%=limInf_==null? new Integer(1).toString():new Integer(new Integer(limInf_).intValue()-(new Integer(masterViewDBBean.getBundle().getString("REGISTERS_NUMBER_TO_SHOW")).intValue())).toString()%>;
	var limSuperior = <%=limSup_==null? new Integer(masterViewDBBean.getBundle().getString("REGISTERS_NUMBER_TO_SHOW")).toString(): new Integer(new Integer(limSup_).intValue()-(new Integer(masterViewDBBean.getBundle().getString("REGISTERS_NUMBER_TO_SHOW")).intValue())).toString()%>;
  	executeQueryCP(limInferior, limSuperior);
}

function adelante(){
	var limInferior = <%=limInf_==null? new Integer(1).toString():new Integer(new Integer(limInf_).intValue()+(new Integer(masterViewDBBean.getBundle().getString("REGISTERS_NUMBER_TO_SHOW")).intValue())).toString()%>;
	var limSuperior = <%=limSup_==null? new Integer(masterViewDBBean.getBundle().getString("REGISTERS_NUMBER_TO_SHOW")).toString(): new Integer(new Integer(limSup_).intValue()+(new Integer(masterViewDBBean.getBundle().getString("REGISTERS_NUMBER_TO_SHOW")).intValue())).toString()%>;
  	executeQueryCP(limInferior, limSuperior);
}

function clearFilters(){
	myForm.elements["FILTERNUMBONO"].value="";
	myForm.elements["FILTERALMACEN"].value="";
	myForm.elements["FILTERFROM"].value="";
	myForm.elements["FILTERTO"].value="";	
	myForm.elements["FILTERTRX"].value="";
}

function desAbilitarAtras(){
	queryButtonAdelante.disabled=true;
}			

function desAbilitarAdelante(){
	queryButtonAtras.disabled=true;        	
}

function getFecha(pField,pAnchor) {
	cal1.select(myForm.elements[pField],pAnchor,'yyyy-MM-dd');
	
}

function buscar_detalle(tienda,terminal,trxnum) {
	alert(tienda);
	alert(terminal);
	alert(trxnum);	
}
//-->
</SCRIPT>
  <!--Navigation-->
  <div align="center"> </div>
<FORM name="myForm" action="test/QueryStatusMonitorController" method="POST">

<!--Hidden Variables-->
<INPUT TYPE="hidden" NAME="command" VALUE="ReporteTrxPuntosxCliente"/>
<INPUT type="hidden" name="SELECTEDINDEX"> 
<INPUT type="hidden" name="CURRENTCARD"> 
<INPUT type="hidden" name="CURRENTNOMBRECLIENTE"> 


<INPUT type="hidden" name="ACTIONTODO" value="CONSULTA"> 
<INPUT TYPE="hidden" NAME="lim_inf">
<INPUT TYPE="hidden" NAME="lim_sup">
<%
String actionToDo_ = request.getParameter("ACTIONTODO") == null || request.getParameter("ACTIONTODO").trim().equals("") ? 
	"CONSULTA2" : request.getParameter("ACTIONTODO");
%>
	
 

  <H1 class="titulos"><font color="#004080">DETALLE TRANSACCION</font></H1>
	
	
  <p class="titulosPeq"><BR>
    <BR>
    <!--Filter Table-->

    <%
	String filterTienda_ = request.getParameter("TIENDA") == null || request.getParameter("TIENDA").trim().equals("") ? 
		"%" : request.getParameter("TIENDA");
	System.out.println("Tienda:"+filterTienda_);
	String filterTerminal_ = request.getParameter("TERMINAL") == null || request.getParameter("TERMINAL").trim().equals("") ? 
		"%" : request.getParameter("TERMINAL");	
	System.out.println("Terminal:"+filterTerminal_);
	String filterTrx_ = request.getParameter("TRX") == null || request.getParameter("TRX").trim().equals("") ? 
		"%" : request.getParameter("TRX");	
	System.out.println("Trx:"+filterTrx_);
	String filterNumBono_ = request.getParameter("FILTERNUMBONO") == null || request.getParameter("FILTERNUMBONO").trim().equals("") ? 
		"%" : request.getParameter("FILTERNUMBONO");
		
	String filterAlmacen_ = request.getParameter("FILTERALMACEN") == null || request.getParameter("FILTERALMACEN").trim().equals("") ? 
		"%" : request.getParameter("FILTERALMACEN");

	String filterFrom_ = request.getParameter("FILTERFROM") == null || request.getParameter("FILTERFROM").trim().equals("") ? 
		"" : request.getParameter("FILTERFROM");

	String filterTo_ = request.getParameter("FILTERTO") == null || request.getParameter("FILTERTO").trim().equals("") ? 
		"" : request.getParameter("FILTERTO");		
	
	%>
  </p>

	<BR><BR>	

	<%
		System.out.println("Parámetro newInput:"+request.getParameter("new_input"));	
		String newInput_ = request.getParameter("new_input") == null || !request.getParameter("new_input").trim().toLowerCase().equals("true") ? 
			"false" : "true";	
		//masterViewDBBean.executeDetalle(filterTienda_,filterTerminal_,filterTrx_);	

		if (!actionToDo_.equals("CONSULTA")) {
			//masterViewDBBean.setFilterNumBono(filterNumBono_);
			//masterViewDBBean.setFilterAlmacen(filterAlmacen_);
			//masterViewDBBean.setFilterFrom(filterFrom_);				
			//masterViewDBBean.setFilterTo(filterTo_);		
			System.out.println("Antes de ejucutar");
			masterViewDBBean.executeDetalle(filterTienda_,filterTerminal_,filterTrx_);	
	
	%>

	<%
			int counter_ = 0;		
			if (masterViewDBBean.firstHeader()) {
	%>
			<!--Table-->Detalle
			
  <TABLE border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#2065ac">
    <TBODY>
		<TR>
			<font color="#004080">
		        <TH class="titulosPeq"><FONT color="#004080">Tienda</font></TH>
	    	    <TH class="titulosPeq"><FONT color="#004080">Terminal</font></TH>
		        <TH class="titulosPeq"><FONT color="#004080">No. Trx</font></TH>	    	    
		        <TH class="titulosPeq"><FONT color="#004080">Operador</font></TH>
	        	<TH class="titulosPeq"><FONT color="#004080">Gross Pos.</font></TH>			        
	    	    <TH class="titulosPeq"><FONT color="#004080">Gross Neg.</font></TH>
	    	    <TH class="titulosPeq"><FONT color="#004080">Fecha Hora Trx</font></TH>
			</font>
		</TR>

						<TR>
							<TD align="center">
								<%=masterViewDBBean.getHTienda()%>
							</TD>																				
							<TD>
								<%=masterViewDBBean.getHTerminal()%>
								<INPUT type="hidden" name="CARD" value="<%=masterViewDBBean.getTerminal()%>"> 
							</TD>
							<TD>
								<%=masterViewDBBean.getHTransNum()%>
							</TD>													
							<TD>
								<%=masterViewDBBean.getHOperador()%>
							</TD>																											
							<TD  align="right">
								<%=masterViewDBBean.getHGrossPositivo()%>
							</TD>
							<TD align="right">
								<%=masterViewDBBean.getHGrossNegativo()%>
							</TD>							
							<TD>
								<%=masterViewDBBean.getHFecha_hora_tran()%>
							</TD>
						</TR>
		<TR>
</TR>
			<%
			}
			%>
<TR>




	<%
			counter_ = 0;		
			if (masterViewDBBean.IEfirst()) {
	%>
			<!--Table-->
			
  <TABLE border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#2065ac">
    <TBODY>
		<TR>
			<font color="#004080">
		        <TH class="titulosPeq"><FONT color="#004080">Código Item</font></TH>
	    	    <TH class="titulosPeq"><FONT color="#004080">Precio</font></TH>
		        <TH class="titulosPeq"><FONT color="#004080">MPGroup</font></TH>
				<TH class="titulosPeq"><FONT color="#004080">Cantidad</font></TH>		        		        	    	    		        
		        <TH class="titulosPeq"><FONT color="#004080">Precio Unidad</font></TH>				
			</font>
		</TR>
					<%
					// Datos
					do {
						%>
						<TR>
							<TD align="center">
								<%=masterViewDBBean.getIECodigoItem()%>
							</TD>																				
							<TD align="right">
								<%=masterViewDBBean.getIEPrecio()%>
							</TD>
							<TD>
								<%=masterViewDBBean.getIEMpgroup()%>
							</TD>
							<TD>
								<%=masterViewDBBean.getIESalequan().equals("0")?"1":masterViewDBBean.getIESalequan()%>
							</TD>
							<TD align="right">
								<%=masterViewDBBean.getIEDealquan().equals(NumberFormatter.formatoMoneda(Double.parseDouble("0")))?masterViewDBBean.getIEPrecio():masterViewDBBean.getIEDealquan()%>
							</TD>																																		
						</TR>
						<%
						counter_++;
					} while (masterViewDBBean.IEnext());
					%>
					<INPUT type="hidden" name="RECORDCOUNT" value="<%=counter_%>">
		<TR>
</TR>
			<%
			}
			%>
<TR>

</TR>			
				</TBODY>
			</TABLE>			
		<%	
		}
		%>

<TR>



</TR>			


</FORM>

<DIV align="center"> 
<TABLA>
<TR>
  <hr>
  <p class="texto"><A href="main/opciones.jsp">Regresar al menú principal</A></p>
  <hr>
  <font color="#FF0000" size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong><font size="5">ASIC</font></strong></font><font size="2"><strong><font face="Verdana, Arial, Helvetica, sans-serif"> 
  <br>
  <font size="1">La Alternativa Inteligente</font></font></strong></font>
</TR>  
<TABLA>  
</DIV>


</body>
</HTML>