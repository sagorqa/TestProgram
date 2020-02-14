package seleniumPro;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//DRIVER//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.expedia.com/Hotels");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//WebElement element = driver.findElement(By.xpath("//label[@class='check col gcw-hotel-add-flight']//input[@type='checkbox']"));
	WebElement element = driver.findElement(By.xpath("//label[@class='check col gcw-hotel-add-flight']"));
	boolean isD=element.isDisplayed();
	if(isD){
		boolean isE=element.isEnabled();
		if(isE){
			boolean isS=element.isSelected();
			if(isS){
				System.out.println("Already selected");
			}
			else
				element.click();
		}
		
	}
	}

}
