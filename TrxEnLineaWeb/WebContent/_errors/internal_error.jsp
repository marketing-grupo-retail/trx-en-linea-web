<%-- VisaWeb:  $Id: internal_error.jsp,v 1.1 2019/12/18 17:31:04 Alfonso Exp $ --%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/asic.tld" prefix="asic"%>
<%@ page import="org.ramm.jwaf.controller.flow.Message" %>
<jsp:useBean id="message" scope="request" class="org.ramm.jwaf.controller.flow.Message"/>
<html>
<Head>
<Title>Error Interno</Title>
</head>
<body bgcolor="#FFFFFF">
<h1><b><font face="Verdana, Arial, Helvetica, sans-serif" size="5">
</font></b> </h1>
<asic:table width="116" titulo="Error en Servicio" tipo="3">
	<TBODY>
		<TR>
			<TD colspan="3">
			<DIV align="center">

			<TABLE border="0" cellpadding="1" cellspacing="1">
				<TBODY>
					<TR >
						<TD align="center" width="481" class="estiloAlterno">Ha ocurrido un error inesperado:<BR> &nbsp;
						<BR>
						<!-- jsp:getProperty name="message" property="title" / --><BR>
						<TABLE border="0">
							<TBODY>
								<TR>
									<TD width="179" align="left" class="txttablas">
									<html:errors/>									
									</TD>									
								</TR>
								
<%
//String name_ = pageContext.getServletConfig().getServletName();
//String debugStr_ = pageContext.getServletConfig().getInitParameter("appDebug");
boolean debug_ = true;
//if(session.getAttribute("s_login").equals("ramm")){
//	debug_ = true;
//}
if(message.isErrorMessage() && debug_){ %>
<TR>
<TD>
<form>
  <input type="button" value="Ver detalles" onClick="showDetails()">
</form>
<script language="JavaScript">
<!--
function showDetails(){
	var winopen;
	winopen = open("","jsp_details","height=550, width=550, resizable=yes,toolbar=yes,scrollbars=yes")
	with(winopen.document){
		open('text/html')
		write("<html><head><title>Error Detallado</title></head>");
		write("<body bgcolor='silver'>");
		write("<br>Descripción detallada del error:&nbsp;&nbsp;&nbsp;&nbsp;");
		write("<input type='button' value='Cerrar' onClick='window.close()'><br>");
		write("<br>Error:<jsp:getProperty name="message" property="title" /><br>");
		write("<br>Descripción:<jsp:getProperty name="message" property="description" /><br>");
		write("<br>Print StackTrace:<br>");
		write("<code><jsp:getProperty name="message" property="htmlStack" /></code>");
		write("<br><br><input type='button' value='Cerrar' onClick='window.close()'><br>");
		write("</body></html>");
		close();
	}	
}	
-->
</script>
</TD>
</TR>
<%}%>
							</TBODY>
						</TABLE>
						<BR>
						<A href="../welcome/index.jsp">Ingresar</A><BR>
						<BR>
						</TD>
					</TR>
					<TR bgcolor="#BED3E9" class="txttablas">
						<TD width="481"></TD>
					</TR>
				</TBODY>
			</TABLE>
			</DIV>
			</TD>
		</TR>
	
	</TBODY>
</asic:table>
<span class="normal"><br>
</span>
</html>