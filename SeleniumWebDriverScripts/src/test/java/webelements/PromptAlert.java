package webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		// simple alert
		d.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
		Alert a = d.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();

		// confirm alert
		d.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		Alert a1 = d.switchTo().alert();
		System.out.println(a1.getText());
		Thread.sleep(2000);
		a1.dismiss();

		// prompt alert
		d.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		Alert a2 = d.switchTo().alert();
		a2.sendKeys("Gowri");
		Thread.sleep(2000);
		System.out.println(a2.getText());
		a2.accept();
		Thread.sleep(2000);
		System.out.println(d.findElement(By.xpath("//*[@id=\"prompt-demo\"]")).getText());
		d.close();
	}
}
