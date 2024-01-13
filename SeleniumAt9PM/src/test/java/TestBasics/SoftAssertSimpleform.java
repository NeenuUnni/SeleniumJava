package TestBasics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SoftAssertSimpleform {
	WebDriver driver;
  @Test
  public void softSimpleform() {
	  
	     SoftAssert softsim=new SoftAssert();
	     
	     WebElement enterMessageField=driver.findElement(By.id("single-input-field"));
		 enterMessageField.sendKeys("First Assignment on Selenium Basics");
		 
		 WebElement showMessageButton=driver.findElement(By.id("button-one"));
		 showMessageButton.click();
		 
		 WebElement valueAField=driver.findElement(By.id("value-a"));
		 valueAField.sendKeys("20");
		 
		 WebElement valueBField=driver.findElement(By.id("value-b"));
	     valueBField.sendKeys("30");
		 
		 WebElement getTotalField=driver.findElement(By.id("button-two"));
		 getTotalField.click();
		 
		 String expectedmsg1="Your Message : First Assignment on Selenium Basics";
		 WebElement msg1=driver.findElement(By.id("message-one"));
		 String actualmsg1=msg1.getText();
		 
		 softsim.assertEquals(actualmsg1, expectedmsg1);
		 
		 String expectedmsg2="Total A + B : 50";
		 WebElement msg2=driver.findElement(By.id("message-two"));
		 String actualmsg2=msg2.getText();
		 
		 softsim.assertEquals(actualmsg2, expectedmsg2);
		 
		 softsim.assertAll();
  }
  @BeforeTest
  public void beforeTest() {
	     driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
  }

  @AfterTest
  public void afterTest() {
  }

}
