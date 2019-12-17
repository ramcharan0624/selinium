package Avail_userid;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void testRegistration() {
	String x,y;
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignUp")).click();
	  driver.findElement(By.id("userName")).sendKeys("fdgfg");
	  driver.findElement(By.id("firstName")).click();
	assertTrue(driver.findElement(By.xpath("//*[@id=\"err\"]")).isDisplayed(),x="Not" );
 
	if(x=="Not")
	{
		System.out.println("User Name Exists");
		 driver.findElement(By.id("userName")).clear();
		
	}
	        driver.findElement(By.id("userName")).clear();
		  driver.findElement(By.id("userName")).sendKeys("Ramcha");
		driver.findElement(By.id("firstName")).sendKeys("Ramcharan");
		driver.findElement(By.id("lastName")).sendKeys("Bodduluru");
		driver.findElement(By.id("password")).sendKeys("Password123");
	    driver.findElement(By.name("confirmPassword")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys("ram123@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("1234567897");
		driver.findElement(By.name("dob")).sendKeys("06/01/1998");
		driver.findElement(By.id("address")).sendKeys("balaji street kodambakkam");
		driver.findElement(By.id("securityQuestion")).click();
		driver.findElement(By.xpath("//option[@value='411012']")).click();
		driver.findElement(By.id("answer")).sendKeys("sam");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	  
	
	
	
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
	  driver= new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	 
  }

}
