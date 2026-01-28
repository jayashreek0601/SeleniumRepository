package week4.assignment;

public class LoginPage extends BasePage {
	@Override
	public void performCommonTasks() {

		// Calling parent class method using super
		super.performCommonTasks();

		System.out.println("Performing login-specific tasks from LoginPage");
	}

	public void login(String username, String password) {
		findElement("usernameField");
		enterText("usernameField", username);

		findElement("passwordField");
		enterText("passwordField", password);

		clickElement("loginButton");
	}

	public static void main(String[] args) {

		LoginPage loginPage = new LoginPage();

		// Calls overridden method
		loginPage.performCommonTasks();

		System.out.println("------------------");

		loginPage.login("xxyyzz", "password123");
	}

}
