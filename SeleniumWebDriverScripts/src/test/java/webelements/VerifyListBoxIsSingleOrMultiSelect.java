package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyListBoxIsSingleOrMultiSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		WebElement select = driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));

		Select s = new Select(select);

		if (s.isMultiple()) {
			System.out.println("Multi Select List Box");
		} else {
			System.out.println("Single Select List Box");
		}

		s.selectByIndex(0);
		s.selectByValue("Wednesday");
		s.selectByVisibleText("Friday");
		WebElement text = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]"));
		System.out.println(text.getText());
		driver.close();
	}
}
