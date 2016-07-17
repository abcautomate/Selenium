
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomePage{

	public static final String HOMEPAGE_URL="http://newtours.demoaut.com/mercurywelcome.php";
	public static final String EXPECTED_TITLE="Welcome: Mercury Tours";

	public void verifyTitle() throws Exception{

		// Create Chrome browser instance
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// Navigate to new tours signOn page
		driver.get(HOMEPAGE_URL);

		// assert page title
		assertTitle(EXPECTED_TITLE,driver.getTitle());

		// Close the browser instance
		driver.quit();

	}

	private void assertTitle(String expected,String actual)throws Exception{
		if(expected.equals(actual)){
			System.out.println("Passed : "+expected);
		}else{
			throw new Exception("Assertion Failure Expected : "+expected+", Actual : "+actual);
		}
	}
}
