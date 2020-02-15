package test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
	
	
	WebDriver driver;	//Global variable 

	@Test
	public void hoverOverTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./dirver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");
		//Element Library
		WebElement Deal_Menu_Element = driver.findElement(By.xpath("//button[@id='l1_4']"));
		By WORKSTATION_DEALS_LOCATOR = By.linkText("Workstation Deals");
		//HoverOver
		Actions action = new Actions(driver);
		action.moveToElement(Deal_Menu_Element).build().perform();
		driver.findElement(WORKSTATION_DEALS_LOCATOR).click();
		
	}
	
	@After
	public void closeEverthing() {
		driver.close();			//you need to create global varaible to close driver
		driver.quit();
		
	}

}
