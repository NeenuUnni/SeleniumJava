package TestBasics;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SoftAssertSubmit {
	WebDriver driver;
  @Test
  public void softAssertSub() {
	  
	     SoftAssert softsub=new SoftAssert();
	     
	     WebElement firstNameField=driver.findElement(By.id("validationCustom01"));
		 firstNameField.sendKeys("Neenu");
		 
		 boolean isDisplayed=firstNameField.isDisplayed();
		 softsub.assertTrue(isDisplayed);
		 
		 WebElement lastNameField=driver.findElement(By.id("validationCustom02"));
		 lastNameField.sendKeys("Baby");
		 
		 boolean isEnabled=lastNameField.isEnabled();
		 softsub.assertTrue(isEnabled);
		 
		 WebElement userNameField=driver.findElement(By.id("validationCustomUsername"));
		 userNameField.sendKeys("neenz");
		 
		 WebElement cityField=driver.findElement(By.id("validationCustom03"));
		 cityField.sendKeys("Kochi");
		 
		 WebElement stateField=driver.findElement(By.id("validationCustom04"));
		 stateField.sendKeys("Kerala");
		 
		 WebElement zipField=driver.findElement(By.id("validationCustom05"));
		 zipField.sendKeys("682030");
		 
		 WebElement clickField=driver.findElement(By.id("invalidCheck"));
		 clickField.click();
		 
		 WebElement submit=driver.findElement(By.className("btn-primary"));
		 submit.click();
		 
		 
		 String expectedmsg="Form has been submitted successfully!";
		 WebElement msg=driver.findElement(By.id("message-one"));
		 String actualmsg=msg.getText();
		 
		 softsub.assertEquals(actualmsg, expectedmsg);
		 softsub.assertAll();
  }
  @BeforeTest
  public void beforeTest() {
	     driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
