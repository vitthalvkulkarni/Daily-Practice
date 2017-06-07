package testpckg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadingTable {
	
	WebDriver driver;
	
	@Test
	public void test()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/India");
	WebElement tab = driver.findElement(By.xpath("//table[@class ='infobox geography vcard']"));
	List<WebElement>tabdet= tab.findElements(By.xpath("//table[@class ='infobox geography vcard']/tbody/tr"));
	tabdet.size();
	System.out.println("Table size is:"+tabdet.size());
	
	WebElement cols = driver.findElement(By.xpath("//table[@class='infobox geography vcard']/tbody/tr[5]/td"));
	
	System.out.println(cols.getText());
	
	System.out.println("----------------------------------------");
	
	for(WebElement temp : tabdet)
	{
		System.out.println(temp.getText());
	}
	
	}
	
	@Test
	public void tabTest()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com");
		System.out.println("--------------------------------------");
		List<WebElement> maintab = driver.findElements(By.xpath("//ul[@id='tab_ul']/li[@role='tab']"));
		
		System.out.println(maintab.size());
		
		driver.findElement(By.xpath("//ul[@id='tab_ul']/li[@role='tab'][2]")).click();
	}

}
