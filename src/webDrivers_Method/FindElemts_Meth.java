package webDrivers_Method;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemts_Meth {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		//finding the total number of links in the site//
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
//		System.out.println(link.size());
		int linkCount = link.size();
		System.out.println("the total link count is "+linkCount);
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("the total number of img tags are :"+image.size());
		
		List<WebElement> inputCount = driver.findElements(By.tagName("input"));
		System.out.println("the total number of input tags are :"+inputCount.size());
		
		

	}

}
