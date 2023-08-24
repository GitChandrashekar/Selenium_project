package handling_Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TableTask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dezlearn.com/webtable-example/");
		

		
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
			for(int j=1;j<col.size();j++)
			{
              if(i==j)
              {
            	  
              }
			}
		}
		
	}

}
