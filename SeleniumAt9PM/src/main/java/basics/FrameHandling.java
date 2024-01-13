package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.navigate().to("https://demoqa.com/frames");
		// driver.switchTo().frame(4);
		 driver.switchTo().frame("frame1");
		 
		 WebElement heading=driver.findElement(By.id("sampleHeading"));
		 String text=heading.getText();
		 System.out.println(text);

	}
}
