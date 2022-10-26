import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator8ParentChild {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium with Java\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Parent Child Relationship
		driver.get("https://www.google.com//");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Pradeep");
		System.out.println("Current URL Is -"+driver.getCurrentUrl());
		System.out.println("Current Browser Titile Is -"+driver.getTitle());
		driver.close();
	}

}
