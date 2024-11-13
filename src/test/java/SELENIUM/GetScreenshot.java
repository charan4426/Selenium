package SELENIUM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//;import org.openqa.selenium.io.FileHandler;

public class GetScreenshot {
public static void main (String [] args) throws IOException {
	WebDriver driver = new EdgeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement zomatoIMG = driver.findElement(By.cssSelector("div.xamitd3")); 
	File temp = zomatoIMG.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshots/insta.png");
	//FileHandler.copy(temp, dest);
	FileUtils.copyFile(temp,dest);
	driver.quit();
}
}