package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Select {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		 
		 List<WebElement> radiobutton1=driver.findElements(By.name("tripType"));
		 radiobutton1.get(0).click();
		 
		 WebElement passCount=driver.findElement(By.name("passCount"));
		 Select pass=new Select(passCount);
		 pass.selectByIndex(1);
		 
		 WebElement dept=driver.findElement(By.name("fromPort"));
		 Select depart=new Select(dept);
		 depart.selectByValue("Paris");
		 
		 WebElement deptMon=driver.findElement(By.name("fromMonth"));
		 Select month=new Select(deptMon);
		 month.selectByVisibleText("March");
		 
		 WebElement deptDay=driver.findElement(By.name("fromDay"));
		 Select dday=new Select(deptDay);
		 dday.selectByIndex(15);
		 
		 WebElement arrCity=driver.findElement(By.name("toPort"));
		 Select arrive=new Select(arrCity);
		 arrive.selectByValue("New York");
		 
		 WebElement retMonth=driver.findElement(By.name("toMonth"));
		 Select retmon=new Select(retMonth);
		 retmon.selectByVisibleText("April");
		 
		 WebElement retDay=driver.findElement(By.name("toDay"));
		 Select aday=new Select(retDay);
		 aday.selectByIndex(19);
		 
		 List<WebElement> radiobutton2=driver.findElements(By.name("servClass"));
		 radiobutton2.get(2).click();

	}

}
