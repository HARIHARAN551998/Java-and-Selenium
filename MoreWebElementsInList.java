package seleniumTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class MoreWebElementsInList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//now i don't use system set property because i added chrome driver in System Environment setting  
		//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		//for demo web site for testing
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Game of Thrones");
		Thread.sleep(5000); //don't use thread sleep 
		List<WebElement> searchSuggestions=
		driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		//int position=0;
		for (WebElement webElement : searchSuggestions) {
			String text=webElement.getText();
		      System.out.println(text);
		      if(text.contains("cast")){
		    	  webElement.click();
		    	 break;
		      }
		    }
		

	}
	
}
