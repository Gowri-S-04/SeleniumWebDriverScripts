package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateOrangeHRMHomePageUsingElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));
		if (logout.isDisplayed()) {
			System.out.println("Pass: Home Page is Displayed");
		} else {
			System.out.println("Fail: Home Page is Not Displayed");
		}
		logout.click();
		driver.close();
	}
}
