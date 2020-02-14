package seleniumPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chorome.driver", "C://Users//shahadat//workspace//selenium//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//implicit wait
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(1000);
		driver.findElement(By.className("hasDatepicker")).click();
		

	}

}
