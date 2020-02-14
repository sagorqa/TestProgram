package seleniumPro;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chorome.driver", "C://Users//shahadat//workspace//selenium//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		List<WebElement>iframecount=driver.findElements(By.tagName("iframe"));
		System.out.println(iframecount.size());
		driver.switchTo().frame(0);
		String drag=driver.findElement(By.id("draggable")).getText();
		System.out.println(drag);
		driver.switchTo().defaultContent();
		
		 }

}
