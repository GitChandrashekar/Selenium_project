package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Static_Dropdown {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement dropdownele = driver.findElement(By.tagName("select"));
		
		Select dropdown = new Select(dropdownele);  //select class process 
		
		List<WebElement> total_options = dropdown.getOptions();
		System.out.println("the total number of options are : "+total_options.size());
		
		for(WebElement DataRep : total_options)
		{
			System.out.println(DataRep.getText());
		}
		
		Thread.sleep(2000);
		dropdown.selectByVisibleText("India");
		
		Thread.sleep(2000);
		dropdown.selectByIndex(3);
		
		Thread.sleep(2000);
		dropdown.selectByValue("England");
		
	}

}
