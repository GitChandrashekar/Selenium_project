package alert_Concept;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
public class Alert_Task {
	public static void main(String[] args) throws InterruptedException, IOException
	{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.automationtesting.in/Alerts.html");

WebElement element11 = driver.findElement(By.xpath("//*[@onclick='alertbox()']"));
element11.click();
Thread.sleep(2000);
String Msg11 = driver.switchTo().alert().getText();
System.out.println("the Msg11 text is : "+Msg11);
driver.switchTo().alert().accept();
Thread.sleep(3000);

WebElement element2 = driver.findElement(By.xpath("(//*[@class='analystic'])[2]"));
element2.click();
Thread.sleep(2000);
WebElement element21 = driver.findElement(By.xpath("//*[@onclick='confirmbox()']"));
element21.click();
Thread.sleep(2000);
String Msg21 = driver.switchTo().alert().getText();
System.out.println("the Msg21 text is : "+Msg21);
driver.switchTo().alert().accept();
Thread.sleep(3000);

WebElement element3 = driver.findElement(By.xpath("(//*[@class='analystic'])[3]"));
element3.click();
Thread.sleep(2000);
WebElement element31 = driver.findElement(By.xpath("//*[@onclick='promptbox()']"));
element31.click();

driver.switchTo().alert().sendKeys("Chandhu from automation testing");
String Msg31 = driver.switchTo().alert().getText();
System.out.println("the Msg31 text is : "+Msg31);
Thread.sleep(3000);
driver.switchTo().alert().accept();

TakesScreenshot Ts1 = (TakesScreenshot) driver;
File src = Ts1.getScreenshotAs(OutputType.FILE);
File dest = new File("D:\\For_Selenium\\My_Selenium_First_project\\src\\Screenshots\\Scrn2.png");
Files.copy(src, dest);
	}
}
