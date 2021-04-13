import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import utils.ExcelUtil;

public class OpenFaceBook extends ExcelUtil {
	
	public void openBrowser()  {
		System.setProperty("webdriver.chrome.driver","E:\\Browser exe\\Chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
       WebElement username =driver.findElement(By.id("email"));
      username.sendKeys(ExcelUtil.getFirstRow(1, 0)); 
      
       WebElement password= driver.findElement(By.id("pass"));
       password.(ExcelUtil.getSecondRow(1, 1));
       
       
       
       
       
       
//       WebElement loginBtn =driver.findElement(By.name("login"));
//       loginBtn.click();
//       Thread.sleep(5000);
//       WebElement forgotBtn= driver.findElement(By.className("_97w4"));
//       forgotBtn.click();
//       WebElement findAccount= driver.findElement(By.name("email"));
//       findAccount.sendKeys("4749379");
//       Thread.sleep(5000);
//		driver.quit();
	}

	public static void main(String[] args) {
		OpenFaceBook ob= new OpenFaceBook();
		ob.openBrowser();
	}	
}
		

	
