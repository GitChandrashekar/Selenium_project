
//isDisplayed() //

package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Display {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
//		1.the total number of links in the Webpage/
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		int Links_count = Links.size();
		System.out.println("the total number links is : "+Links_count);
		
		
		//2.Get the actual texts of all the links
		for(int i=0;i<Links_count;i++)
		{
			System.out.println("the "+i+"th link text is :"+Links.get(i).getText());
		}

		//3.Count the number of visible links
//		first Way :-
//		int DispalyLinkCount=0;
//		int nonDisplayLinkCount=0;
//		for(int i=0;i<Links_count;i++)
//		{
//			if(Links.get(i).isDisplayed())
//			{
//				DispalyLinkCount++;
//			}
//			else 
//			{
//				nonDisplayLinkCount++;
//			}			
//		}
//		System.out.println("the total number of visible links is : "+DispalyLinkCount);
//		System.out.println("the total number of non visible links  is : "+nonDisplayLinkCount);
		
//		Second way:-
		int Count=0;
		for(int i=0;i<Links_count;i++)
		{
			if(Links.get(i).isDisplayed())
			{
				Count++;
			}
		}
		int VisibleLinks = Count;
		System.out.println("the visible links are : "+VisibleLinks);
		
		int NonVisibleLinks = Links_count - VisibleLinks;
		System.out.println("the total number of invisible links : "+NonVisibleLinks);
	}

}
