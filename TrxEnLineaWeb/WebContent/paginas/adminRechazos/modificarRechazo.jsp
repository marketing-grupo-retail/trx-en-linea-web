
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/trxonline.tld" prefix="trx" %>
<html:html>
<HEAD>
<%@ page 
language="java"
contentType="text/html; charset=ISO-8859-1"
%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">
<LINK href="/TrxManagerWeb/css/style.css" rel="stylesheet"
	type="text/css">
<TITLE>Modificar Tramas Rechazadas</TITLE>
<script language="JavaScript" src="/TrxManagerWeb/js/utils.js"></script> 
<script type="text/javascript" language="JavaScript1.2">
var indexEditSelected = -1; 

function volver(){
	changeySumbmitForm(initModRechazosForm,'<%=request.getContextPath()%>/listar_rechazos.do');
}

function enviar(){
	var marco_ = getIFrameDocument("iframestring");
	var form_ = marco_.getElementById("stringForm");
	form_.accion.value=document.getElementById("accion").value;
	
	cargarString();
	
}


function cargarString(){
	
	var marco_ = getIFrameDocument("iframestring");
	var form_ = marco_.getElementById("stringForm");
	form_.seccion.value=document.getElementById("seccion").value;
	form_.comentario.value=document.getElementById("comentario").value;
	form_.submit();
}	

function getIFrameDocument(aID){
	var rv = null;

	// if contentDocument exists, W3C compliant (Mozilla)
	if (document.getElementById(aID).contentDocument){
		rv = document.getElementById(aID).contentDocument;
	} else {
	// IE
		//alert("IE");
		rv = document.frames["iframestring"].document;
	}

	return rv;
}


	
</script>
</HEAD>

<BODY>
<trx:conversor parametro='strings'></trx:conversor>
<html:form method="post" action="/load_modificar_string" styleId="initModRechazosForm" >
<INPUT type="hidden" id="accion" value="ACCION_ENVIAR" >
	<table border="0" cellpadding="0" cellspacing="3" width="100%"
		align="center">
		<tr align="center">
			<TD height="30" class="BgBlue"><span class="TituloBlancoGrande">Modificar
			Tramas Rechazadas </span></TD>
		</tr>
		<TR class="BgGrisOscuro">
			<td class="EnlacesMenuBlueSUB">
			<p><strong>Secciones:</strong></p>
			</td>
		</TR>
		<TR>
			<TD>
			<p><html:select property="seccion" size="1" styleId="seccion"
				onchange="cargarString()">
				<option value="" selected="selected" >- Seleccione -</option>
				<bean:define id="valores" name="strings" scope="application"
					type="java.util.ArrayList" />
				<html:options collection="valores" property="value"
					labelProperty="label" />
			</html:select></p>
			</TD>
		</TR>
		<TR class="BgGrisOscuro">
			<td class="EnlacesMenuBlueSUB">
			<p><strong>Comentarios:</strong></p>
			</td>
		</TR>
		<TR>
			<TD align="left"><bean:define id="rechazovo" name="rechazo"
				scope="session" type="com.asic.transacciones.vo.TX_RECHAZO" /> <html:textarea
				property="comentario" styleId="comentario" cols="100" rows="5"
				value="<%=rechazovo.getCOMENTARIO()%>">
			</html:textarea> <input type="button" name="envio" value="Enviar" onclick="return enviar();"></TD>
		</TR>
		<TR>
			<TD><br><IFRAME name="iframestring" id="iframestring"
				src="<%=request.getContextPath()%>/paginas/adminRechazos/blankRechazo.jsp"
				scrolling="auto" width="100%" height="300" frameborder="0" class="Iframe"></IFRAME>
			</TD>
		</TR>
		<TR>
		<TD><IMG src="<%=request.getContextPath()%>/images/back_blue.gif" onclick="return volver();" style="cursor:hand;" />
		</TD>
		</TR>
		</table>
</html:form>
</BODY>
</html:html>
