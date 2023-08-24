//facebook task//
package first_Task;
import java.io.File;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;
import zmq.ZError.IOException;

public class Face_Book_Task {
	public static void main(String[] args) throws IOException,Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://www.facebook.com//");
		 
	WebElement Sign_Up_Face =  driver.findElement(By.xpath("//*[@rel='nofollow']"));
	Actions Facebook_Act = new Actions(driver);
	Facebook_Act.click(Sign_Up_Face).perform();
	
//	----------//For performing operation on day//-----------------------//
	
		WebElement Day_DD = driver.findElement(By.xpath("(//*[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
	
		Select Day_options = new Select(Day_DD);
	
		List<WebElement> DD_option = Day_options.getOptions();
	    System.out.println("the total elements of day size is : "+DD_option.size());
	    for(int i=0;i<DD_option.size();i++)
	    {
	    	System.out.println("the "+i+"th "+"element in the day is : "+DD_option.get(i).getText() );
	    }
//		for(WebElement Data : DD_option)
//		{
//		System.out.println("the  elements in the day is  :  "+Data.getText());
//		}
		Day_options.selectByVisibleText("14");
		System.out.println("-----*********----------**************************");
		Thread.sleep(1700);	
		
//----------//For performing operation on Month//-------------------------//
		
		WebElement Month_DD = driver.findElement(By.xpath("(//*[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
		
		Select Month_options = new Select(Month_DD);
		
		List<WebElement> MM_option = Month_options.getOptions();
		
		System.out.println("the total elements of Month size is "+MM_option.size());
		 for(int i=0;i<MM_option.size();i++)
		    {
		    	System.out.println("the "+i+"th "+"element in the Month is : "+MM_option.get(i).getText() );
		    }
//		for(WebElement Data1 : MM_option)
//		{
//		System.out.println("the elements in the Month :  "+Data1.getText());
//		}
		Month_options.selectByIndex(5);
		System.out.println("-----*********----------**************************");
		Thread.sleep(1700);
		
		//----------//For performing operation on year//-------------------------//
        WebElement  Year_DD = driver.findElement(By.xpath("(//*[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
		
		Select Year_options = new Select(Year_DD);
		
		List<WebElement> YY_option = Year_options.getOptions();
		
		System.out.println("the total elements of Year size is "+YY_option.size());
		 for(int i=0;i<YY_option.size();i++)
		    {
		    	System.out.println("the "+i+"th "+"element in the year is : "+YY_option.get(i).getText() );
		    }
//		for(WebElement Data2 : YY_option)
//		{
//		System.out.println("the elements in the year :  "+Data2.getText());
//		}
		Year_options.selectByValue("1996");
		System.out.println("-----*********----------**************************");
		
		
//		Taking screen shots
        TakesScreenshot TSS = (TakesScreenshot) driver;  //because we cannot directly add driver to take TakesScreenshot
		File src = TSS.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\For_Selenium\\My_Selenium_First_project\\src\\Screenshots\\Facebook_SS.png");
		Files.copy(src, dest);
	}
}

//WebElement Create_New_Account = driver.findElement(By.xpath("//a[@ajaxify='"
//	+ "/reg/spotlight/']"));
//Facebook_Act.click(Create_New_Account).perform();
//
//WebElement Day_DD = driver.findElement(By.id("//*[@id='day']"));
//
//Select Day_options = new Select(Day_DD);
//
//List<WebElement> DD_option = Day_options.getOptions();
//
//System.out.println("the element size is : "+DD_option.size());
//
//for(WebElement Data : DD_option)
//	{
//	System.out.println(Data.getText());
//    }