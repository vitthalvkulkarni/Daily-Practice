package testpckg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_Actions {
	
	public static WebDriver driver;
	@Test
	public void flipkartTest()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://Flipkart.com");
		
		WebElement electronics = driver.findElement(By.xpath("//span[.='Electronics']"));
		WebElement samsung = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(electronics).release(samsung).perform();
		
	/*	electronics.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		samsung.click();*/
	}

}
