package expedia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//Instance create of WebDriver
		
		driver.manage().window().maximize();
		
	//WebDriverWait wait=new WebDriverWait(driver,15);
	//wait.until(ExpectedConditions.elementToBeClickable(By.className("sp-name")));
	driver.get("https://www.expedia.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
	WebElement element = driver.findElement(By.xpath("//label[contains(@class,'check col gcw-flights-add-hotel')]"));
	boolean isD=element.isDisplayed();
	if(isD){
		boolean IsE=element.isEnabled();
		if(IsE){
		boolean IsS	=element.isSelected();
		if(IsS){
		System.out.println("Already selected");	
		}
		else
			element.click();
		
	}
		else
	System.out.println("Displayed False");
	
}
	}
}


	




	


