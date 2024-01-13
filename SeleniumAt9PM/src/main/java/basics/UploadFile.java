package basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://demo.guru99.com/test/upload/");
		 
		 WebElement uploadfile=driver.findElement(By.id("uploadfile_0"));
		 uploadfile.sendKeys("C:\\Users\\Neenu\\Pictures\\Screenshots\\Screenshot 2023-11-14 215134.png");
		 
		 WebElement checkbox=driver.findElement(By.className("field_check"));
		 checkbox.click();
		 
		 WebElement submitbutton=driver.findElement(By.id("submitbutton"));
		 submitbutton.click();

	}

}
