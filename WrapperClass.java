package com.Abhay.Practice;

/**
 * Int i is a primitive data type... As java is an object oriented language
 *O there is class called Wrapper class which can be used to overcome this exception
 * 
 *
 */
public class WrapperClass {
	public static void main(String[] args){
		Integer obj = new Integer(5);			//Here we are using Integer wrapper class whose object is named 'obj'...
		System.out.println(obj);				//Here we are wrapping the value of int  in object hence it is called wrapping...
		
		int j = obj.intValue();					//Here we are assigning value of object to a variable hence this is called unwrapping...
	}

}
