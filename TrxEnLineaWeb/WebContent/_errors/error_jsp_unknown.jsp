<%-- VisaWeb:  $Id: error_jsp_unknown.jsp,v 1.1 2019/12/18 17:31:04 Alfonso Exp $ --%>

<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page isErrorPage="true"%>
<html>
<Head>
<Title>Error Interno en JSP</Title>

<link rel="stylesheet" type="text/css" href="../theme/estilos.css">


</head>
<body bgcolor="#FFFFFF">
<h1><b><font face="Verdana, Arial, Helvetica, sans-serif" size="5">Error Interno en JSP</font></b></h1>
<h3 class="normal"> Ha ocurrido un error interno en el servicio solicitado. </h3>
<br>
<br>
<span class="normal">Excepcion:<%=exception.getMessage()%> 
<%
    StringWriter swriter_ = new StringWriter();
	PrintWriter pwriter_ = new PrintWriter(swriter_);
    exception.printStackTrace(pwriter_);
    String stack_ = swriter_.getBuffer().toString();
    //iterar para convertir la cadena a html y eliminar los saltos de
    //linea
    StringBuffer fullStack_ = new StringBuffer("");
    for(int i=0; i< stack_.length();i++){
    	if(stack_.charAt(i) == '\n') continue;
    	if((stack_.charAt(i) == '\n')||(stack_.charAt(i) == '\r'))
    		fullStack_.append("<br>");
    	else
    		fullStack_.append(stack_.charAt(i));
    }
    stack_ = fullStack_.toString();
    
	Exception sourceExc_ = (Exception) exception;
	Vector rootCauseVector_ = new Vector();
	Vector stackCauseVector_ = new Vector();
    String rootCause_ = "";
    String stackCause_ = "";

//	do{    
	//    System.out.println("Printing rootCause");
	    if(sourceExc_ instanceof javax.servlet.jsp.JspException){
	    	javax.servlet.jsp.JspException jex_ = (javax.servlet.jsp.JspException) sourceExc_;
//	    	Throwable ex_ = jex_.getRootCause();
	    	Throwable ex_ = jex_;
	    	rootCause_ = ex_.getMessage();
	    	
			StringWriter swriter2_ = new StringWriter();
			PrintWriter pwriter2_ = new PrintWriter(swriter2_);
		    ex_.printStackTrace(pwriter2_);
		    stackCause_ = swriter2_.getBuffer().toString();
		    //iterar para convertir la cadena a html y eliminar los saltos de
		    //linea
		    StringBuffer fullStack2_ = new StringBuffer("");
		    for(int i=0; i< stackCause_.length();i++){
		    	if(stackCause_.charAt(i) == '\n') continue;
		    	if((stackCause_.charAt(i) == '\n')||(stackCause_.charAt(i) == '\r'))
		    		fullStack2_.append("<br>");
		    	else
		    		fullStack2_.append(stackCause_.charAt(i));
		    }
		    stackCause_ = fullStack2_.toString();    	
		    
		    rootCauseVector_.add(rootCause_);
		    stackCauseVector_.add(stackCause_);		    
	    	sourceExc_ = (Exception) ex_;
	    	
	    }
//	}while(sourceExc_ instanceof javax.servlet.jsp.JspException);
    
%>
</span>
<form>
  <input type="button" value="Ver detalles" onClick="showDetails()">
</form>
<script language="JavaScript">
<!--
function showDetails(){
	var winopen;
	winopen = open("","jsp_details","height=550, width=550, resizable=yes,toolbar=no,scrollbars=yes")
	with(winopen.document){
		open('text/html')
		write("<html ><head><Title>Error Interno en JSP</Title></head>");
		write("<body bgcolor='#FFFFFF'>");
		write("<h1><b><font face='Verdana, Arial, Helvetica, sans-serif' size='5'>Detalles:</font></b></h1>");
		write("<br><b>Excepción:</b><br>");
		write("<code><%=exception.getMessage()%></code>");
		write("<br><b>Stack:</b><br>");
		write("<code><%=stack_%></code>");
<%		for(int i=0; i< rootCauseVector_.size(); i++){
%>
		write("<br><b>Root Cause:</b><br>");
		write("<code><%=rootCauseVector_.elementAt(i) %></code>");
		write("<br><b>Stack:</b><br>");
		write("<code><%=stackCauseVector_.elementAt(i) %></code>");
<%		
		}
%>		
		write("</body></html>");
		close();
	}	
}		
-->
</script>
</body>
</html>