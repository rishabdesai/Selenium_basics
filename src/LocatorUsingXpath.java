/* This code will open the login.salesforce.com page using .get() method. 
 * Use findElement to locate username (using ID) and password (using name) field, enter some dummy data
 * use xpath to find the login button, then click it.
 * Xpath format "//tagname[@attribute='value']"
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
		
		// xpath format "//tagname[@attribute='value']" 
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("dummy@email.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
	}

}
