package actionaClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames { 
		public static void main (String [] args) throws InterruptedException {
			WebDriver driver = new EdgeDriver(); 
			driver.manage().window().maximize();
		    driver.get("https://www.google.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.switchTo().frame("callout");
			driver.findElement(By.xpath("//button[text()='Don't switch']")).click();
			driver.switchTo().defaultContent();
			
			driver.findElement(By.name("q")).sendKeys("Automation Testing" + Keys.ENTER);
            Thread.sleep(2000);
            driver.quit();
            
			
		}
}
