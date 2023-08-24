package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_RadioBtns {

	public static void main(String[] args) throws Exception
	{	
     WebDriver driver = new ChromeDriver();
     driver.get("https:/demoqa.com/automation-practice-form");
     
//radio button 1 
driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]")).click();
Thread.sleep(2200);
//radio button 2
driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[2]")).click();
Thread.sleep(2200);
//radio button 3
driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[3]")).click();
Thread.sleep(2200);
     
List<WebElement> lisst = driver.findElements(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])")); 
     System.out.println(lisst.size());
	}

}
