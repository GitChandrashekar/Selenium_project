//getWindowHandles() //

package webDrivers_Method;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Win_Hdles {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.pixaby.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.tree.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fab.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.Maaza.com");
		
		Set<String> Windows = driver.getWindowHandles();
//		System.out.println(Windows.size());               // prints the total windows opened Size//
		System.out.println(driver.getWindowHandles().size());
		
		//to get the address of the all the windows//
		for(String Window : Windows)
		{
			System.out.println("All opened URL's Address : "+Window);
		}
		

	}

}
