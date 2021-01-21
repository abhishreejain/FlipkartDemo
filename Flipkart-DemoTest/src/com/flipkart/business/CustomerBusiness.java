/**
 * 
 */
package com.flipkart.business;

import java.io.*;
import java.util.*;

import org.apache.log4j.Logger;

import com.flipkart.bean.Customer;

/**
 * @author ABHI SHREE JAIN
 *
 */
public class CustomerBusiness{
	
	private static Logger logger = Logger.getLogger(CustomerBusiness.class);
	
    Customer customers[] = new Customer[3];
    List<Customer> customersobj = new ArrayList<Customer>();
		// 
	public String createCustomer(){
			
		
		// Implementation later one 
		logger.info("<--- print Customer Details--->");

		 // Insert the Customer values in Array. 
	       
		 logger.debug("customer created");
		 
		 
	     Customer customer1 = new Customer();
	     Customer customer2 = new Customer();
	     Customer customer3 = new Customer();
			
			customer1.setCustomerId(101);
			customer1.setCustomerName("Avinash");
			customer1.setAddress("Goa");
			customersobj.add(customer1);
			
			customer2.setCustomerId(102);
			customer2.setCustomerName("Ritwik");
			customer2.setAddress("Bangalore");
			customersobj.add(customer2);
			
			customer3.setCustomerId(103);
			customer3.setCustomerName("Rimjhim");
			customer3.setAddress("Pune");
			customersobj.add(customer3);
			return "create Customer";
	
	}
	

     public boolean deleteCustomer(int customerID)
     {
         
         for(int i=0; i<customersobj.size(); i++) 
         {
        	Customer customerDel = customersobj.get(i);
        	if(customerDel.getCustomerId() == customerID)
        	{
        		customersobj.remove(i);
        	}
         }
         logger.info("Deleted Customer");
         return true;
     }
	
	
	 public String updateCustomer(Customer customer){
		logger.info("in Update Customer Method");
		 
		 //present details
		 for(Customer  cust : customers)
		 {				
			 logger.info("details of Customer--> " +cust.getCustomerId() + "" +cust.getCustomerName()+ "" +cust.getAddress());
		}
		 
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 
		 for(int i=0; i<customersobj.size(); i++) 
         {
        	Customer customerUpdate = customersobj.get(i);
        	if(customerUpdate.getCustomerId() == customer.getCustomerId())
        	{
        		logger.info("Enter customer name to be updates");
        		System.out.println("Enter customer name to be updates");
        		try {
					customerUpdate.setCustomerName(reader.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
         }
	 
         logger.info("Customer updated");
		 
	        return "Update Customer" + "" +customer.toString(); 
	        
	 }

	 
	 
	 public String listCustomer(){
		 
		 
		// List Customer Method here  
		 
		 logger.info("list customer Impl -->");
		 
		    // List Customer Logic
		   	for(Customer  cust : customers){
				//System.out.println("details of Customer-->" +cust.getCustId() + "" +cust.getCustName()+ "" +cust.getAddress());
				
		   		logger.info("details of Customer--> " +cust.getCustomerId() + "" +cust.getCustomerName()+ "" +cust.getAddress());
			}
	 
	  return "print Customer List";
	 }
	 
	 
}