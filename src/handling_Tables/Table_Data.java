package handling_Tables;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Data {

	public static void main(String[] args)
	{
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.seleniumeasy.com/table-pagination-demo.html");
		
//first find the table in the page?//
WebElement Table = driver.findElement(By.tagName("table"));
System.out.println("the table text is : "+Table.getSize());

//how to find the total no of rows//
List<WebElement> Total_Rows = Table.findElements(By.tagName("tr"));
System.out.println("the total number of rows are : "+Total_Rows.size());
System.out.println("---------------------------------------------------");


//how to find the total number of headers in a table 
List<WebElement> Total_headers = Table.findElements(By.tagName("th"));
System.out.println("the total number of headers are : "+Total_headers.size());


//headers content //
for(int i=0;i<Total_headers.size();i++)
{
	System.out.println(Total_headers.get(i).getText());
}

System.out.println("---------------------------------------------------");


//how to find the total number of the TableData(columns)//
List<WebElement> Total_TD = Table.findElements(By.tagName("td"));
System.out.println("the total number of Table Data is : "+Total_TD.size());
for(WebElement T0tal_TD_Text : Total_TD )
{
	System.out.println(T0tal_TD_Text.getText());
}
System.out.println("---------------------------------------------------");


//how to find the total TD in a single row//
for(int i=1;i<Total_Rows.size();i++)
{
	List<WebElement> TD_Row = Total_Rows.get(i).findElements(By.tagName("td"));
	System.out.println("the total number of TD in the "+i+"th row is : "+TD_Row.size() );
//	System.out.println("the  TD info in the "+i+"th row is : "+TD_Row.get(i).getText());
}

}

}

