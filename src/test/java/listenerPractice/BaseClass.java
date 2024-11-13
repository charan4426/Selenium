package listenerPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class BaseClass {
		
		    // This method runs once before all tests in the suite are executed
		    @BeforeSuite
		    public void beforeSuite() {
		        System.out.println("Before Suite");
		    }

		    // This method runs once after all tests in the suite are executed
		    @AfterSuite
		    public void afterSuite() {
		        System.out.println("After Suite");
		    }

		    // This method runs before any test within <test> tags in the XML file
		    @BeforeTest
		    public void beforeTest() {
		        System.out.println("Before Test");
		    }

		    // This method runs after all tests within <test> tags in the XML file are completed
		    @AfterTest
		    public void afterTest() {
		        System.out.println("After Test");
		    }

		    // This method runs before the first method in each class is invoked
		    @BeforeClass
		    public void beforeClass() {
		        System.out.println("Before Class");
		    }

		    // This method runs after all methods in the current class have been executed
		    @AfterClass
		    public void afterClass() {
		        System.out.println("After Class");
		    }

		    // This method runs before each test method in the class is invoked
		    @BeforeMethod
		    public void beforeMethod() {
		        System.out.println("Before Method");
		    }

		    // This method runs after each test method in the class has been executed
		    @AfterMethod
		    public void afterMethod() {
		        System.out.println("After Method");
		    }
		}





