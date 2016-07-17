
/**
 * Import FirefoxDriver and By from selenium jar
 */
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldMarionette{

	public static void main(String args[]) throws Exception{

		// Set system property
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");

		// Create a marionette firefox browser instance
		MarionetteDriver driver = new MarionetteDriver();

		// Create firefox browser instance
		//FirefoxDriver driver = new FirefoxDriver();

		// Navigate to google home page
		driver.get("https://www.google.co.in/");

		// Type hello world in the search field
		driver.findElement(By.name("q")).sendKeys("Hello World");

		// Wait for 10 seconds
		Thread.sleep(10*1000);

		// Close the browser instance
		driver.quit();

	}
}
