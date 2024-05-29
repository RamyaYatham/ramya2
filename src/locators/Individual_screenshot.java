package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Individual_screenshot {//individual element ss
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		//inspect only logo
		WebElement logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		//create object of file class
		File dest = new File("C:\\Users\\admin\\Desktop\\ss\\logo.png");
		Files.copy(src, dest);
		
	}

}
