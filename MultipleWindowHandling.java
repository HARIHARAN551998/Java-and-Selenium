package seleniumTask;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		//setting of user to define the chrome options
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//now i don't use system set property because i added chrome driver in System Environment setting  
		//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		//for demo web site for testing
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("home")).click();
		System.out.println("Home Page URL: "+driver.getCurrentUrl());
		
		//when store the all window in set because all window is unique id why we choose for
		//collections set we handle the windows in index based.. 
		Set<String> windowHandles = driver.getWindowHandles();
		
		//to handle the all window so use in build function of index based but we can't 
		//use index faced action in SET, so SET to convert the LIST... 
		List<String> list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));   //when use index based all windows
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Next Window after click the URL: "+currentUrl);
		
		//then after to close the first window so window switch the old window after close.. 
		driver.switchTo().window(list.get(0));
		driver.close();
		
		//once again to get all window and store same way to the above
		Set<String> windowHandles2 = driver.getWindowHandles();
		//after we convert the SET into LIST we do first clear the old list property values 
		list.clear();
		list.addAll(windowHandles2);
		driver.switchTo().window(list.get(0));
		System.out.println("then after to close the old: "+driver.getCurrentUrl());
		
		driver.quit();
		
		//above i can just window change to after close
		//in the same way we can handle the number of the windows......
	}

}
