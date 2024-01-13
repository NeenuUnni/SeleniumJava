package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99SignIn {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.navigate().to("https://demo.guru99.com/selenium/newtours/");
		 
		 WebElement userNameField=driver.findElement(By.name("userName"));
		 userNameField.sendKeys("tutorial");
		 
		 WebElement passWordField=driver.findElement(By.name("password"));
		 passWordField.sendKeys("tutorial");
		 
		 WebElement signInField=driver.findElement(By.name("submit"));
		 signInField.click();

	}

}
