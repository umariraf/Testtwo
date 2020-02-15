package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {
	
	@Test
	public void handlePopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./dirver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//form[@name='loginform']/descendant::input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		//handling Popup switch to frame(int index)
		
		driver.switchTo().alert().accept();
		
		driver.close();
		driver.quit();
		
		
	}
}
