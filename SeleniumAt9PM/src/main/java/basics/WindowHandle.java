package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://demo.guru99.com/popup.php");
		 
		 WebElement link = driver.findElement(By.linkText("Click Here"));
         link.click();
         
         String homepage = driver.getWindowHandle();
         Set<String> childpage = driver.getWindowHandles();
         
         Iterator<String> i = childpage.iterator();
         while(i.hasNext()) {
        	 String currentpage=i.next();
        	 if(!currentpage.equalsIgnoreCase(homepage)) {
        		 driver.switchTo().window(currentpage);
        		 
        WebElement email=driver.findElement(By.name("emailid"));
        email.sendKeys("neenusara55@gmail.com");
        	 }
         }
         
	}

}
