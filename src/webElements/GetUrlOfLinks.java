//getAttribute()//

package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlOfLinks {

	public static void main(String[] args)
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com//");
      
      WebElement LinkEle = driver.findElement(By.tagName("a"));
      System.out.println("the a element's link is "+LinkEle.getAttribute("href"));
      
      List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
      for (int i=0;i<TotalLinks.size();i++)
      {
    	  System.out.println(+i+"th tag name is : "+TotalLinks.get(i).getText()
    			  +"and tag link is = "+TotalLinks.get(i).getAttribute("href"));
      }
		
	}

}
