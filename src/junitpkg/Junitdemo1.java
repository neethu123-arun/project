package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo1 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	
	{
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");//one method
		//WebElement email=driver.findElement(By.id("email"));//othermethd
		//email.sendKeys("abc123@gmail.com");
		   //driver.findElement(By.id("pass")).sendKeys("neery23");
		  //driver.findElement(By.name("login")).click();	
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		email.sendKeys("abc@gmail.com");
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
