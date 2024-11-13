package SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Validation2 {
	public static void main (String [] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginBTN = driver.findElement(By.cssSelector("button[type='submit']"));
		
		if (loginBTN.isEnabled()) {
			System.out.println("login Enabled");
		}
		else {
			System.out.println("login Disabled");
		}
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("jnjknlksdncck");
		driver.findElement(By.name("password")).sendKeys("123456");

		if (loginBTN.isEnabled()) {
			System.out.println("login Enabled");
		}
		else {
			System.out.println("login Disabled");
		}
		driver.quit();
	}

}
