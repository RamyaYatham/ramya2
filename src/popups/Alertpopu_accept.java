package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpopu_accept {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//give customer id 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		//submit
//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//move the control of selenium from webpage to alert pop up page
		Alert alt = driver.switchTo().alert();
		Thread.sleep(4000);
		// click on ok button which is present on pop up page
		alt.accept();
	}
}
