package practice_Main_Conecpts;
import java.awt.Desktop.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class IFRAME_tag {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Actions act = new Actions(driver);
		for(int i=0;i<4;i++)
		{
			act.keyDown(Keys.ARROW_DOWN).perform();
		}
//WebElement _1stFrame = driver.findElement(By.xpath("//*[@id='singleframe']"));
driver.switchTo().frame("singleframe");
//driver.switchTo().frame(2);
//System.out.println("the tag name is : "+_1stFrame.getTagName());

WebElement elem = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
elem.sendKeys("Chandhu");
//(//*[@type='text'])[1]

		

       
		
	}

}
