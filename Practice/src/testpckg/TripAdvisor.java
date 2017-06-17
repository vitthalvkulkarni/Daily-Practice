package testpckg;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TripAdvisor {
	
	@Test
	public void tripAdvisor()
	{
		WebDriver driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("http//demoqa.com");

				

	}

}
