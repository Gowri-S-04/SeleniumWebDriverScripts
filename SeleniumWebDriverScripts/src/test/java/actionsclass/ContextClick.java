package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(button).build().perform(); // Right click on the button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click(); // copy
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText()); // capturing the text present on alert box
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); // close alert box
		Thread.sleep(2000);
		driver.close();
	}
}
