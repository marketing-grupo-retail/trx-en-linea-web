<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<META http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<META name="GENERATOR" content="IBM WebSphere Studio">
<TITLE>Redireccionando</TITLE>
<SCRIPT>
<!--
function startApp(){
	var theURL='<%=request.getParameter("next")%>';
	var wname ="ACGADMIN";
	var intleft=(screen.width-800)/2
	var inttop=(screen.height-600)/2
	var width=screen.width-10
	var height=screen.height
	if (height==768)
		height=height-75
	else 
		height=height-75
	inttop=0
	intleft=0
	window.open(theURL, wname,'status=yes,z-lock=yes,menubar=no,resizable=no,hotkeys=no,scrollbars=yes,resizable=yes,left=' + intleft + ',top=' + inttop + ', location=no,width=' + width  + ',height='+ height);
	//window.close();
	}
	-->
</SCRIPT>
</HEAD>
<BODY onload ="startApp();">

Si no se abre una ventana nueva con la aplicación, oprima <a href="javascript:startApp()">aquí</a>
<br/>
<A href="welcome.jsp">Cerrar</A>
</BODY>
</HTML>
