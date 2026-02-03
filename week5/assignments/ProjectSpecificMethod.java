package week5.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	public WebDriver driver;

	@BeforeMethod
	public void preCondition() {

		// Test data
		String url = "http://leaftaps.com/opentaps/.";
		String username = "DemoSalesManager";
		String password = "crmsfa";

		// Launch browser
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		// load the URL
		driver.get(url);
		// Enter the Username
		driver.findElement(By.id("username")).sendKeys(username);
		// Enter the Password
		driver.findElement(By.id("password")).sendKeys(password);
		// Click on Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@AfterMethod
	public void postCondition() {
		// Close the Browser
		driver.quit();

	}

}
