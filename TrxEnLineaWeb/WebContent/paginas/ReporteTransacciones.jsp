<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><HTML>
<head>


<META http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<%
%><TITLE>CONSULTA TRANSACCIONES EN POS</TITLE>
<META name="GENERATOR" content="IBM WebSphere Studio">

<!--Styles-->
<STYLE TYPE="text/css">
<!--H1
{
text-align: center;
}-->
</STYLE>

<!--Style Sheet-->
<LINK href="../theme/Master.css" rel="stylesheet" type="text/css">
<!--<link href="../theme/comfandi.css" rel="stylesheet" type="text/css">-->
</head> 
<body  bgcolor="#EEDFA6" link="#996600" vlink="#666600" alink="#999999">

<%@ page import="com.asic.demo.ReporteTransaccionesMasterViewBean" %>
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
	//alert(tienda+"otr3");
	//alert(terminal);
	//alert(trxnum);	
	myForm2.elements["TIENDA"].value = tienda;
	myForm2.elements["TERMINAL"].value = terminal;	
	myForm2.elements["TRX"].value = trxnum;		
	myForm2.submit();	
	//alert("redirect");
	//navigate("../paginas/DetalleTransaccion.jsp&tienda="+tienda);

}
//-->
</SCRIPT>
  <!--Navigation-->
  <div align="center"> </div>
<FORM name="myForm2" action="../paginas/DetalleTransaccion.jsp" method="POST">
	<INPUT type="hidden" name="TIENDA">
	<INPUT type="hidden" name="TERMINAL">
	<INPUT type="hidden" name="TRX">		
</FORM>  
<FORM name="myForm" action="../test/QueryStatusMonitorController" method="POST">

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
	
 

  <H1 class="titulos"><font color="#004080">Consulta Transacciones</font></H1>
	
	
  <p class="titulosPeq"><BR>
    <BR>
    <!--Filter Table-->
    Especificación de filtros 
    <%
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
  <TABLE align="center" border="1" cellpadding="1" cellspacing="1" bordercolor="#2065ac">
    <TBODY>
			<TR>
				
        <TD class="texto" rowspan="2">Almacén: </TD>
        <TD width="82" rowspan="2"><INPUT type="text" name="FILTERALMACEN"
				value="<%=filterAlmacen_%>" size="12"></TD>
				
        <TD class="texto" width="60" rowspan="2">Terminal: </TD>
        <TD width="83" rowspan="2"><INPUT
				type="text" name="FILTERNUMBONO" value="<%=filterNumBono_%>" size="11"></TD>
			<TD width="81" rowspan="2">Transacción:</TD>
			<TD width="62" rowspan="2"><INPUT type="text" name="FILTERTRX"
				value="<%=filterNumBono_%>" size="11"></TD>

			<TD class="texto" rowspan="2">Fecha:</TD>
			<TD class="texto" rowspan="2">
			<TABLE align="center" border="1" cellpadding="1" cellspacing="1" bordercolor="#2065ac">
				<TBODY>
					<TR>
						<TD align="center"> 
							<A href="#"	onclick="Javascript:getFecha('FILTERFROM','anchor1');" NAME="anchor1" ID="anchor1">Desde</A>
						</TD>

						<TD align="center"> 
							<A href="#"	onclick="Javascript:getFecha('FILTERTO','anchor2');" name="anchor2" id="anchor2">Hasta</A>
						</TD>
					</TR>
					<TR>
						<TD><INPUT type="text" name="FILTERFROM" readonly="readonly" value="<%=filterFrom_%>"></TD>
						<TD><INPUT type="text" name="FILTERTO" 	 readonly="readonly" value="<%=filterTo_%>"></TD>
					</TR>
				</TBODY>
			</TABLE>
			</TD>
				<TD><INPUT type="button" name="queryButton" value="Ejecutar consulta" onclick="Javascript:executeQuery()"></TD>
				<TD rowspan="2"></TD>
			</TR>
		<TR>
			<TD><INPUT type="button" name="clearButton" value="Borrar filtros"
				onclick="Javascript:clearFilters()"></TD>
		</TR>

	</TBODY>
	</TABLE>
	<BR><BR>	

	<%
		System.out.println("Parámetro newInput:"+request.getParameter("new_input"));	
		String newInput_ = request.getParameter("new_input") == null || !request.getParameter("new_input").trim().toLowerCase().equals("true") ? 
			"false" : "true";	

		if (actionToDo_.equals("CONSULTA")) {
			masterViewDBBean.setFilterNumBono(filterNumBono_);
			masterViewDBBean.setFilterAlmacen(filterAlmacen_);
			masterViewDBBean.setFilterFrom(filterFrom_);				
			masterViewDBBean.setFilterTo(filterTo_);		
			System.out.println("newInput=false");
			masterViewDBBean.execute(limInf_,limSup_);	
	
	%>
		
			 
	<%
			int counter_ = 0;		
			if (masterViewDBBean.first()) {
	%>
			<!--Table-->
			
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
	    	    <TH class="titulosPeq"><FONT color="#004080">Detalle</font></TH>	    	    	    	    
    	    
			</font>
		</TR>
					<%
					// Datos
					do {
						%>
						<TR>
							<TD align="center">
								<%=masterViewDBBean.getTienda()%>
							</TD>																				
							<TD>
								<%=masterViewDBBean.getTerminal()%>
								<INPUT type="hidden" name="CARD" value="<%=masterViewDBBean.getTerminal()%>"> 
							</TD>
							<TD>
								<%=masterViewDBBean.getTransNum()%>
							</TD>													
							<TD>
								<%=masterViewDBBean.getOperador()%>
							</TD>																											
							<TD  align="right">
								<%=masterViewDBBean.getGrossPositivo()%>
							</TD>
							<TD align="right">
								<%=masterViewDBBean.getGrossNegativo()%>
							</TD>							
							<TD>
								<%=masterViewDBBean.getFecha_hora_tran()%>
							</TD>
							<TD align="center">
								<INPUT type="button" name="queryButton" value="..." onclick="Javascript:buscar_detalle('<%=masterViewDBBean.getTienda()%>','<%=masterViewDBBean.getTerminal()%>',<%=masterViewDBBean.getTransNum()%>)">
							</TD>							
						</TR>
						<%
						counter_++;
					} while (masterViewDBBean.next());
					%>
					<INPUT type="hidden" name="RECORDCOUNT" value="<%=counter_%>">
		<TR>
</TR>
			<%
			}
			%>
<TR>
			<%if(!limInf_.equals("1")){ %>       	
	        <TD><INPUT type="button" name="queryButtonAtras" value="<< Atrás" onclick="Javascript:atras()"></TD>        	
			<%}
			if (((new Integer(limInf_).intValue())+(new Integer(masterViewDBBean.getBundle().getString("REGISTERS_NUMBER_TO_SHOW")).intValue()))< (masterViewDBBean.getNumeroRegistros()+1)){
			%>
	        <TD><INPUT type="button" name="queryButtonAdelante" value="Adelante >>" onclick="Javascript:adelante()"></TD>        
			
			<%}
			%>
			<TD>Registros del: <%if (masterViewDBBean.getNumeroRegistros()>0){%> <%=limInf_%><%}else{%> 0 <%}%> al: <%if (new Integer(limSup_).intValue()< masterViewDBBean.getNumeroRegistros())%><%=limSup_%><%else%><%=masterViewDBBean.getNumeroRegistros()%> de: <%=masterViewDBBean.getNumeroRegistros()%></TD>
</TR>			
				</TBODY>
			</TABLE>			
		<%	
		}
		%>

</FORM>

<DIV align="center"> 
<TABLA>
<TR>
  <hr>
  <p class="texto"><A href="../main/opciones.jsp">Regresar al menú principal</A></p>
  <hr>
  <font color="#FF0000" size="2" face="Verdana, Arial, Helvetica, sans-serif"><strong><font size="5">ASIC</font></strong></font><font size="2"><strong><font face="Verdana, Arial, Helvetica, sans-serif"> 
  <br>
  <font size="1">La Alternativa Inteligente</font></font></strong></font>
</TR>  
<TABLA>  
</DIV>


</body>
</HTML>