package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	public  LoginPage(WebDriver driver) {
	   this.driver = driver;
		
		
	}
	@FindBy(how = How.XPATH, using = "//form[@action='todo.php']/ul/li/input")WebElement CLOTHING_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@name='allbox']")WebElement TOGGLE_ELEMENT;
	
	
	
	
	
	public void validUserAbleToCheckBox() {
		CLOTHING_ELEMENT.click();
		CLOTHING_ELEMENT.isSelected();
	}
	public void userAbleToCheckToggleBox() {
		TOGGLE_ELEMENT.click();
		TOGGLE_ELEMENT.isSelected();
	}	
	
	
	
	
	
}
