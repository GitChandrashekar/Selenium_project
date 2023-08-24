package handling_Multiple_Windows;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class Found_It_Page_task {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in");
		
		String Curr_Win = driver.getWindowHandle();
		System.out.println("the window name is : "+Curr_Win);
		
		driver.findElement(By.xpath("//*[@class='addPrimaryTextColor']")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("googleSignIn")).click();
		Thread.sleep(1500);
		Set<String> Total_WebElements =  driver.getWindowHandles();
		System.out.println("the total opened windows are : "+Total_WebElements.size());
		System.out.println("the opened windows names are : "+Total_WebElements );
		for(String Child1 : Total_WebElements)
		{
			if(!(Curr_Win==Child1))
			{
				driver.switchTo().window(Child1);
			}
		}
		Thread.sleep(1500);
           driver.findElement(By.id("identifierId")).sendKeys("chandrashekar");
           
           TakesScreenshot Ts22 = (TakesScreenshot) driver;
           File Souce_Win = Ts22.getScreenshotAs(OutputType.FILE);
           File Dest_Win = new File("C:\\Users\\Govinduramalakshmi\\OneDrive\\Desktop\\Screenshots\\Multi_Window.png");
           Files.copy(Souce_Win, Dest_Win);}}
