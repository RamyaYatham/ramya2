package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelements {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");
	// write x apth of gmail and store in reference variable 
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	//create object of actions class
	Actions a = new Actions(driver);
	//use the method 
	a.moveToElement(gmail).perform();
	
	
}
}
