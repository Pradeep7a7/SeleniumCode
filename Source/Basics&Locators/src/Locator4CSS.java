import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4CSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test is Started");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#email")).sendKeys("Okay");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Okay");
		driver.findElement(By.cssSelector("div[class='_6ltg']")).click();
	}
}
