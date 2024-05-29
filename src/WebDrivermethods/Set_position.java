package WebDrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Set_position {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		//set the position of browser window
		Point p =new Point(100, 200);
		driver.manage().window().setPosition(p);
	}

}
