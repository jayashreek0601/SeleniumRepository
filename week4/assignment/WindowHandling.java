package week4.assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		// launch the browser
		driver.get("http://leaftaps.com/opentaps/.");
		// Enter the Username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on Contacts tab
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// Click on Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		String parentWindow = driver.getWindowHandle();
		// Click lookup icon
		driver.findElement(By.xpath("(//input[@id='ComboBox_partyIdFrom']/following::img)[1]")).click();
		// Switch to child window
		for (String win : driver.getWindowHandles()) {
			if (!win.equals(parentWindow)) {
				driver.switchTo().window(win);
				break;
			}
		}

		// Select Contact ID
		driver.findElement(By.xpath("(//*[text()='Contact ID']//following::a[@class='linktext'])[1]")).click();

		// Child window auto closes → switch back
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("(//input[@id='ComboBox_partyIdTo']/following::img)[1]")).click();

		// Switch to second child window
		for (String win : driver.getWindowHandles()) {
			if (!win.equals(parentWindow)) {
				driver.switchTo().window(win);
				break;
			}
		}

		// Perform action in second window
		driver.findElement(By.xpath("(//*[text()='Contact ID']//following::a[text()='DemoCustomer'])[1]")).click();

		// Switch back again
		driver.switchTo().window(parentWindow);
		// Click on Merge
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		// Accept the alert
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert simpleAlert = wait.until(ExpectedConditions.alertIsPresent());
		simpleAlert.accept();
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.quit();
	}

}
