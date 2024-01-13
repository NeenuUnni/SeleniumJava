package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		 
		 WebElement button1=driver.findElement(By.className("btn-success"));
		 button1.click();
		 Alert al1=driver.switchTo().alert();
		 String msg1=al1.getText();
		 System.out.println(msg1);
		 al1.accept();
		 
		 WebElement button2=driver.findElement(By.className("btn-warning"));
		 button2.click();
		 Alert al2=driver.switchTo().alert();
		 String msg2=al2.getText();
		 System.out.println(msg2);
	//	 al2.accept();
		 al2.dismiss();
		 
		 WebElement button3=driver.findElement(By.className("btn-danger"));
		 button3.click();
		 Alert al3=driver.switchTo().alert();
		 String msg3=al3.getText();
		 System.out.println(msg3);
		 al3.sendKeys("Alert Warning Message");
		 al3.accept();
		 
	}

}
