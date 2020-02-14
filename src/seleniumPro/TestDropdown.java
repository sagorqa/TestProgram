package seleniumPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class TestDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		/*WebElement element=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		boolean Isd=element.isDisplayed();
		if(Isd){
			boolean Ise=element.isEnabled();
			if(Ise){
				boolean Iss=element.isSelected();
				System.out.println("Success");
			}
			else
				element.click();
		}*/
		
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.id("email")).sendKeys("shahadat.sagor@gmail.com");
		driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(1) > td:nth-child(2) > label")).click();
		driver.findElement(By.xpath("//input[@class='pass']")).sendKeys("16331633");
	}

}
