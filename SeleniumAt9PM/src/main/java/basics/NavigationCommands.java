package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		
         WebDriver driver = new ChromeDriver(); // launch chrome
		 driver.manage().window().maximize(); // to maximize the tab
		 
		 driver.navigate().to("https://www.selenium.dev");
		 driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		 
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();

	}

}
