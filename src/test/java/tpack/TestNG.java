package tpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {
	
	@Test
	public void sampleAutomation()
	{
//		---------------PASSED----------------------------


		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("alert1")).click();
		
		//-----------------------fAILED----------------------
//		int a=10/0; //ARITHMETIC ExCEPTION
		
		//---------------------------SKIPPED--------------------------------------------
		
//		int age=5;
//		if(age<18) {
//			throw new SkipException("Age cannot be less than 18-hence skipping this test");
//		}
//		
		
		System.out.println("Sample Test");
		
	}
	
	

}
