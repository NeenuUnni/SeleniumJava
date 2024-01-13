package TestBasics;

import org.testng.annotations.Test;

import basics.ExcelRead;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class ExcelReadExample {
	WebDriver driver;
  @Test(dataProvider="dp")
  public void verifyexcelread(String username, String password) {
	  WebElement emailField=driver.findElement(By.xpath("//input[@name='email']"));
	  emailField.sendKeys(username);
	  WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
	  passwordField.sendKeys(password);
	  WebElement submitbutton=driver.findElement(By.xpath("//button[text()='Sign in']"));
	  submitbutton.click();
  }  
@DataProvider//from where we need to take data for this test is provided by dp
    public Object[][] dp() throws InvalidFormatException, IOException
	  {
		 Object [][] data= ExcelRead.getDataFromExcel("D:\\Selenium\\excelreadfile.xlsx","Sheet1");
		 return data;
	  }
//here we use before method because every time we need to reuse the same code
	  //no of parameters=no of columns in the excel
	  //no of time@test get executed=no of rows in excel	  

  @BeforeMethod
  public void beforeMethod() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));//implicit wait
		driver.get("https://qalegend.com/crm/index.php/signin"); 
  }

  @AfterMethod
  public void afterMethod() {
//	  driver.close();
  }

}
