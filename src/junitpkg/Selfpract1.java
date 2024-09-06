package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfpract1 {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test1()
	{
		String title=driver.getTitle();
		System.out.println("title="+title);
	}
	@Test
	public void test2()
	{
		String pagesrc=driver.getPageSource();
		if(pagesrc.contains("G"
				+ "mail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
	

}
