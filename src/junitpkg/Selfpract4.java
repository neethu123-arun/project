package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfpract4 {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
		
	}
	@After
	public void tearDoown()
	{
		driver.quit();
	}
	

}
