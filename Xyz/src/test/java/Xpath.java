import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Xpath {
	@Test
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Browser exe\\Chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("dropdown- toggle disabled")).click();
}
}