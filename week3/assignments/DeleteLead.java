package week3.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
		driver.findElement(By.name("phoneNumber")).sendKeys("6657876979");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement leadText = driver.findElement(By.xpath("(//a[text()='Test']//preceding::a)[last()-1]"));
		String leadTextValue = leadText.getText();
		leadText.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		WebElement leadField = driver.findElement(By.name("id"));
		leadField.sendKeys(leadTextValue);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String expectedMsg = "No records to display";
		WebElement actualExpectedMsg = driver.findElement(By.xpath("//div[text()='No records to display']"));
		if (actualExpectedMsg.isDisplayed()) {
			System.out.println("Lead is delected successfully"+" "+expectedMsg);
		} else {
			System.out.println("Lead is not delected successfully");
		}
		driver.quit();
	}

}
