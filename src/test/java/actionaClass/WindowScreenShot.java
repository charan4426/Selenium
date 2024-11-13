package actionaClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScreenShot {

		public static void main (String [] args) throws InterruptedException, IOException {
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
		    driver.get("https://www.google.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
			TakesScreenshot ts = (TakesScreenshot)driver;
 			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/google.png");
			FileUtils.copyFile(temp,dest);
			Thread.sleep(3000);
			driver.quit();
			
}		
}