package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL_Meth {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.get("https://www.amazon.com");
		
		//How to get current webpage url?//
		//--by using the getCurrentUrl()//
		
		String url = driver.getCurrentUrl();
          System.out.println("the current page URL is = "+url);
		
//		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
