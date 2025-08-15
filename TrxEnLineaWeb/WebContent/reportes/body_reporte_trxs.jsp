<%-- VisaWeb:  $Id: body_reporte_trxs.jsp,v 1.1 2019/12/18 17:31:05 Alfonso Exp $ --%>

<link href="../theme/estilos.css" rel="stylesheet" type="text/css">
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page import="com.asic.transacciones.vo.TPOS_HEADER" %>
<%@ page import="com.grpretail.trxonline.forms.ReporteTrxForm" %>
<%@ page import="java.util.*"%>
<script type="text/javascript" language="JavaScript1.2" src="../js/calendario_YYYYMMDD.js"></script>
<script language="JavaScript" src="../js/utils.js"></script>
<script language="JavaScript1.2">
<!--
backPage="../welcome/select_modulo.do?modulo=a";

function selectBuscar(){
//alert("2")
	if(!errorValidarCampos()){
		document.forms[0].btnBuscar.disabled = true;
		document.forms[0].action = "../reportes/reporte_trxs.do?search=true";	
		document.forms[0].submit();
	}
}


function errorValidarCampos(){
	var error_= false;

	var tienda_ = Trim(document.forms[0].tienda.value);
	var terminal_ = Trim(document.forms[0].terminal.value);
	var numeroTrx_ = Trim(document.forms[0].numeroTrx.value);
	

	if (!isPositiveInteger(tienda_)){	
		alert("La tienda debe ser un número");
		error_= true;
	}
	if (!isPositiveInteger(terminal_)){	
		alert("La terminal debe ser un número");
		error_= true;
	}
	if (!isPositiveInteger(numeroTrx_)){	
		alert("El número de Trx debe ser un número");
		error_= true;
	}
	/* else if(parseInt(puntos_) <= 0){
		alert("Los puntos deben ser > a 0");
		error_ = true;
	}*/
	return error_;
}	
	
function selectPrint(){
    alert ("Desde selectPrint");
	document.forms[0].action = "../bonos/reimpresion_bono.do";	
	document.forms[0].submit();
}
function selectCrear(){
    //alert ("Desde selectCrear");
	document.forms[0].action = "../admin_usuario/crear_usuario.jsp";	
	document.forms[0].submit();
}

function doClick(pIdObject){
	//alert(pIdObject);
	document.forms[0].idObject.value = pIdObject;
}

function selectEditar(){
//alert("2")
	document.forms[0].action = "../clientes/crear_modificar_cliente.do?edit=true";	
	document.forms[0].submit();
}



function selectEliminar(){
	
	document.forms[0].action = "../clientes/eliminar_clientes.do";	
	document.forms[0].submit();
}

function showRedimir(){
	document.forms[0].action = "../bonos/crear_bono.do?show=true";	
	document.forms[0].submit();
}
function validarEliminar(objElimina){
	var flag_ = false;
	if (isNaN(objElimina.length)){
		flag_ = objElimina.checked;
	}else{
		for(var i=0; i<objElimina.length; i++){
			if(objElimina[i].checked){	
				if(confirm ("Está seguro de eliminar el(los) cliente(s)?")){
					flag_ = true;
					break;
				}
			}
		}
	}
	if(flag_ == false){
		alert("Debe seleccionar uno o varios clientes");
	}else{
		selectEliminar();
	}
}

function validarEditar(objEditar){
	//alert("Desde validarEditar")
	//alert(objEditar.value)
	if (objEditar.value=='')
	{
		alert("Debe seleccionar un cliente");
	}else{
		selectEditar();
	}
	//alert("saliendo");
}

function validarPuntos(objPuntos){
	//alert("Desde validarEditar")
	//alert(objEditar.value)
	if (objPuntos.value=='')
	{
		alert("Debe seleccionar un cliente");
	}else{
		selectPuntos();
	}
	//alert("saliendo");
}



function formatCurrency(num)
{
	num = num.toString().replace(/\$|\,/g,'');
	
	if (isNaN(num))
	num = '0';
	
	var signo = (num == (num = Math.abs(num)));
	num = Math.floor(num * 100 + 0.50000000001);
	centavos = num % 100;
	num = Math.floor(num / 100).toString();
	
	if (centavos < 10)
	centavos = '0' + centavos;
	
	for (var i = 0; i < Math.floor((num.length - (1 + i)) / 3); i++)
	num = num.substring(0, num.length - (4 * i + 3)) + ',' + num.substring(num.length - (4 * i + 3));
	
	return (((signo) ? '' : '-') + '$' + num + '.' + centavos);
}

function seleccionarItem(item,login,password,nombre,apellido,email,estado,ingrdate,retidate){

	// Se setean los campos y los visibles en la forma de edición son asignados con cadena vacía
	document.forms[0].selEditar.value=item;
	document.forms[0].selEditar_login.value=(login=='null')?"":login;
	document.forms[0].selEditar_password.value=password;
	document.forms[0].selEditar_nombre.value=(nombre=='null')?"":nombre;
	document.forms[0].selEditar_apellido.value=(apellido=='null')?"":apellido;
	document.forms[0].selEditar_email.value=(email=='null')?"":email;
	document.forms[0].selEditar_estado.value=estado;
	document.forms[0].selEditar_ingrdate.value=ingrdate;
	document.forms[0].selEditar_retidate.value=retidate;
	
}

-->
</script>
<html:form action="/reportes/reporte_trxs.do?search=true&paging=true" method="post" name="reporteTrxForm" type="com.grpretail.trxonline.forms.ReporteTrxForm" scope="request">

<table width="99%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr> 
    <td height="20" colspan="2"><table width="760" border="0" cellspacing="0" cellpadding="0">
        <tr> 
          <td width="70%" class="TitulosPlanos"><img src="../images/spacer.gif" width="10" height="10">Reporte de Trxs</td>
        </tr>
      </table></td>
  </tr>
  <tr> 

    <td align="left" valign="top" ><!-- #BeginEditable "body" -->
      <table width="99%" border="0" align="left" cellpadding="10" cellspacing="0" class="borderTable">

        <tr> 
          <td width="700"> 
          <FIELDSET class="borderTable"><LEGEND> Parámetros de búsqueda </LEGEND>
          <table width="650" cellpadding="3" cellspacing="2">
              <tr>
                <TD align="right" class="table_title" width="25%">Tienda:</TD>
                <td class="table_content" width="25%">
	                <html:text  maxlength="22" property="tienda" size="20" styleClass="Campos" name="reporteTrxForm"/></TD>	
                <TD align="right" class="table_title" width="25%">Terminal:</TD>
                <td class="table_content" width="25%">
                	<html:text  maxlength="22" property="terminal" size="20" styleClass="Campos" name="reporteTrxForm"/></TD>
				</tr>
              
              <tr>
                <td align="right" class="table_title" width="25%">Número de trx:</td>
                <td class="table_content" width="25%">
                	<html:text  property="numeroTrx" maxlength="22" size="20"  styleClass="Campos" name="reporteTrxForm"/></TD>
				<TD align="right" class="table_title" width="25%">Fecha:</TD>
                <td class="table_content" width="25%">
					<%String fecha_ = request.getParameter("fecha") != null ? request.getParameter("fecha") : "";%> 
					<html:text property="fecha" size="10" styleClass="Campos" readonly="true"></html:text>
					<a href="javascript:seleccionarFechaYYYYMMDD(document.forms[0].elements['fecha'])">
					<img src="../images/cal.gif" width="16" height="16" border="0" alt="Haga click para seleccionar la fecha" /></a>
                </TD>
              </tr>          
				<tr>
					<td colspan="4"><input type="button" name="btnBuscar" class="normals" value="Buscar" onClick="selectBuscar()"></td>
				</tr>            
            </table>
            </FIELDSET>
            </td>
        </tr>

        <tr> 
          <td width="100%">
          
          <FIELDSET class="borderTable"><LEGEND> Transacciones </LEGEND>
          <table width="100%" border="0" align="left" cellpadding="3" >
              <tr> 
                <td align="center" class="table_title" width="13%"> Tienda</td>
                <td align="center" class="table_title" width="13%"> Terminal</td>
                <td align="center" class="table_title" width="13%"> No. Trx</td>
                <td align="center" class="table_title" width="22%"> Fecha</td>
                <td align="center" class="table_title" width="13%"> Hora </td>
                <td align="center" class="table_title" width="13%"> Tipo de Trx </td>
                <td align="center" class="table_title" width="13%"> Detalle Trx </td>
              </tr>
              <tr>
              <logic:notEmpty  scope="request" name="transacciones" >
				<logic:iterate id="element" indexId="i" type="com.asic.transacciones.vo.TPOS_HEADER" scope="request" name="transacciones">
              <TR class="table_content<%= i.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= i.intValue( ) % 2 %>'"> 

                <TD width="13%"><%=element.getSTORE().intValue()%></TD>
                <TD width="13%"><%=element.getTERMINAL().intValue()%></TD>
                <TD width="13%"><%=element.getTRANSNUM().intValue()%></TD>
                <TD width="22%"><%=element.getDAY()%></TD>
                <TD width="13%"><%=element.getTIME()%></TD>
		        <TD width="13%"><%=element.getTRANSTYPE().intValue()%></TD>
		        <TD width="13%"><a href="../reportes/detalle_reporteTrxs.do?pTienda=<%=element.getSTORE()%>&pTerminal=<%=element.getTERMINAL()%>&pNumeroTrx=<%=element.getTRANSNUM()%>&pFecha=<%=element.getDAY()%>&pHora=<%=element.getTIME()%>&pTipoTrx=<%=element.getTRANSTYPE()%>&pGrossPos=<%=element.getGROSSPOS()%>&pGrossNeg=<%=element.getGROSSNEG()%>">
		        Ver detalle</a></TD>
	         </TR>
	         <INPUT type="hidden" name="idObject" value="<%=element.getSTORE()+";"+element.getTERMINAL()+";"+element.getTRANSNUM()+";"+element.getDAY()%>">
			</logic:iterate>
			</logic:notEmpty>
            
              
  			  	<TR align="left">
					<TD align="center" colspan="11"><%
						request.setAttribute("formName", "reporteTrxForm");
						request.setAttribute("editSize", "disabled");
						if (request.getAttribute("collectionSize")!=null)
						{%> <jsp:include flush="true" page="../_jsp-comp/paginar.jsp"></jsp:include><%}%></TD>
				</TR>
				
            </table>
            </FIELDSET>
            
            
            
          </td>
        </tr>

      </table>
      <!-- #EndEditable --></td>
  </tr>
</table>
</html:form>
