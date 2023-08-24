package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_Practice {
public static void main(String[] args) throws Exception
{
	WebDriver driver = new ChromeDriver();
	driver.get("https:/demoqa.com/automation-practice-form");
	
//	WebElement ele = driver.findElement(By.id("firstName"));
//	ele.sendKeys("Chandhu");
	
	//textfields handle//
driver.findElement(By.id("firstName")).sendKeys("Chandhu");
Thread.sleep(2200);

driver.findElement(By.id("lastName")).sendKeys("shekar");
Thread.sleep(2200);

driver.findElement(By.id("userEmail")).sendKeys("shekar@gmial.com");
Thread.sleep(2200);

//Radio buttons handle//
driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[1]")).click();
Thread.sleep(2200);

driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[2]")).click();
Thread.sleep(2200);

driver.findElement(By.xpath("(//div[@class='custom-control custom-radio custom-control-inline'])[3]")).click();
Thread.sleep(2200);

driver.findElement(By.id("userNumber")).sendKeys("9902455850");
Thread.sleep(2200);


//chechbox handles //
driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])(1)")).click();
Thread.sleep(2200);

driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])(2)")).click();
Thread.sleep(2200);

driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])(3)")).click();
Thread.sleep(2200);

//handlin submit button//
Thread.sleep(2100);
driver.findElement(By.id("submit")).submit();

}
}
//(//input[@class=custom-control-input])[1]