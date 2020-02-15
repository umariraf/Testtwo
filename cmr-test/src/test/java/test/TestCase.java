package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class TestCase {
	
	@Test
	public void ValidUserShouldBeAbleToLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./dirver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String dashboardTitleXpath = "//div[@id='page-wrapper']//descendant::h2[contains(text(),'Dashboard')]";
		Thread.sleep(3000);
		String expectedTitle = "Dashboard- TechFios Test Application - Billing";
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Dashboard page did not display", expectedTitle, actualTitle); 
		
		driver.findElement(By.xpath("//a[contains(text(),'Add Deposit')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='select2-account-container']")).click();
		driver.findElement(By.xpath("//*[@value='Rent']")).click();
		driver.findElement(By.xpath("//*[@id='description']")).sendKeys("My First Rent");
		driver.findElement(By.xpath("//*[@id='amount']")).sendKeys("5000");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
		driver.close();
		driver.quit();
		}
}
