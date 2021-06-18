package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://api.jquery.com/dblclick/");
		Actions act = new Actions(d);
		d.switchTo().frame(0);
		WebElement ele = d.findElement(By.xpath("/html/body/div"));
		((JavascriptExecutor) d).executeScript("arguments[0].scrollIntoView();", ele);
		String color = ele.getCssValue("color").toString();
		System.out.println("color before double click:" + color);
		Thread.sleep(5000);
		act.doubleClick(ele).build().perform();
		Thread.sleep(2000);
		color = ele.getCssValue("color").toString();
		System.out.println("color after double click:" + color);
		d.close();
	}
}