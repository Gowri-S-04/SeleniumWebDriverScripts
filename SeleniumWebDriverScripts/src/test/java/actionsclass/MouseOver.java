package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		login.click();
		WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement usermanagement = driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement users = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		Actions a = new Actions(driver);
		a.moveToElement(admin).moveToElement(usermanagement).moveToElement(users).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
