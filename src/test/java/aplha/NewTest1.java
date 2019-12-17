package aplha;

import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority = 2)
  public void f() {
	  System.out.println("google");
  }

@Test(priority = 1)
public void a() {
	System.out.println("facebook");
}
}
