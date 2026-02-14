package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
@Parameters({"url","username","password"})
	@BeforeMethod
	public void preCondition(String url,String user,String pass) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		// launch the browser
		driver.get(url);
		// Enter the Username
		driver.findElement(By.id("username")).sendKeys(user);
		// Enter the Password
		driver.findElement(By.id("password")).sendKeys(pass);
		// Click on Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void postCondition() {
		// Close the Browser
		driver.quit();
	}
}
