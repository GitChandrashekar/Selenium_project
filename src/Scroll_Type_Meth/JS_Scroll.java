package Scroll_Type_Meth;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class JS_Scroll {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		//Edit from the github//
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");

		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		
		WebElement ele = driver.findElement(By.xpath("//*[@class='nav-logo-base nav-sprite']"));
	
		jsp.executeAsyncScript("arguments[0].scrollIntoView();",ele);
		Thread.sleep(2000);
		TakesScreenshot amaScrnShot = (TakesScreenshot) driver;
		File Ama_src = amaScrnShot.getScreenshotAs(OutputType.FILE);
//		File Ama_Dest = new File("D:\\For_Selenium\\My_Selenium_First_project\\src\\Screenshots\\Amapic.png");
		File Ama_Dest = new File("C:\\Users\\Govinduramalakshmi\\OneDrive\\Desktop\\Screenshots\\Amapic.png");
		Files.copy(Ama_src, Ama_Dest);
		
	}
}
//close-fixedban
