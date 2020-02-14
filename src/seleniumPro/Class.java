package seleniumPro;

/*Launch the (Firefox/chrome) browser
Open website www.gmail.com
Inspect web element by using  class
Wait for 5 Seconds
Close the Browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chorome.driver", "C://Users//shahadat//workspace//selenium//driver//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.gmail.com");
	driver.findElement(By.id("profileIdentifier")).sendKeys("mjk");
	String actualTitle= driver.getTitle();
	String expectedTitle="http://www.gmail.com";
	if(actualTitle.equalsIgnoreCase(expectedTitle)){
		System.out.println("pass");
	}
	else
		System.out.println("fail");
	
	
	Thread.sleep(500);
	
	driver.close();
	}

}
