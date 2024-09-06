package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class Junitpgm4 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test() {
	List<WebElement> li=driver.findElements(By.tagName("a"));
	System.out.println("total no of link="+li.size());
	//normal for loop
	//for(int i=0;i<li.size();i++){
	//	WebElement element=li.get(i);
	//	String link=element.getAttribute("href");
	//	String linktext=element.getText();
		
	//	System.out.println("link="+link+"--------"+linktext);
//	}
		//foreachloop
	
	for(WebElement ele:li)
	{
		String link=ele.getAttribute("href");
		String text=ele.getText();
		System.out.println("link="+link+"--------"+text);
	}
	
	}
	
	
}
