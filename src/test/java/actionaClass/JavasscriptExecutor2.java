package actionaClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavasscriptExecutor2 {
public static void main (String args[]) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
	System.out.println(js.executeScript("return document.title"));
	System.out.println(js.executeScript("return document.URL"));
	Thread.sleep(3000);
	
	js.executeScript("history.go(0)");
	Thread.sleep(3000);
	
	WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
	WebElement searchBT = driver.findElement(By.id("nav-search-submit-button"));

	js.executeScript("arguments[0].value = arguments[1]", searchTF,"shoes");
	js.executeScript("arguments[0].click()", searchBT);
	
	driver.quit();

}
}
