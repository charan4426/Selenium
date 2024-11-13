package actionaClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseNameHOver {
	public static void main (String [] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
	    driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement homeAndLivingTab = driver.findElement(By.xpath("//a[text()='Home & Living'and @class = 'desktop-main']"));
		Actions action = new Actions(driver);	
		action.moveToElement(homeAndLivingTab).perform();
		driver.findElement(By.xpath("//a[text()='Clocks']")).click();
		String header = driver.findElement(By.cssSelector("h1.title-title")).getText();
		if (header.equalsIgnoreCase("clocks"))
			System.out.println("pass");
		else
			System.out.println("pail");
		
		driver.quit();
		}

}
