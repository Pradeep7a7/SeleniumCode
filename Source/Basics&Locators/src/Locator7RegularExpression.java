import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator7RegularExpression {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Regular Expression Using Xpath
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kking8242@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("peepakumar");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Current URL Is -"+" "+driver.getCurrentUrl());
		System.out.println("Current Browser Titile Is -"+" "+driver.getTitle());
		driver.close();
		/* //Regular Expression Using CSS
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[class*='inputtext _55r1']")).sendKeys("kking8242@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder*='Password']")).sendKeys("peepakumar");
		driver.findElement(By.cssSelector("button[name*='login']")).click();
		System.out.println("Current URL Is -"+driver.getCurrentUrl());
		System.out.println("Current Browser Title Is -"+driver.getTitle());
		driver.close(); */
	}

}
