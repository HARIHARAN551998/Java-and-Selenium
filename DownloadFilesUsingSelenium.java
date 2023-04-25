package seleniumTask;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFilesUsingSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setting of user to define the chrome options
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				
				//now i don't use system set property because i added chrome driver in System Environment setting  
				//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver(options);
				
				//for demo web site for testing
				driver.get("https://demo.automationtesting.in/FileDownload.html");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
				
				WebElement textHere=driver.findElement(
						By.xpath("//textarea[@id='textbox']"));
				
				textHere.sendKeys("Hi Hari! How Are You...");
				
				WebElement generateFile = driver.findElement(By.xpath("//button[@id='createTxt']"));
				generateFile.click();
				
				driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
				
				File fileLocation= new File("C:\\Users\\Danger Vishva\\Downloads");

				File[] totalFiles=fileLocation.listFiles();
				
				for (File file : totalFiles) {
					
					if(file.getName().equals("info.txt")){
						System.out.println("File is downloaded");
						break;
					}
				}
				
				
	}
}	
