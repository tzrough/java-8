package com.hongfei.focus.lamda;

import org.junit.Test;

public class LamdaTest2 
{

	void strHandler(String s, MyFunction1 f) 
	{
		System.out.println(f.handle(s));
	}
	
	void calculator(int num1, int num2, MyFunction2 f) 
	{
		System.out.println(f.calculate(num1, num2));
	}
	
	@Test
	public void test1() 
	{
		String s = "  this is a test  ";
		
		strHandler(s, x -> x.trim());
		strHandler(s, x -> x.substring(0, 6));
	}
	
	@Test
	public void test2() 
	{
		int num1 = 6;
		int num2 = 9;
		
		calculator(num1, num2, (x, y) -> x + y);
		calculator(num1, num2, (x, y) -> x * y);
		calculator(num1, num2, (x, y) -> x - y);
		
	}
}
