package SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class sendKeysPractice2 {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Forgotten password?")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
        Thread.sleep(5000);
        driver.quit();
}
}
