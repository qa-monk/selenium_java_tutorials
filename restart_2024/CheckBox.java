package restart_2024;

import java.util.List;

import javax.naming.directory.InvalidSearchControlsException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		Thread.sleep(2000);
		
		//1st way
		driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		
		
		//2nd way
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total number of checkboxes " +checkbox.size());
		
		System.out.println(checkbox.get(0).isDisplayed());
		System.out.println(checkbox.get(0).isSelected());
		System.out.println(checkbox.get(0).isEnabled());
		
		System.out.println(checkbox.get(1).isDisplayed());
		System.out.println(checkbox.get(1).isSelected());
		System.out.println(checkbox.get(1).isEnabled());
		
		Thread.sleep(1000);
		checkbox.get(0).click();
		
		Thread.sleep(2000);
		checkbox.get(1).click();
		
		//3rd way
		List<WebElement> checkbox1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		String expResult = "checkbox 2";
		
		for(int i=0; i<checkbox1.size(); i++) {
			
			if(checkbox1.get(i).getText().equalsIgnoreCase(expResult));
			checkbox1.get(i).click();
			System.out.println(expResult + " Clicked");
			break;
			
			
		}
		
		
		
		
		

	}

}
