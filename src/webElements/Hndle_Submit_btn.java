package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hndle_Submit_btn {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
	     driver.get("https:/demoqa.com/automation-practice-form");
	     
	     Thread.sleep(2100);
driver.findElement(By.id("submit")).submit();
	}

}
