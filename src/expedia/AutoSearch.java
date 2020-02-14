package expedia;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSearch {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();//Instance create of WebDriver
		
	driver.manage().window().maximize();
		
	//WebDriverWait wait=new WebDriverWait(driver,15);
	//wait.until(ExpectedConditions.elementToBeClickable(By.className("sp-name")));
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
	driver.get("https://www.expedia.com/Flights");
	driver.findElement(By.xpath("//button[@id='tab-flightHotelCar-tab-flp-fhc']")).click();
	driver.findElement(By.xpath("//input[@id='package-origin-flp-fhc']")).sendKeys("Jfk");
	List<WebElement> list = driver.findElements(By.xpath("//input[@placeholder='City or airport']"));
	
	System.out.println(list.size());
	for(int i =0; i<list.size(); i++){
		System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("New York, NY (JFK-John F. Kennedy Flights)")){
			list.get(i).click();
		}
	}

}
}