    package SELENIUM;

    import java.time.Duration;
	import org.openqa.selenium.By;
    import org.openqa.selenium.Point;
    import org.openqa.selenium.Rectangle;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
    import org.openqa.selenium.Dimension;

	public class Gettertwo {
	public static void main (String [] args) {
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.github.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signUP = driver.findElement(By.xpath("//button[normalize-space(text())='Sign up for GitHub']"));
		Point loc = signUP.getLocation();
		System.out.println("X-corrdinate " + loc.getX());
		System.out.println("Y-corrdinate " + loc.getY());
		
		Dimension dim = signUP.getSize();
		System.out.println("HEight " + dim.getHeight());
		System.out.println("width " + dim.getWidth());
        
		Rectangle rect = signUP.getRect();
		System.out.println("X-corrdinate " + rect.getX());
		System.out.println("Y-corrdinate " + rect.getY());
		System.out.println("HEight " + rect.getHeight());
		System.out.println("width " + rect.getWidth());
         
		driver.quit();

	}
}
