
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ page 
language="java"
contentType="text/html; charset=ISO-8859-1"  
%>
<html:html locale="true">
	<head>
	<html:base />
	<title><tiles:getAsString name="title"/></title>
	</head>
	<body>
	<tiles:insert attribute="header"/>
	<tiles:insert attribute="headerMensaje"/></tiles:insert>	
	<table cellspacing="1" border="0" width="780" height="440" align='center'>
	<tbody>
		<tr>
		<td>			
		</td>
		</tr>			
		<tr valign="top">
			<td align="center" height="15"><tiles:insert attribute="panel" /><BR>
			</td>
		</tr>	
		<tr valign="top">
			<td align="center"><BR>
			<tiles:insert attribute="body" /></td>
		</tr>
	</tbody>
	</table>
	<tiles:insert attribute="footer"></tiles:insert>
</body>
</html:html>