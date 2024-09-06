package testng;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rishi {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		
	}
	@Test
	public void test() throws IOException
	{
		//click on health
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		//select dropdown
		
		WebElement dropdownsort=driver.findElement(By.xpath("//*[@id=\"input-sort\"]"));
		Select dropdown=new Select(dropdownsort);
		dropdown.selectByValue("price-asc");
		
		
		//dispalying logo
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"logo\"]/a/img"));
		Boolean logodisplay=logo.isDisplayed();
		if(logodisplay)
		{System.out.println("logo displayed");
		}
		else {System.out.println("not displayed");
		}
		
		
		
		//search for aproduct then add to wishlist
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement searchbutton=driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		searchbutton.sendKeys("Baby");
		
		driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[4]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
		
		
		WebElement agri=driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[7]/a"));
		String name=agri.getText();
		if(name.equalsIgnoreCase("AGRICULTURE"))
		{
			System.out.println("AGRICULURE DISPLYED");
		}
		else
		{
			System.out.println("not displayed");
		}
		File agriscr= agri.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(agriscr, new File("C:\\Users\\Dell\\eclipse-workspace\\Webdriverpgm\\src\\screenshot\\rishi.png"));
		
	

}
}
