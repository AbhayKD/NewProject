package com.Abhay.Practice;
import static org.junit.Assert.*;
import org.junit.Test;

public class DataTypes {
	
	@Test
	public void BasicDataTypes(){
		byte b;
		short s;
		int i;
		long l=2;
		
		float f=4.0f;
		double d;
		
		char c = 'A';
		
		boolean isTrue= false;
	}
	@Test
	public void PrintSize(){
		System.out.println();
		System.out.println();
		System.out.println("Size of Primitive Data Types in Java (bits)");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Byte " + Byte.SIZE);
		System.out.println("Short " + Short.SIZE);
		System.out.println("Integer " + Integer.SIZE);
		System.out.println("Long " + Long.SIZE);
		
		System.out.println("Float " + Float.SIZE);
		System.out.println("Double " + Double.SIZE);
		
		System.out.println("Character " + Character.SIZE);
	}
	@Test
	public void PrintMaxAndMin(){
		
		System.out.println();
		System.out.println();
		System.out.println("MAX And MIN values of Primitive Data Types in Java (bits)");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println("Byte " + Byte.MAX_VALUE + "to" + Byte.MIN_VALUE);
		System.out.println("Short " + Short.MAX_VALUE + "to" + Short.MIN_VALUE);
		System.out.println("Integer " + Integer.MAX_VALUE + "to" + Integer.MIN_VALUE);
		System.out.println("Long " + Long.MAX_VALUE + "to" + Long.MIN_VALUE);

		System.out.println("Float " + Float.MAX_VALUE + "to" + Float.MIN_VALUE);
		System.out.println("Double " + Double.MAX_VALUE + "to" + Double.MIN_VALUE);

		System.out.println("Character " + Character.MAX_VALUE + "to" + Character.MIN_VALUE);

	}
	@Test(expected = NumberFormatException.class)
	public void testCreatingOfPrimitiveValuesFromString(){
		boolean isGood = Boolean.parseBoolean("True");
		assertTrue(isGood);
		
		boolean isVeryGood = Boolean.parseBoolean("true");
		assertTrue(isVeryGood);
		
		boolean isVeryVeryGood = Boolean.parseBoolean("1");
		assertFalse(isVeryVeryGood);
		
		int number = Integer.parseInt("11");
		assertEquals(11, number);
		
		int secondNumber = Integer.parseInt("12.5");
		assertEquals(12, secondNumber);
	}
	
	@Test
	public void testBasicCharacterMethods(){
		assertTrue(Character.isDigit('1'));
		assertFalse(Character.isDigit('A'));
		assertTrue(Character.isLetter('A'));
		assertFalse(Character.isLetter(';'));
	}

}


