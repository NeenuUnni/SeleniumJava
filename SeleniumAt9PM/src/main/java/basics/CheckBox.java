package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class CheckBox {

	public static void main(String[] args) {
          WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		  
		  List<WebElement> checkbox = driver.findElements(By.className("check-box-list"));
           checkbox.get(0).click();
           checkbox.get(3).click();
	}

}
