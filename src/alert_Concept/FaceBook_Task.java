package alert_Concept;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;

public class FaceBook_Task {
//from gitbub edited lineee///
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//");
		
//		WebElement ele = driver.findElement(By.id("u_0_0_c7"));  
		
		//1.for direct sign button//
		WebElement ele = driver.findElement(By.xpath("(//*[@role='button'])[2]"));
		ele.click();
//		(//*[@class='inputtext _58mg _5dba _2ph-'])[1]
		
		WebElement ele_First = driver.findElement(By.id("u_2_b_oN"));
		ele_First.sendKeys("Chandrashekar");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//2.for Sign up for Facebook button //
////		WebElement eleAlter = driver.findElement(By.className("_97w5"));
////		eleAlter.click();
		
//		//for first name//
//		WebElement ele1 = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]"));
//		ele1.sendKeys("Chandrashekar");
//		Thread.sleep(3000);
//		
//		//for last name//
//		WebElement ele12 = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[2]"));
//		ele12.sendKeys("Bestha");
//		Thread.sleep(3000);
//		
//		//for phone number.//
//		WebElement ele13 = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[3]"));
//		ele13.sendKeys("9902455850");
//		Thread.sleep(3000);
//		
//		//For Password.//
//		WebElement ele14 = driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[5]"));
//		ele14.sendKeys("@123//9902455850");
//		
//		//for date of birth (day)//
//		WebElement ele15 = driver.findElement(By.xpath("//*[@id='day']"));
//		Select ele55 = new Select(ele15);
//		List<WebElement> listele55 = ele55.getOptions();
//		for(int i=0;i<listele55.size();i++)
//		{
//			System.out.println("the "+i+"th  day value is : "+listele55.get(i).getText() );
//		}
//		//Selecting the day in the DD//
//		ele55.selectByValue("25");
//		Thread.sleep(3000);
//		
//		System.out.println("--------------------------------");
//		
//		//for date of birth (Month)//
//		//*[@id='month']
//		WebElement ele16 = driver.findElement(By.xpath("//*//*[@id='month']"));
//		Select ele56 = new Select(ele16);
//		List<WebElement> listele56 = ele56.getOptions();
//		for(int i=0;i<listele56.size();i++)
//		{
//			System.out.println("the "+i+"th  day value is : "+listele56.get(i).getText() );
//		}
//          ele56.selectByIndex(1);		
//      	Thread.sleep(3000);
//
//          System.out.println("--------------------------------");
//          
//  		//for date of birth (Year)//
//  		WebElement ele17 = driver.findElement(By.xpath("(//*[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
//		Select ele57 = new Select(ele17);
//		List<WebElement> listele57 = ele57.getOptions();
//		for(int i=0;i<listele57.size();i++)
//		{
//			System.out.println("the "+i+"th  day value is : "+listele57.get(i).getText() );
//		}
//        ele57.selectByVisibleText("1996");
//        Thread.sleep(3000);
//
//
//        //for selecting radio button//
//        WebElement Radio_btn =driver.findElement(By.xpath("(//*[@class='_58mt'])[1]"));
//        Radio_btn.click();
//        
//        //For taking screenshots //
//        TakesScreenshot TS_Facebook = (TakesScreenshot) driver;
//         File src_Face =  TS_Facebook.getScreenshotAs(OutputType.FILE);
//         File Desc_Face = new File("D:\\For_Selenium\\My_Selenium_First_project\\src\\Screenshots\\Facbook_task2.png");
//         Files.copy(src_Face, Desc_Face);

	}

}
