package seleniumPro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleniumPrac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//DRIVER//Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Select obj= new Select(driver.findElement(By.id("month")));
		obj.selectByVisibleText("Mar");
		obj.selectByValue("4");
		List<WebElement>elementCount= obj.getOptions();
		System.out.println(elementCount.size());
		
	}

	}


