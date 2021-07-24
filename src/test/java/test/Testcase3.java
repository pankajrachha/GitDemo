package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase3 {
	
	@BeforeTest
	public void bf3()
	{
		System.out.println("before test 3");
	}
	@Test 
	public void HomeLoan3()
	{
		System.out.println("HomeLoan TestCase 3");
	}
	
	@Test 
	public void Demo3()
	{
		System.out.println("Demo TestCase 3");
	}
	
	@Test 
	public void UAT3()
	{
		System.out.println("UAT TestCase 3	");
	}

	
}
