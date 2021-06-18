package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateOrangeHRMHomePage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		String actualtitle = driver.getTitle();
		String expectedtitle = "OrangeHRM";
		System.out.println(actualtitle);
		System.out.println(expectedtitle);
		if (actualtitle.equals(expectedtitle)) {
			System.out.println("Pass:Title is Matched");
		} else {
			System.out.println("Fail:Title is Not Matched");
		}
		driver.close();
	}
}
