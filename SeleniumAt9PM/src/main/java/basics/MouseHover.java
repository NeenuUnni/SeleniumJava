package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://demoqa.com/menu/#");
		 
		 Actions actions = new Actions(driver);
		 WebElement link1=driver.findElement(By.linkText("Main Item 2"));
		 actions.moveToElement(link1).perform(); // moveToElement() is used for mouse-hover; perform() is to execute the action
		 WebElement link2=driver.findElement(By.linkText("SUB SUB LIST »"));
		 actions.moveToElement(link2).perform();
		 WebElement link3=driver.findElement(By.linkText("Sub Sub Item 1"));
		 actions.moveToElement(link3).click().build().perform(); // build() is used to combine the actions if one or more
//		 actions are there.

	}

}
