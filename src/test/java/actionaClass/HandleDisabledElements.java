package actionaClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleDisabledElements {
	public static void main (String args[]) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginBT = driver.findElement(By.cssSelector("[type=\"submit\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", loginBT);
		
		Thread.sleep(3000);
		loginBT.click();
		Thread.sleep(3000);
        driver.quit();
        
}
}
