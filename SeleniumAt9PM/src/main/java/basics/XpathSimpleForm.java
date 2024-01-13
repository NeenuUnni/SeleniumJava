package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSimpleForm {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		 
		 WebElement xpathentermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		 xpathentermessage.sendKeys("Assignment on xpath");
		 
		 WebElement xpathshowmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		 xpathshowmessage.click();

		 WebElement xpathvalueA=driver.findElement(By.xpath("//input[@id='value-a']"));
		 xpathvalueA.sendKeys("80");
		 
		 WebElement xpathvalueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		 xpathvalueB.sendKeys("5");
		 
		 WebElement xpathgetTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		 xpathgetTotal.click();
	}

}
