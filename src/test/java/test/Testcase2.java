package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {
	
	@BeforeTest
	public void bf2()
	{
		System.out.println("before test 2");
	}
	@Test 
	public void HomeLoan2()
	{
		System.out.println("HomeLoan TestCase2");
	}
	
	@Test 
	public void Demo2()
	{
		System.out.println("Demo TestCase2");
	}
	
	@Test 
	public void UAT2()
	{
		System.out.println("UAT TestCase2");
	}

	
}
