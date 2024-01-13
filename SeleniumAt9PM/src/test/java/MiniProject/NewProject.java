package MiniProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewProject {
	WebDriver driver;
  @Test
  public void verifyproject() {
	  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	  email.sendKeys("admin@admin.com");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("12345678");
	  WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign in']"));
	  signIn.click();
	  
	  WebElement projects=driver.findElement(By.xpath("//span[text()='Projects']"));
	  projects.click();
	  WebElement allprojects=driver.findElement(By.xpath("//span[text()='All Projects']"));
	  allprojects.click();
	  WebElement addproject=driver.findElement(By.xpath("//a[@class='btn btn-default']"));
	  addproject.click();
	  WebElement title=driver.findElement(By.xpath("//input[@name='title']"));
	  title.sendKeys("Project-Neenu");
	  WebElement titledes=driver.findElement(By.xpath("//textarea[@name='description']"));
	  titledes.sendKeys("Project added on 29/11/2023 by Neenu");
	  WebElement savebutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	  savebutton.click();
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
