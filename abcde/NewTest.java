package abcde;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
	 WebDriver driver; 
  @Test
   public void f() {
		  driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebDriverWait ws=new WebDriverWait(driver, 20);
		driver.findElement(By.id("identifierId")).sendKeys("9094730447");
		driver.findElement(By.className("RveJvd snByac")).click();
	
		
		
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	}
