import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Locators {
	@Test
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.ie.driver","E:\\Browser exe\\IE 32 bit\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		}
	
}
