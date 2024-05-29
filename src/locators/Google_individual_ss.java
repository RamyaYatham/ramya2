package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Google_individual_ss {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		WebElement gmail = driver.findElement(By.xpath("//a[@class='gb_H']"));
		File src = gmail.getScreenshotAs(OutputType.FILE);
		//we have to create destination folder to store the ss
		File dest = new File("C:\\Users\\admin\\Desktop\\ss\\gmail.png");
		Files.copy(src, dest);
		
	}

}
