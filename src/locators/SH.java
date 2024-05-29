package locators;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SH {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
JavascriptExecutor jse = (JavascriptExecutor)driver;
	}

}
