//Mesho task//
package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meshoo_pblm {
	
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.meesho.com//");
	
	WebElement element1 = driver.findElement(By.xpath("(//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[1]"));
	System.out.println("the text of first element is : "+element1.getText());  
	System.out.println("--------*--------------*-------");
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
	System.out.println("the total count of elements in the navbar is : "+elements.size());
	System.out.println("--------*--------------*-------");
	for(int i=0;i<elements.size();i++)
	{
		System.out.println("the text of "+i+"th element is : "+elements.get(i).getText());
	}
	
}
}
