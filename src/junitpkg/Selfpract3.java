package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfpract3 {
	
		ChromeDriver driver;
		@Before
		public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
			}
		@Test
		public void test1()
		{
			WebElement searchfield=driver.findElement(By.name("q"));
			searchfield.sendKeys("mobilephones",Keys.ENTER);
			//driver.findElement(By.name("btnK")).click();
			}
		}

