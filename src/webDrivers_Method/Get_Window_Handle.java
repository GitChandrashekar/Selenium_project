//getWindowHandle()//
package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handle {

	public static void main(String[] args) 
	{
		//getWindowHandle() :- this method is used to fetch the web address of the url page// 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getWindowHandle());

		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com//");
		String Str = driver.getWindowHandle();
		System.out.println("the address is Str : "+Str);
	}

}
//1CA64E809AD080D1213C59A3DCE98E66//