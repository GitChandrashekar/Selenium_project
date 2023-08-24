//getTitle method//
package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String Title = driver.getTitle();
		System.out.println("the page title is : "+Title);
		
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());

	}

}
