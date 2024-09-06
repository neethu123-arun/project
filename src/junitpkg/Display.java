package junitpkg;//DISPLAY LOGO OF AN APPLICATION

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {
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
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		Boolean logodisplay=logo.isDisplayed();
		if(logodisplay)
		{System.out.println("logo displayed");
		}
		else {System.out.println("not displayed");
		}
	}
		@Test
		public void test1()
		{
			WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
			Boolean radiobuttonselect=radiobutton.isSelected();
			if(radiobuttonselect)
			{
				System.out.println("radiobutton is selected");
				}
			else
			{
				System.out.println("notselected");
			}
			
			
}
		@Test
		public void buttonEnable()
		{
			WebElement createtaccountbutton=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
			Boolean button=createtaccountbutton.isEnabled();
			if(button)
			{
				System.out.println("button is enabled");
				}
			else
			{
				System.out.println("not enabled");
			}
		}
		
}
