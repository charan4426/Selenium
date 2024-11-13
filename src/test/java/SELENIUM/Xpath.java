package SELENIUM;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("iphone");
			driver.findElement(By.className("_2iLD__")).click();
			//div[text()='Nothing Phone (2a) Plus (Grey, 256 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']
			
	        int sum=0;
			for(;;) {
				Thread.sleep(3000);
				List<WebElement> list=driver.findElements(By.className("KzDlHZ"));
				sum= sum + list.size();
				try {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}catch(Exception e){
				break;
			}
			}
			
			String header = driver.findElement(By.className("BUOuZu")).getText();
			System.out.println(header);
			String[] str = header.split(" ");
			int AN = Integer.parseInt(str[5]);
			if (sum == AN) {
				System.out.println("Hogaya");
			}else {
				System.out.println("nahi hua ");
			}

			driver.quit();


	}

}
