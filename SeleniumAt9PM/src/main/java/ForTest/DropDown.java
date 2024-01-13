package ForTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		 
		 WebElement colourSelect=driver.findElement(By.id("single-input-field"));
		 Select cselect=new Select(colourSelect);
//		 cselect.selectByIndex(1);
	//	 cselect.selectByValue("Yellow");
		 cselect.selectByVisibleText("Green");
		 WebElement selectedcolor=driver.findElement(By.id("message-one"));
		 String color = selectedcolor.getText();
		 System.out.println(color);

	}

}
