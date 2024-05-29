package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollHandling {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//login to app
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		//typecast the driver
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		//scroll down
		jse.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(4000);
		//scroll up
		jse.executeScript("window.scrollBy(0,-2000)");
jse.executeScript("window.scrollBy()0,2000");
	}

}
