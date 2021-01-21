/**
 * 
 */
package com.flipkart.app;

import org.apache.log4j.Logger;

import com.flipkart.bean.Customer;
import com.flipkart.business.CustomerBusiness;

/**
 * @author ABHI SHREE JAIN
 *
 */
public class CustomerApp {
	
	private static	Logger logger = Logger.getLogger(CustomerApp.class);
	
	public static void main(String[] args) {
		// Auto-generated method stub
		// Menu creation
		// Create data for bean interaction
		
		CustomerBusiness business = new CustomerBusiness();
		
		
		logger.info(business.createCustomer());
		logger.info(business.deleteCustomer(101));
        
		logger.info(business.updateCustomer(new Customer()));
		logger.info(business.listCustomer());

	}
	
}
