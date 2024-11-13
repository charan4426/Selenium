package SELENIUM;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test11 {public static void main (String [] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver(); 
	driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moto g85 5g" + Keys.ENTER);
    driver.findElement(By.linkText("Motorola G85 5G (Viva Magenta, 8GB RAM + 128GB Storage)")).click();
    Thread.sleep(3000);    
    driver.findElement(By.cssSelector("input#id=\"add-to-cart-button\"")).click();
    driver.findElement(By.className("class=\"a-button a-button-primary attach-primary-button attach-button-large attach-checkout-button\""));
    
    
    driver.quit();
}

}
