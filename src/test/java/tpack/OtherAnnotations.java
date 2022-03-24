package tpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OtherAnnotations {

//	@BeforeClass
//	public void testChrome() {
//		System.out.println("Launching chrome browser");
//	}
//
//	@AfterClass
//	public void testChromeClosure() {
//		System.out.println("Close chrome browser");
//	}

		@BeforeMethod
		public void testChrome()
		{
			System.out.println("Launching chrome browser");
		}
		
		@AfterMethod
		public void testChromeClosure()
		{
			System.out.println("Close chrome browser");
		}

	@Test(priority = 1)
	public void testRegisterPage() {
		System.out.println("You are on registration page");

	}

	@Test(priority = 2)
	public void testLogInPage() {
		System.out.println("You are on login page");

	}

	@Test(priority = 3)
	public void testHomePage() {
		System.out.println("You are on home page");

	}

}
