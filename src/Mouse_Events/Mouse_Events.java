//Action mouse evnets//
package Mouse_Events;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse_Events {
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		
		Actions Actor = new Actions(driver);
		
		// mouse moves to Men sections//
		WebElement Men = driver.findElement(By.xpath("(//div[@class='"
				+ "NavBarDesktop__Subtitle-sc-xsryom-0 izctWK'])[3]"));
		Thread.sleep(3000);
		Actor.moveToElement(Men).perform();
		

		//in Men sub section selects the jeans option//
		WebElement jeans = driver.findElement(By.xpath("(//*[@class='sc-dEVLtI fiSoMH"
				+ " MenuItem__ParagraphBody-sc-1c49nqf-0 jjSmfp MenuItem__ParagraphBody-sc-1c49nqf-0 "
				+ "jjSmfp'])[42]"));
		Thread.sleep(3000);
		Actor.click(jeans).perform();
	}
}
