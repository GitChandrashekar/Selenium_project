// Alert opertaion on demoqa site //

package alert_Concept;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_Data {

	public static void main(String[] args) throws InterruptedException
	{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demoqa.com/alerts");
WebElement Alret1 = driver.findElement(By.xpath("//*[@id='alertButton']"));

Alret1.click();
String message3 = driver.switchTo().alert().getText();
System.out.println("the message is : "+message3);
Thread.sleep(2000);
driver.switchTo().alert().accept();

WebElement Alret2 = driver.findElement(By.id("timerAlertButton"));
Alret2.click();
Thread.sleep(7000);
String message2 = driver.switchTo().alert().getText();
System.out.println("the message is : "+message2);
driver.switchTo().alert().accept();


WebElement Alret3 = driver.findElement(By.id("confirmButton"));
Thread.sleep(3000);
Alret3.click();
String message = driver.switchTo().alert().getText();
System.out.println("the message is : "+message);
Thread.sleep(3000);
//driver.switchTo().alert().accept();
driver.switchTo().alert().dismiss();


Actions Act = new Actions(driver);
for(int i=0;i<4;i++)
{
	Act.keyDown(Keys.ARROW_DOWN).perform();
}
Thread.sleep(3000);

WebElement Alret4= driver.findElement(By.id("promtButton"));
Alret4.click();

driver.switchTo().alert().sendKeys("Chandhu");
String message1 = driver.switchTo().alert().getText();
System.out.println("the message is : "+message1);
Thread.sleep(3000);
driver.switchTo().alert().accept();

	}

}
