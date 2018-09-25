package com.hongfei.focus.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

import sun.net.www.content.audio.x_aiff;

/**
 *
 *
 *
 */
public class LamdaTest1 {
	
	@Test
	public void test1() 
	{
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello Lamda");
			}
		};
		
		r1.run();
		
		Runnable r2 = () -> System.out.println("Hello Lamda");
		
		r2.run();
	}
	
	
	@Test
	public void test2() 
	{
		Consumer<String> consumer = (x) -> System.out.println(x);
		
		consumer.accept("Hello Lamda");
	}
	
	
	@Test
	public void test3() 
	{
		Consumer<String> consumer = x -> System.out.println(x);
		
		consumer.accept("Hello Lamda");
		
	}
	
	@Test
	public void test4() 
	{
		Comparator<Integer> comparator = (x,y) ->
		{
			System.out.println("Functional Interface");
			return Integer.compare(x, y);
		};
	}
	
	@Test
	public void test5() 
	{
		Comparator<Integer> comparator = (x,y) -> Integer.compare(x, y);
	}
	
	
	@Test
	public void test6() 
	{
		String[] strs = {"a", "b", "c"};
		
		List<String> list = new ArrayList<>();
	}
	
	@Test
	public void test7() 
	{
		Integer num = operation(100, x -> x * x);
		System.out.println(num);
		
		System.out.println(operation(200, y -> y + 200));
	}
	
	public Integer operation(Integer num, MyFunc function) 
	{
		return function.getVal(num);
	}
}
