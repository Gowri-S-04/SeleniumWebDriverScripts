package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiyStatusOfRadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		WebElement radiobutton = driver
				.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input"));
		// verify radiobutton is displayed in page or not
		if (radiobutton.isDisplayed()) {
			System.out.println("RadioButton is Displayed");
		} else {
			System.out.println("RadioButton is Not Displayed");
		}
		// verify whether radiobutton is enabled or disabled
		if (radiobutton.isEnabled()) {
			System.out.println("RadioButton is Enabled");
		} else {
			System.out.println("RadioButton is Disabled");
		}
		radiobutton.click();
		// verify whether radiobutton is selected or not
		if (radiobutton.isSelected()) {
			System.out.println("RadioButton is Selected");
		} else {
			System.out.println("RadioButton is not selected");
		}
		driver.close();
	}
}
