package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ID {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	//using id
	driver.findElement(By.id("email")).sendKeys("ramya@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("ramya");
	}
}

