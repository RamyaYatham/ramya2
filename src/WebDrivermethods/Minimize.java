package WebDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Minimize {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.zomato.com");
driver.manage().window().minimize();
}
}
