package com.Abhay.Practice;


/**
 * In this practice we are studying about toString method
 * We write a constructor first by declaring the variables
 * Then we pass the values in the object created as the variables are declared in the constructor
 * then we call both the variables individually instead of this we can use toString() method
 * As every class extends to Object so Object class contains a method called toString()
 * this method simply returns the package name along with the hash code of the contents
 * So can simply generate a toString for the variables and print the values instead of calling them individually 
 *
 */
public class StringDemo2 {
	public static void main(String[]  args){
		Student s1 = new Student(11, "Abhay");
		System.out.println(s1.rollno);		
		System.out.println(s1.name);
		System.out.println(s1.toString());
	}

}

class Student{
	int rollno;
	String name;
	
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
}