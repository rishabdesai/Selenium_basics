/* This code will open the www.facebook.com page using .get() method. 
 * Then using findElement, it will find the email field using id = 'email'
 * Then using sendKeys(), it will send the dummy text to that filed.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTechnique {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d_ris\\OneDrive\\903_testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//open facebook.com page, select user email field using ID, enter dummy value in it.
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("dummy@email.com");
		
		//select password field using name, enter dummy value
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		//select the link "forgot password" 
		driver.findElement(By.linkText("Forgotten password?")).click();	
		
	}

}
