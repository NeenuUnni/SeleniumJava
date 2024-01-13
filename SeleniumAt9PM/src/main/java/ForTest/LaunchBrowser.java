package ForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver(); // to launch chrome
//		WebDriver driver = new FirefoxDriver(); // to launch firefox
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/");

	}

}
