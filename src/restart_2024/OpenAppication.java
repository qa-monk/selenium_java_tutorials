package restart_2024;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAppication {

	public static void main(String[] args) throws InterruptedException {

		//Setting the property of the chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		
		//Launching chrome browser instance
		ChromeDriver driver = new ChromeDriver();
		
		//Open the URL using get() method
		driver.get("https://tutorialsninja.com/demo/");

		//Maximize the window
		driver.manage().window().maximize();
		
		//Delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		
		//Open URL using navigate method
		driver.navigate().to("https://google.com");
		
		//Refresh the page
		driver.navigate().refresh();
		
		//navigate to back
		driver.navigate().back();
		
		//navigate to forward
		driver.navigate().forward();
		//fetch current url
		System.out.println(driver.getCurrentUrl());
		
		//Get title of the web page
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		//Close the browser
		driver.close();
		
		
	}

}
