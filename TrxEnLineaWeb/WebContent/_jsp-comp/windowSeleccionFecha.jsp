<%-- VisaWeb:  $Id: windowSeleccionFecha.jsp,v 1.1 2019/12/18 17:30:58 Alfonso Exp $ --%>

<%@ page import="org.ramm.jwaf.util.StringFormater" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<%@ page 
language="java"
contentType="text/html; charset=ISO-8859-1"
%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<TITLE>windowSeleccionFecha.jsp</TITLE>
<link rel="stylesheet" type="text/css" href="../theme/estilos.css">
<script type="text/javascript" language="JavaScript1.2" src="../js/utils.js"></script>
<script language="JavaScript" src="../js/compSeleccionFechaMultiple.js"></script>
<script language="JavaScript" src="../js/popcalendar.js"></script> 
<script language="JavaScript" src="../js/datePop.js"></script>
<SCRIPT language="JavaScript">
function initComponents(){
	//alert("init4");
//	setTimeout("showPopUp()",1000);
	showPopUp();
} 

function showPopUp(){
	//alert("showPopUp:"+ document.images['fechaInicialBtn']);
	
	popUpCalendar(document.images['fechaInicialBtn'], myForm.fechaInicialTxt, 
		defaultDateFormat, compSeleccionFecha_update);
}

function enviarDatos(){
	alert(myForm.fechaInicialTxt.value);
	opener.document.selectFechaForm.selectFechaTxt.value = 
		myForm.fechaInicialTxt.value;
	
	// close window
}
</SCRIPT>

<script language="javascript"><!--
// controla el chequeo de foco en la ventana
var skipcycle = false

function fcsOnMe(){
	if (!skipcycle){
		window.focus(); 
	}
	mytimer = setTimeout('fcsOnMe()', 500);
}
//-->
</script>
</HEAD>
<BODY onload="initComponents(); mytimer = setTimeout('fcsOnMe()', 500);">
<FORM name="myForm">
<TABLE border="0">
	<TBODY>
		<TR>
			<TD><SCRIPT language="JavaScript">
// variable a actualizar con el objeto form definido
// por defecto es myForm
var  seleccionRango_theForm = document.myForm;
</SCRIPT> <!-- script language="JavaScript" src="js/common.js"></script -->
			<!-- Fecha a enviar en el formulario --> 
<INPUT type="hidden" name="fecha" value="-1"> 
<IMG src="../images/show-calendar.gif"
	name="fechaInicialBtn" onclick="showPopUp();return false;"
	alt="Fecha"> 
	<INPUT type="text" name="fechaInicialTxt"
	value='<%=StringFormater.valideNull(request.getParameter("fechaInicialTxt"))%>'
	size="20" readonly onfocus="skipcycle=true" onblur="skipcycle=false"> 
			</TD>
		</TR>
		<TR>
			<TD align="center"><BR>
			<INPUT type="submit" name="submitName" value="Enviar" 
			onclick="enviarDatos();return false;" 
			onfocus="skipcycle=true" onblur="skipcycle=false">
			 &nbsp;&nbsp;&nbsp;&nbsp;<INPUT
				type="reset" value="Limpiar" 
				onfocus="skipcycle=true" onblur="skipcycle=false"></TD>
		</TR>
	</TBODY>
</TABLE>
</FORM>
</BODY>
</HTML>
