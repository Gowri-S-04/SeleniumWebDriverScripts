package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateOrangeHRMHomePageUsingCurrentURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		String expectedurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		String actualurl = driver.getCurrentUrl();

		if (actualurl.equals(expectedurl)) {
			System.out.println("Pass: Home Page is Displayed");
		} else {
			System.out.println("Fail: Home Page is Not Displayed");
		}
		driver.close();
	}
}
