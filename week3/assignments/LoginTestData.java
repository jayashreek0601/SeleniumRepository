package week3.assignments;

public class LoginTestData extends TestData {

	public void enterUsername() {
		System.out.println("Enter Username");
	}

	public void enterPassword() {
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		LoginTestData loginTestData = new LoginTestData();
		loginTestData.enterUsername();
		loginTestData.enterPassword();
		loginTestData.navigateToHomePage();
		loginTestData.enterCredentials();
	}

}
