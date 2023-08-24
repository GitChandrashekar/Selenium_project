//isSelected()//
package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay_Meth {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://google.com");
		
		List<WebElement> totalEle = driver.findElements(By.tagName("a"));
		System.out.println("the total number of links in the page is "+totalEle.size());
		System.out.println("--------*----------*");
		for(int i=0;i<totalEle.size();i++)
		{
			System.out.println(totalEle.get(i).getText());
		}
		
		System.out.println("--------*----------*");
		
		WebElement img = driver.findElement(By.tagName("img"));
		boolean ImageTag = img.isDisplayed();
		System.out.println("the img tag display status is :"+ImageTag);
		
//		WebElement gmail = driver.findElement(By.xpath("//a[@class='gb_v'][1]"));
//		boolean gMaill = gmail.isSelected();
//		System.out.println("status of gamil selected :"+gMaill);
//		
//	
//		gmail.click();
//		
//		Thread.sleep(2000);
//		boolean Gmail1 = gmail.isSelected();
//		System.out.println("status of gamil selected :"+Gmail1);
		
		WebElement SignIn =driver.findElement(By.className("gb_oa gb_ld gb_Nd gb_le"));
		boolean checkIndia = SignIn.isSelected();
		System.out.println("the status before selecting the India : "+checkIndia);
		
		SignIn.click();
		
		boolean CheckIndia1 = SignIn.isSelected();
		System.out.println("the status after selecting the India : "+CheckIndia1);
		
		
		
		
		
		
	}
	}
//a[@class='gb_v'][1]
