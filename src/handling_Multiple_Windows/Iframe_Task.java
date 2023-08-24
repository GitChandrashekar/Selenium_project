package handling_Multiple_Windows;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;
public class Iframe_Task 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Frames.html");
	String add_win = driver.getWindowHandle();
	 System.out.println("the window address is : "+add_win);
	Actions Act_scroll = new Actions(driver);
	
	for(int i=0;i<3;i++)
	{
		Act_scroll.keyDown(Keys.ARROW_DOWN).perform();
	}
    driver.switchTo().frame("SingleFrame");
    
//    System.out.println("the text is : "+driver.getTitle());
    System.out.println("the address is : "+driver.getWindowHandle());
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("chandrashekar");
	Set<String> totalweb = driver.getWindowHandles();
	System.out.println("the opened windows are : "+totalweb);
	TakesScreenshot Frame_Shot = (TakesScreenshot) driver;
	File Frame_Shot_Src = Frame_Shot.getScreenshotAs(OutputType.FILE);
	File Frame_Shot_Desc = new File("C:\\Users\\Govinduramalakshmi\\OneDrive\\Desktop\\Screenshots\\Frame.png");
	Files.copy(Frame_Shot_Src, Frame_Shot_Desc);
}}


