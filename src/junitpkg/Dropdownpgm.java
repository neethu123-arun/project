package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
	@Test
	public void test()
	{
		//driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
		WebElement drpdayEle=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select drpday=new Select(drpdayEle);
		drpday.selectByValue("02");
		
		WebElement drpmnthEle=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select drpmnth=new Select(drpmnthEle);
		drpmnth.selectByVisibleText("FEB");
		
		WebElement drpyearEle=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select drpyear=new Select(drpyearEle);
		drpyear.selectByValue("2024");
		
		
}
	@After
	public void tearDown()
	{
		driver.quit();
		}	
}
