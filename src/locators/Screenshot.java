package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Screenshot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		//typecast the driver
		TakesScreenshot ts = (TakesScreenshot)driver;
		//use getscreenshotAs() - helps to take ss
		File src = ts.getScreenshotAs(OutputType.FILE);
		//create object for file class
		File dest = new File("C:\\Users\\admin\\Desktop\\gogle.png");
		//move the file from source to destination
		Files.copy(src, dest);
	
		
		
	}

}
