package file_Handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zmq.ZError.IOException;


public class Fetch_file_Data {

	public static void main(String[] args) throws  java.io.IOException
	{
       //create a path for the file//
		File f1 = new File("D:\\For_Selenium\\My_Selenium_First_project\\properties\\Data.properties");
		
		//read the data inside it//
		FileInputStream FS1 = new FileInputStream(f1);
		
		//handle  the data //
		Properties prop1 = new Properties();
		prop1.load(FS1);
		
		String namee = prop1.getProperty("name");
		System.out.println("the data name is "+namee);
		
		String pass = prop1.getProperty("pass");
		System.out.println("the password is : "+pass);
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com//");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(prop1.getProperty("name"));
		
		
		
		
		
		
		
		
		
	}

}
