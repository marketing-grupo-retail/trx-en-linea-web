<%-- VisaWeb:  $Id: body_detalleReporteTrxs.jsp,v 1.1 2019/12/18 17:31:04 Alfonso Exp $ --%>

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

<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr> 
    <td height="20" colspan="2"><table width="760" border="0" cellspacing="0" cellpadding="0">
        <tr> 
          <td width="70%" class="TitulosPlanos"><img src="../images/spacer.gif" width="10" height="10">Detalle Reporte de Trxs</td>
        </tr>
      </table></td>
  </tr>
  <tr> 

    <td align="left" valign="top" ><!-- #BeginEditable "body" -->
      <table width="100%" border="0" align="left" cellpadding="0" cellspacing="0" class="borderTable">



        <tr> 
          <td width="100%">
          <html:hidden property="tienda"/>
          <html:hidden property="terminal"/>
          <html:hidden property="numeroTrx"/>
          <html:hidden property="fecha"/>

          <table width="100%" border="0" align="left" >
			
			<logic:notEmpty  scope="request" name="transacciones" >

			<logic:notEmpty name="transacciones" property="header" scope="request">
			<TR><TD>
			<FIELDSET class="borderTable_s"><LEGEND> Encabezado </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3" >
				<tr> 
	                <td align="center" class="table_title" width="12%"> Tienda</td>
	                <td align="center" class="table_title" width="12%"> Terminal</td>
	                <td align="center" class="table_title" width="12%"> No. Trx</td>
	                <td align="center" class="table_title" width="16%"> Fecha</td>
	                <td align="center" class="table_title" width="12%"> Hora </td>
	                <td align="center" class="table_title" width="12%"> Tipo Trx </td>
	                <td align="center" class="table_title" width="12%"> Gross Pos </td>
	                <td align="center" class="table_title" width="12%"> Gross Neg </td>
				</tr>
              	<tr>
				<logic:iterate id="e_header" indexId="h" type="com.asic.transacciones.vo.TPOS_HEADER" name="transacciones" property="header" scope="request">
					<TR class="table_content<%= h.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= h.intValue( ) % 2 %>'"> 
		                <TD width="12%"><%=e_header.getSTORE().intValue()%></TD>
		                <TD width="12%"><%=e_header.getTERMINAL().intValue()%></TD>
		                <TD width="12%"><%=e_header.getTRANSNUM().intValue()%></TD>
		                <TD width="16%"><%=e_header.getDAY()%></TD>
		                <TD width="12%"><%=e_header.getTIME()%></TD>
		                <TD width="12%"><%=e_header.getTRANSTYPE().intValue()%></TD>
		                <TD width="12%"><%=e_header.getGROSSPOS().intValue()%></TD>
		                <TD width="12%"><%=e_header.getGROSSNEG().intValue()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>
			<logic:notEmpty name="transacciones" property="itemEntry" scope="request">
			<TR><TD>
			<FIELDSET class="borderTable_s"><LEGEND> Item </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3" >
				<tr> 
	                <td align="center" class="table_title" width="10%"> Código item</td>
	                <td align="center" class="table_title" width="10%"> XPrice</td>
	                <td align="center" class="table_title" width="10%"> Dpto</td>
	                <td align="center" class="table_title" width="10%"> Family Num1</td>
	                <td align="center" class="table_title" width="10%"> Family Num2</td>
	                <td align="center" class="table_title" width="10%"> Deal Quan</td>
	                <td align="center" class="table_title" width="10%"> Price mth</td>
	                <td align="center" class="table_title" width="10%"> Sale Quan</td>
	                <td align="center" class="table_title" width="10%"> Sale Price</td>
	                <td align="center" class="table_title" width="10%"> QTYORWGT</td>
				</tr>
              	<tr>
				<logic:iterate id="e_itemEntry" indexId="ie" type="com.asic.transacciones.vo.TPOS_ITEMENTRY" name="transacciones" property="itemEntry" scope="request">
					<TR class="table_content<%= ie.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= ie.intValue( ) % 2 %>'"> 
		                <TD width="10%"><%=e_itemEntry.getITEMCODE().intValue()%></TD>
		                <TD width="10%"><%=e_itemEntry.getXPRICE().intValue()%></TD>
		                <TD width="10%"><%=e_itemEntry.getDEPARTME().intValue()%></TD>
		                <TD width="10%"><%=e_itemEntry.getFAMILYNU1().intValue()%></TD>
		                <TD width="10%"><%=e_itemEntry.getFAMILYNU2().intValue()%></TD>
		                <TD width="10%"><%=e_itemEntry.getDEALQUAN().intValue()%></TD>
				        <TD width="10%"><%=e_itemEntry.getPRICEMTH().intValue()%></TD>
				        <TD width="10%"><%=e_itemEntry.getSALEQUAN().intValue()%></TD>
				        <TD width="10%"><%=e_itemEntry.getSALEPRICE().intValue()%></TD>
				        <TD width="10%"><%=e_itemEntry.getQTYORWGT().intValue()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>
			<logic:notEmpty name="transacciones" property="discount" scope="request">
			<TR><TD>
			<FIELDSET class="borderTable_s"><LEGEND> Descuentos </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3" >
	              <tr> 
	                <td align="center" class="table_title" width="25%"> DISGROUP</td>
	                <td align="center" class="table_title" width="25%"> DISRATE</td>
	                <td align="center" class="table_title" width="25%"> AMTDISCO</td>
	                <td align="center" class="table_title" width="25%"> TAXEXEMP</td>
	              </tr>
				<logic:iterate id="e_discount" indexId="d" type="com.asic.transacciones.vo.TPOS_DISCOUNT" name="transacciones" property="discount" scope="request">
					<TR class="table_content<%= d.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= d.intValue( ) % 2 %>'"> 
		                <TD width="25%"><%=e_discount.getDISGROUP().intValue()%></TD>
		                <TD width="25%"><%=e_discount.getDISRATE().intValue()%></TD>
		                <TD width="25%"><%=e_discount.getAMTDISCO().intValue()%></TD>
		                <TD width="25%"><%=e_discount.getTAXEXEMP().intValue()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>
			<logic:notEmpty name="transacciones" property="tax" scope="request">
			<TR><TD width="400">
			<FIELDSET class="borderTable_s"><LEGEND> Impuestos </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3" >
	              <tr> 
	                <td align="center" class="table_title" width="50%"> TYPE</td>
	                <td align="center" class="table_title" width="50%"> AMTTAXA</td>
	              </tr>
				<logic:iterate id="e_tax" indexId="t" type="com.asic.transacciones.vo.TPOS_TAX" name="transacciones" property="tax" scope="request">
					<TR class="table_content<%= t.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= t.intValue( ) % 2 %>'"> 
		                <TD width="50%"><%=e_tax.getTYPE().intValue()%></TD>
		                <TD width="50%"><%=e_tax.getAMTTAXA().intValue()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>
			<logic:notEmpty name="transacciones" property="tender" scope="request">
			<TR><TD>
			<FIELDSET class="borderTable_s"><LEGEND> Tenders </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3" >
	              <tr> 
	                <td align="center" class="table_title" width="20%"> Tipo</td>
	                <td align="center" class="table_title" width="16%"> TENDTYPE</td>
	                <td align="center" class="table_title" width="16%"> AMTTENDE</td>
	                <td align="center" class="table_title" width="16%"> AMTTNFEE</td>
	                <td align="center" class="table_title" width="16%"> CUSTOMER</td>
               		<td align="center" class="table_title" width="16%"> STATUS</td>
	              </tr>
				<logic:iterate id="e_tender" indexId="t" type="com.asic.transacciones.vo.TPOS_TENDER" name="transacciones" property="tender" scope="request">
					<TR class="table_content<%= t.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= t.intValue( ) % 2 %>'"> 
		                <TD width="20%"><%=e_tender.getTYPE().intValue()%></TD>
		                <TD width="16%"><%=e_tender.getTENDTYPE().intValue()%></TD>
		                <TD width="16%"><%=e_tender.getAMTTENDE().intValue()%></TD>
		                <TD width="16%"><%=e_tender.getAMTTNFEE().intValue()%></TD>
		                <TD width="16%"><%=e_tender.getCUSTOMER().intValue()%></TD>
		                <TD width="16%"><%=e_tender.getSTATUS().intValue()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>

			<logic:notEmpty name="transacciones" property="userData" scope="request">
			<TR><TD>

			<FIELDSET class="borderTable_s"><LEGEND> User Data </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3">
	              <tr> 
	                <td align="center" class="table_title" width="5%"> Data1</td>
	                <td align="center" class="table_title" width="5%"> Data2</td>
	                <td align="center" class="table_title" width="5%"> Data3</td>
	                <td align="center" class="table_title" width="5%"> Data4</td>
	                <td align="center" class="table_title" width="5%"> Data5</td>
	                <td align="center" class="table_title" width="5%"> Data6</td>
	                <td align="center" class="table_title" width="5%"> Data7</td>
	                <td align="center" class="table_title" width="5%"> Data8</td>
	                <td align="center" class="table_title" width="5%"> Data9</td>
	                <td align="center" class="table_title" width="5%"> Data10</td>
	                <td align="center" class="table_title" width="5%"> Data11</td>
	                <td align="center" class="table_title" width="5%"> Data12</td>
	                <td align="center" class="table_title" width="5%"> Data13</td>
	                <td align="center" class="table_title" width="5%"> Data14</td>
	                <td align="center" class="table_title" width="5%"> Data15</td>
	                <td align="center" class="table_title" width="5%"> Data16</td>
	                <td align="center" class="table_title" width="5%"> Data17</td>
	                <td align="center" class="table_title" width="5%"> Data18</td>
	                <td align="center" class="table_title" width="5%"> Data19</td>
	                <td align="center" class="table_title" width="5%"> Data20</td>
	              </tr>
	              <tr>
				<logic:iterate id="e_userData" indexId="ud" type="com.asic.transacciones.vo.TPOS_USER_DATA" name="transacciones" property="userData" scope="request">
					<TR class="table_content<%= ud.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= ud.intValue( ) % 2 %>'"> 
		                <TD width="5%"><%=e_userData.getDATA1()%></TD>
		                <TD width="5%"><%=e_userData.getDATA2()%></TD>
		                <TD width="5%"><%=e_userData.getDATA3()%></TD>
		                <TD width="5%"><%=e_userData.getDATA4()%></TD>
				        <TD width="5%"><%=e_userData.getDATA5()%></TD>
				        <TD width="5%"><%=e_userData.getDATA6()%></TD>
				        <TD width="5%"><%=e_userData.getDATA7()%></TD>
				        <TD width="5%"><%=e_userData.getDATA8()%></TD>
				        <TD width="5%"><%=e_userData.getDATA9()%></TD>
				        <TD width="5%"><%=e_userData.getDATA10()%></TD>
		                <TD width="5%"><%=e_userData.getDATA11()%></TD>
		                <TD width="5%"><%=e_userData.getDATA12()%></TD>
		                <TD width="5%"><%=e_userData.getDATA13()%></TD>
		                <TD width="5%"><%=e_userData.getDATA14()%></TD>
				        <TD width="5%"><%=e_userData.getDATA15()%></TD>
				        <TD width="5%"><%=e_userData.getDATA16()%></TD>
				        <TD width="5%"><%=e_userData.getDATA17()%></TD>
				        <TD width="5%"><%=e_userData.getDATA18()%></TD>
				        <TD width="5%"><%=e_userData.getDATA19()%></TD>
				        <TD width="5%"><%=e_userData.getDATA20()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>

			</TD></TR>			
			</logic:notEmpty>

			<logic:notEmpty name="transacciones" property="priceChange" scope="request">
			<TR><TD>
			<FIELDSET class="borderTable_s"><LEGEND> Price Change </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3" >
	              <tr> 
	                <td align="center" class="table_title" width="20%"> Item Code</td>
	                <td align="center" class="table_title" width="20%"> New Deal Q</td>
	                <td align="center" class="table_title" width="20%"> New Price</td>
	                <td align="center" class="table_title" width="20%"> Old Deal Q</td>
	                <td align="center" class="table_title" width="20%"> Old Price</td>
	              </tr>
				<logic:iterate id="e_priceChange" indexId="pc" type="com.asic.transacciones.vo.TPOS_PRICE_CHANGE" name="transacciones" property="priceChange" scope="request">
					<TR class="table_content<%= pc.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= pc.intValue( ) % 2 %>'"> 
		                <TD width="16%"><%=e_priceChange.getITEMCODE()%></TD>
		                <TD width="12%"><%=e_priceChange.getNEWDEALQ()%></TD>
		                <TD width="12%"><%=e_priceChange.getNEWPRICE()%></TD>
		                <TD width="12%"><%=e_priceChange.getOLDDEALQ()%></TD>
		                <TD width="12%"><%=e_priceChange.getOLDPRICE()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>
			<logic:notEmpty name="transacciones" property="dataEntry" scope="request">
			<TR><TD>
			<FIELDSET class="borderTable_s"><LEGEND> Data entry </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3" >
	              <tr> 
	                <td align="center" class="table_title" width="20%"> Data1</td>
	                <td align="center" class="table_title" width="16%"> Data2</td>
	                <td align="center" class="table_title" width="16%"> Data3</td>
	                <td align="center" class="table_title" width="16%"> Data4</td>
	                <td align="center" class="table_title" width="16%"> Data5</td>
	                <td align="center" class="table_title" width="16%"> Data5</td>
	              </tr>
				<logic:iterate id="e_dataEntry" indexId="de" type="com.asic.transacciones.vo.TPOS_DATA_ENTRY" name="transacciones" property="dataEntry" scope="request">
					<TR class="table_content<%= de.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= de.intValue( ) % 2 %>'"> 
		                <TD width="20%"><%=e_dataEntry.getDATA1()%></TD>
		                <TD width="16%"><%=e_dataEntry.getDATA2()%></TD>
		                <TD width="16%"><%=e_dataEntry.getDATA3()%></TD>
		                <TD width="16%"><%=e_dataEntry.getDATA4()%></TD>
		                <TD width="16%"><%=e_dataEntry.getDATA5()%></TD>
		                <TD width="16%"><%=e_dataEntry.getDATA6()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>
			<logic:notEmpty name="transacciones" property="managerOverride" scope="request">
			<TR><TD>
			<FIELDSET class="borderTable_s"><LEGEND> Manager Overrride </LEGEND>
			<table width="40%" border="0" align="left" cellpadding="3" >
	              <tr> 
	                <td align="center" class="table_title" width="50%"> OVERRIDE</td>
	                <td align="center" class="table_title" width="50%"> Razón</td>
	              </tr>
				<logic:iterate id="e_managerOverride" indexId="mo" type="com.asic.transacciones.vo.TPOS_MANAGER_OVERRIDE" name="transacciones" property="managerOverride" scope="request">
					<TR class="table_content<%= mo.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= mo.intValue( ) % 2 %>'"> 
		                <TD width="50%"><%=e_managerOverride.getOVERRIDE().intValue()%></TD>
		                <TD width="50%"><%=e_managerOverride.getREASON()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>
			<logic:notEmpty name="transacciones" property="tradingStamps" scope="request">
			<TR><TD width="200">
			<FIELDSET class="borderTable_s"><LEGEND> Trading Stamps </LEGEND>
			<table width="100%" border="0" align="left" cellpadding="3" >
	              <tr> 
	                <td align="center" class="table_title" width="100%"> STAMPS</td>
	              </tr>
				<logic:iterate id="e_tradingStamps" indexId="ts" type="com.asic.transacciones.vo.TPOS_TRADING_STAMPS" name="transacciones" property="tradingStamps" scope="request">
					<TR class="table_content<%= ts.intValue( ) % 2 %>" onMouseOver="this.className='table_contenth'" onMouseOut="this.className='table_content<%= ts.intValue( ) % 2 %>'"> 
		                <TD width="100%"><%=e_tradingStamps.getSTAMPS().intValue()%></TD>
		         	</TR>
				</logic:iterate>
			</table>
			</FIELDSET>
			</TD></TR>
			</logic:notEmpty>			

			</logic:notEmpty>
            </table>
            
          </td>
        </tr>

      </table>
      <!-- #EndEditable --></td>
  </tr>
</table>
</html:form>
