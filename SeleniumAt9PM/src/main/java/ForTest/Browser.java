package ForTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/"); // launch URL
		driver.manage().window().maximize(); // to maximize the window
		
		String url = driver.getTitle();
		System.out.println("Title:" +url);
		
		

	}

}
