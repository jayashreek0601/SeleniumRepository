package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch the browser
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> countColumns = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr/td[1]"));
		int columnsText = countColumns.size();
		System.out.println(columnsText);
		List<WebElement> allDataElements = driver
				.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr/td[1]"));
		for (int i = 0; i < allDataElements.size(); i++) {
			String text = allDataElements.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
