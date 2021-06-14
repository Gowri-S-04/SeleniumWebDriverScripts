package webdriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", ".//Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		takeScreenshot("GoogleSearchPage");
		driver.close();
	}

	public static void takeScreenshot(String fileName) throws IOException {
		// take screenshot and store it as a File format
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// copy the screenshot to desired location using copyFile() method
		FileUtils.copyFile(file, new File("./Screenshots\\" + fileName + ".png"));
	}
}