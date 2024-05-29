package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentication_popup {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium:webdriver@chercher.tech/auth/");
	}

}


