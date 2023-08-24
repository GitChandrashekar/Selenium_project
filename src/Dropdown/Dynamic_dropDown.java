package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropDown {

	public static void main(String[] args) throws Exception
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Alluarjun");
	Thread.sleep(3000);
	List<WebElement> elementsize = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
	
		 System.out.println("the total count is : "+elementsize.size());
		 
		 for(int i=0;i<elementsize.size();i++)
		 {
			 if(elementsize.get(i).getText().contains("Alluarjun movies"))
			 {
				 elementsize.get(i).click();
				 break;
			 }
		 }
		 
		 

	}

}
//driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Chandhu");
//Thread.sleep(3000);
//List<WebElement> elementsize = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
//
//
//	 System.out.println("the total count is : "+elementsize.size());
//	 
//	 for(WebElement AllEle : elementsize)
//	 {
//		 System.out.println(AllEle.getText());
//	 }
