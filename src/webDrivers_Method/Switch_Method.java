package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Method {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://myntra.com");
		

	}

}
