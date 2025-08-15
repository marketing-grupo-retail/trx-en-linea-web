package com.asic.framework.factory;

import com.asic.framework.exception.ServiceException;


/**
 * JDOC Class Def
 *
 * @author $author$
 * @version $Revision: 1.1 $
 */
public interface AbstractBusinessDelegateFactory extends BusinessDelegateFactory {

	public ServiceProvider getService(String pClassName) throws ServiceException;

}
