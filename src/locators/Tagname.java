package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tagname {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		//using tag name
		driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
	}

}
