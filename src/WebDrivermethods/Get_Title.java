package WebDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_Title {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.myntra.com");
	//get the title of page
	 String t=driver.getTitle();// return type - string
	 System.out.println(t);
	 
}
}
