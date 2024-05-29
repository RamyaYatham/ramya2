package WebDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_pagesource {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		//get page source method
		 String source=driver.getPageSource();
		 System.out.println(source);
		
	}

}
