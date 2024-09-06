package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Upload {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test()
	{
		WebElement choosefile=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		choosefile.sendKeys("C:\\Users\\Dell\\Desktop\\Neethu -Resume.docx");
		
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}

}
