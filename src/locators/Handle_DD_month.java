package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_DD_month {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		//create new account
		driver.findElement(By.xpath("(//a[@ role='button'])[2]")).click();
		//select dd and store in ref variable
		Thread.sleep(5000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//create object of select class
		Thread.sleep(5000);
		Select s =new Select(month);
		//method of select class - visible text
		s.selectByVisibleText("Feb");
		//same for year		
		
		
	}

}