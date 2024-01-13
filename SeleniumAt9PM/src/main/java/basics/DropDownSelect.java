package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		 
		 WebElement colourSelect=driver.findElement(By.id("single-input-field"));
		 Select cselect=new Select(colourSelect);
//		 cselect.selectByIndex(1);
	//	 cselect.selectByValue("Yellow");
		 cselect.selectByVisibleText("Green");
		 System.out.println("Colour Options available are");
		 List<WebElement> colouroptions=cselect.getOptions();
		 
		 for(int i=0;i<colouroptions.size();i++) {
			 String value=colouroptions.get(i).getText();
			 System.out.println(value);
		 }
         WebElement currentoption=cselect.getFirstSelectedOption();
         String currentvalue=currentoption.getText();
         System.out.println("Currently selected colour is:" +currentvalue);
         
         WebElement multipleselectdropdown = driver.findElement(By.id("multi-select-field"));
         Select multiplesel = new Select(multipleselectdropdown);
         boolean f=multiplesel.isMultiple();
         System.out.println("Multiple Select:" +f);
         multiplesel.selectByIndex(1);
         multiplesel.selectByValue("Green");
         System.out.println("Selected options in multiselect:");
         
         List<WebElement> selectOptions=multiplesel.getAllSelectedOptions();
         for(int i=0;i<selectOptions.size();i++) {
        	 String value=selectOptions.get(i).getText();
        	 System.out.println(value);
         }
         
  //       multiplesel.deselectByIndex(1);
  //       multiplesel.deselectByValue("Green");
  //       multiplesel.deselectAll(); // deselect all the selected options
         
	}

}
