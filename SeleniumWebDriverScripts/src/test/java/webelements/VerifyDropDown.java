package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		// select specified option using select class
		Select country = new Select(driver.findElement(By.name("country")));
		if (country.isMultiple()) {
			country.selectByIndex(3);
			country.selectByValue("AMERICAN SAMOA");
			country.selectByVisibleText("ANTARCTICA");
			System.out.println("DropDown is Mulit Select DropDown");
		} else {
			System.out.println("Dropdown is a single select DropDown");
		}
		driver.get("http://jsbin.com/osebed/2");

		Select fruits = new Select(driver.findElement(By.id("fruits")));
		if (fruits.isMultiple()) {
			// multiple values select
			fruits.selectByIndex(1);
			fruits.selectByVisibleText("Banana");
			fruits.selectByValue("grape");
			System.out.println("DropDown is Mulit Select DropDown");
			// deselect multiple values
			fruits.deselectByIndex(1);
			fruits.deselectByVisibleText("Banana");
			fruits.deselectByValue("grape");
		} else {
			System.out.println("Dropdown is a single select DropDown");
		}
		driver.close();
	}
}