package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfpract6 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/alert.html");
}
	
@Test

	public void test() throws Exception
	{
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText()); 
	a.accept();
	//a.dismiss();
	driver.findElement(By.name("firstname")).sendKeys("neethu");
	driver.findElement(By.name("lastname")).sendKeys("pk");
	driver.findElement(By.xpath("/html/body/input[4]"));
	
	}

}
