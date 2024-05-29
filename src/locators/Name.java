package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Name {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		//using name
	driver.findElement(By.name("email")).sendKeys("abc@123456");//email address
	driver.findElement(By.name("pass")).sendKeys("3456");//password
	
	}

}

