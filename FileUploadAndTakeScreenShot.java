package seleniumTask;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class FileUploadAndTakeScreenShot {

	public static void main(String[] args) throws AWTException, IOException {

		//setting of user to define the chrome options
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//now i don't use system set property because i added chrome driver in System Environment setting  
		//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		//for demo web site for testing
		
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000)); //its use for wait some times all webelement loading

		
		String projectPath = System.getProperty("user.dir"); //to get the path of the project
		driver.findElement(By.id("input-4")).sendKeys(projectPath+"./files/Xpath Notes.txt");
		
		//After the file upload we take screen shot
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./Screenshot/uploaded.png");
		FileHandler.copy(sourceFile, destinationFile);
		
		driver.quit();
		
	}

}
