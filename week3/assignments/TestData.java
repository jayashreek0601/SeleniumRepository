package week3.assignments;

public class TestData {
	public void enterCredentials() {
		System.out.println("Enter Credentials");
	}

	public void navigateToHomePage() {
		System.out.println("Navigate to Home Page");
	}

	public static void main(String[] args) {
		TestData testData = new TestData();
		testData.enterCredentials();
		testData.navigateToHomePage();
	}
}
