package Selenium_Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args)
	{
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/progress-bar");
driver.findElement(By.id("startStopButton")).click();

//explicitly waiting by finding a element//
WebDriverWait WWait = new WebDriverWait(driver,Duration.ofSeconds(20));
WWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("resetButton")));
driver.findElement(By.id("resetButton")).click();







	}

}
