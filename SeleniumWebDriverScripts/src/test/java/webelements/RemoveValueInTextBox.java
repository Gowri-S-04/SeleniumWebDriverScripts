
package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveValueInTextBoxWithClearMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		username.sendKeys("Admin");
		System.out.println(username.getAttribute("value"));
		username.clear();
		driver.close();
	}
}
