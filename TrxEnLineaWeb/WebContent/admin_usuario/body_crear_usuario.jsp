<%-- ASIC Admin Usuarios:  $Id: body_crear_usuario.jsp,v 1.1 2019/12/18 17:31:06 Alfonso Exp $ --%>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@taglib uri="/WEB-INF/asic.tld" prefix="asic"%>

<%@page import="com.asic.transacciones.forms.UserForm"%>

<script type="text/javascript" language="JavaScript1.2" src="../js/utils.js"></script>

<script language="JavaScript1.2">

<!--

function validarCampos(){
	return esCorreoValido(document.forms[0].mail);	
}

//-->
</script>
<html>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<html:form method="post" action="/admin_usuario/crear_usuario.do">
  <table border="0" cellspacing="0" cellpadding="0" align="center">
    <tr>
      <td width="645"><BR><BR>
      
		<asic:table titulo="Crear Usuario" width="100%">
			<TBODY>

				<TR> 
					<TD vAlign=top width="40%">
						<P class=a align="left"><SPAN class=a><BR>
					<BR>
					<BR>* Login : </SPAN>
					</TD>
					<td width="60%" class=a><BR><BR><html:text property="login" maxlength="15" size="20" styleClass="Campos"/>
						<br/><html:errors property="login" /></TD>
				</TR>
				<TR>
					<TD vAlign=top width="40%">
						<P class=a align="left"><SPAN class=a><BR><BR>* Password : </SPAN>
					</TD>
					<td width="60%" class=a><BR><html:password property="password" maxlength="15" size="20" styleClass="Campos"/>
						<br/><html:errors property="password" />
					</TD>
				</TR>
				<TR>
					<TD class=a vAlign=top width="40%">
						<P class=a align="left"><SPAN class=a><BR><BR>* Nombre : </SPAN>
					</TD>
					<td width="60%" class=a><BR><html:text property="nombre" maxlength="35" size="20" styleClass="Campos"/>
						<br/><html:errors property="nombre" /></TD>
				</TR>
				<TR>
					<TD class=a vAlign=top width="40%">
						<P class=a align="left"><SPAN class=a><BR><BR>* Apellido : </SPAN>
					</TD>
					<td width="60%" class=a><BR><html:text property="apellido" maxlength="35" size="20" styleClass="Campos"/>
						<br/><html:errors property="apellido" />
					</TD>
				</TR>
				<TR>
					<TD class=a vAlign=top width="40%">
						<P class=a align="left"><SPAN class=a><BR><BR>E-mail : </SPAN>
					</TD>
					<td width="60%" class=a><BR>
					<html:text property="mail" maxlength="80" size="80" styleClass="Campos"  onchange="return esCorreoValido( this )"/>
						<br/><html:errors property="mail" />
					</TD>
				</TR>
				<tr>
				<TD colspan="2" class="a"><BR>
					
					<BR><b>Los campos marcados con asterisco (*) son requeridos</b></TD>
				</tr>
				<tr>
					<TD align="center" colspan="2"><BR>					
					<BR><input name="crear" type="submit" 
						value="Crear"  onclick="validarCampos()"></TD>
				</tr>

			</TBODY>
		</asic:table>
		</td>
    </tr>
  </table>
</html:form>
<html:javascript formName="userForm"/>
</html>