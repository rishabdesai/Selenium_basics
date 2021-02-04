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
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
