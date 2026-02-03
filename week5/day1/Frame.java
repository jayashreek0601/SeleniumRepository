package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch the browser
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Switch to frame
		driver.switchTo().frame("iframeResult");
		// Click on Try It
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		// Switch to alert
		Alert alert = driver.switchTo().alert();
		// Accept or dismiss the alert
		alert.accept();
		// Get the Text to verify
		WebElement getTextElement = driver
				.findElement(By.xpath("(//h2[text()='JavaScript Confirm Box']//following::p)[1]"));
		String verifyText = getTextElement.getText();
		if (verifyText.equals("You pressed OK!")) {
			System.out.println("Result:" + verifyText + " " + "Clicked on the alert");
		} else {
			System.out.println("Alert is not clicked");
		}
		// Close the browser
		driver.quit();
	}

}
