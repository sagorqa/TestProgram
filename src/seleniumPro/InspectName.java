package seleniumPro;

/*Launch the (Firefox/chrome) browser
Open website www.gmail.com
Inspect web element by using name,
Wait for 5 Seconds
Close the Browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//selenium//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com");
		driver.findElement(By.className("sp-name")).click();
		driver.findElement(By.className("linkbar__link" )).click();
		driver.findElement(By.className("tab-label")).click();
		//driver.findElement(By.linkText("linkbar__link ")).click();
		driver.findElement(By.id("flight-type-one-way-label-flp")).click();
		driver.findElement(By.id("flight-origin-flp")).sendKeys("jfk");
		driver.findElement(By.className("autocomplete-dropdown")).click();
		driver.findElement(By.id("flight-destination-flp")).sendKeys("Dhk");
		driver.findElement(By.id("flight-departing-single-flp")).clear();
		//driver.findElement(By.xpath("//input[@class='flight-origin-hp-flight']")).click();
		String expectedTitle="https://www.expedia.com";
		String actualTitle=driver.getTitle();
		
		System.out.println("Browser title");
		
		String browserurl= driver.getCurrentUrl();
		System.out.println("current url");
		//Thread.sleep(500);
		//driver.close();
	}
}
