package TestBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;

public class MercuryLogin {
	
	WebDriver driver;
  @Test
  public void VerifyLogin() {
	     WebElement userNameField=driver.findElement(By.name("userName"));
	      Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	 			.withTimeout(Duration.ofSeconds(10))
	 			.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	 			fluentWait.until(ExpectedConditions.visibilityOf(userNameField));
		 userNameField.sendKeys("tutorial");
		 
		 WebElement passWordField=driver.findElement(By.name("password"));
		 passWordField.sendKeys("tutorial");
		 
		 WebElement signInField=driver.findElement(By.name("submit"));
		 signInField.click();
  }
  @BeforeTest
  public void beforeTest() {
	     driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
