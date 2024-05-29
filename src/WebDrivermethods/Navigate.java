package WebDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigate {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.com");
	}
}
