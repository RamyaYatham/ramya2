package webtables_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class WebTables {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
			driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=jkkhkjh&submit-name=");
//xpath for all headers
			List<WebElement> headers = driver.findElements(By.xpath("//th"));
//print the size of headers i.e how many headers are there
			System.out.println("no of headers:"+headers.size());//+ is concatenation
			//print the text of headers by using for each loop 
			for(  WebElement i:headers) {
			System.out.println(i.getText());
			//xpath for all rows
			List<WebElement> allrows = driver.findElements(By.xpath("//tbody//tr"));
			//size of rows
			System.out.println("no of rows:"+ allrows.size());
			//print all rows data
			for(WebElement j:allrows) {
				System.out.println(j.getText());
			}
	
}
}
}
