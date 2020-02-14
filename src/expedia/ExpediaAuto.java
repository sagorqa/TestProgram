package expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		//instance of webdriver interface
		WebDriver driver= new ChromeDriver();
		//maximize ()
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		//to get expected title
		String title= driver.getTitle();
		System.out.println(title);
		//title varification
		String expectedTitle="Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations";
		if(title.equalsIgnoreCase(expectedTitle))
		System.out.println("Successful");
		else
			System.out.println("Failed");
		driver.findElement(By.id("header-account-menu")).click();
		driver.findElement(By.id("account-register")).click();
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("signup-first-name"))).sendKeys("Md Anowar");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("signup-first-name"))).sendKeys("Md Anowar");
		//driver.findElement(By.name("signup-first-name")).sendKeys("Md Anowar");
		driver.findElement(By.name("signup-last-name")).sendKeys("Shahadat");
		driver.findElement(By.cssSelector("#gss-signup-email")).sendKeys("shahadat.sagor@gmail.com");
		driver.findElement(By.xpath("//input[@id='gss-signup-password']")).sendKeys("Sagor1633");
		driver.findElement(By.id("gss-signup-submit")).click();
		Thread.sleep(500);
	
}
}