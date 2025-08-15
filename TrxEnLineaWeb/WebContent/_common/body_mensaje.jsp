<%-- VisaWeb:  $Id: body_mensaje.jsp,v 1.1 2019/12/18 17:30:55 Alfonso Exp $ --%>
<%@taglib uri="/WEB-INF/asic.tld" prefix="asic"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@page import="org.ramm.jwaf.controller.flow.Message"%>


<link rel="stylesheet" type="text/css" href="../css/style.css">

 <TABLE border=0 cellPadding=0 cellSpacing=0 width=100%>
<!--  <tr>
    <td valign="middle">
	    	<logic:notEmpty name="mensaje" scope="request"> 
             <asic:table width="600" titulo="" >
                  <jsp:useBean id="mensaje" class="org.ramm.jwaf.controller.flow.Message" scope="request">
                   	</jsp:useBean> 
					<tr class="estiloAlterno">
						<TD align="center"><jsp:getProperty name="mensaje" property="title"/></TD>
					</TR> 
					<tr class="mensaje">
						<TD><jsp:getProperty name="mensaje" property="description" /></TD>
					</TR> 
					
					<%--
					<% if ( mensaje!=null && mensaje.isErrorMessage() && mensaje.getDescription() != null ){ %>
					<tr class="mensaje">						
						<TD>Excepción:  <%=mensaje.getDescription()%></TD>
						<%--<TD>Excepción:<%=mensaje.getSourceException().getMessage()%></TD>
					</TR>
					<%}%>
					--%>
					
					
	         </asic:table>
         </logic:notEmpty> 
	</td>
  </tr>-->
  		<logic:present name="mensaje" scope="request">
				<tr>
					<td align="left" valign="middle" colspan="2" class="EnlacesMenuSubSmall">
					<bean:define id="mnsj" name="mensaje" scope="request" type="Message" />
					<logic:equal name="mnsj" property="title" value="Error">
						<img border="0" height="15" width="15"
							src="<%=request.getContextPath()%>/images/error.gif">
						<font color="#990000"><bean:write name="mnsj"
							property="description" /></font>
					</logic:equal>
					 <logic:equal name="mnsj" property="title" value="Mensaje">
						<img border="0" height="15" width="15"
							src="<%=request.getContextPath()%>/images/ok.gif">
						<font color="#990000"><bean:write name="mnsj"
							property="description" /></font>
					</logic:equal></td>
				</tr>
			</logic:present>
			<!--html:errors></html:errors-->
</table>