package handling_Tables;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Handling_TableData {

	public static void main(String[] args)
	{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.dezlearn.com/webtable-example/");
WebElement table = driver.findElement(By.tagName("table"));

//the total number of rows//
List<WebElement> Rows = table.findElements(By.tagName("tr"));
System.out.println("the total rows in the table is : "+Rows.size());
System.out.println("------------*************--------------");

//the total number of headers//
List<WebElement> Headers = table.findElements(By.tagName("th"));
System.out.println("the total number of headers is : "+Headers.size());
//All headers data is //
System.out.println("the table headers are : ");
for(WebElement  THs : Headers)
{
	System.out.println(THs.getText());
}
System.out.println("------------*************--------------");


//the total number of columns in table//
List<WebElement> columns = table.findElements(By.tagName("td"));
System.out.println("the total number of columns is : "+columns.size());
for(WebElement Goo : columns)
{
	System.out.println(Goo.getText());
}
System.out.println("------------*************--------------");


//the total number of data in each row//
for(int i=1;i<Rows.size();i++)
{
	List<WebElement> col = Rows.get(i).findElements(By.tagName("td"));
	System.out.println(i+"st "+"column count  in "+i+"st row is  "+col.size() );
}
System.out.println("------------*************--------------");


for(int n1=1; n1<Rows.size() ; n1++ )
{
	List<WebElement> col = Rows.get(n1).findElements(By.tagName("td"));
	for(int n2=1; n2<col.size() ; n2++)
	{
		 
		if(n1==2 && n2==4)
		{
			col.get(n2).findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
		}
		
		if(n1==1 && n2==4)
		{
			WebElement DD = col.get(n2).findElement(By.tagName("select"));
			Select sel = new Select(DD);
			sel.selectByVisibleText("Sports");
		}

		if(n1==1 && n2==5)
		{
			col.get(n2).findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("chandhu");
			
		}
		
    }
	System.out.println();
}


}}
