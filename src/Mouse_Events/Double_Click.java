package Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	driver.manage().window().maximize();
	
	Actions Act_DD_Click = new Actions(driver);
	WebElement DD_ele = driver.findElement(By.xpath("(//*[@class='RNmpXc'])[2]"));
	Act_DD_Click.doubleClick(DD_ele).perform();
	

	}

}
//(//*[@class='gNO89b'])[2]