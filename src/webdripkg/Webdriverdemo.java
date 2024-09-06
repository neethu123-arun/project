
package webdripkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//open browser
		driver.get("https://www.google.com");//launch application
		String actualtitle=driver.getTitle();
		String expectedtitle="Google";
		System.out.println("title="+actualtitle);
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		driver.quit();//close entire browser
		
		
		

	}

}

