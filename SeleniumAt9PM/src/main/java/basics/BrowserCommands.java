package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver(); // launch chrome
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize(); // to maximize the tab
		
		driver.get("https://www.selenium.dev/");// launch website url
		
		String title = driver.getTitle(); // to get the title of the website url
		System.out.println("Title of the page:"+title);
		
		String url = driver.getCurrentUrl(); // to get the url of the website
        System.out.println("url of the page:"+url);
        
        String pagesource = driver.getPageSource(); // to get the html details of the website
		System.out.println("pagesource:"+pagesource);
		
	//	driver.quit(); // to close the browser
		driver.close(); // to close the current tab
		
		// TODO Auto-generated method stub

	}

}
