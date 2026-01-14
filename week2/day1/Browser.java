package week2.day1;

public class Browser {
	public String launchBrowser(String browserName) {

		return browserName;

	}

	private void loadUrl() {
		System.out.println("Url loaded successfully");

	}

	public static void main(String[] args) {
		Browser obj1 = new Browser();
		String browser = obj1.launchBrowser("Chrome");
		System.out.println("BrowserName:" + " " + browser);
		obj1.loadUrl();

	}

}
