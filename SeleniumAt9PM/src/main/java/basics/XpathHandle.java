package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathHandle {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/selenium/newtours/");
		 
		 WebElement xpathuser=driver.findElement(By.xpath("//input[@name='userName']"));
		 WebElement xpathpass=driver.findElement(By.xpath("//input[@name='password']"));
		 xpathuser.sendKeys("tutorial");
		 xpathpass.sendKeys("tutorial");
		 
		 WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		 submit.click();

	}

}
