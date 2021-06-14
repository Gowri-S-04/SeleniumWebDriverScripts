package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptToOpenGoogleInFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}
}
