package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_DD {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new EdgeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
	//click on username text field
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bujji1086");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gautham@8324");
	driver.findElement(By.id("login")).click();
	//select drop down and store in ref variable
	Thread.sleep(5000);
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	//create obj of select class
	Select s =new Select(location);
	//use method of visible text 
	Thread.sleep(2000);
	s.selectByVisibleText("Melbourne");
	Thread.sleep(2000);
	s.selectByIndex(5);
	
}
}
