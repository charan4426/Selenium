package SELENIUM;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/#:~:text=Flipkart:%20The%20One-stop%20Shopping");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("mobiles");
	driver.findElement(By.className("_2iLD__")).click();
	List<WebElement> mobiles= driver.findElements(By.className("KzD1HZ"));

	/*for (WebElement mobile: mobiles) {
		String name = mobile.getText();
		Thread.sleep(2000);
		WebElement price = driver.findElement(By.xpath("//div[text()='"+name+"'0]/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		Thread.sleep(3000);
        System.out.println(name+"\t"+price.getText());
    	a

	}*/
	//for (int i=0;i<mobiles.size();i++) {
	
		System.out.println(mobiles);
	//}
	Thread.sleep(2000);
	driver.quit();

	}


}