package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	
	@Test
	public void ValidUserShouldBeAbleToLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./dirver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.bestbuy.com/");
		
		driver.findElement(By.xpath("//div[@class='search-bar-container']")).click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		
		
		
		driver.close();
		driver.quit();
		
	}
	
	
}
