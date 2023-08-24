package practice_Main_Conecpts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScriptTimeoutException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class Scroll_JS {

	public static void main(String[] args) throws InterruptedException,ScriptTimeoutException
	{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.pixabay.com/");


WebElement Scroll_Up_To = driver.findElement(By.xpath("//*[@class='licenseButton--2Odkd "
		+ "light--uBcBI textButton--qm98M base--jzyee light--uBcBI']"));

JavascriptExecutor Jsp11 = (JavascriptExecutor) driver;

Jsp11.executeAsyncScript("arguments[0].scrollIntoView();",Scroll_Up_To);

	}

}
