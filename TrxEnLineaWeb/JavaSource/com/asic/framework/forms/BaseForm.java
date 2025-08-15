/* 
 * Created on Sep 1, 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.asic.framework.forms;

import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorForm;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.BusinessDelegateFactoryAdapter;
import com.asic.framework.vo.GenericVO;

/**
 * @author db2admin
 *
 */
public class BaseForm extends ValidatorForm {
	
	protected GenericVO vo = null;
	private String atributo = null;
	private List results=null;
    
	/**
	 * @return
	 */
	public GenericVO getVO() {
		return vo;
	}
	
	public void setVO( GenericVO pVo ) {
		this.vo = pVo;
	}
	
	protected Object getVO(Class pClass) throws ServiceException {
    	
		return BusinessDelegateFactoryAdapter.getInstanceImp()
											 .createVOBusinessDelegate()
											 .getInstance(pClass);
    
	}	

	/**
	 * @return
	 */
	public List getResults() {
		return results;
	}

	/**
	 * @param list
	 */
	public void setResults(List list) {
		results = list;
	}

	/**
	 * @return
	 */
	public String getAtributo() {
		return atributo;
	}

	/**
	 * @param string
	 */
	public void setAtributo(String string) {
		atributo = string;
	}

}
