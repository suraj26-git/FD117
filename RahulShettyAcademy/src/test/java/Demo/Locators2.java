package Demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		String name="Suraj";
		System.setProperty("webdriver.chrome.driver", "D://Java By Kiran/MyChormeDriver/chromedriver-win64/chromedriver.exe");

		// WebDriver :
		// interface,chromeDriver,EdgeDriver,FireFoxDriver,OperaDriver,RemoteDriver,SafariDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // globally Applicable for line, waiting the
		String password = getPassword(driver);										// object showing in the page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
	    driver.findElement(By.xpath("//*[text()='Log Out']")).click();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext = driver.findElement(By.cssSelector("form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordtext.split("'");
		//String[] passwordArray2 = passwordArray[1].split("'");
		
		String password = passwordArray[1].split("'")[0];
		return password;
	}

}
