package WebDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_URL {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com");
	 String URL=driver.getCurrentUrl();
	 System.out.println(URL);
}
}
