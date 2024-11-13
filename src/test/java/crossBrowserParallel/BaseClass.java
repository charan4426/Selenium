package crossBrowserParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
		WebDriver driver;
		@Parameters("BROWSER")
		@BeforeClass
		public void classsetup(String browser)	
		{
			switch(browser) {
			case "chrome" :
				driver = new ChromeDriver();
				break;

			case "edge" :
				driver = new EdgeDriver();
				break;
				default : 
					System.out.println("error");
			}
		}

		@AfterClass
		public void classTearDown() {
			if (driver !=null)
			driver.quit();
		}
		
		
		
	}



