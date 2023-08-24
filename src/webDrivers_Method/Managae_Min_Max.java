package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managae_Min_Max {

	public static void main(String[] args)  throws Exception
	
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://amazon.com//");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		
		

	}

}
