package product;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class product1 {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id("userName")).sendKeys("lalitha");
	  driver.findElement(By.id("password")).sendKeys("Password123");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Actions actions=new Actions(driver);
	  actions.moveToElement(driver.findElement(By.partialLinkText("All"))).click().perform();
	  Thread.sleep(2000);
	  actions.moveToElement(driver.findElement(By.linkText("Electronics"))).click().perform();
	  Thread.sleep(2000);
	  actions.moveToElement(driver.findElement(By.partialLinkText("Head"))).click().perform();
	  actions.moveToElement(driver.findElement(By.partialLinkText("Add"))).click().perform();
	  actions.moveToElement(driver.findElement(By.xpath("//a[@style='color:green']"))).click().perform();
	  driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	 driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[contains(text(),'Andhra Bank')]")).click();
	driver.findElement(By.xpath("//a[@onclick='radioValue()']")).click();
	driver.findElement(By.name("userName")).sendKeys("123456");
	driver.findElement(By.name("password")).sendKeys("Pass@456");
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	
	  
	  
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
