package seleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chorome.driver", "C://Users//shahadat//workspace//selenium//driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement target=driver.findElement(By.id("droppable"));
		Actions obj=new Actions(driver);
		obj.dragAndDrop(source, target).build().perform();
		
	}

}
