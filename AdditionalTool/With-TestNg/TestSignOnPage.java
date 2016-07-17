
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestSignOnPage{

	public static final String SIGNON_URL="http://newtours.demoaut.com/mercurysignon.php";
	public static final String EXPECTED_TITLE="Sign-on: Mercury Tours";
	private ChromeDriver driver;

	@BeforeClass
	public void openBrowser(){
		// Create Chrome browser instance
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void verifyTitle() throws Exception{

		// Navigate to new tours signOn page
		driver.get(SIGNON_URL);

		// assert page title
		assertEquals(driver.getTitle(),EXPECTED_TITLE,"Verify title "+EXPECTED_TITLE);

	}

	@AfterClass
	public void closeBrowser(){
		// Close the browser instance
		driver.quit();
	}
}
