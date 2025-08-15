
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="java.util.Hashtable"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Collections"%>


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
<TITLE></TITLE>
</HEAD>

<BODY>

<html:form method="post" action="/init_header_rechazos"
	styleId="stringForm">
	<html:hidden property="seccion" styleId="seccion" />
	<html:hidden property="comentario" styleId="comentario" />
	<html:hidden property="accion" styleId="accion" value=""/>
	
	<jsp:include flush="true" page="../../_common/body_mensaje.jsp"/>  
	<logic:present name="dynamicHashmapForm" property="string">
		<bean:size id="size" name="dynamicHashmapForm" property="string" />
		<logic:equal value="0" name="size">
		<center><font color="red" ><b>No hay string.</b></font></center>
		</logic:equal>
		<logic:greaterThan value="0" name="size">
			<table>
				<logic:present name="parametros_strings" scope="application">
					<%Hashtable hash_ = (Hashtable) application.getAttribute("parametros_strings");
					Hashtable hashCampos_ = (Hashtable) hash_.get("tx_header");
					ArrayList claves_ = new ArrayList();
					claves_.addAll(hashCampos_.keySet());
					Collections.sort(claves_);
					request.setAttribute("list_campos", claves_);%>
					<logic:present name="list_campos" scope="request">

						<logic:iterate id="element" name="list_campos">
							<tr>
								<td class="EnlacesMenuSubSmall"><%=("" + element).toUpperCase()%>
								</td>

								<logic:iterate id="string" name="dynamicHashmapForm"
									property="string" indexId="i"
									type="com.asic.transacciones.vo.TX_HEADER_Imp">
									<td class="EnlacesMenuSubSmall" align="center"><html:text
										name="string" indexed="true"
										property='<%=("" + element).toUpperCase()%>'>
										<bean:write name="string"
											property='<%=("" + element).toUpperCase()%>' />
									</html:text></td>
								</logic:iterate>
							</tr>
						</logic:iterate>

					</logic:present>
				</logic:present>
			</table>
		</logic:greaterThan>
	</logic:present>

</html:form>
</BODY>
</html:html>
