package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {
	@BeforeTest
	public void setValues() {
		filename = "EditLead";
	}

	@Test(dataProvider = "fetchData")
	public void editLead(String phoneNumber, String companyName) {
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Find Leads']")));
		driver.findElement(By.xpath("//a[text()='10771']")).click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Edit")));
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.name("submitButton")).click();
	}

}
