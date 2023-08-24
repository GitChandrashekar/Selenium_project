package Selenium_Wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		1.implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/progress-bar");
		
		driver.findElement(By.id("startStopButton")).click();
		
//		Thread.sleep(15000);   //it is waiting temporarily based on the loading view//
		
		driver.findElement(By.id("resetButton")).click();

	}

}
