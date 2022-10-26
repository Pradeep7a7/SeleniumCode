import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// Invoking Browsers
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://meark.org");
		System.out.println("URL is  " +driver.getCurrentUrl());
		System.out.println("Title is  " + driver.getTitle());
		driver.close();
		
	}

}
