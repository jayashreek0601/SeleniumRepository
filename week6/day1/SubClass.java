package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubClass extends BaseClass {
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		String[][] readData= ReadExcel.readData();
		return readData;
		}
	

	@Test(dataProvider="fetchData")
	public void createLead(String companyName, String firstName, String lastName) {

		// Click on Leads Tab
		driver.findElement(By.linkText("Leads")).click();
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
