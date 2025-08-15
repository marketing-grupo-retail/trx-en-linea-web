<%-- ASIC Admin Usuarios:  $Id: body_bienvenida.jsp,v 1.1 2019/12/18 17:30:56 Alfonso Exp $ --%>
<%@taglib uri="/WEB-INF/asic.tld" prefix="asic"%>
<script type="text/javascript" language="JavaScript1.2"
	src="../js/ayuda.js"></script>

<link rel="stylesheet" type="text/css" href="../theme/estilos.css">
<TABLE border=0 cellPadding=0 cellSpacing=0 width=780 align="center">
	<TBODY>
		<TR> 
			<TD vAlign=top><BR>
			<BR>
			<%String titulo_ = "Bienvenido al area de "+ request.getAttribute("area_bienvenida");%>
			<asic:table
				titulo="<%=titulo_%>">
				<TBODY>
					<TR>
						<TD align="center" width="58%">
						<TABLE align=center border=0 cellPadding=0 cellSpacing=0
							height="76" width="268">
							<TBODY>
								<TR>
									<TD class=b vAlign=top align="left" width="241"><STRONG><%=request.getAttribute("mensaje_bienvenida")%>
									</STRONG><BR>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
						</td>
						<TD vAlign=top class="estiloAlterno" align="center" width="42%">
						<TABLE align=center class="estiloAlterno" border=0 cellPadding=0
							cellSpacing=0 height=137>
							<TBODY>
								<TR>
									<TD align="center" vAlign="middle">
									<DIV align=center><BR>
									<IMG height=135 src="../images/fotofabrica.jpg" width=166></DIV>
									</TD>
								</TR>
							</TBODY>
						</TABLE>
						<b><FONT size="2"><BR>
						ACG - La Alternativa Inteligente</FONT></b></TD>
					</TR>
				</TBODY>
			</asic:table> 
			
			<%--TABLE align=right border=0 cellPadding=0 cellSpacing=0 width="100%" height="450">
        <TBODY> 
        <TR vAlign=top>
          <TD valign="top" align="left">
            <TABLE align=center border=0 cellPadding=0 cellSpacing=0 >
              <TBODY>
              <TR>			
                <TD class=TitulosPlanos colSpan=3><BR>
					<IMG height=12 src="../images/barra_marcos.gif" width=350></TD>
              </TR>
              <TR>
                <TD background=../images/fon_home.gif bgColor=#003366 
                	class=TitulosPlanos vAlign=top width=38>
                  <DIV align=left><IMG height=10 
                  src="../images/esq_marrojo.gif" width=20></DIV></TD>
                <TD background=../images/fon_home.gif bgColor=#003366 
                class=TitulosPlanos width=505>
                  <DIV align=left class=TitularesBlancos>Bienvenido al area de <%=request.getAttribute("area_bienvenida")%></DIV>
                </TD>
                <TD background=../images/fon_home.gif bgColor=#003366 
                class=TitulosPlanos vAlign=top width=26>
                  <DIV align=right><IMG height=20 
                  src="../images/esq_marc.gif" 
              width=23></DIV></TD></TR></TBODY></TABLE>
            <BR>
						<TABLE border=0 cellPadding=0 cellSpacing=0 width="66%"
							align="center">
							<TBODY>
								<TR>
									<TD align="center" width="58%">
									<TABLE align=center border=0 cellPadding=0 cellSpacing=0
										height="76" width="268">
										<TBODY>
											<TR>
												<TD class=b vAlign=top align="left" width="241"><STRONG><%=request.getAttribute("mensaje_bienvenida")%></STRONG><BR> 
												
												<!--<TD vAlign=top align="left" height="58" width="280"><SPAN
													class=b><STRONG>En esta página encontrará la información
												soporte de la compensación, controversias, administración de
												riesgos, autorizaciones y niveles de servicio.</STRONG></SPAN></TD> //-->
											</TR>
										</TBODY>
									</TABLE>
									</td>
									<TD vAlign=top class="estiloAlterno" align="center" width="42%">
									<TABLE align=center class="estiloAlterno" border=0 cellPadding=0
										cellSpacing=0 height=137>
										<TBODY>
											<TR>
												<TD align="center" vAlign="middle">
												<DIV align=center><BR>
												<IMG height=135 src="../images/fotofabrica.jpg" width=166></DIV>
												</TD>
											</TR>
										</TBODY>
									</TABLE>
									<b><FONT size="2" ><BR>
									ACG - La Alternativa Inteligente</FONT></b></TD>
								</TR>
							</TBODY>
						</TABLE--%>
						</TD></TR></TBODY>
</TABLE>