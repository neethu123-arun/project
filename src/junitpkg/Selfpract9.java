package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfpract9 {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void test1() throws Exception
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr,new File("C:\\Users\\Dell\\Desktop//screenshotred.png "));
		
	WebElement checkavailability=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
	File buttonscreenshot=checkavailability.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(buttonscreenshot, new File("C:\\Users\\Dell\\eclipse-workspace\\Webdriverpgm\\src\\screenshot\\reddif.png"));
	
	
	} 
	}



