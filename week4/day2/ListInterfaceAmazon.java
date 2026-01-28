package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Entered the URL
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Entered the Search Input
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> priceList = new ArrayList<>();
		for (int i = 0; i < priceElements.size(); i++) {

		    WebElement price = priceElements.get(i);

		    String text = price.getText();

		    if (!text.isEmpty()) {
		        text = text.replace(",", "");
		        priceList.add(Integer.parseInt(text));
		    }
		}

		Collections.sort(priceList);
		//Printing the Lowest Mobile Phone Price

		System.out.println("Lowest mobile phone price is: ₹" + priceList.get(0));

		driver.quit();

	}

}
