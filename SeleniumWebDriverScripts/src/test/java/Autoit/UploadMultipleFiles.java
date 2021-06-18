package Autoit;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadMultipleFiles {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://demo.guru99.com/test/upload/");
		WebElement button = d.findElement(By.xpath("//*[@id=\"file_wraper0\"]"));
		// JavascriptExecutor executor = (JavascriptExecutor) d;
		// executor.executeScript("arguments[0].click();", button);
		button.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C://Users/Gowri//Documents//SingleFileUpload.exe"); // execute .exe file
		Thread.sleep(5000);

		button.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C://Users/Gowri//Documents//MultipleFilesUpload.exe"); // execute .exe file
		Thread.sleep(5000);

		d.close();
	}
}
