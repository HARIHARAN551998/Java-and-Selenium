package seleniumTask;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ReadDataFromExcelAndLogIN {

	

		@Test(dataProvider = "login",dataProviderClass =seleniumTask.DataReceviedFromExcel.class )
		public void login(String uname,String pword) {
			//setting of user to define the chrome options
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			//now i don't use system set property because i added chrome driver in System Environment setting  
			//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver(options);
			
			//for demo web site for testing
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
			//its use implicitlyWait for wait some times all web element loading
			
			WebElement userName= driver.findElement(By.id("username"));
			userName.sendKeys(uname);
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys(pword);

			WebElement clickButton = driver.findElement(By.id("submit"));
			clickButton.click();
			
			String title= driver.getTitle();
			System.out.println("Title is: "+title);
			
			driver.quit();
	}

}
