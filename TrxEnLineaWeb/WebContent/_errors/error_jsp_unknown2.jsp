<%-- VisaWeb:  $Id: error_jsp_unknown2.jsp,v 1.1 2019/12/18 17:31:04 Alfonso Exp $ --%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page import="org.ramm.jwaf.view.templates.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page isErrorPage="true"%>
<html>
<Head>
<Title>Error Interno en JSP</Title>

<link rel="stylesheet" type="text/css" href="../theme/estilos.css">


<META name="GENERATOR" content="IBM WebSphere Studio">
</head>
<body bgcolor="#FFFFFF">
<h1><b><font face="Verdana, Arial, Helvetica, sans-serif" size="5">Error Interno en JSP</font></b></h1>
<h3 class="normal"> Ha ocurrido un error interno en el servicio solicitado. </h3>
<br>
<br>
<blockquote>
  <p><strong>La excepci&oacute;n causante del error ha sido:</strong></p>
  <p><% exception.printStackTrace(new java.io.PrintWriter(out)); %></p>
</blockquote>
</body>
</html>