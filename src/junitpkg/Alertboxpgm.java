package junitpkg;//auotomation of popup or alertmessage

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alertboxpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/alert.html");
}
	
@Test

	public void test()
{driver.findElement(By.xpath("//input[@type='button']")).click();
/*Alert a=driver.switchTo().alert();
System.out.println(a.getText());
a.accept();
//a.dismiss();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xy");*/
}
@After
public void tearDown()
{
	driver.quit();
	}
}
