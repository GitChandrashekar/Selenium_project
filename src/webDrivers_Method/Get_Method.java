package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {

	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");  //using get method we can launch the webpages//
	
	}

}
