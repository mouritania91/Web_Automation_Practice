package mouri.project.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExamples {
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("beforeSuite..........");
		
	}
	
	@Test (priority = 1)
	public void testExample() {
		System.out.println("test1..........");
	}
	
	@Test (priority = 0)
	public void testExample2() {
		System.out.println("test2..........");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("afterSuite..........");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass..........");
	}
	
	@AfterClass
	public void afterlass() {
		System.out.println("afterclass..........");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest..........");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest..........");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod..........");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod..........");
	}
	

}
