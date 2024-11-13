package SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelectedMethod {
	public static void main (String [] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement femaleRB = driver.findElement(By.xpath("//input[@value='1']"));
		femaleRB.click();
		if (femaleRB.isSelected())
			System.out.println("selected");
		else 
			System.out.println(" not selected");
		
		WebElement maleRB = driver.findElement(By.xpath("//input[@value='2']"));
		maleRB.click();
		if (maleRB.isSelected())
			System.out.println("selected");
		else 
			System.out.println(" not selected");
		driver.quit();
		
}
}