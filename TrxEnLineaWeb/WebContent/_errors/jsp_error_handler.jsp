<%-- VisaWeb:  $Id: jsp_error_handler.jsp,v 1.1 2019/12/18 17:31:04 Alfonso Exp $ --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<%@ page import="org.ramm.jwaf.logger.LogWriter"
language="java"
contentType="text/html; charset=ISO-8859-1"
isErrorPage="true"
%>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<META http-equiv="Content-Style-Type" content="text/css">

<link rel="stylesheet" type="text/css" href="../theme/estilos.css">

<TITLE>error_handler.jsp</TITLE>
</HEAD>
<BODY>
<P>Error:</P>
<%=(exception==null)?"NULL":exception.getMessage()%>
<%
LogWriter.getLog().log(LogWriter.WARNING, "error_handler", exception);
%>
</BODY>
</HTML>
