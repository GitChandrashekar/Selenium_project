// getSize() in terms of dimensions//

package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Size {
	public static void main(String[] args)
	
	{
WebDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com");
WebElement element = driver.findElement(By.xpath("(//img)[1]"));
 

String EleimgContent = element.getAttribute("src");
//fetches the attribute value of the img tag
System.out.println("the img attribute value is : "+EleimgContent);


// getsize is used to fetch the height and width of Element(img)//
Dimension DimEle= element.getSize(); 
System.out.println("the Img size is :"+DimEle); //prints the height and width of the img1//



List<WebElement> ImgEleSize =  driver.findElements(By.tagName("img"));
//fetches the total count of the img tags//
System.out.println("the total count of img tags : "+ImgEleSize.size());
for(int i=0;i<ImgEleSize.size();i++)
{
	System.out.println(ImgEleSize.get(i).getSize()); //fetches all the img tags dimensions//
}

  }
    }
