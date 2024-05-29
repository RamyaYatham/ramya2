package Actions;
//used to perform mouse related actions

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
ramya 
	selenium
	testing
public class Click {
	ksajhjshjka
	skjdsajhdjadkja
	74586385
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");
	//write x path of element and store in ref variable
	WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	//create object for actions class
	Actions a = new Actions(driver);
	a.moveToElement(gmail).click().perform();//perform method is mandatory class for all the action classes to perform any action
}

}



































