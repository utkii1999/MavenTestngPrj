package kpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestThree {
	
	
	@Test
	public void test3()
	{
		System.out.println("TEST THREE CLASS TEST THREE");
	}
	
	@AfterTest
	public void testm()
	{
		System.out.println("this will execute after every test module");
	}


	@BeforeSuite
	public void testk()
	{
		System.out.println("This will execute after every before all the classes in the suite");
	}
	
	@AfterSuite
	public void testl()
	{
		System.out.println("This will execute after every after all the classes in the suite");
	}
}
