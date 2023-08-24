//close and quit method//
package webDrivers_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quit {

	public static void main(String[] args) throws Exception 
	
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/"); //opens the google driver//
		
		Thread.sleep(3000);  //after 3 second//
		driver.switchTo().newWindow(WindowType.TAB);  //switches to //
		driver.get("https://www.amazon.com/");        //amazon site//
		Thread.sleep(3000);
//		driver.close();
		driver.quit();                     //google and remaining all tabs/windows will be closed//
		
		
		

	}

}
