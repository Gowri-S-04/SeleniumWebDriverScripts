package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiyStatusOfCheckBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement rememberme = d.findElement(By.xpath("//*[@id=\"RememberMe\"]"));
		// verify check box is displayed in page or not
		if (rememberme.isDisplayed()) {
			System.out.println("Checkbox is Displayed");
		} else {
			System.out.println("Checkbox is Not Displayed");
		}
		// verify whether element is enabled or disabled
		if (rememberme.isEnabled()) {
			System.out.println("Checkbox is Enabled");
		} else {
			System.out.println("Checkbox is Disabled");
		}
		// verify whether element is a check box or not
		String elementtype = rememberme.getAttribute("type");
		if (elementtype.equals("checkbox")) {
			System.out.println("Remember Me is a CheckBox ");
		} else {
			System.out.println("Remember Me is Not Check Box");
		}
		rememberme.click(); // click link using click() method
		// rememberme.sendKeys(Keys.ENTER);// click link without using click() method
		// verify whether element is selected or not selected
		if (rememberme.isSelected()) {
			System.out.println("CheckBox is Selected");
		} else {
			System.out.println("CheckBox is Not Selected");
		}
		d.close();
	}
}
