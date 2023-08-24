package Mouse_Events;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Drag_event {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions ActMouse = new Actions(driver);
		
		for(int i=0;i<3;i++)
		{
			ActMouse.keyDown(Keys.ARROW_DOWN).perform();
			
		}
		
		ActMouse.clickAndHold(drag).perform();
		Thread.sleep(1500);
		ActMouse.dragAndDrop(drag, drop).perform();
		
		for(int i=0;i<3;i++)
		{
			ActMouse.keyDown(Keys.ARROW_UP).perform();
			
		}


	}

}
