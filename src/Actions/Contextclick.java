package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {//nothing but right click 
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		//write x path of element and store in ref variable
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		//create object for actions class
		Actions a = new Actions(driver);
		a.moveToElement(gmail).contextClick().perform();//perform method is mandtory for all the action classes
	}

}
