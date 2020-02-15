package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousElements {
	
	@Test
	public void explorvariouselements() throws InterruptedException {
		
		//set default driver
		System.setProperty("webdriver.chrome.driver", "./dirver/chromedriver.exe");
		
		//Instantiate ChromDriver object
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//deleted cookies and history
		driver.manage().deleteAllCookies();
		//Maximize browser
		driver.manage().window().maximize();
		driver.get("http://objectspy.space");
		
		//slow down java
		Thread.sleep(2000); //dont use trycatch use InterruptedException
		
		//Click on Radio button male
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("kausik");
		Thread.sleep(3000);
		//linked
		//driver.findElement(By.linkText("Link Test : New Page")).click();
		//Thread.sleep(5000);
		
		//click on partial link
		driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
		Thread.sleep(3000);
		
		
		//work start from here everything come from driver
		//close the driver
		driver.close();
		//quit the driver
		driver.quit();
		
		
		
		
		
	}
	
	

}
