package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassertion {
	WebDriver driver;
	@BeforeTest
		
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
		}
	@Test
	public void test1()
	{
		String actualTitle=driver.getTitle();
		String expTitle="facebook";
		Assert.assertEquals(actualTitle, expTitle,"title failed");
		System.out.println("hello");
	}
	

}
