package seleniumPro;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTeble {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chorome.driver", "C://Users//shahadat//workspace//selenium//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);//implicit wait
		driver.get("https://weather.com/weather/5day/L/usny0996");
		Thread.sleep(1000);
		//WebElement el= driver.findElement(By.xpath("//*[@id='twc-scrollabe']/table"));
		WebElement el= driver.findElement(By.xpath("//*[@id='twc-scrollabe']/table/tbody/tr[1]/td[2]"));
		List<WebElement> row= el.findElements(By.tagName("tr"));
		
		System.out.println(row.get(1).getText());
		/*for (int i=0; i<row.size();i++){
			List<WebElement> col = el.findElements(By.tagName("td"));
			
			for(int j=0; j<col.size();j++){
				System.out.println(col.get(j).getText());
			}
		}*/
		for (int i=0; i<row.size();i++){
			List<WebElement> col = el.findElements(By.tagName("td"));
			
			for(int j=0; j<col.size();j++){
				System.out.println(col.get(j).getText());
			}
		}
	}

}
