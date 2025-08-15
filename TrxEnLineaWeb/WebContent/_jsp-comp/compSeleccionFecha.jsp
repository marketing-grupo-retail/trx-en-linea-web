<%-- VisaWeb:  $Id: compSeleccionFecha.jsp,v 1.1 2019/12/18 17:30:58 Alfonso Exp $ --%>

<!-- INICIO: COMPONENTE PARA SELECCION DE RANGO
pre:
	obj seleccionRango_theForm
	obj	seleccionRango_theFdefaultDateFormatorm.fechaInicialTxt
	obj	seleccionRango_theForm.fechaFinalTxt
	lib js/common.js	
pos:
	seleccionRango_theForm.fechaInicial
	seleccionRango_theForm.fechaFinal
 -->
<%@ page import="org.ramm.jwaf.util.StringFormater" %> 
<link rel="stylesheet" href="../theme/estilos.css" type="text/css">
<script language="JavaScript">
// variable a actualizar con el objeto form definido
// por defecto es myForm
var  seleccionRango_theForm = document.myForm;
var  indiceForm = 0;
</script>   

<!-- script language="JavaScript" src="js/common.js"></script --> 
<script language="JavaScript" src="../js/popcalendar.js"></script> 
<!--script language="JavaScript" src="../js/date.js"></script -->
<script language="JavaScript" src="../js/compSeleccionFecha.js"></script>
<!-- Fecha a enviar en el formulario -->
<INPUT type="hidden" name="fecha" value="-1">

<INPUT type="text" name="fechaInicialTxt"
	value="<%=StringFormater.valideNull(request.getParameter("fechaInicialTxt"))%>"
	size="20" readonly>
<INPUT type="image"
	src="../images/show-calendar.gif" name="fechaInicialBtn"
	onclick="popUpCalendar(this, document.forms[0].fechaInicialTxt, defaultDateFormat, compSeleccionFecha_update); return false;"
	alt="Fecha">
<!-- FIN: COMPONENTE PARA SELECCION DE RANGO -->