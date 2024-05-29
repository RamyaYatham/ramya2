package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class X_pathby_groupindex {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		//user name
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("standard_user");
		//password
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("secret_sauce");
		//login
		driver.findElement(By.xpath("(//input)[3]")).click();
	}

}
