package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class SS {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.zomato.com");
	// typecasting the driver
	TakesScreenshot ts = (TakesScreenshot)driver;
	// use the getscreenshotAs() to take ss
	File src = ts.getScreenshotAs(OutputType.FILE);
	// we have to store the ss in particular folder - to give that folder location we create a folder 
	File dest = new File("C:\\Users\\admin\\Desktop\\ss\\zomato.png");
	//to move file from src to dest folder 
	Files.copy(src, dest);
}
}
