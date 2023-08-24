package handling_Multiple_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Find_Type
{
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	
	
//	Actions Act22 = new Actions(driver);
//	
//	for(int i=0;i<6;i++)
//	{
//		Act22.keyDown(Keys.ARROW_DOWN).perform();
//	}
//	1st Type of finding  the iframe window using locator inside the frame method.//
//	driver.switchTo().frame("singleframe");
	
//  2nd type of finding the iframe window using webelement and locatar//
//	WebElement element22 = driver.findElement(By.xpath("//*[@id='singleframe']"));
//	driver.switchTo().frame(element22);

	//3rd type is by using the index number of that iframe tag//
	driver.switchTo().frame(1);
	
	driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("Chandhu");
	
	
	
	
}
}
