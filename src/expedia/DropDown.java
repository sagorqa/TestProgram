package expedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();//Instance create of WebDriver
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//implicit wait
		
	//WebDriverWait wait=new WebDriverWait(driver,15);
	//wait.until(ExpectedConditions.elementToBeClickable(By.className("sp-name")));
	driver.get("https://www.expedia.com/");
	
	boolean isD=driver.findElement(By.xpath("//span[@id='content-box']")).isDisplayed();
	if(isD){
		boolean IsE=driver.findElement(By.xpath("//span[@id='content-box']")).isEnabled();
		if(IsE){
		boolean IsS	=driver.findElement(By.xpath("//span[@id='content-box']")).isSelected();
		if(IsS){
		System.out.println("Already selected");	
		}
		
		else
			System.out.println("Enabled False");
	}
	System.out.println("Displayed False");
	
}

}
	}


