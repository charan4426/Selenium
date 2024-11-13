package testng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	@Test(dataProvider = "data")
	public void LoginTest(String UN, String PW) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(PW);
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
	    driver.quit();
	    
	}
	
	@DataProvider
	public Object[][] data(){
		Object[][] obj = new Object [4][2];
		obj[0][0]="standard_user";
		obj[0][1]="secret_sauce";
		obj[1][0]="locked_out_user";
		obj[1][1]="secret_sauce";
		obj[2][0]="problem_user";
		obj[2][1]="secret_sauce";
		obj[3][0]="performance_glitch_user";
		obj[3][1]="secret_sauce";
		
		return obj;
	}
	

}
