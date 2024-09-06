package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm2 {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void test()
{
	driver.findElement(By.name("q")).sendKeys("picture of flower");	
	WebElement searchbutton=driver.findElement(By.name("q"));
	searchbutton.sendKeys("car",Keys.ENTER);
	
			
	}
@After
public void tearDown()
{
	driver.quit();
	}
}
