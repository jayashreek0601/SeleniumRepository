package week4.assignment;

public class BasePage {
	public void findElement(String locator) {
        System.out.println("Finding element using locator: " + locator);
    }

    public void clickElement(String locator) {
        System.out.println("Clicking on element: " + locator);
    }

    public void enterText(String locator, String text) {
        System.out.println("Entering text '" + text + "' into element: " + locator);
    }

    public void performCommonTasks() {
        System.out.println("Performing common tasks from BasePage");
    }
}

