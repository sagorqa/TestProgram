package seleniumPro;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C://Users//shahadat//workspace//Selenium//DRIVER//Chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.walgreens.com/register/regpersonalinfo.jsp");
			List<WebElement>link= driver.findElements(By.tagName("a"));
			int x= link.size();
			System.out.println(x);
			for(int i=1; i<=x;i++){
			String listName=link.get(i).getText();
			System.out.println(listName);
			boolean isD=driver.findElement(By.xpath("//input[@class='radio radio-primary']")).isDisplayed();
			if(isD){
				boolean IsE=driver.findElement(By.xpath("//input[@class='radio radio-primary']")).isDisplayed();
				if(IsE){
				boolean IsS	=driver.findElement(By.xpath("//input[@class='radio radio-primary']")).isSelected();
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
	}