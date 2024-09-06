package webdripkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverpgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//open browser
		
		driver.get("https://www.google.com");
		String pagesource=driver.getPageSource();
		
		if(pagesource.contains("Gmail"))
		{
			System.out.println("pass");
		}
		
		else
		{
		   System.out.println("fail");
		}
		
		}
		
	}


