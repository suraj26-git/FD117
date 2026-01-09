package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivity {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // globally Applicable for line, waiting the
		                           										// object showing in the page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https:www.google.com");             //Internally Navigate Page
		driver.navigate().back();
		driver.navigate().forward();
	}
}
