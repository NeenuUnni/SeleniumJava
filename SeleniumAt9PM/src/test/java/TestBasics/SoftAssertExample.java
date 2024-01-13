package TestBasics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
  @Test
  public void softAssertEg() {
	  String actual="Hello World";
	  String expected="Hello World";
	  
	  SoftAssert softeg=new SoftAssert();
	  softeg.assertEquals(actual, expected);
  }
  
  @Test
  
  public void second()
  {
	  boolean f=true;
	  SoftAssert softeg2=new SoftAssert();
	  softeg2.assertTrue(f);
	  
	  softeg2.assertAll();
  }
}
