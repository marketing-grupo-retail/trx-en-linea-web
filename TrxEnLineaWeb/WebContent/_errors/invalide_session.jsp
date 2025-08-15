<%-- VisaWeb:  $Id: invalide_session.jsp,v 1.1 2019/12/18 17:31:04 Alfonso Exp $ --%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page import="org.ramm.jwaf.controller.flow.Message" %>
<jsp:useBean id="message" scope="request" class="org.ramm.jwaf.controller.flow.Message"/>
<html>
<Head>
<Title>Error de Sesion</Title>
</head>
<body bgcolor="#FFFFFF">
<h1>Sesion invalida<b><font face="Verdana, Arial, Helvetica, sans-serif" size="5"> 
  - <jsp:getProperty name="message" property="title" /></font></b> </h1>
<span class="normal"><br>
<A href="../index.htm">Volver a ingresar al sistema </A><BR>
</body>
</html>