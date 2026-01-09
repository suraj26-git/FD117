package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {
		
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C://Users/q/Downloads/chromedriver-win64/chromedriver.exe");

			//WebDriver : interface,chromeDriver,EdgeDriver,FireFoxDriver,OperaDriver,RemoteDriver,SafariDriver
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));      //globally Applicable for line, waiting the object showing in the page
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.manage().window().maximize();
			driver.findElement(By.id("inputUsername")).sendKeys("suraj");
			driver.findElement(By.name("inputPassword")).sendKeys("suraj@123");
			driver.findElement (By.className ("signInBtn")).click();
			System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
			driver.findElement(By.linkText("Forgot your password?")).click();      // for Link
			Thread.sleep(2000);  //
			//driver.findElement(By.xpath("//*[@placeholder='Name']")).sendKeys("Suraj");
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Suraj");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("suraj@123");
			driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sourabh@123"); //child-parent
			driver.findElement(By.xpath("//form/input[3]")).sendKeys("8976504438");                        //parent-child
			//driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("98765447365");
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			System.out.println(driver.findElement(By.cssSelector("form p")).getText());
			driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#inputUsername")).sendKeys("suraj");
			driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
			driver.findElement(By.id("chkboxOne")).click();
			driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}
}
