package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws IOException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://jqueryui.com/droppable/");
		 
		 WebElement frame1=driver.findElement(By.className("demo-frame"));
         driver.switchTo().frame(frame1);
         
         WebElement drag=driver.findElement(By.id("draggable"));
         WebElement drop=driver.findElement(By.id("droppable"));
         
         Actions act=new Actions(driver);
         act.dragAndDrop(drag, drop).perform();
	
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//take screenshot
 	    File destFile=new File("D:\\Screenshots\\test1.png");
 	    FileUtils.copyFile(srcFile,destFile);
	}
}
