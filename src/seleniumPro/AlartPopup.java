package seleniumPro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartPopup {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chorome.driver", "C://Users//shahadat//workspace//selenium//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//implicit wait
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Alert obj=driver.switchTo().alert();
		obj.accept();
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Alert obj1=driver.switchTo().alert();
		obj.sendKeys("Sagor");
		Thread.sleep(500);
		obj.accept();

	}

}
