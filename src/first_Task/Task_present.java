package first_Task;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task_present {
	public static void main(String[] args) throws Exception
	{
//1.Case//		
WebDriver driver = new ChromeDriver();
//2.Case//
driver.manage().window().maximize();
//3.Case//
driver.get("https://www.google.com");
//4.case//
driver.navigate().to("https://www.pixabay.com");
//5.case//
System.out.println("Pixabay title : "+driver.getTitle());
//6.case//
System.out.println("Pixabay site url : "+driver.getCurrentUrl());
//7.case//
System.out.println("Pixabay site Window Address : "+driver.getWindowHandle());
//8.case//
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.ajio.com");
////9.case//
List<WebElement> countt = driver.findElements(By.tagName("input"));
System.out.println("the total webelement (inputs tags) size is "+countt.size());
//10.case//
driver.close();
//11.case//
Thread.sleep(3000);
//12.Case//
driver.quit();
	}
}