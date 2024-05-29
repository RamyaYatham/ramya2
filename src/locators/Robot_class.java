package locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_class {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		//create object for robot class
		Robot r= new Robot();
		//pagedown
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//pagedown
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
	}

}
