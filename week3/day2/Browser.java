package week3.day2;

public class Browser {
	String browserName ;
	float browserVersion;

	public void openURL() {
		System.out.println("Open URL");
	}

	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	public void navigateBack() {
		System.out.println("Navigate Back");
	}
	public void printBrowserDetails() {
	    System.out.println("Browser Name: " + browserName);
	    System.out.println("Browser Version: " + browserVersion);
	}


}
