<%-- 
/** Define una tabla con las opciones de paginacion:
 *	Entradas:
 *		Tamaño deseado del listado siguiente
 *			opcional, primera vez, si no viene pone 10 por defecto
 *			request.getAttribute("numFilas")
 *			opcional, segunda vez
 *			request.getParameter("numFilas")
 *		
 *		Posicion del cursor sobre la lista actual
 *			opcional, si no llega, pone 1 por defecto
 *			request.getParameter("posIndex")		
 *		
 *		Tamaño de la lista que se muestra actualmente, definido en el action
 *			opcional, si no llega, pone 10 por defecto
 *			request.getAttribute("collectionSize")
 *		
 *		Si se desea poder modificar el campo de numero de filas siguientes
 *			opcional, si no llega no deja editar por defecto.
 *			request.getAttribute("editSize");	
 *			
 *		Nombre del formulario que se desea utilizar, definido en la pagina
 			obligatorio, si no llega no funciona
 			request.getAttribute("formName");
 *
 *	Salida:
 		Envia el formulario por defecto.
 */
--%>
<%@ page import="org.ramm.jwaf.util.StringFormater" %>
<%
String editSize_ = "";
if(request.getAttribute("editSize") != null){
	editSize_ = "disabled";
}
%>
<script language="JavaScript1.2">
<!--

var theDefaultForm_  = <%=request.getAttribute("formName")%>;
//
// Incrementa el indicie actual posIndex en numFilas
// y envia el submit requerido
//

function goToNextPage(objPosIndex, objNumFilas, objForm){
//	alert("next "+objPosIndex.value+" "+objNumFilas.value);
	var pos = 0;
	var pagFinal_ = objForm.pagina.value;
	
	objForm.pagina.value = (pagFinal_ - 0)+(1 - 0);

	posicion_ = objPosIndex.value;
	numFilas_ = objNumFilas.value;
	pos = ( posicion_ - 0 )+ (numFilas_ - 0 );
	objPosIndex.value = pos;
//	alert(pos);
	objForm.submit();
}

/**
 Incrementa el indicie actual posIndex en numFilas
 y envia el submit requerido
*/
function goToBackPage(objPosIndex, objNumFilas, objForm){
//	alert("back");

	objPosIndex.value = objPosIndex.value - objNumFilas.value;
	
	if(objPosIndex.value <= 0){
		alert("No hay mas datos hacia atras.");
	}else{
		var pagFinal_ = objForm.pagina.value;
		objForm.pagina.value = pagFinal_ - 1;
		objForm.submit();
	}
}

-->
</script>
<TABLE width="100" border="0">		
	<TBODY>
		<TR>
			<TD align="right" height="21">
			<%
				String numPags_ = "1";
				if (request.getParameter("pagina") == null){
          			request.setAttribute("pagina", numPags_);
          		}else{
          			request.setAttribute("pagina", request.getParameter("pagina"));          		
          		}
          	%>
			<INPUT type="hidden" name="pagina" value="<%=request.getAttribute("pagina")%>" >
			<!-- navegacion -->
				<%
				// Si es la primera vez sale el boton desabilitado
				if(request.getParameter("posIndex") == null){

				%>		 
<!--					<img src="../images/denim2006ic.gif" width="20" height="15" border="0" alt="ver anterior">  -->
				<%
				} else {
				%>
<!--					<a href="javascript:goToBackPage(theDefaultForm_.posIndex, theDefaultForm_.numFilas, theDefaultForm_)" >
						<img src="../images/denim006ic.gif" width="20" height="15" border="0" alt="ver anterior"></a>  -->
				<%
				}
				%>
			</TD>
			<TD align="center" height="21" >
			<!-- posicion del indice actual -->
			<INPUT type="hidden" name="posIndex" value="<%=StringFormater.verifyValue(request.getParameter("posIndex"),"","1")%>">
			<INPUT type="text" <%=editSize_ %> name="numFilas" size="2" maxlength="2" value="<%=StringFormater.verifyValue((String)request.getAttribute("numFilas"),"","10")%>">
			
			</TD>
			<TD valign="middle" height="21">
				<%
				String numFilas_ = "10";
				// segunda vez
				if(request.getParameter("numFilas") != null){
					numFilas_ = request.getParameter("numFilas");
				// primera vez
				}else if(request.getAttribute("numFilas") != null){
					numFilas_ = (String)request.getAttribute("numFilas");
				}
				//transacciones_.size()
				String sizeStr_ = (String)request.getAttribute("collectionSize");						
				int size_ = Integer.parseInt(sizeStr_);
					
			 	// si las filas a mostrar son menores que las definidas (numFilas)
				if(size_ < Integer.parseInt(numFilas_) 
					|| (request.getAttribute("pag_hasNext") != null   
						&& request.getAttribute("pag_hasNext").equals("false"))){							
				%>		
<!--				<img src="../images/denim2007ic.gif" width="20" height="15" border="0" alt="ver siguiente">							-->
				<%
				// si son iguales o mayores puede que exista siguiente
				}else {
				%>
<!--				<a href="javascript:goToNextPage(theDefaultForm_.posIndex, theDefaultForm_.numFilas, theDefaultForm_)" >
						<img src="../images/denim007ic.gif" width="20" height="15" border="0" alt="ver siguiente"></a> 				-->
				<%
				}
				%>
			</TD>
		</TR>
	</TBODY>
</TABLE>