import java.net.URL;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) throws Exception {
		
		URL seleniumHqUrl = new URL("http://www.seleniumhq.org/");
		String seleniumHqDoc="http://www.seleniumhq.org/docs/";

		// Create a Firefox browser instance
		FirefoxDriver driver = new FirefoxDriver();

		// Navigate to url
		driver.navigate().to(seleniumHqUrl);

		// Wait for 2 seconds
		Thread.sleep(2*1000);
		
		driver.get(seleniumHqDoc);

		// Wait for 2 seconds
		Thread.sleep(2*1000);
		
		//Refresh Page
		driver.navigate().refresh();

		// Wait for 2 seconds
		Thread.sleep(2*1000);
		
		driver.navigate().back();
		
		// Wait for 2 seconds
		Thread.sleep(2*1000);
		
		driver.navigate().forward();

		// Wait for 2 seconds
		Thread.sleep(2*1000);

		// Close the browser instance
		driver.quit();

	}
}
