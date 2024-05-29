package WebDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate_features {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);//wait for 5 secs
	    driver.navigate().to("https://www.myntra.com");
	   //go back to google
	    Thread.sleep(5000);
	    driver.navigate().back();
	    //go forward - goes to myntra
	    Thread.sleep(5000);
	    driver.navigate().forward();
		
	}

}
