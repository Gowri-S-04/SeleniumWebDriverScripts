package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveValueInTextBoxWithoutClearMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("Admin");
		System.out.println(username.getAttribute("id"));
		username.sendKeys(Keys.CONTROL + "a");
		username.sendKeys(Keys.DELETE);
		driver.close();
	}
}
