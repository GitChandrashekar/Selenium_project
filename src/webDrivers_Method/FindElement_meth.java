package webDrivers_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement_meth {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		
		WebElement Element = driver.findElement(By.id("gender-male"));
		Element.click();
		Thread.sleep(2200);
		
	WebElement FirstName=driver.findElement(By.id("FirstName"));
	FirstName.sendKeys("Chandrashekar");
	Thread.sleep(2200);
	
	WebElement LastName=driver.findElement(By.id("LastName"));
	LastName.sendKeys("Bestha");
	Thread.sleep(2200);
	
	WebElement email=driver.findElement(By.id("Email"));
	email.sendKeys("chandrashekarise.rrryme@gmail.com");
	Thread.sleep(2200);
	
	WebElement Pass=driver.findElement(By.id("Password"));
	Pass.sendKeys("9902455");
	Thread.sleep(2200);
	
	WebElement ConfirmPass=driver.findElement(By.id("ConfirmPassword"));
	ConfirmPass.sendKeys("9902455");
	Thread.sleep(2200);
	
	WebElement RegButton = driver.findElement(By.name("register-button"));
	RegButton.click();
	
	}

}
