import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropdown {
	
	@Test
public void assertons() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","E:\\Browser exe\\Chrome exe\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	 driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
	Select dropdown1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	dropdown1.selectByIndex(3);
	driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
	Select dropdown2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
	dropdown2.selectByIndex(3);
	driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
	Select dropdown3= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
	dropdown3.selectByIndex(2);
}
}
