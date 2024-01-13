package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		
		List<WebElement> tableoptions=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		 for(int i=0;i<tableoptions.size();i++)
		 {
			 String value = tableoptions.get(i).getText();
			 System.out.println(value);
		 }

		 List<WebElement> tablebodyvalue=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td"));
		 for(int j=0;j<tablebodyvalue.size();j++)
		 {
			 String body = tablebodyvalue.get(j).getText();
			 System.out.println(body);
		 }
		 
		 WebElement tablecontent=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td[3]"));
		 String value2=tablecontent.getText();
		 System.out.println(value2);
	}

}
