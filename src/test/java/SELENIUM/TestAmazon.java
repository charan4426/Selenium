package SELENIUM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestAmazon {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class=\"nav-left\"]/a")).click();
		driver.findElement(By.xpath("//li/a/div[text()=\"Audible Audiobooks\"]")).click();
		Thread.sleep(3000);
		List<WebElement> list =driver.findElements(By.xpath("//div[@id=\"hmenu-content\"]/ul[@class=\"hmenu hmenu-visible hmenu-translateX\"]/li/a"));
		for(WebElement links :list) {
			String name=links.getText();
			System.out.println(name);
			
			Thread.sleep(2000);

			
		}

		driver.quit();
		
		}
}