package kpack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFour {
	
	@Test
	public void test4()
	{
		System.out.println("TEST FOUR CLASS TEST FOUR");
	}
	
	@BeforeTest
	public void testm()
	{
		System.out.println("this will execute before every test module");
	}


}
