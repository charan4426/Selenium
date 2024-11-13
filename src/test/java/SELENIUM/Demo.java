package SELENIUM;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

		public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("mobiles");
	driver.findElement(By.className("_2iLD__")).click();
	//div[text()='Nothing Phone (2a) Plus (Grey, 256 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']

	List<WebElement> mobiles=driver.findElements(By.className("KzDlHZ"));
	Thread.sleep(2000);
	for(WebElement mobile :mobiles) {
		String name=mobile.getText();
		WebElement price=driver.findElement(By.xpath("//div[text()='"+ name +"']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(name + "/t"+price.getText());
		
		Thread.sleep(2000);

		
	}

	driver.quit();



		}

	}
