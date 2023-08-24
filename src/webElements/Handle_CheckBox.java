package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_CheckBox {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
	     driver.get("https:/demoqa.com/automation-practice-form");
	     
	     driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])(1)")).click();
	     Thread.sleep(2200);
	     driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])(2)")).click();
	     Thread.sleep(2200);
	     driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox custom-control-inline'])(3)")).click();
	     Thread.sleep(2200);

	}

}
