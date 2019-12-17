import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("open the browser");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("close the browser")
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("login")
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("")
  }

}
