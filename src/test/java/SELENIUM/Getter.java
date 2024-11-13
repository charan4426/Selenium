package SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Getter {
public static void main (String [] args) {
	WebDriver driver = new EdgeDriver(); 
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement loginBTN = driver.findElement(By.name("login"));
	System.out.println("Text on the Element " + loginBTN.getText());
	System.out.println("Get Attribute " + loginBTN.getAttribute("data-testid"));
	System.out.println("Get Tagname " + loginBTN.getTagName());
	System.out.println("color: " + loginBTN.getCssValue("color"));
	System.out.println("Font: " + loginBTN.getCssValue("font"));
	System.out.println("Back-ground color: " + loginBTN.getCssValue("background-color"));

	
	driver.quit();
	
}
}
