package lofinacc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest6 {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		 // driver.manage().window().fullscreen();
		//  Assert.assertEquals("Home",driver.getTitle());
		  driver.findElement(By.id("firstName")).sendKeys("xdfgv");
		  driver.findElement(By.id("lastName")).sendKeys("ccdfsa");
		  driver.findElement(By.id("username")).sendKeys("xxyyyfg4567");
		  driver.findElement(By.name("Passwd")).sendKeys("Abcde@1887");
		  driver.findElement(By.name("ConfirmPasswd")).sendKeys("Abcde@1887");
		  driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		  driver.findElement(By.cssSelector("input#phoneNumberId")).sendKeys("1234567895");
		  
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