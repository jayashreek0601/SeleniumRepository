package week3.day2;

public class TestBrowser {

	public static void main(String[] args) {
		Browser browser=new Browser();
		browser.browserName="Generic Browser";
		browser.printBrowserDetails();
		browser.openURL();
		browser.closeBrowser();
		browser.navigateBack();
		System.out.println("------------------");
		Chrome chrome=new Chrome();
		chrome.browserName="Chrome";
		chrome.browserVersion=143.0f;
		chrome.printBrowserDetails();
		chrome.clearCache();
		chrome.openIncognito();
		chrome.openURL();
		chrome.closeBrowser();
		chrome.navigateBack();
		System.out.println("------------------");
		Edge edge= new Edge();
		edge.browserName="Edge";
		edge.browserVersion=144.0f;
		edge.printBrowserDetails();
		edge.takeSnap();
		edge.clearCookies();
		edge.openURL();
		edge.closeBrowser();
		edge.navigateBack();
		System.out.println("------------------");
		Safari safari= new Safari();
		safari.browserName="Safari";
		safari.browserVersion=26f;
		safari.printBrowserDetails();
		safari.readerMode();
		safari.fullScreenMode();
		safari.openURL();
		safari.closeBrowser();
		safari.navigateBack();
	}

}
