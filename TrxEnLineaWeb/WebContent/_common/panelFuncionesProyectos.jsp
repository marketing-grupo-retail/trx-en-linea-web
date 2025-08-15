<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<script language="JavaScript1.2">
function cargarPaginaCreacionProyectos(){
	document.forms[0].action="../cargarCreacionProyectos.do";
	document.forms[0].submit();
}
</script>
<html:form method="get" enctype="text/plain" action="/buscarEmpresas">
<TABLE border="0" cellspacing="1">
	<TBODY>
		<TR>
			<TD><a href="../admin_proyectos/listar_proyectos.jsp" ><IMG border="0" src="../images/listarProyectos.jpg" width="130" height="32"></a></TD>
			<!--<TD><a href="javascript:cargarPaginaCreacionProyectos()" ><IMG border="0" src="../images/crearProyectos.jpg" width="130" height="32"></a></TD>-->
			<TD><a href="../admin_proyectos/crear_proyectos.jsp" ><IMG border="0" src="../images/crearProyectos.jpg" width="130" height="32"></a></TD>
			<TD><a href="../admin_proyectos/asociar_perfil.jsp" ><IMG border="0" src="../images/asociarPerfilProyecto.jpg" width="130" height="32"></a></TD>
			<TD><IMG border="0" src="../images/asociarBDProyecto.jpg" width="130"
				height="32"></TD>
		</TR>
	</TBODY>
</TABLE>
</html:form>
