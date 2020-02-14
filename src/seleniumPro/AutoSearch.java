package seleniumPro;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//shahadat//workspace//Selenium//DRIVER//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/Flights");
		driver.findElement(By.xpath("//button[@id='tab-flight-tab-flp']")).click();
		driver.findElement(By.xpath("//[@id='flight-type-roundtrip-label-flp']")).click();
		WebElement origin= driver.findElement(By.xpath("//input[@id='flight-origin-flp']"));
		origin.clear();
		origin.sendKeys("jfk");
		origin.sendKeys(Keys.ENTER);
	
	WebElement destination= driver.findElement(By.xpath("//input[@id='flight-destination-flp']"));
	destination.clear();
	destination.sendKeys("dub");
	Thread.sleep(2000);
	destination.sendKeys(Keys.ARROW_DOWN);
	destination.sendKeys(Keys.ENTER);
	}
}