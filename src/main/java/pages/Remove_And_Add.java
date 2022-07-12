package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Remove_And_Add extends BasePage {
	
	WebDriver driver;
	Actions action; 
	public void removeAdd(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[1]") WebElement ADD_ELEMENT;
	@FindBy(how= How.XPATH, using= "//div[@class='controls']/input[1]")WebElement REMOVE_ELEMENT;
	@FindBy(how= How.XPATH, using = "//*[@id=\"extra\"]/input[1]")WebElement ADD_CATEGORY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/a[2]/span")WebElement CATEGORIE2_ELEMENT;
	@FindBy(how = How.XPATH,using = "//select[@name='due_day']")WebElement DUE_DATE_ELEMENT;
	@FindBy(how = How.XPATH,using = "//select[@name='due_month']")WebElement MONTH_ELEMENT;
	@FindBy(how = How.XPATH,using = "//select[@name='due_year']")WebElement YEAR_ELEMENT;
	@FindBy(how = How.XPATH,using = "//select[@name='colour']")WebElement COLOUR_ELEMENT;
	
	@FindBy(how = How.XPATH,using = "//select[@name='category']")WebElement CATEGORY_ELEMENT;
	
	public void addName(String code123) {
		ADD_ELEMENT.sendKeys(code123);
	}
	
	public void userRemove() {
    action = new Actions(driver);
	 
	 action.click(driver.findElement(By.xpath("/html/body/div[4]/input[1]")))
	 .keyDown(Keys.CONTROL)
	 .sendKeys("QA123")
	 .keyUp(Keys.CONTROL)
	 .sendKeys(Keys.BACK_SPACE).keyDown(Keys.CLEAR)
	 .build().perform();
	
	 
	}
	
	public void addCatogery(String addCategory) {
		
		ADD_CATEGORY_ELEMENT.sendKeys(addCategory);
	}
	public void selectCategory(String category) {
		selectDropdown(CATEGORY_ELEMENT, category);
	}
	public void selectDueDate(String date) {
		selectDropdown(DUE_DATE_ELEMENT, date);
	}
	
	public void selectMonth(String month) {
		selectDropdown( MONTH_ELEMENT, month);
	}
	public void selectYear(String year) {
		selectDropdown(YEAR_ELEMENT, year);
	}
	public void selectColour(String colour) {
		selectDropdown(COLOUR_ELEMENT, colour);
	}
	public void userAbleToRemoveCategory2() {
		CATEGORIE2_ELEMENT.clear();
		
	}
	
	

}
