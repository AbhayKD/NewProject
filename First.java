package com.Abhay.Practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class First {
/*SUT- System Under Test*/
	@Test
	public void test(){
		Calc obj = new Calc();
		assertEquals(25,Calc.square(5));
		assertEquals(36,Calc.square(6));

	}

}
