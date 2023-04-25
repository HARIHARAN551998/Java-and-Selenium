package seleniumTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingFrames {

	public static void main(String[] args) {

		//setting of user to define the chrome options
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				
				//now i don't use system set property because i added chrome driver in System Environment setting  
				//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver(options);
				
				//for demo web site for testing
				driver.get("https://letcode.in/frame");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
				//its use implicitlyWait for wait some times all webe lement loading
				
				driver.switchTo().frame("firstFr");
				driver.findElement(By.name("fname")).sendKeys("hari");
				driver.findElement(By.name("lname")).sendKeys("haran");
				driver.switchTo().frame(1);   //this index based or use web element
				//WebElement innerFrame= driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
				//driver.switchTo().frame(innerFrame);
				driver.findElement(By.xpath("//input[@class='input']")).sendKeys("hari123@");
				//then exit of frame we use parentFrame default method step by step
				driver.switchTo().parentFrame();
				driver.findElement(By.name("fname")).sendKeys("hari");
				driver.findElement(By.name("lname")).sendKeys("haran");
				
				//totally exit from frame use this method
				driver.switchTo().defaultContent();
				
				driver.findElement(By.linkText("Watch tutorial")).click();
				
				driver.quit();
	}

}
