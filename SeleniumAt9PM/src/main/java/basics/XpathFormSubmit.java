package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFormSubmit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://selenium.obsqurazone.com/form-submit.php");
        
        WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
        firstName.sendKeys("Neenu");
        
        WebElement lastName=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
        lastName.sendKeys("Baby");
        
        WebElement username=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
        username.sendKeys("neenz");
        
        WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
        city.sendKeys("Kochi");
        
        
        WebElement submit=driver.findElement(By.xpath("//button[text()='Submit form]"));
        submit.click();
	}

}
