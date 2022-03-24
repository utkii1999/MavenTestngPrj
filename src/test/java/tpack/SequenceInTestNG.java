package tpack;

import org.testng.annotations.Test;

//By default runs in alphabetical order
// we can set priority by using priority attribute

public class SequenceInTestNG {
	@Test(priority=1)
	public void RegisterPage()
	{
		System.out.println("You are on registration page");
		
	}
	
	@Test(priority=3)
	public void LogInPage()
	{
		System.out.println("You are on login page");
		
	}
	
	
	@Test(priority=2)
	public void HomePage()
	{
		System.out.println("You are on home page");
		
	}
	

}
