import java.net.URL;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.List;

public class ByExample {

	public static void main(String[] args) throws Exception {
		
		// Create a Firefox browser instance
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://www.seleniumhq.org/");
		waitInPage();

		WebElement searchBoxById=driver.findElement(By.name("q"));
		searchBoxById.sendKeys("Selenium Ide");
		waitInPage();

		WebElement submitByXpath=driver.findElement(By.xpath(".//input[@value='Go']"));
		submitByXpath.click();
		waitInPage();

		WebElement ideLink= driver.findElement(By.partialLinkText("Plugins"));
		ideLink.click();
		waitInPage();
		
		WebElement homeLink= driver.findElement(By.tagName("a"));
		homeLink.click();
		waitInPage();

		WebElement aboutLink= driver.findElement(By.linkText("About"));
		aboutLink.click();
		waitInPage();

		WebElement sideBar = driver.findElement(By.id("side"));
		sideBar.findElement(By.linkText("History")).click();
		waitInPage();

		driver.quit();
	}

	private static void waitInPage() throws Exception{
		// Wait for 2 seconds
		Thread.sleep(2000);
	} 
}
