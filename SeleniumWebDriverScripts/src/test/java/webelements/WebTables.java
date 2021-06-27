package webelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/webtables");

		// getting Column Details
		List<WebElement> col = d
				.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]"));
		int col_size = col.size();
		System.out.println("No.of Column: " + col_size);
		System.out.println("Columns names are:");
		for (WebElement col_Details : col) {
			String col_Names = col_Details.getText();
			System.out.println(col_Names + "		");
		}

		// getting Row Details
		List<WebElement> row = d.findElements(By.xpath("//div[@class='rt-tbody']"));
		int row_size = row.size();
		System.out.println("No.of Rows: " + row_size);

		for (int i = 1; i <= row_size; i++) {
			List<WebElement> row_details = d.findElements(
					By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[" + i
							+ "]/div[1]"));
			for (WebElement erow_detail : row_details) {
				String row_values = erow_detail.getText();
				System.out.println(row_values + "		");
			}
		}
		Thread.sleep(2000);
		d.close();
	}
}