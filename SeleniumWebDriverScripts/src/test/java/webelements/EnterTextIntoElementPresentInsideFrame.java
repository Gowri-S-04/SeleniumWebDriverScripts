package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextIntoElementPresentInsideFrame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(frame2);
		Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		textbox.sendKeys("Gowri");
		System.out.println(textbox.getAttribute("value"));
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();
	}
}
