/*
 * Creado el 23/06/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.demo;

/**
 * @author ACadena
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */

import java.util.List;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.demo.vos.NumeroRegistros;
import com.asic.transacciones.vo.TPOS_HEADER_Imp;
import com.asic.transacciones.vo.TPOS_ITEMENTRY_Imp;


/**
 * @author Administrador
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class TransaccionesDAO_DBUtil {//implements TransaccionesDAO {

	private String filterNumBono = "%";
	private String filterAlmacen = "%";
	private String filterFrom = "";
	private String filterTo = "";
	

	private String filterTienda = "%";
	
	public TransaccionesDAO_DBUtil() {
		super();

	}
	
	
	public List contarRegistros()
		throws ConnectionFailedException, DBAccessException {
			List res_ = null;
			
			try {
				String filter_ = getFilter(); 
						
				System.out.println("Filter: " + filter_);
				String select_="count(*) num_reg";
				String from_="TPOS_HEADER";
				res_ =
					DBUtil.select(
						select_,
						from_,		
						filter_,
						NumeroRegistros.class);
				//select id from ( select id, rownum num from trx_bonos)  where num between 11 and 20;						

						
						
				    						
			} catch (ConnectionFailedException e) {
				e.printStackTrace();
				throw e;
			} catch (DBAccessException e) {
				e.printStackTrace();
				throw e;
			} catch (Exception e) {
				e.printStackTrace();
				throw new DBAccessException(e);
			}

			return res_;
	}
	
	private String getFilter(){
		
		String answer_= //"UPPER(NUM_BONO) LIKE '" + filterNumBono + "' AND " +
						"UPPER(STORE) LIKE '" + filterAlmacen + "'";
		if (!filterFrom.equals(""))
				answer_=answer_+" AND TRUNC(DAY) >= TO_DATE('"+ filterFrom +"','yyyy-mm-dd')";
		if (!filterTo.equals(""))	
				answer_=answer_+" AND TRUNC(DAY) <= TO_DATE('"+ filterTo +"','yyyy-mm-dd')";
		
		return answer_;
		
	}

	public List selectVO(String limInf, String limSup)
		throws ConnectionFailedException, DBAccessException {
			List res_ = null;
			
			try {
				String filter_ =getFilter(); 
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);System.out.println("Filter: " + filter_);
				
				String select_=	
				"STORE,TERMINAL,TRANSNUM,DAY,TIME,TRANSTYPE,NUMSTRIN,OPERATOR,PASSWORD,"+
				"GROSSPOS,GROSSNEG";
 				
				String from_=
				"(SELECT " +
				"STORE,TERMINAL,TRANSNUM,DAY,TIME,TRANSTYPE,NUMSTRIN,OPERATOR,PASSWORD,"+
				"GROSSPOS,GROSSNEG,ROWNUM NUM"+       				
				" FROM TPOS_HEADER WHERE "+filter_+ " ORDER BY OFFSETY ASC) ";
				String where_=" NUM BETWEEN "+limInf+" AND "+limSup;
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
								
				res_ =
					DBUtil.select(
						select_,						
						from_,
						where_,		
						TPOS_HEADER_Imp.class);
				//select id from ( select id, rownum num from trx_bonos)  where num between 11 and 20;						
				    						
			} catch (ConnectionFailedException e) {
				e.printStackTrace();
				throw e;
			} catch (DBAccessException e) {
				e.printStackTrace();
				throw e;
			} catch (Exception e) {
				e.printStackTrace();
				throw new DBAccessException(e);
			}

			return res_;
	}

	public List getHeader(String pTienda,String pTerminal,String pTrx)
		throws ConnectionFailedException, DBAccessException {
			List res_ = null;
			
			try {
				String filter_ =getFilter(); 
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);System.out.println("Filter: " + filter_);
				
				String select_=	
					"STORE,TERMINAL,TRANSNUM,DAY,TIME,TRANSTYPE,NUMSTRIN,OPERATOR,PASSWORD,"+
					"GROSSPOS,GROSSNEG";
 				
				String from_=
					"TPOS_HEADER ";
				//String where_=" STORE= '"+pTienda+"' AND TERMINAL='"+pTerminal+"' AND TRANSNUM='"+pTrx+"'";
				String where_="";
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
								
				res_ =
					DBUtil.select(
						select_,						
						from_,
						where_,		
						TPOS_HEADER_Imp.class);
				//select id from ( select id, rownum num from trx_bonos)  where num between 11 and 20;						
				    						
			} catch (ConnectionFailedException e) {
				e.printStackTrace();
				throw e;
			} catch (DBAccessException e) {
				e.printStackTrace();
				throw e;
			} catch (Exception e) {
				e.printStackTrace();
				throw new DBAccessException(e);
			}

			return res_;		
	}

	public List getItems(String pTienda,String pTerminal,String pTrx)
		throws ConnectionFailedException, DBAccessException {
			List res_ = null;
			
			try {
				String filter_ =getFilter(); 
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);
				System.out.println("Filter: " + filter_);System.out.println("Filter: " + filter_);
				
				String select_=
				"ITEMCODE, XPRICE, DEPARTME MPGROUP,DEALQUAN,"+
				"PRICEMTH,SALEQUAN,SALEPRICE,QTYORWGT";       					
				String from_=
					"TPOS_ITEMENTRY ";
				//String where_=" STORE= "+pTienda+" AND TERMINAL="+pTerminal+" AND TRANSNUM="+pTrx;
				String where_="";
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
				System.out.println("sentencia sql-->"+select_+from_+where_);
								
				res_ =
					DBUtil.select(
						select_,						
						from_,
						where_,		
						TPOS_ITEMENTRY_Imp.class);
				//select id from ( select id, rownum num from trx_bonos)  where num between 11 and 20;						
				    						
			} catch (ConnectionFailedException e) {
				e.printStackTrace();
				throw e;
			} catch (DBAccessException e) {
				e.printStackTrace();
				throw e;
			} catch (Exception e) {
				e.printStackTrace();
				throw new DBAccessException(e);
			}

			return res_;		
	}


	/**
	 * Returns the filterNumBono.
	 * @return String
	 */
	public String getFilterNumBono() {
		return filterNumBono;
	}

	/**
	 * Returns the filterAlmacen.
	 * @return String
	 */
	public String getFilterAlmacen() {
		return filterAlmacen;
	}

	/**
	 * Returns the filterFrom.
	 * @return String
	 */
	public String getFilterFrom() {
		return filterFrom;
	}

	/**
	 * Sets the filterNumBono.
	 * @param filterNumBono The filterNumBono to set
	 */
	public void setFilterNumBono(String filterNumBono) {
		if(filterNumBono==null || filterNumBono.trim().equals(""))filterNumBono="%";
		//else if(!filterNumBono.trim().equals("%")) filterNumBono = Relleno.carga(filterNumBono,18,'0',0,18);
		this.filterNumBono = filterNumBono.toUpperCase();
	}

	/**
	 * Sets the filterAlmacen.
	 * @param filterAlmacen The filterAlmacen to set
	 */
	public void setFilterAlmacen(String filterAlmacen) {
		if(filterAlmacen==null || filterAlmacen.trim().equals(""))filterAlmacen="%";
		this.filterAlmacen = filterAlmacen.toUpperCase();
	}

	/**
	 * Sets the filterFrom_.
	 * @param filterFrom The filterFrom_ to set
	 */
	public void setFilterFrom(String filterFrom) {
		if(filterFrom==null || filterFrom.trim().equals(""))filterFrom="";
		this.filterFrom = filterFrom.toUpperCase();
	}

	/**
	 * Sets the filterTo.
	 * @param filterTo The filterTo to set
	 */
	public void setFilterTo(String filterTo) {
		if(filterTo==null || filterTo.trim().equals(""))filterTo="";
		this.filterTo = filterTo.toUpperCase();
	}

	/**
	 * Sets the filterTienda.
	 * @param filterTienda The filterTienda to set
	 */
	public void setFilterTienda(String filterTienda) {
		if(filterTienda==null || filterTienda.trim().equals(""))filterTienda="%";
		this.filterTienda = filterTienda;
	}

}