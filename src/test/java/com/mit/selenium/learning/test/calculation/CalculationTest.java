package com.mit.selenium.learning.test.calculation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mit.selenium.learning.calculation.Calculation;

public class CalculationTest {
	
	Calculation c = new Calculation();
	
	@Test(priority=1)
	public void additionTest(){
		int sum = c.addition(2, 2);
		System.out.println(sum);
		Assert.assertEquals(4, sum );
	}
	@Test(priority=2)
	public void SubtractionTest(){
		int sub = c.subraction(5, 3);
		System.out.println(sub);
		Assert.assertEquals(2, sub );
	}
	@Test(priority=3)
	public void multiplicationTest(){
		int diff = c.multiplication(3, 5);
		System.out.println(diff);
		Assert.assertEquals(15, diff );
	}
	@Test(priority=4)
	public void divisionTest(){
		int div = c.divide(10, 2);
		System.out.println(div);
		Assert.assertEquals(5, div );
	}
}
