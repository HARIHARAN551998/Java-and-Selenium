package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	//setting of user to define the chrome options
	ChromeOptions options=new ChromeOptions();
	private WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void setUp(String browserName) {
		switch (browserName) {
		case "chrome":
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			break;
		case "firefox":
			driver=new FirefoxDriver();
		case "edge":
			driver=new EdgeDriver();
			break;

		default:
			System.err.println("Driver is not defined...");
			break;
		}


	}


	@Test
	public void testLogin() {
		driver.get("https://example.com/login");
		WebElement userName= driver.findElement(By.id("username"));
		userName.sendKeys("student");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");

		WebElement clickButton = driver.findElement(By.id("submit"));
		clickButton.click();

	}

	@AfterClass
	public void testdown() {
		driver.quit();
	}
}


