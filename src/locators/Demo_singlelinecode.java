package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_singlelinecode {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//login operations using keys class
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	}

}
