package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 WebElement firstNameField=driver.findElement(By.id("validationCustom01"));
		 wait.until(ExpectedConditions.visibilityOf(firstNameField));
		 firstNameField.sendKeys("Neenu"); // sendkeys is to enter value to a text field
		 
		 WebElement lastNameField=driver.findElement(By.id("validationCustom02"));
		 lastNameField.sendKeys("Baby");
		 
		 WebElement userNameField=driver.findElement(By.id("validationCustomUsername"));
		 userNameField.sendKeys("neenz");
		 
		 WebElement cityField=driver.findElement(By.id("validationCustom03"));
		 cityField.sendKeys("Kochi");
		 
		 WebElement stateField=driver.findElement(By.id("validationCustom04"));
		 stateField.sendKeys("Kerala");
		 
		 WebElement zipField=driver.findElement(By.id("validationCustom05"));
		 zipField.sendKeys("682030");
		 
		 WebElement clickField=driver.findElement(By.id("invalidCheck"));
		 wait.until(ExpectedConditions.elementToBeClickable(clickField));
		 clickField.click();
		 
		 boolean isDisplayed=firstNameField.isDisplayed();
		 System.out.println("First Name field is Displayed:"+isDisplayed);
		 
		 boolean isEnabled=firstNameField.isEnabled();
		 System.out.println("First Name field is Enabled:"+isEnabled);
		 
		 String tagname=firstNameField.getTagName();
		 System.out.println("FirstName field tagName is:"+tagname);
		 
		 String value=firstNameField.getAttribute("placeholder");
		 System.out.println("FirstName placeholder is:"+value);
		 
		 firstNameField.clear();
		 
		 String fontweight=firstNameField.getCssValue("font-weight");
		 System.out.println("FirstName field font weight is:"+fontweight);
		 
		 Dimension d=firstNameField.getSize();
		 int height=d.height;
		 int width=d.width;
		 System.out.println("FirstName field height is:"+height);
		 System.out.println("FirstName field width is:"+width);
		 
		 Point p=firstNameField.getLocation();
		 int x=p.x;
		 int y=p.y;
		 System.out.println("FirstName field x-axis:"+x);
		 System.out.println("FirstName field y-axis:"+y);
		 

	}

}
