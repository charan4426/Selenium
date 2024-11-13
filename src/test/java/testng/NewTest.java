package testng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test (groups = "smoke")
  public void demo1() {
	  Reporter.log("Test1-Demo1-smoke",true);
  }
	  
	  @Test (groups = "sanity")
	  public void demo2() {
		  Reporter.log("Test1-Demo2-sanity",true);
		  }

		  @Test (groups = {"smoke ","sanity"})
		  public void demo3() {
			  Reporter.log("Test1-Demo3-smoke and sanity",true);
		  }
  }

