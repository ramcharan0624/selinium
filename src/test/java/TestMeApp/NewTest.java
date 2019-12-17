package TestMeApp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.naukri.com/");

	  Actions actions=new Actions(driver);
	  actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a/div"))).click().perform();
	/*  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our\n" + 
	  		"												Offices')]"))).
	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();*/
	  Set<String> set= driver.getWindowHandles();
	  for(String str :set) {
		  driver.switchTo().window(str);
	  }
	  driver.close();
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
