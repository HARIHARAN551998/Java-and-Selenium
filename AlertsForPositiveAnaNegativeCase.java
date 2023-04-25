package seleniumTask;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsForPositiveAnaNegativeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setting of user to define the chrome options
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		//now i don't use system set property because i added chrome driver in System Environment setting  
		//System.setProperty("webdriver.chrome.driver", "D:\\hari\\selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(options);

		//for demo web site for testing
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));



		// Positive scenario - user clicks OK
		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("alert text name: "+text);
		alert.accept();
		String positiveResult = driver.findElement(By.id("output")).getText();
		
		if (positiveResult.contains("OK")) {
			System.out.println("User was accepted.");
		} else {
			System.out.println("User was not accepted.");
		}

		// Negative scenario - user clicks Cancel
		alert.dismiss();
		String negativeResult = driver.findElement(By.id("output")).getText();

		if (negativeResult.contains("Cancel")) {
			System.out.println("Exiting the program");
		} else {
			System.out.println("program not exiting");
		}

		// Positive scenario - user enters valid input
		driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Hari");
		alert1.getText();
		
		System.out.println("alert text name: "+text);
		alert.accept();
		String validInput = driver.findElement(By.id("output")).getText();

		if (validInput != null && !validInput.isEmpty()) {
			System.out.println("Hello, " + validInput + "!");
		} else {
			System.out.println("No name entered.");
		}

		// Negative scenario - user cancels input
		alert1.dismiss();
		String inValidInput = driver.findElement(By.id("output")).getText();

		if (inValidInput != null && !inValidInput.isEmpty()) {
			
				System.out.println("You are name" + inValidInput );
		}
		 else {
			System.out.println("your cancel the alert");
		}
	}


}


