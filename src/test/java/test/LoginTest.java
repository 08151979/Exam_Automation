package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.LoginPage;
import pages.Remove_And_Add;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldbeAbleToLogin() {
		driver = BrowserFactory.inint();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.validUserAbleToCheckBox();
	
		loginpage.userAbleToCheckToggleBox();
		
		Remove_And_Add addRemove = PageFactory.initElements(driver, Remove_And_Add.class);
		addRemove.addName("Techfios code");
		addRemove.addCatogery("Automation Project");
		addRemove.selectCategory("category508");
		addRemove.selectDueDate("9");
		addRemove.selectMonth("Feb");
		addRemove.selectYear("2023");
		addRemove.selectColour("Green");
		addRemove.userRemove();
		
		
	}
	
	

}
