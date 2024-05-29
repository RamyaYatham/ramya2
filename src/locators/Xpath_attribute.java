package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_attribute {
public static void main(String[] args) {
	WebDriver driver =new EdgeDriver();
	driver.get("https://www.facebook.com");
	//X-path by attribute
	//enter email id 
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ryatham@gmail.com");
	//password
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("@1234");
    //login button
	driver.findElement(By.xpath("//button[@name='login']")).click();
	//Xpath by visible text
    //forgot password
driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
}
}
