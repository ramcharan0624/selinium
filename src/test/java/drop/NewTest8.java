package drop;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest8 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	WebElement   dropdown = driver.findElement(By.id("select-demo"));
	  Select drop = new Select(dropdown);
	  drop.selectByValue("Sunday");
	  
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
