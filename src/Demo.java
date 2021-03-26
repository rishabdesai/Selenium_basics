import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		//invoke .exe file first
		String key ="webdriver.chrome.driver";
		String value="C:\\Users\\d_ris\\OneDrive\\903_testing\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		
		
		//create driver object for chrome browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); // open the URL on the chrome browser
		System.out.println(driver.getTitle());  //validate if the page title is correct 
		
		//to check if you are landed on correct url
		System.out.println(driver.getCurrentUrl());
		
		//to check the page source (f12)
		System.out.println(driver.getPageSource());
		
		//to navigate to another web page
		//driver.get("http://yahoo.com");
		
		//to mimic back button of browser
		//driver.navigate().back();
		//driver.navigate().forward();
		
		//to close the current browser
		driver.close();
		
		//to close all the browsers
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
