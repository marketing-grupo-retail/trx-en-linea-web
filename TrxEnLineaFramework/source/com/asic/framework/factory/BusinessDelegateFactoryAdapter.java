package com.asic.framework.factory;

import com.asic.framework.exception.ServiceException;


/**
 * Project: ITSO PiggyBank Application
 * 
 * The BusinessDelegateFactory is used to create the implementation
 * instance of the PiggyBank business delegate factory.
 *  
 * @author markus.meser@ch.ibm.com
 */
public abstract class BusinessDelegateFactoryAdapter extends BusinessDelegateFactory_Imp implements AbstractBusinessDelegateFactory {


	/**
	 * Constructor for BusinessDelegateFactory.
	 */
	private BusinessDelegateFactoryAdapter() {
		super();
	}
	
	public AbstractBusinessDelegateFactory getServiceDelegate(){
		return (AbstractBusinessDelegateFactory) delegateFactory;
	}


	/**
	 * Returns business delegate factory instance.
	 * 
	 * @return <code>AbstractBusinessDelegateFactory</code> the delegate factory instance.
	 * @exception <code>ServiceException</code> is thrown if error on factory initialization occures.
	 */
	public static AbstractBusinessDelegateFactory getInstanceImp() throws ServiceException{		
		return (AbstractBusinessDelegateFactory)getInstance();	
	}	

}
