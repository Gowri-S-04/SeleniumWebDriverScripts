package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement target = driver.findElement(By.xpath("//*[@id='box107']"));
		Actions act = new Actions(driver);
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
		//First method
		act.dragAndDrop(source, target).build().perform(); // Second method
		Thread.sleep(2000);
		driver.close();
	}
}
