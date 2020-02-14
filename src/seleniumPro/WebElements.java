package seleniumPro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
		driver.get("https://www.expedia.com/");
		//getTitle()
		String browserTitle= driver.getTitle();
		System.out.println(browserTitle);
				
		String browserUrl= driver.getCurrentUrl();
		System.out.println(browserUrl);
		
		driver.findElement(By.id("header-account-menu")).click();
		driver.findElement(By.id("account-signin")).click();
		//driver.findElement(By.className("label")).click();
		WebDriverWait wait=new WebDriverWait(driver,15);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gss-signin-email']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gss-signin-email']")));
		driver.findElement(By.xpath("//input[@id='gss-signin-email']")).sendKeys("shahadat.sagor@gmail.com");
		driver.findElement(By.cssSelector("#gss-signin-password")).sendKeys("hena4321");
		driver.findElement(By.className("col gss-col-12")).click();
		
		/*List<WebElement>link= driver.findElements(By.tagName("a"));
		int x= link.size();
		System.out.println(x);
		/*for(int i=1; i<=x;i++){
		String listName=link.get(i).getText();
		System.out.println(listName);*/
		WebElement element = driver.findElement(By.cssSelector("#gss-join-program-check-label"));
		
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

