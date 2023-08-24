package file_Handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Handle
{
	public static WebDriver driver;
	
public static void main(String[] args) throws IOException
{
   //creating the data //
	File f1 = new File("D:\\For_Selenium\\My_Selenium_First_project\\properties\\FB_Data");
	
	//streaming in to the data//
	FileInputStream FS11 = new FileInputStream(f1);
	
	//handle the data in it//
	Properties prop1 = new Properties();
	prop1.load(FS11);
	
	String browser_Val = prop1.getProperty("browser");
	System.out.println("the browser val is : "+browser_Val);
	
	if(browser_Val.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
	}
	else if(browser_Val.equalsIgnoreCase("Edge"))
	{
		driver = new EdgeDriver();

	}
	else if(browser_Val.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else 
	{
		System.out.println("no browser found");
	}
	
	driver.get(prop1.getProperty("url"));
	
	driver.findElement(By.xpath(prop1.getProperty("username_path")))
	.sendKeys(prop1.getProperty("username"));
	
	driver.findElement(By.xpath(prop1.getProperty("pass_path")))
	.sendKeys(prop1.getProperty("password"));
	
	driver.findElement(By.className("Eye_path")).click();
	
}
}
