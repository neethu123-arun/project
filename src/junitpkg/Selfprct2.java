package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfprct2 {
	ChromeDriver driver;
	@Before
	public void SetUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
		}
	@Test
	public void test1() throws Exception
	{
		Thread.sleep(30);
		driver.findElement(By.id("email")).sendKeys("neethuarun@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("neethu1235");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
