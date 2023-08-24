package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Source {

	public static void main(String[] args)
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.com/");
     System.out.println( driver.getPageSource());
     
     driver.get("https://google.com");
     String Code = driver.getPageSource();
     System.out.println("the page source is : "+Code);

	}

}
