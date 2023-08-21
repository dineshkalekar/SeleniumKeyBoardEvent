package KeyBoardsEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("email"));
		e1.sendKeys("dscsc");
		
		Thread.sleep(3000);
		
		Actions a1=new Actions(driver);
		a1.keyDown(e1, Keys.TAB).sendKeys("sdfas").perform();
		
		
		
		
		

	}

}
