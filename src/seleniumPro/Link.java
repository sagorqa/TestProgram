package seleniumPro;
//Text for autosuggestions
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//shahadat//workspace//Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		/*List<WebElement>link=driver.findElements(By.tagName("a"));
		int x=link.size();
		System.out.println(x);*/
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		
		List<WebElement>list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@ class='sbtc']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			if(list.get(i).getText().contains("selenium tutorial")){
			list.get(i).click();
			break;
		}
		
	}
  }
}
