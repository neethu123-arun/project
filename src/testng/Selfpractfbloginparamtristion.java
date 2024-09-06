package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Selfpractfbloginparamtristion {
	ChromeDriver driver;
	@BeforeTest
	public void SetUp() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Parameters({"email","password"})
	@Test
	public void test(String email,String password) 
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
	}

}
