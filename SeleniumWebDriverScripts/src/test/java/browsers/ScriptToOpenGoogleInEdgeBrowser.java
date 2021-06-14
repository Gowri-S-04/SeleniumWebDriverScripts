package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScriptToOpenGoogleInEdgeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
}
