package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class NewTest4 {
  @Test
  public void asserttest() {
	  Assert.assertTrue(10<11);
	  Assert.assertFalse(22>23);
	  int x=20;
	  Assert.assertEquals(20,x);
	  NewTest4 n1 = new NewTest4();
	  NewTest4 n2 = new NewTest4();
	  NewTest4 n3;
	  n3=n2;
	  Assert.assertNotSame(n3, n1);
	
  }
}
