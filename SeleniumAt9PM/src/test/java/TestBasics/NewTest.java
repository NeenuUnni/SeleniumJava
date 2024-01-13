package TestBasics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
  @Parameters({"userNameField","passWordField"}) 
  @Test
  
  public void browserVerify(String userNameField, String passWordField) {
	  
	  if(userNameField.equals("tutorial") && passWordField.equals("tutorial"))
	  {
	     WebElement username=driver.findElement(By.name("userName"));
		 username.sendKeys("tutorial");
		 
		 WebElement password=driver.findElement(By.name("password"));
		 password.sendKeys("tutorial");
		 
		 WebElement signInField=driver.findElement(By.name("submit"));
		 signInField.click();
  }
	  else
	  {
		  System.out.println("Invalid login credentials");
	  }
  }
  
  
  @Parameters({"browser"})
  @BeforeTest
  public void beforeTest(String browser) {
//	  String browser = "Chrome";
	  
	  if(browser.equals("Chrome")) {
		  driver = new ChromeDriver();
	  }
	  else if(browser.equals("Edge")) {
		  driver = new EdgeDriver();
	  }
	  else {
		  System.out.println("Invalid browser");
	  }
	  
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  
  }

  @AfterTest
  public void afterTest() {
//	  driver.close();
  }

}
