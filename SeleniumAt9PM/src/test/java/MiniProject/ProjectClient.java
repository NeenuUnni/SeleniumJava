package MiniProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ProjectClient {
	WebDriver driver;
  @Test
  public void verifyclient() {
	  WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	  email.sendKeys("admin@admin.com");
	  WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	  password.sendKeys("12345678");
	  WebElement signIn=driver.findElement(By.xpath("//button[text()='Sign in']"));
	  signIn.click();
	  
	  WebElement clients=driver.findElement(By.xpath("//span[text()='Clients']"));
	  clients.click();
	  WebElement addclient=driver.findElement(By.xpath("//a[@class='btn btn-default']"));
	  addclient.click();
	  
	  WebElement company=driver.findElement(By.xpath("//input[@name='company_name']"));
	  company.sendKeys("Obsqura-Neenu");
	  WebElement address=driver.findElement(By.xpath("//textarea[@name='address']"));
	  address.sendKeys("Infopark");
	  WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
	  city.sendKeys("Kochi");
	  WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
	  state.sendKeys("Kerala");
	  WebElement zipcode=driver.findElement(By.xpath("//input[@name='zip']"));
	  zipcode.sendKeys("682030");
	  WebElement country=driver.findElement(By.xpath("//input[@name='country']"));
	  country.sendKeys("India");
	  WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
	  phone.sendKeys("8330847026");
	  WebElement website=driver.findElement(By.xpath("//input[@name='website']"));
	  website.sendKeys("neenuobsq.com");
	  WebElement vatNum=driver.findElement(By.xpath("//input[@name='vat_number']"));
	  vatNum.sendKeys("2016789823");
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
