import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","E:\\Study\\Selenium with Java\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https:meark.org");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.linkText("+91 9886016840")));
		// System.out.println(driver.getPageSource());
		driver.close();
		driver.quit();

	}

}
