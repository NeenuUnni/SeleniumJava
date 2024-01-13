package MiniProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ProjectItem {
	WebDriver driver;
  @Test
  public void verifyitem() {
	  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	  email.sendKeys("admin@admin.com");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("12345678");
	  WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign in']"));
	  signIn.click();
	  
	  WebElement item=driver.findElement(By.xpath("//span[text()='Items']"));
	  item.click();
	  WebElement additem=driver.findElement(By.xpath("//a[@class='btn btn-default']"));
	  additem.click();
	  WebElement itemtitle=driver.findElement(By.xpath("//input[@name='title']"));
	  itemtitle.sendKeys("Item Title - Neenu");
	  WebElement description=driver.findElement(By.xpath("//textarea[@name='description']"));
	  description.sendKeys("Item added by Neenu on 29/11/2023");
	  WebElement rate=driver.findElement(By.xpath("//input[@name='item_rate']"));
	  rate.sendKeys("5000");
	  WebElement save=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	  save.click();
  }
  @BeforeTest
  public void beforeTest() {
	     driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));//implicit wait
		 driver.get("https://qalegend.com/crm/index.php/dashboard");
  }

  @AfterTest
  public void afterTest() {
//	  driver.close();
  }

}
