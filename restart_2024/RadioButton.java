package restart_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//1st way to select radio button
		
		driver.findElement(By.xpath("//a[contains(@id, 'u_0')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//2nd way to select radio button
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total radio button " + radio.size());
		System.out.println(radio.get(0).isSelected()); //false
		System.out.println(radio.get(1).isEnabled()); //true
		System.out.println(radio.get(2).isSelected()); //true
		
		Thread.sleep(2000);
		radio.get(1).click(); //male
		
		Thread.sleep(2000);
		System.out.println(radio.get(2).isSelected()); //false
		
		//3rd way
		
			List<WebElement> radio1 = driver.findElements(By.xpath("//label[@class='_58mt']"));
			System.out.println("Total radio buttons :"+ radio1.size());
			String expResult = "Female";
		
			for(int i=0; i<radio1.size(); i++) {
				if(radio1.get(i).getText().equalsIgnoreCase(expResult));
				radio1.get(i).click();
				System.out.println(expResult + " Clicked");
				break;
				}
		
	}
	
}
