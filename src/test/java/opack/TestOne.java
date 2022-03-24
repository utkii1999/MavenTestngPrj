package opack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {
	
	@Test
	public void test1()
	{
		System.out.println("TEST ONE CLASS TEST ONE");
	}

	@AfterTest
	public void testm()
	{
		System.out.println("this will execute after every test module");
	}

}
