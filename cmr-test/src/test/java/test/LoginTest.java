package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class LoginTest {
	
	@Test
	public void ValidUserShouldBeAbleToLogin() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./dirver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://techfios.com/test/billing/?ng=admin/");
			
			driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
			
			driver.findElement(By.xpath("//*[contains(@placeholder,'assword')]")).sendKeys("abc123");
			
			driver.findElement(By.xpath("//*[contains(text(), 'ign in') and @name='login']")).click();
						
			String dashboardTitleXpath = "//div[@id='page-wrapper']//descendant::h2[contains(text(),'Dashboard')]";
			Thread.sleep(3000);
			
			String expectedTitle = "Dashboard- TechFios Test Application - Billing";
			
			String actualTitle = driver.getTitle();
			
//			if(expectedTitle.equalsIgnoreCase(actualTitle)) {
//				System.out.println("Test pass");				//make failure
//			}else {
//				System.out.println("Test Failed");
//				
//				throw new RuntimeException("Test Failed");
//				
//			}
//			
			//Assert.assertEquals("Dashboard page did not display", expectedTitle, actualTitle); //failure use this command
			
			//Explicit wait
			WebDriverWait wait = new WebDriverWait(driver, 10); //more then 60 wait wave the flag
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dashboardTitleXpath)));
			
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(dashboardTitleXpath)));
			
			
			Thread.sleep(3000);			
			driver.close();
			driver.quit();
			
		}

}
