package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public int generateRandom(int boundary) {
		Random rnd = new Random();
		int num = rnd.nextInt(999);
		return num;
	}

   public void selectDropdown(WebElement webelement, String visibleText) {
	  Select sel = new Select(webelement);
	  sel.selectByVisibleText(visibleText);

   }
   public void action(WebDriver driver) {
	   
	   Actions action = new Actions(driver);
	   
   }

}
