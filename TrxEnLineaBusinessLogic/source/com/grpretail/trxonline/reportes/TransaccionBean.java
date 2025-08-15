/*
 * Created on 14/07/2011
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.grpretail.trxonline.reportes;

import java.util.ArrayList;
import java.util.List;

import org.ramm.jwaf.dbutil.DBUtil;
import org.ramm.jwaf.sql.ConnectionFailedException;
import org.ramm.jwaf.sql.DBAccessException;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.resources.ApplicationResources;
import com.asic.transacciones.vo.TPOS_DATA_ENTRY_Imp;
import com.asic.transacciones.vo.TPOS_DISCOUNT_Imp;
import com.asic.transacciones.vo.TPOS_HEADER;
import com.asic.transacciones.vo.TPOS_HEADER_Imp;
import com.asic.transacciones.vo.TPOS_ITEMENTRY_Imp;
import com.asic.transacciones.vo.TPOS_MANAGER_OVERRIDE_Imp;
import com.asic.transacciones.vo.TPOS_PRICE_CHANGE_Imp;
import com.asic.transacciones.vo.TPOS_TAX_Imp;
import com.asic.transacciones.vo.TPOS_TENDER_Imp;
import com.asic.transacciones.vo.TPOS_TRADING_STAMPS_Imp;
import com.asic.transacciones.vo.TPOS_USER_DATA_Imp;
import com.asic.transacciones.vo.TRANSACCION;
import com.asic.transacciones.vo.TRANSACCION_Imp;

/**
 * @author Andrea
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class TransaccionBean {

	/* (non-Javadoc)
	 * @see com.grpretail.trxonline.reportes.TransaccionBusinessDelegate#getTransacciones(com.asic.transacciones.vo.TPOS_HEADER, int, int)
	 */
	public List getTransacciones(TPOS_HEADER pHeader, int pPosIni, int pPosFin)
		throws ServiceException {
			List res_ = null;

			try {
				
				String select_ = " a.STORE, a.TERMINAL, a.TRANSNUM, a.DAY, a.TIME, a.TRANSTYPE, a.GROSSPOS, a.GROSSNEG " ;
				String where_= "STORE is not null ";
			
				if (pHeader.getSTORE()!=null)
					where_+= " AND STORE = " + pHeader.getSTORE().toString();
				if (pHeader.getTERMINAL()!=null)
					where_+= " AND a.TERMINAL = " + pHeader.getTERMINAL().toString();
				if (pHeader.getTRANSNUM()!=null)
					where_+= " AND a.TRANSNUM = " + pHeader.getTRANSNUM().toString();
				if (pHeader.getDAY()!=null)
					where_+= " AND TRUNC (a.DAY) = TO_DATE ('" + pHeader.getDAY().toString()+"' , 'yyyy-mm-dd')";
						
				res_ = DBUtil.select(select_,
						"TPOS_HEADER a",
						where_,
						" ",
						TPOS_HEADER_Imp.class,
						ApplicationResources.GR_DB,
						pPosIni, pPosFin);

			} catch (ConnectionFailedException e) {
				e.printStackTrace();
				throw new ServiceException("ConnectionFailedException", e);
			} catch (DBAccessException e) {
				e.printStackTrace();
				throw new ServiceException("DBAccessException", e);
			}

			return res_;
	}

	/**
	 * @param pHeader
	 * @param pPosIni
	 * @param pPosFin
	 * @return
	 */
	public TRANSACCION getDetalleTransacciones(TPOS_HEADER pHeader, int pPosIni, int pPosFin) throws ServiceException {
		List res_ = null;
		TRANSACCION trx_ = new TRANSACCION_Imp();
		try {
			//SELECT  i.ITEMCODE, i.XPRICE, i.DEPARTME, i.FAMILYNU1, i.FAMILYNU2, i.DEALQUAN, i.PRICEMTH, i.SALEQUAN, i.SALEPRICE, i.QTYORWGT, 
			// null as DATA1, null as DATA2, null as DATA3, null as DATA4, null as DATA5, null as DATA6, 
			// a.STORE, a.TERMINAL, a.TRANSNUM, a.DAY, a.TIME, a.TRANSTYPE 
			// FROM TPOS_HEADER a, TPOS_ITEMENTRY i  
			// WHERE a.STORE = 1.0 AND a.TERMINAL = 10.0 AND a.TRANSNUM = 10.0 AND a.DAY = TO_TIMESTAMP('2009-08-13 12:00:00.0' , 'yyyy-mm-dd HH24:MI:SS.ff3') and a.STORE=i.STORE 
			// AND a.TERMINAL= i.TERMINAL and a.TRANSNUM = i.TRANSNUM and a.DAY=i.DAY
			// union all SELECT null as ITEMCODE, null as XPRICE, null as DEPARTME, null as FAMILYNU1, null as FAMILYNU2, null as DEALQUAN, null as PRICEMTH, null as SALEQUAN, null as SALEPRICE, null as QTYORWGT,
			// d.DATA1, d.DATA2, d.DATA3, d.DATA4, d.DATA5, d.DATA6,
			// a.STORE, a.TERMINAL, a.TRANSNUM, a.DAY, a.TIME, a.TRANSTYPE
			// FROM TPOS_HEADER a, TPOS_DATA_ENTRY d
			// WHERE a.STORE = 1.0 AND a.TERMINAL = 10.0 AND a.TRANSNUM = 10.0 AND a.DAY = TO_TIMESTAMP('2009-08-13 12:00:00.0' , 'yyyy-mm-dd HH24:MI:SS.ff3') and a.STORE=d.STORE
			// AND a.TERMINAL= d.TERMINAL and a.TRANSNUM = d.TRANSNUM and a.DAY=d.DAY
			String select_;
			String where_;
			if (pHeader.getTRANSTYPE().intValue()==0) {
				//Encabezado
				List headerList_ = new ArrayList();
				headerList_.add(pHeader);
				trx_.setHeader(headerList_);
				//Item
				trx_.setItemEntry(getItemEntry(pHeader));
				//Descuentos
				trx_.setDiscount(getDiscount(pHeader));
				//Impuestos
				trx_.setTax(getTax(pHeader));
				//Tenders
				trx_.setTender(getTender(pHeader));
				//User Data
				trx_.setUserData(getUserData(pHeader));
				//Price Change
				trx_.setPriceChange(getPriceChange(pHeader));
				//Data Entry
				trx_.setDataEntry(getDataEntry(pHeader));
				//Manager Override
				trx_.setManagerOverride(getManagerOverride(pHeader));
				//TPOS_TRADING_STAMPS
				trx_.setTradingStamps(getTradingStamps(pHeader));				
			}
		} catch (ConnectionFailedException e) {
			e.printStackTrace();
			throw new ServiceException("ConnectionFailedException", e);
		} catch (DBAccessException e) {
			e.printStackTrace();
			throw new ServiceException("DBAccessException", e);
		}

		return trx_;
	}

	private List getTradingStamps(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " ts.STAMPS " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=ts.STORE AND a.TERMINAL= ts.TERMINAL and a.TRANSNUM = ts.TRANSNUM and a.DAY=ts.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_TRADING_STAMPS ts", where_,  TPOS_TRADING_STAMPS_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

	private List getManagerOverride(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " mo.OVERRIDE, mo.REASON " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=mo.STORE AND a.TERMINAL= mo.TERMINAL and a.TRANSNUM = mo.TRANSNUM and a.DAY=mo.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_MANAGER_OVERRIDE mo", where_,  TPOS_MANAGER_OVERRIDE_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

	private List getDataEntry(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " de.DATA1, de.DATA2, de.DATA3, de.DATA4, de.DATA5, de.DATA6 " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=de.STORE AND a.TERMINAL= de.TERMINAL and a.TRANSNUM = de.TRANSNUM and a.DAY=de.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_DATA_ENTRY de", where_,  TPOS_DATA_ENTRY_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

	private List getPriceChange(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " pc.ITEMCODE, pc.NEWDEALQ, pc.NEWPRICE, pc.OLDDEALQ, pc.OLDPRICE " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=pc.STORE AND a.TERMINAL= pc.TERMINAL and a.TRANSNUM = pc.TRANSNUM and a.DAY=pc.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_PRICE_CHANGE pc", where_,  TPOS_PRICE_CHANGE_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

	private List getUserData(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " u.TYPE, u.DATA1, u.DATA2, u.DATA3, u.DATA4, u.DATA5, u.DATA6, u.DATA7, u.DATA8, u.DATA9, u.DATA10, u.DATA11, u.DATA12, u.DATA13, u.DATA14, u.DATA15, u.DATA16, u.DATA17, u.DATA18, u.DATA19, u.DATA20 " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=u.STORE AND a.TERMINAL= u.TERMINAL and a.TRANSNUM = u.TRANSNUM and a.DAY=u.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_USER_DATA u", where_, TPOS_USER_DATA_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

	private List getTender(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " t.TYPE, t.TENDTYPE, t.AMTTENDE, t.AMTTNFEE, t.CUSTOMER, t.STATUS " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=t.STORE AND a.TERMINAL= t.TERMINAL and a.TRANSNUM = t.TRANSNUM and a.DAY=t.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_TENDER t", where_,  TPOS_TENDER_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

	private List getTax(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " t.TYPE, t.AMTTAXA " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=t.STORE AND a.TERMINAL= t.TERMINAL and a.TRANSNUM = t.TRANSNUM and a.DAY=t.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_TAX t", where_,  TPOS_TAX_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

	private List getDiscount(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " d.DISGROUP, d.DISRATE, d.AMTDISCO, d.TAXEXEMP " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=d.STORE AND a.TERMINAL= d.TERMINAL and a.TRANSNUM = d.TRANSNUM and a.DAY=d.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_DISCOUNT d", where_,  TPOS_DISCOUNT_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

	private List getItemEntry(TPOS_HEADER pHeader)
		throws ConnectionFailedException, DBAccessException {
		String select_ = " i.ITEMCODE, i.XPRICE, i.DEPARTME, i.FAMILYNU1, i.FAMILYNU2, i.DEALQUAN, i.PRICEMTH, i.SALEQUAN, i.SALEPRICE, i.QTYORWGT " ;
		String where_= " a.STORE=" + pHeader.getSTORE().toString() +
		" AND a.TERMINAL=" + pHeader.getTERMINAL().toString() +
		" AND a.TRANSNUM=" + pHeader.getTRANSNUM().toString() +
		" AND a.DAY = TO_TIMESTAMP('" + pHeader.getDAY().toString() + "' , 'yyyy-mm-dd HH24:MI:SS.ff3')" +
		" AND a.STORE=i.STORE AND a.TERMINAL= i.TERMINAL and a.TRANSNUM = i.TRANSNUM and a.DAY=i.DAY ";
		List res_ = DBUtil.select(select_, "TPOS_HEADER a, TPOS_ITEMENTRY i", where_, TPOS_ITEMENTRY_Imp.class, ApplicationResources.GR_DB);
		return res_;
	}

}
