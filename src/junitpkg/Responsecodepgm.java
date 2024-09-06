package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;

public class Responsecodepgm {
	String link="https://www.google.com";
	@Test
	public void test() throws URISyntaxException, MalformedURLException, IOException
	{
		URI ob=new URI(link);
		HttpURLConnection con=(HttpURLConnection)ob.toURL().openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{ 
			System.out.println("success"+link);
		}
		else if(con.getResponseCode()==404)
		{System.out.println("broken link"+link);
		}
		
}
	
	

}
