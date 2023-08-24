package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_With_Edge {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
	}

}
