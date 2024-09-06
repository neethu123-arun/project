package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfpract8 {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void test1()
	{
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		Boolean logodisplay=logo.isDisplayed();
		if(logodisplay)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	@Test
	public void test2()
	{
		WebElement radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
		Boolean radiobutton=radio.isSelected();
		if(radiobutton)
		{
			System.out.println("radiobutton is selected");
		}
		else
		{
			System.out.println("radiobutton is not displayed");
		}
	}
	@Test
	public void test3()
	{
		WebElement create=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		Boolean createbutton=create.isEnabled();
		if(createbutton)
		{
			System.out.println("createaccountbutton is enabled");
		}
		else
		{
			System.out.println("createaccountbutton is not enabled");
		}
	}
	
	}
	

