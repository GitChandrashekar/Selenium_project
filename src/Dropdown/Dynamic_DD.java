package Dropdown;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_DD {
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("(//*[@class='gLFyf'])[1]")).sendKeys("AlluArjun");
	
	List<WebElement> listall = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	System.out.println("the total list is : "+listall.size());
	for(WebElement race : listall)
	{
		System.out.println(race.getText());
	}
}
}
