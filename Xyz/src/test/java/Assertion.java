import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertion {
	@Test
	
	public void checkBox() {
		System.setProperty("webdriver.chrome.driver","E:\\Browser exe\\Chrome exe\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertFalse(false);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue("driver.findElement(By.id(\"ctl00_mainContent_chk_friendsandfamily\")).isSelected()"!);
		//Assert.assertTrue(true);
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.quit();
	}
}
	