package KeyBoardsEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOnFb {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("email"));
		
		Actions a1=new Actions(driver);
		 a1.moveToElement(e1).click().sendKeys("pushkar")
		.doubleClick().keyDown( Keys.TAB).sendKeys("swapnnil")
		.keyDown(e1, Keys.ENTER).keyDown(Keys.TAB).click().perform();

	}

}
