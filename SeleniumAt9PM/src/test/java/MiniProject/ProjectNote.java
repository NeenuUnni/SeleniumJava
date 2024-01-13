package MiniProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ProjectNote {
	
	WebDriver driver;
  @Test
  public void verifylogin() {
	  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	  email.sendKeys("admin@admin.com");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("12345678");
	  WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign in']"));
	  signIn.click();
	  
	  WebElement notes=driver.findElement(By.xpath("//span[text()='Notes']"));
	  notes.click();
	  
	  WebElement addnote=driver.findElement(By.xpath("//a[@class='btn btn-default']"));
	  addnote.click();
	  
	  WebElement addtitle=driver.findElement(By.xpath("//input[@name='title']"));
	  addtitle.sendKeys("Assignment Project");
	  
	  WebElement adddesc=driver.findElement(By.xpath("//textarea[@name='description']"));
	  adddesc.sendKeys("Assignment to be done on 29/11/2023");
	  
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
