package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Selfpractparameterisation {
	@Parameters({"a"})
	@Test
	public void test(String a)
	
	{
	System.out.println(a);	
	}

}
