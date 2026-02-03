package week5.assignments;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the URL
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Scroll to the Element
		Actions act = new Actions(driver);
		WebElement scrollToView = driver.findElement(By.linkText("Conditions of Use & Sale"));
		act.scrollToElement(scrollToView).perform();
		//Get the text of the Element
		WebElement getTheText = driver.findElement(By.xpath("(//li[@class=\"nav_first\"])[last()]/a"));
		String text = getTheText.getText();
		System.out.println(text);
		//Take screenshot of the displayed webpage
		File screenshotSource = driver.getScreenshotAs(OutputType.FILE);
		File screenshotPath = new File("./screenshot/amazon.png");
		FileUtils.copyFile(screenshotSource, screenshotPath);
		//Close the browser
		driver.quit();
	}

}
