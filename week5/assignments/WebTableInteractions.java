package week5.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteractions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch the browser
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the From Station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
		//Enter the To Station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		// Sort on date uncheck
		WebElement checkBoxElement = driver.findElement(By.id("chkSelectDateOnly"));
		if(checkBoxElement.isSelected()) {
			checkBoxElement.click();
		}
		//Find Train Count
		List<WebElement> tableElements = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody/tr[td]"));
		int tableCount = tableElements.size();
		System.out.println("Train Count: "+tableCount);
		//Retrive all the train names
		List<WebElement> trainNames = driver.findElements(By.xpath("//div[@id=\"divTrainsList\"]/table[1]/tbody/tr[td]/td[2]"));
		for(int i=0; i<trainNames.size();i++) {
			String text = trainNames.get(i).getText();
			System.out.println("Train Names: "+text);
		}
		// Store train names in a List
		List<String> trainNameList = new ArrayList<>();

		for (WebElement train : trainNames) {
		    String text = train.getText().trim();
		    trainNameList.add(text);
		}

		// ---- Duplicate Verification Step ----
		Set<String> uniqueTrainNames = new HashSet<>();

		boolean duplicateFound = false;

		for (String name : trainNameList) {
		    if (!uniqueTrainNames.add(name)) {
		        System.out.println("Duplicate Train Name Found: " + name);
		        duplicateFound = true;
		    }
		}

		if (!duplicateFound) {
		    System.out.println("No duplicate train names found");
		}
		driver.quit();
	}

}
