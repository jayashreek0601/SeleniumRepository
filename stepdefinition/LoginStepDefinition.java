package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass{
	

	@Given("Launch the browser")
	public void launchBrowser() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
	}

	@And("Load the URL")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/.");

	}

	@And("Enter the Username as {string}")
	public void enterUserName(String username) {
		// Enter the Username
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@And("Enter the Password as {string}")
	public void enterPassword(String password) {
		// Enter the Password
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on the login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("It should be navigate to home page")
	public void verifyLogin() {
		// Click on CRM/SFA
		System.out.println("Logged in Successfully");
		
	}

	@But("It throws error Message")
	public void verifyInvalidLogin() {
		System.out.println("Invalid credential");
		driver.quit();
	}
}
