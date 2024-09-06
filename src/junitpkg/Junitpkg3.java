package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpkg3 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbutton.sendKeys("mobilephones",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[1]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/span")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
		//driver.navigate().back();
		
			

		
	}
	

	
	
}
