package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathGuruRegister {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 
		 WebElement xpathfirstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		 WebElement xpathlastName=driver.findElement(By.xpath("//input[@name='lastName']"));
		 xpathfirstName.sendKeys("Neenu");
		 xpathlastName.sendKeys("Baby");
		 
		 WebElement xpathPhone=driver.findElement(By.xpath("//input[@name='phone']"));
		 xpathPhone.sendKeys("8330847026");
		 
		 WebElement xpathEmail=driver.findElement(By.xpath("//input[@name='userName']"));
		 xpathEmail.sendKeys("neenusara55@gmail.com");
		 
		 WebElement xpathAddress=driver.findElement(By.xpath("//input[@name='address1']"));
		 xpathAddress.sendKeys("Minoa Heritage");
		 
		 WebElement xpathcity=driver.findElement(By.xpath("//input[@name='city']"));
		 xpathcity.sendKeys("Kochi");
		 
		 WebElement xpathstate=driver.findElement(By.xpath("//input[@name='state']"));
		 xpathstate.sendKeys("Kerala");
		 
		 WebElement xpathcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		 xpathcode.sendKeys("682030");
		 
		 WebElement xpathuserName=driver.findElement(By.xpath("//input[@name='email']"));
		 xpathuserName.sendKeys("Neenub");
		 
		 WebElement xpathpass=driver.findElement(By.xpath("//input[@name='password']"));
		 xpathpass.sendKeys("Qwerty321!@");
		 
		 WebElement xpathconfirmpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		 xpathconfirmpass.sendKeys("Qwerty321!@");
		 
		 WebElement xpathsubmit=driver.findElement(By.xpath("//input[@name='submit']"));
		 xpathsubmit.click();

	}

}
