package Autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.seleniumeasy.com/test/generate-file-to-download-demo.html");
		d.findElement(By.xpath("//*[@id=\"textbox\"]")).sendKeys("Download File");
		d.findElement(By.xpath("//*[@id=\"create\"]")).click();
		d.findElement(By.xpath("//*[@id=\"link-to-download\"]")).click();
		Thread.sleep(2000);
		d.close();
	}
}
