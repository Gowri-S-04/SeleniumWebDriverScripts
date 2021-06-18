package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		// Explicit wait to wait for the frame.
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
		WebElement scroll = driver.findElement(By.xpath("/html/body/p[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(scroll).build().perform();
		Thread.sleep(2000);
		WebElement toolTipEle = driver.findElement(By.xpath("//*[@id=\"age\"]"));
		String toolTipTxt = toolTipEle.getAttribute("title");
		System.out.println("ToolTipMessage: " + toolTipTxt);
		// Using assert to verify the expected and actual value
		// Assert.assertEquals("We ask for your age only for statistical
		// purposes.",toolTipTxt);
		driver.close();
	}
}
