package webelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://jqueryui.com/datepicker/");
		d.switchTo().frame(0);
		d.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);
		WebElement monthyear = d.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div"));
		monthyear.click();
		Thread.sleep(2000);

		WebElement dateWidget = d.findElement(By.id("ui-datepicker-div"));
		List<WebElement> rows = dateWidget.findElements(By.tagName("tr"));
		List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns) {
			// Select 13th Date
			if (cell.getText().equals("13")) {
				cell.findElement(By.linkText("13")).click();
				Thread.sleep(2000);
				break;
			}
		}
		d.close();
	}
}
