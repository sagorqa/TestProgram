package seleniumPro;

/*Launch the (Firefox/chrome) browser
Open website www.gmail.com
Inspect web element by using ID,
Wait for 5 Seconds
Close the Browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//DRIVER//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("md-tile")).click();
		Thread.sleep(5000);
		driver.close();
		String expectedTitle="https://www.google.com/gmail/about/#";
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equalsIgnoreCase(expectedTitle) ){
			
			System.out.println("success");
}
		else
		System.out.println("fail");	
	}

}
