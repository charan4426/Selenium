package paralleltesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test2 extends BaseClass
{
	@Test
public void edgeTest() {
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moto g85 5g" + Keys.ENTER);
	    driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\" and text()=\"Motorola G85 5G (Viva Magenta, 12GB RAM + 256GB Storage)\"]")).click();
	   
}
}


