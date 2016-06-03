
/**
 * Import EdgeDriver and By from selenium jar
 */
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeHelloWorld{

	public static void main(String args[]) throws Exception{

		// Set edge driver path
		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");

		// Create a Edge browser instance
		EdgeDriver driver = new EdgeDriver();

		// Navigate to google home page
		driver.get("https://www.google.co.in/");

		// Wait for 5 seconds
		Thread.sleep(5*1000);

		// Type hello world in the search field
		driver.findElement(By.name("q")).sendKeys("Hello World");

		// Wait for 5 seconds
		Thread.sleep(5*1000);

		// Close the browser instance
		driver.quit();

	}
}
