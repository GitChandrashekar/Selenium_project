
package handling_Tables;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Table_Task2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		
//		JavascriptExecutor jsp22 = (JavascriptExecutor) driver;
//		WebElement scrll = driver.findElement(By.xpath("(//*[@class='elementor-heading-title elementor-size-default'])[1]"));
//		jsp22.executeAsyncScript("arguments[0].scrollIntoView();",scrll);
		
		Actions act1 = new Actions(driver);
		for(int i=1;i<=6;i++)
		{
			act1.keyDown(Keys.ARROW_DOWN).perform();
		}
		WebElement table = driver.findElement(By.tagName("table"));
		
	
		
		//the total number of rows//
		List<WebElement> Rows = table.findElements(By.tagName("tr"));
		System.out.println("the total rows in the table is : "+Rows.size());
		System.out.println("------------*************--------------");
		
		
		//the total number of data in each row//
		for(int i=1;i<Rows.size();i++)
		{
			List<WebElement> col = Rows.get(i).findElements(By.tagName("td"));
			System.out.println(i+"st "+"column count  in "+i+"st row is  "+col.size() );
		}
		System.out.println("------------*************--------------");
		
		
//		task
		for(int i=1;i<Rows.size();i++)
		{
			List<WebElement> col = Rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++)
			{
				if(i==1&&j==1)
				{
				String text= col.get(j).findElement(By.xpath("(//*[@class='tg-0lax'])[6]")).getText();
				System.out.println(text);
				}
				else if(i==2 && j==1)
				{
					String email =col.get(j).findElement(By.xpath("(//*[@class='tg-0lax'])[13]")).getText();
					System.out.println(email);
				}
				 if(i==3 && j==2)
				{
					col.get(j).findElement(By.xpath("(//*[@type='checkbox'])[5]")).click();
				}
				else if(i==4 && j==3)
				{
					col.get(j).findElement(By.xpath("(//*[@type='checkbox'])[8]")).click();
				}
				 if(i==5 && j==4)
				{
					WebElement DD = col.get(j).findElement(By.tagName("select"));
					Select select = new Select(DD);
					select.selectByVisibleText("Sports");
				}
				else if(i==6 && j==5)
				{
				col.get(j).findElement(By.xpath("(//*[@type='text'])[6]")).sendKeys("good")	;
				}
			}
		}
        TakesScreenshot TSS = (TakesScreenshot) driver;  //because we cannot directly add driver to take TakesScreenshot
		File ts1 = TSS.getScreenshotAs(OutputType.FILE);
		File F1 = new File("D:\\For_Selenium\\My_Selenium_First_project\\src\\Screenshots\\Table_SS.  png");
		Files.copy(ts1, F1);
	}

}
