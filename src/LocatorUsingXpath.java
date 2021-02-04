/* This code will open the login.salesforce.com page using .get() method. 
 * Use findElement to locate username and password field, enter some dummy data
 * use xpath to find the login button, then click it.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUsingXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d_ris\\OneDrive\\903_testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//open salesforce page, select user email & password, enter dummy value in it.
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("dummy@email.com");
		driver.findElement(By.name("pw")).sendKeys("123456");
		// select login button using xpath, click it.
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		
	}

}
