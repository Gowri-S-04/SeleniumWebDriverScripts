package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogleTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("Pass:Title is Matched");
		} else {
			System.out.println("Fail:Title is Not Matched");
		}
		String url = driver.getCurrentUrl();
		if (url.contains("google.co.in")) {
			System.out.println("Pass: url has co.in ");
		} else {
			System.out.println("Fail:url dont have co.in " + url);
		}
		driver.close();
	}
}
