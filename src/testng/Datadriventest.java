package testng;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;
@BeforeTest
	
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
@Test
public void test() throws IOException
{
	
	FileInputStream f=new FileInputStream("C:\\Users\\Dell\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("sheet1");
	int r=sh.getLastRowNum();
	for(int i=1;i<=r;i++)
	{
		
		String email=sh.getRow(i).getCell(0).getStringCellValue();
		String password=sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("email="+email+"------"+"password="+password);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		//driver.navigate().refresh();
		/*String actualurl=driver.getCurrentUrl();
		String expurl="https://www.facebook.com/home";
		if(actualurl.equals(expurl)) {
			System.out.println("pass");
			
		}else
		{
			System.out.println("fail");
		}*/
		
		
	}
	}
		
	
	}


