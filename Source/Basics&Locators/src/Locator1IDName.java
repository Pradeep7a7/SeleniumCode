import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1IDName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test is Started");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kking8242@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("peepakumar");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}

}
