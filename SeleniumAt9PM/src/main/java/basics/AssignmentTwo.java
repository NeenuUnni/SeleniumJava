//https://demo.guru99.com/selenium/newtours/register.php

package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		 
		 WebElement enterFirstName=driver.findElement(By.name("firstName"));
		 enterFirstName.sendKeys("Neenu");
		 
		 WebElement enterLastName=driver.findElement(By.name("lastName"));
		 enterLastName.sendKeys("Unnikrishnan");
		 
		 WebElement enterPhoneNumber=driver.findElement(By.name("phone"));
		 enterPhoneNumber.sendKeys("8330847026");
		 
		 WebElement enterEmailId=driver.findElement(By.name("userName"));
		 enterEmailId.sendKeys("neenusara55@gmail.com");
		 
		 WebElement enterAddress=driver.findElement(By.name("address1"));
		 enterAddress.sendKeys("Minoa Apartments");
		 
		 WebElement enterCityField=driver.findElement(By.name("city"));
		 enterCityField.sendKeys("Kochi");
		 
		 WebElement enterStateField=driver.findElement(By.name("state"));
		 enterStateField.sendKeys("Kerala");
		 
		 WebElement enterPostalCode=driver.findElement(By.name("postalCode"));
		 enterPostalCode.sendKeys("682030");
		 
		 WebElement enterUserName=driver.findElement(By.id("email"));
		 enterUserName.sendKeys("Neenz");
		 
		 WebElement enterPassword=driver.findElement(By.name("password"));
		 enterPassword.sendKeys("Qazwsx123@!");
		 
		 WebElement enterConfirmPassword=driver.findElement(By.name("confirmPassword"));
		 enterConfirmPassword.sendKeys("Qazwsx123@!");
		 
		 WebElement enterSubmitQuery=driver.findElement(By.name("submit"));
		 enterSubmitQuery.click();
		 
	}

}
