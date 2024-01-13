package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLinks {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		 
		 WebElement linkText=driver.findElement(By.linkText("Simple Form Demo"));
		 linkText.click();
		 
		 WebElement partialText=driver.findElement(By.partialLinkText("Simple Form"));
		 partialText.click();

	}

}
