package SELENIUM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LimitingDriverScope {
	public static void main (String [] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement footer = driver.findElement(By.id("pageFooter"));
		List <WebElement> links =footer.findElements(By.tagName("a"));
		for (WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		
		driver.quit();
		
	
}
}