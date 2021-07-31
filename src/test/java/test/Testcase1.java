package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeTest
	public void bf()
	{
		System.out.println("before test ");
		System.out.println("Added test ");
		System.out.println("Master test ");
		
		System.out.println("In Fixed Branch ");
	}
	@Test 
	public void HomeLoan()
	{
		System.out.println("HomeLoan TestCase");
	}
	
	@Test 
	public void Demo()
	{
		System.out.println("Demo TestCase");
	}
	
	@Test 
	public void UAT()
	{
		System.out.println("UAT TestCase");
	}

	
}
