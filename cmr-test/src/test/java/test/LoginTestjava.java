package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestjava {
	
	@Test
	public void handleCSSEelements() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./dirver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://techfios.com/test/billing/?ng=admin/");
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techfiosdemo@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
						
			driver.close();
			driver.quit();
			
		}

}



