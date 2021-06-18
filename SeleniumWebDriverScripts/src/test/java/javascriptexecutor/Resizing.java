package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);// scroll down for the //
																							// element
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement resizeElement = driver.findElement(
				By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions actionsResize = new Actions(driver);
		// provide the x and y offset values
		actionsResize.dragAndDropBy(resizeElement, 100, 50).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
