package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		// Click on Accounts Tab
		driver.findElement(By.linkText("Accounts")).click();
		// Click on Create Accounts
		driver.findElement(By.linkText("Create Account")).click();
		// Enter the Account name
		String expectedAccountName = "Test124";
		driver.findElement(By.id("accountName")).sendKeys(expectedAccountName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// Select the Industry
		WebElement industryElement = driver.findElement(By.name("industryEnumId"));
		Select options = new Select(industryElement);
		options.selectByVisibleText("Computer Software");
		// Select the Ownership
		WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
		Select options1 = new Select(ownershipElement);
		options1.selectByVisibleText("S-Corporation");
		// Select the Source
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
		Select options2 = new Select(sourceElement);
		options2.selectByValue("LEAD_EMPLOYEE");
		// Select the Marketing Campaign
		WebElement marketingElement = driver.findElement(By.id("marketingCampaignId"));
		Select options3 = new Select(marketingElement);
		options3.selectByIndex(6);
		// Select the State or Province
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select options4 = new Select(stateElement);
		options4.selectByValue("TX");
		// Click on Create Account
		driver.findElement(By.className("smallSubmit")).click();
		// Verify that the Account Name is displayed correctly
		
		WebElement accountNameElement = driver.findElement(By.xpath("//span[text()='Account Name']/following::span[1]"));
		String fullText = accountNameElement.getText().trim();

		System.out.println("Full text from UI: " + fullText);

		String actualAccountName;

		if (fullText.contains("("))
		{
		    actualAccountName =
		            fullText.substring(0, fullText.indexOf("(")).trim();
		} 
		else 
		{
		    actualAccountName = fullText;
		}

		System.out.println("Displayed Account Name: " + actualAccountName);

		if (actualAccountName.equals(expectedAccountName)) 
		{
		    System.out.println("Account name is displayed correctly");
		} 
		else
		{
		    System.out.println("Account name mismatch");
		}
		
		// Close the browser
		driver.quit();

	}

}
