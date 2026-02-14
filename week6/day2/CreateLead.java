package week6.day2;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@BeforeTest
	public void setValues() {
		filename = "CreateLead";
	}

	@Test(dataProvider = "fetchData")
	public void createLead(String companyName, String firstName, String lastName) {

		// Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		// Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		// Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		// Enter the Title
		String expectedTitle = "Testing";
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(expectedTitle);
		// Click on Create Lead
		driver.findElement(By.name("submitButton")).click();
	}

}
