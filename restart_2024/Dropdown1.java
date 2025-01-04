package restart_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id, 'u_0')]")).click();
				
		//1st way to select the dropdown
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		// System.out.println("TOtoal dropdowns " + birthMonth);
		birthMonth.get(8).click();
		
		////2nd way to select the dropdown
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr");
		Thread.sleep(2000);
		month.selectByValue("12");
		Thread.sleep(2000);
		month.selectByIndex(7);
		
		System.out.println(bm.getText());
		//System.out.println("_______");
		//System.out.println(month.getFirstSelectedOption().getText());
		
		
		//3rd way
		List<WebElement> dropdown = month.getOptions();
		for(int i=0; i<dropdown.size(); i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase("Sep"));
				dropdown.get(i).click();
			}
		
		Thread.sleep(2000);
		//4th way
		WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
		bm1.sendKeys("Oct");
		
		Thread.sleep(2000);

		//5th way
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");
		
		//check if dropdown support multi selection
		System.out.println(month.isMultiple()); //false
		
		//driver.close();
		
	}
	
}
