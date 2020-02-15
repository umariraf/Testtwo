package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElements {
	
	@Test
	public void HandleCSSEelements() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./dirver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://objectspy.space");
	
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input#sex-0")).click(); //tagname
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[value='Female']")).click(); //tag[attribute='value']
	Thread.sleep(3000);
	
	
	driver.close();
	driver.quit();
	
			

		
		
	}

}
