/*Regular Expression format for xpath "//tagname[contains(@attribute ,'value')]" 
 * Regular Expression format for css "tagname[attribute*='value']" 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorUsingRegularExpression {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\d_ris\\OneDrive\\903_testing\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//open salesforce page, select user email & password, enter dummy value in it.
		driver.get("http://login.salesforce.com");
		
		// Regular Expression format for xpath "//tagname[contains(@attribute ,'value')]" 
//		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("dummy@email.com");
//		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[contains(@value,'Log In')]")).click();
		
		// Regular Expression format for css "tagname[attribute*='value']"
		driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("dummy@email.com");
		driver.findElement(By.cssSelector("input[name*='pw']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name*='Login']")).click();
		 //if login fails, then print the error message on console using getText()
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
	}
}
