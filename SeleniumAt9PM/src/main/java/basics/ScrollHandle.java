package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandle {

	public static void main(String[] args){
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver; //typecast driver to Javascriptexecutor
//		 js.executeScript("window.scrollBy(0,500)"); // vertically scroll down by 500 pixels
//		 js.executeScript("window.scrollBy(0,-100)"); // vertically scroll up by 100
		 
//		 WebElement showbutton=driver.findElement(By.id("button-two"));
//		 js.executeScript("arguments[0].scrollIntoView()", showbutton); // scroll to webelement is seen
		 
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // scroll to the bottom of the page
		 js.executeScript("window.scrollTo(0,-document.body.scrollHeight)"); // scroll tp the top of the page

	}

}
