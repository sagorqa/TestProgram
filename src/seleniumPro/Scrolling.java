package seleniumPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.expedia.com/");
		JavascriptExecutor obj= (JavascriptExecutor)driver;
		//obj.executeScript("window.scrollBy(5000,0)");
		obj.executeScript("window.scrollTo(0,5000)");
		//obj.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);

	}

}
