package practice_Main_Conecpts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import zmq.ZError.IOException;

public class Naukri_Multi_Win {

	public static void main(String[] args) throws IOException, InterruptedException	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
//		Actions Act222 = new Actions(driver);
//		
//		WebElement DD = driver.findElement(By.xpath("(//*[@class='nI-gNb-menuItems__anchorDropdown'])[1]"));
//			Act222.moveToElement(DD).perform();
//		
//			Thread.sleep(1500);
//			
//			WebElement DD1 = driver.findElement(By.xpath("(//*[@class='nI-gNb-menuItems__anchorDropdown'])[2]"));
//			Act222.moveToElement(DD1).perform();
//			
//			Thread.sleep(1500);
//			
//			WebElement DD2 = driver.findElement(By.xpath("(//*[@class='nI-gNb-menuItems__anchorDropdown'])[3]"));
//			Act222.moveToElement(DD2).perform();
		
		String window = driver.getWindowHandle();
		System.out.println("the current window anme is : "+window);
		WebElement Reg = driver.findElement(By.id("register_Layer"));
		Reg.click();
	}

}
