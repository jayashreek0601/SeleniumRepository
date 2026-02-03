package week5.assignments;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LeafTabsTest extends ProjectSpecificMethod {
	@Test
	public void creatLead() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bot Test");
		// Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lead003");
		// Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test03");
		// Enter the Title
		String expectedTitle = "Testing";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(expectedTitle);
		// Click on Create Lead
		driver.findElement(By.name("submitButton")).click();
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);

	}

}
