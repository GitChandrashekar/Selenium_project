package handling_Multiple_Windows;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_Window {
	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String WinCurrnet1 = driver.getWindowHandle();
		System.out.println("the window title is : "+WinCurrnet1);
		
		
		 driver.findElement(By.id("register_Layer")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@name='google-register']")).click();
		 Thread.sleep(2000);
		 Set<String> totalwebpages = driver.getWindowHandles();
		 System.out.println("the opened current windows total : "+totalwebpages.size());
		 System.out.println("the opened windows address are : "+totalwebpages);
		 
		 for(String Child : totalwebpages)
		 {
			 if(!(WinCurrnet1 == Child) )
			 {
				 driver.switchTo().window(Child);
			 }
		 }
		 
		 driver.findElement(By.id("identifierId")).sendKeys("chandhu");
       
	}

}
