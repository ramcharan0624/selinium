package data;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest2 {
  @Test(dataProvider = "dp")
  public void f(String n, int s) {
	  System.out.println(n+ "is" +s);
  }

  @DataProvider
  public Object[][] dp() {
    Object dp[][]  = {
    		{ "ram","hr"},
    		{"sam","tl"},
    };
    	return dp;	
    
    }
  }

