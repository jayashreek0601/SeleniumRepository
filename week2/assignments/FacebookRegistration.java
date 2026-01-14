package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on Create new Account
		driver.findElement(By.linkText("Create new account")).click();
		//Enter the First Name
		driver.findElement(By.name("firstname")).sendKeys("Bot");
		//Enter the Last Name
		driver.findElement(By.name("lastname")).sendKeys("Test");
		//Select the DOB(Day)
		WebElement dayElement = driver.findElement(By.id("day"));
		Select day = new Select(dayElement);
		day.selectByVisibleText("9");
		//Select the DOB(Month)
		WebElement monthElement = driver.findElement(By.id("month"));
		Select month = new Select(monthElement);
		month.selectByVisibleText("Jun");
		////Select the DOB(Year)
		WebElement yearElement = driver.findElement(By.id("year"));
		Select year = new Select(yearElement);
		year.selectByVisibleText("2001");
		//Select the Gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//Enter the Mobile Number or Email
		driver.findElement(By.name("reg_email__")).sendKeys("3848484844");
		//Enter the Password
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
		//Close the Browser
		driver.quit();

	}

}
