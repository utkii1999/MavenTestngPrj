package opack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTwo {
	
	@Test
	public void test2()
	{
		System.out.println("TEST TWO CLASS TEST TWO");
	}

	@BeforeTest
	public void testm()
	{
		System.out.println("this will execute before every test module");
	}

}
