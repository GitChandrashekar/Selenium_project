package file_Handling;
import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import javax.sound.sampled.Clip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Paste_pgm {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException
	{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.naukri.com/");

//creating the path//---------------
File f1 = new File("D:\\For_Selenium\\My_Selenium_First_project\\properties\\Nuakri.properties");

//streaming into the path//--------------
FileInputStream Stream = new FileInputStream(f1);

//handling the .properties file //-----------------
Properties prop22 = new Properties();
prop22.load(Stream);


driver.findElement(By.id("register_Layer")).click();

driver.findElement(By.xpath(prop22.getProperty("name_link"))).
sendKeys(prop22.getProperty("name"));
driver.findElement(By.xpath(prop22.getProperty("email_id_path"))).
sendKeys(prop22.getProperty("email"));
driver.findElement(By.xpath(prop22.getProperty("password_path"))).
sendKeys(prop22.getProperty("password"));
driver.findElement(By.xpath(prop22.getProperty("mobile_path"))).
sendKeys(prop22.getProperty("mobile_number"));
driver.findElement(By.xpath(prop22.getProperty("Fresher"))).click();


//
//JavascriptExecutor jsp =  (JavascriptExecutor) driver;
//WebElement scroll_T0 = driver.findElement(By.xpath("(//*[@type='button'])[2]"));
//jsp.executeAsyncScript("arguments[0].scrollIntoView;",scroll_T0);
  
Actions act = new Actions(driver);
for(int i=0; i<20;i++)
{
	act.keyDown(Keys.ARROW_DOWN).perform();
}

Thread.sleep(3000);
WebElement scroll_T0 = driver.findElement(By.xpath("(//*[@type='button'])[2]"));
scroll_T0.click();

Thread.sleep(2000);
//sending the file from the desktop to browser //


//For copying the file from the file
String Pathh = "C:\\Users\\Govinduramalakshmi\\OneDrive\\Desktop\\Technical Resume\\updatedDevopResume.docx";
StringSelection select = new StringSelection(Pathh);
Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
clip.setContents(select, select);



//for pasting the file .//
Robot robo = new Robot();

robo.keyPress(KeyEvent.VK_CONTROL);
robo.keyPress(KeyEvent.VK_V);

robo.delay(2000);

robo.keyRelease(KeyEvent.VK_CONTROL);
robo.keyRelease(KeyEvent.VK_V);

robo.keyPress(KeyEvent.VK_ENTER);
robo.delay(1000);
robo.keyRelease(KeyEvent.VK_ENTER);
	}

}
