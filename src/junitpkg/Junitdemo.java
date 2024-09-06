package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
     ChromeDriver driver;//declare chrome driver here otherwise it will terminate in the first method itself

   @Before
   public void setup()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.google.com");
   }
   
   @Test
   public void test1()
   {
	   
	   
	   
  String title =driver.getTitle();
  System.out.println("title="+title);
   }
   @Test
   public void test2()
   {String pagesource=driver.getPageSource();
	
	if(pagesource.contains("Gmail"))
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
