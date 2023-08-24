package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_TextBoxes {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:/demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Chandhu");
		Thread.sleep(2200);

		driver.findElement(By.id("lastName")).sendKeys("shekar");
		Thread.sleep(2200);

		driver.findElement(By.id("userEmail")).sendKeys("shekar@gmial.com");
		Thread.sleep(2200);
		
		driver.findElement(By.id("userNumber")).sendKeys("9902455850");
		Thread.sleep(2200);

	}

}
