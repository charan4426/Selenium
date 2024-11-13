package actionaClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSlider {
	public static void main (String [] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("handbags" + Keys.ENTER)	;
        WebElement slider = driver.findElement(By.cssSelector("form[data-slider-id=\"p_36/range-slider\"]"));
        
       Actions action = new Actions(driver);
       action.scrollToElement(slider);
       
       WebElement lower_bound = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
       WebElement upper_bound = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));
       
       for(;;) {
    	  lower_bound.sendKeys(Keys.ARROW_RIGHT);
    	  if(lower_bound.getAttribute("aria-valuetext").contains("10,") )
    	  break;   
       }
       Thread.sleep(3000);
       for(;;) {
     	  upper_bound.sendKeys(Keys.ARROW_LEFT);
     	  if(upper_bound.getAttribute("aria-valuetext").contains("20,") )
     	  break;
       }
       Thread.sleep(3000);

       driver.findElement(By.className("a-button-input")).click();
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"))));
       
       String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
       
       System.out.println(price);
       
       
       driver.quit();
       
}
}
