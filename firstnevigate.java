package Nevigations;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstnevigate {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
	
	//	driver.navigate().to("https://www.myntra.com/");
		
		URL lik =new URL("https://www.myntra.com/");
		 driver.navigate().to(lik);
		 driver.navigate().back();
		 
		 driver.navigate().forward();
		  
		 driver.navigate().refresh();
		 
		 
		 
		
		

	}

}
