package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test (groups = "smoke")
  public void demo1() {
	  Reporter.log("Test2-Demo1-smoke",true);
  }
	  
	  @Test (groups = "regression")
	  public void demo2() {
		  Reporter.log("Test2-Demo2-sanity",true);
		  }

		  @Test (groups = {"smoke ","regression"})
		  public void demo3() {
			  Reporter.log("Test2-Demo3-smokeand regression",true);
		  }
  }

