package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class makeawish {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://make-a-wish.my.salesforce-sites.com/?chid=100-000");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		
}
}
