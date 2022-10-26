import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator6CustomXpathCss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/* //Using Xpath
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("kking8242@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("peepakumar");
		driver.findElement(By.xpath("//button[@type='submit']")).click(); */
		//Using CSS
		driver.manage().window().maximize();
		System.out.println("Test Started Here");
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']")).sendKeys("kking8242@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("peepakumar");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		Locator5 P =new Locator5();
		System.out.println(P.main());
	}
	

}
