package TestBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTest {
  @Test(priority=1,groups= {"regression"})
  public void f() {
	  System.out.println("@Test");
  }
  
  @Test(priority=2, groups = {"smoke","regression"})
  public void a() {
	  System.out.println("@Test a");
  }
  
  @Test(priority=3, groups = {"smoke", "regression"})
  public void b() {
	  System.out.println("@Test b");
  }
  
  @Test(priority=4, groups= {"smoke"})
  
  public void c() {
	  System.out.println("Invalid method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@BeforeSuite");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }

}
