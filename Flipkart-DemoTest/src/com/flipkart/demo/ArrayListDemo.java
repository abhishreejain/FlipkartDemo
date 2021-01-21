/**
 * 
 */
package com.flipkart.demo;

import java.util.ArrayList;
import java.util.List;

import com.flipkart.bean.Customer;

/**
 * @author ABHI SHREE JAIN
 *
 */
public class ArrayListDemo  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = new ArrayList<String>();
//		List<Customer> customer = new ArrayList<Customer>();
		
		System.out.println("Size of this collection " + l1.size());
		l1.add("Hello");
		l1.add("world");
		l1.add("wrong");
		System.out.println("Size of this collection " + l1.size());
		l1.remove("Hello");
		System.out.println("Size of this collection " + l1.size());
		
		for(String value: l1) {
			System.out.println("element is " +value);

		}
		
	}

}
