package webElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTextMeth {
	public static void main(String[] args)
	{
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ajio.com");
	
	List<WebElement> elements = driver.findElements(By.className("alignTag"));
	System.out.println("the total count of elements in the navbar is : "+elements.size());
	
	 System.out.println("------------*----------------*------------");
	 
	 System.out.println("the first element's  name is : "+elements.get(0).getText());
	 
	 System.out.println("------------*----------------*------------");
	 
	 for(int i=0;i<elements.size();i++)
	 {
		 System.out.println("The "+i+"th element text is : "+elements.get(i).getText());
	 }
	
	}

}
//li[@class='alignTag']
//driver.get("https://www.ajio.com");