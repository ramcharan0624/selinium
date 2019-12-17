package aplha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().fullscreen();
		    Assert.assertEquals("Home",driver.getTitle());
		    driver.findElement(By.linkText("SignIn" )).click();
		   /* driver.findElement(By.id("userName")).sendKeys("lalitha");
		    driver.findElement(By.id("password")).sendKeys("Password123");
		    driver.findElement(By.name("Login")).click();
		    List<WebElement> a = driver.findElements(By.tagName("img"));
		    System.out.println(a.size());
		    List<WebElement> b = driver.findElements(By.tagName("link"));*/
		    driver.findElement(By.cssSelector("input#userName")).sendKeys("lalitha");
		    driver.findElement(By.cssSelector("input#password")).sendKeys("Password123");
		    driver.findElement(By.name("Login")).click();
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe"); 
		 driver =new InternetExplorerDriver();  
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

	}

