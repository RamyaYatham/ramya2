package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_popup {//accept and get text method
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//give customer id 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		//submit
		kjhjgjj
			6754312
//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//move the control of selenium from webpage to alert pop up page
		Alert alt = driver.switchTo().alert();
		// click on ok button which is present on pop up page
		alt.accept();
		// to get the text present on alert popup page - use get text method
		String text = alt.getText();
		System.out.println(text);
		
	
		

	}

}
