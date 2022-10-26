import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3xpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test is Started");
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("Username Goes Here");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password");
	}

}
