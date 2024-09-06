
	package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Responsecodesdispaly {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test() throws MalformedURLException, URISyntaxException, IOException {
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total no of link="+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verify(link);
		}
		
	}
	private void verify(String link) throws URISyntaxException, MalformedURLException, IOException{ 
	try
	{
		
		
			URI ob=new URI(link);
			HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
			//con.connect();
			if(con.getResponseCode()==200)
			{ 
				System.out.println("success"+link);
			}
			else if(con.getResponseCode()==404)
			{System.out.println("broken link"+link);
			}
	
	}


catch(Exception e)
{
	System.out.println(e.getMessage());}
}
}
