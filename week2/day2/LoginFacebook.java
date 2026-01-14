package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the URL
		driver.get("https://www.facebook.com/");
		//Enter the Username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Enter the Password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//Click on Login
		driver.findElement(By.name("login")).click();
		//Get the Title
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();	
			

	}

}
