//Assignment - 26/10/2023; https://selenium.obsqurazone.com/simple-form-demo.php

package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		 
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
		 
		 WebElement innerTextField=driver.findElement(By.id("message-one"));
         String innertext=innerTextField.getText();
         System.out.println("The inner text field is:"+innertext);
         
         WebElement getTotalText=driver.findElement(By.id("message-two"));
         String gettotal=getTotalText.getText();
         System.out.println("The total of A and B is:"+gettotal);
	}

}
