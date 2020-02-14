package expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		//browser path
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//Instance create of WebDriver
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//implicit wait
		//explicit wait
		//WebDriverWait wait=new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.elementToBeClickable(By.className("sp-name")));
		
		//browser name
		driver.get("https://www.expedia.com/");
		
		//getTitle()
		String browserTitle= driver.getTitle();
		System.out.println(browserTitle);
		
		String browserUrl= driver.getCurrentUrl();
		System.out.println(browserUrl);
		
		boolean displayStatus= driver.findElement(By.id("package-advanced-options-hp-package")).isDisplayed();
		System.out.println(displayStatus);
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("sp-name"))).click();;
		
		
		
		//driver.findElement(By.className("sp-name")).click();
		driver.findElement(By.className("linkbar__link" )).click();
		driver.findElement(By.className("tab-label")).click();
		//driver.findElement(By.linkText("linkbar__link ")).click();
		driver.findElement(By.id("flight-type-one-way-label-flp")).click();
		driver.findElement(By.id("flight-origin-flp")).sendKeys("jfk");
		driver.findElement(By.className("autocomplete-dropdown")).click();
		driver.findElement(By.id("flight-destination-flp")).sendKeys("Dhk");
		driver.findElement(By.id("flight-departing-single-flp")).clear();
		driver.findElement(By.xpath("//input[@class='flight-origin-hp-flight']")).click();
		//driver.findElement(By.xpath("//button[@class='flight-departing-wrapper-single-flp']")).sendKeys();
		//driver.findElement(By.linkText("header-itineraries"));
		//driver.findElement(By.cssSelector(selector))
		//WebElement element=driver.findElement(By.className("datepicker-cal-month-header"));
		Select dropdown=new Select (driver.findElement (By.className("datepicker-cal-month-header")));
		driver.findElement(By.className("flight-departing-single-flp"));
		boolean status=driver.findElement(By.id("page-header")).isDisplayed();
		
		Thread.sleep(500);
		driver.close();
	}
}

		