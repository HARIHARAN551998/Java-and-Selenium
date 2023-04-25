package seleniumTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MenuAndSubMenuclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//now i don't use system set property because i added chrome driver in System Environment setting  
		//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		//for demo web site for testing
		driver.get("https://www.oyorooms.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		
		WebElement menuElement= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[2]/div/div[2]/a/div/h2"));
		WebElement subElement = driver.findElement(By.xpath("//a[contains(text(),'T Nagar')]"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(menuElement);
		actions.click(subElement).build().perform();
		Thread.sleep(2000); //thread sleep don't use but now all web element loading some time wait for it
		driver.quit();
		
	
	}

}
