package file_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiple_Driver {

	// class/instance variable//
	public static WebDriver driver ;
	public static void main(String[] args) throws IOException 
	{

		
		//creating the path //
		File CFL = new File("D:\\For_Selenium\\My_Selenium_First_project\\properties\\Driver.properties");
		
		//stream into data//
		FileInputStream FCFL = new FileInputStream(CFL);
		
		//handling the data in driver.properties//
		Properties prop22 = new Properties();
		prop22.load(FCFL);
		String browserEle = prop22.getProperty("browser");
		System.out.println("the opened browser : "+browserEle);
		
		if(browserEle.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		else if(browserEle.equalsIgnoreCase("edge"))
		{
			 driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("the browser not found");
		}
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys((prop22.getProperty("name")));
	}

}
