package WebDrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Set_size {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.com");
	//set size
	Dimension d = new Dimension(500,400);
	driver.manage().window().setSize(d);
	

	

	
}
}
