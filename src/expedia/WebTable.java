package expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//Instance create of WebDriver
		
		driver.manage().window().maximize();
		
	driver.get("https://www.expedia.com/Flights");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
	WebElement element = driver.findElement(By.xpath("//input[@id='flight-departing-single-flp']"));
	

	}

}
