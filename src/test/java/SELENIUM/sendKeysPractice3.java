package SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class sendKeysPractice3 {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchTF.sendKeys("toys");
		Thread.sleep(3000);
		searchTF.clear();
		searchTF.sendKeys("tv");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(3000);
        driver.quit();


}
}
