
package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Loginfb {
ChromeDriver driver;

	
	@BeforeTest(alwaysRun=true)
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

    @Parameters({"usern","paswrd"})
    		
	@Test
	public void test(String usernm,String paswrd )
	{
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(usernm);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(paswrd);
	}
}


