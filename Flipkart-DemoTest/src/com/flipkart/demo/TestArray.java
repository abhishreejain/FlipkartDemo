/**
 * 
 */
package com.flipkart.demo;

/**
 * @author ABHI SHREE JAIN
 *
 */
public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array of primitive type
		int arrayOfInt[] = new int[] {2, 3, 5};
		for(int i=0;i<arrayOfInt.length;i++)
		{
			System.out.println("the"+i+"element has value"+arrayOfInt[i]);
		}
		
		String names[] = new String[] {"aaa","bbb","ccc"};
		for(int i=0;i<names.length;i++)
		{
			System.out.println("the"+i+"element has value"+names[i]);
		}
	}

}
