package actionaClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuyggestion {
	public static void main (String [] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
	    driver.get("https://www.google.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("charan");
		List <WebElement> list = driver.findElements(By.xpath("*//li[contains(.,'charan')]"));
		for (WebElement e : list){
		
			System.out.println(e.getText());
			
		}
		
		list.get(1).submit();
		Thread.sleep(5000);
		driver.quit();
		
		
 }
}
