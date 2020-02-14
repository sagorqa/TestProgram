package seleniumPro;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHendle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chorome.driver", "C://Users//shahadat//workspace//selenium//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//implicit wait
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		Thread.sleep(1000);
		Set<String> objS= driver.getWindowHandles();
		Iterator<String> objI=objS.iterator();
		String mainW=objI.next();
		String childW=objI.next();
		driver.switchTo().window(childW);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.switchTo().window(mainW);
		System.out.println(driver.getTitle());
		
	}

}

	


