package Selenium_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Load_Time {

	public static void main(String[] args)
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//pageLoading//
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/progress-bar");
		driver.findElement(By.id("startStopButton")).click();
	}

}
