package SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class ValidationMethods {
	public static void main (String [] args) {
	WebDriver driver = new EdgeDriver(); 
	driver.manage().window().maximize();
    driver.get("https://www.selenium.dev/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement logo = driver.findElement(By.cssSelector("svg#Layer_1"));
	
	if (logo.isDisplayed()) {
		System.out.println("logo displayed");
	}
	else {
		System.out.println("logo not displayed");
	}
	
	
}
}