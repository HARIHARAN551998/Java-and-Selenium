package seleniumTask;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropDown {

	public static void main(String[] args) {

		
		//setting of user to define the chrome options
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//now i don't use system set property because i  added chrome driver in System Environment setting  
		//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		//for demo web site for testing
		
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000)); //its use for wait some times all webelement loading

		WebElement heros = driver.findElement(By.id("superheros"));
		Select myHeros=new Select(heros);
		boolean ismult = myHeros.isMultiple();//when check for its multiple or not
		System.out.println("my heros: "+ismult);
		
		myHeros.selectByValue("aq");		//use when i selectByValue method
		myHeros.selectByValue("bt");
		myHeros.selectByValue("bp");
		myHeros.selectByValue("cm");
		//print the selected options
		List<WebElement> selectedOptions = myHeros.getAllSelectedOptions();
		System.out.println("when i clicked the multiple options are: ");
		for(WebElement selected:selectedOptions) {
			System.out.println(selected.getText());
		}
	}

}
