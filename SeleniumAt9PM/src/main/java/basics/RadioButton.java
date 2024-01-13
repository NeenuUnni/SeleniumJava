package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class RadioButton {

	public static void main(String[] args) {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		  
		  List<WebElement> radiobutton1=driver.findElements(By.name("inlineRadioOptions"));
		  radiobutton1.get(1).click();
		  
		  WebElement radiomessage1=driver.findElement(By.id("button-one"));
		  radiomessage1.click();
		  
		  WebElement message1=driver.findElement(By.id("message-one"));
		  String str1=message1.getText();
		  System.out.println(str1);
		  
		  List<WebElement> radiobutton=driver.findElements(By.name("student-gender"));
		  radiobutton.get(0).click();
		  
		  List<WebElement> radiobutton3=driver.findElements(By.name("student-age"));
		  radiobutton3.get(1).click();
		  
		  WebElement radiomessage2=driver.findElement(By.id("button-two"));
		  radiomessage2.click();
		  
		  WebElement message2=driver.findElement(By.id("message-two"));
		  String str2=message2.getText();
		  System.out.println(str2);

	}

}
