package webdriver;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowserUsingUserInput {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter browser: ");
		String browser = s.next();
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
