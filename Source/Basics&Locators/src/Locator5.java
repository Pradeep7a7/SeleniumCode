import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Your test is Started");
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Pradeep@meark.org");
		driver.findElement(By.name("pw")).sendKeys("Okay");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
		driver.close();
	}

	public char[] main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Your test is Started");
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Pradeep@meark.org");
		driver.findElement(By.name("pw")).sendKeys("Okay");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.id("error")).getText());
		return null;
	}

}
