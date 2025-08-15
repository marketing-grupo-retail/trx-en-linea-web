<%-- VisaWeb:  $Id: login.jsp,v 1.1 2019/12/18 17:30:56 Alfonso Exp $ --%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@taglib uri="/WEB-INF/asic.tld" prefix="asic"%>
<link href="../theme/estilos.css" rel="stylesheet" type="text/css">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<SCRIPT LANGUAGE="JavaScript" TYPE="text/javascript">
<!--
function submitForm(nav){
//   document.forms[0].elements["action"].value = nav
   document.forms[0].submit();
}
//-->
</SCRIPT>
<html:form method="post" action="/welcome/login.do" focus="login" onsubmit="submitForm('login');">
<table width="100%" border="0" cellpadding="0" cellspacing="0" height="100%">
  <tr> 
    <td rowspan="2" valign="top" width="236"> 
    </td>
    <td valign="top" width="702"></td>
  </tr>
  <tr> 
    <td valign="top" width="702">
    <table width="100%" border="0" align="right" cellpadding="0" cellspacing="0">
        <tr valign="top"> 
          <td width="586"><table width="100%" border="0" align="right" cellpadding="0" cellspacing="0">
              <tr valign="top"> 
                <td width="586">
                
                <asic:table titulo="logon.title" tipoTitulo="key" >    
                </asic:table>
							
							<p><!-- Chequea si existe pagina siguiente 2 --> <%
                  String next_ = request.getParameter("next");
                  String modulo_ = request.getParameter("modulo");
                  if(next_ != null){
                  %> <html:hidden property="next" value="<%=next_%>" />
							<html:hidden property="modulo" value="<%=modulo_%>" /> <%}%> <%
                  String codComp_ = request.getParameter("codComp");
                  if(codComp_ != null){
                  %> <html:hidden property="codComp"
								value="<%=codComp_%>" /> <%}%> <!-- Chequea si la sesion fue invalidada -->
							<logic:equal name="invalid_session" value="true" scope="request">
								<center><span class="WarningMessage"> <logic:equal
									name="other_login" value="true" scope="request">
									<bean:message key="logon.invalid_session_other_login" />
								</logic:equal> <logic:notEqual name="other_login" value="true"
									scope="request">
									<bean:message key="logon.invalid_session" />
								</logic:notEqual> </span>
								<center>
							</logic:equal> <logic:equal name="other_user" value="true"
								scope="request">
								<span class="WarningMessage"> <bean:message
									key="logon.invalid_session_other_user" /> </span>
								<center>
							</logic:equal> <logic:equal name="invalid_access" value="true"
								scope="request">
								<center><span class="WarningMessage"> <bean:message
									key="logon.invalid_access" /> </span></center>
							</logic:equal></p>
							<p align="center"><span class="a"><bean:message
								key="logon.subtitle" /></span></p>
							<asic:table titulo="Registro" tipo="2" >
								
										<tr>
											<td width="32%" class="a">&nbsp;</td>
											<td width="68%">&nbsp;</td>
										</tr>
										<tr>
											<td valign="top" class="a">
											<div align="right">Login:</div>
											</td>
											<td><% String val_ = ""; 
                              	// Si viene por login normal
                              	if(request.getParameter("login")!=null){
                              		val_ = request.getParameter("login");
                              	// Si viene por newUser 
                              	}else if(request.getAttribute("login")!=null){
                              		val_ = (String)request.getAttribute("login");
                              	}
                              %> <html:text property="login" size="17"
												maxlength="15" styleClass="Campos" value="<%=val_%>" /> <html:errors
												property="login" /> <html:errors property="perfil" /> <!-- INPUT name="login" type="text" class="Campos" id="Text13" style="WIDTH: 260px; HEIGHT: 22px" size="38" value="" -->
											<br>
											</td>
										</tr>
										<tr>
											<td valign="top" class="a">
											<div align="right">Contraseña:</div>
											</td>
											<td><html:password property="password" size="17"
												maxlength="15" styleClass="Campos" /> <html:errors
												property="password" /> <!-- INPUT name="password" type="password" class="Campos" id="Text122" style="WIDTH: 260px; HEIGHT: 22px" size="38" -->
											<br>
											</td>
										</tr>
										<tr>
											<td valign="top" class="a">
											<td class="a"></td><td></td></tr>
									<tr>
											<td valign="top" align="center" colspan="3">
												<INPUT type="submit" value="Enviar" class="botones" />
											</td>
										</tr>
								
							</asic:table>

							
							</td>
              </tr>
            </table> </td>
        </tr>
      </table></td>
  </tr>
</table>
</html:form>