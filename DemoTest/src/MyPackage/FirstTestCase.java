package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		// No need to set system property for ChromeDriver using Selenium 4.6 and above
        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Get page source : "+driver.getPageSource());
        driver.quit();
		
	}
}
