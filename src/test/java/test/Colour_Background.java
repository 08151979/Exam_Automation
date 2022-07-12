package test;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Colour_Background {
	
	WebDriver driver;
	WebElement element;
	
@Test
	public void backgroundColor() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"drivers\\chromedriver_102.exe");
		 driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://techfios.com/test/102/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@name,'todo')]"));
		System.out.println("Total No of the check boxes"+ checkbox.size());
//		
//		for(int i = 0 ; i<checkbox.size(); i++) {
//			checkbox.get(i).click();
//		}
		
		// select multiple check boxes by choice
		// i want to select 3, 7,and 9 box
		
		for(WebElement chbox: checkbox) {
			 String checkboxName = chbox.getAttribute("name");
			 if(checkboxName.equals("todo[3]")|| checkboxName.equals("todo[6]")) {
				 chbox.click();
			 }
		}
		driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/input[1]")).sendKeys("TestNG Project");
		//driver.findElement(By.xpath(null))
		 element = driver.findElement(By.xpath("//*[@id=\"extra\"]/input[1]"));
		 element.sendKeys("This element want to print and clear");
		
		 Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
		
		
		element = driver.findElement(By.xpath("//select[@name='category']"));
		
		Select sel2 = new Select(element);
		
		
		sel2.selectByVisibleText("Jogging");
//		 List<WebElement> category = sel.getAllSelectedOptions();
//	
//		for(WebElement print : category) {
//			System.out.println("Print each every element " + print.getText());
//		}
//		 // return all the options
//		
//		 List<WebElement> allcategory = sel.getOptions();
//		 for(WebElement alldubli : allcategory) {
//			 System.out.println("all value print" + alldubli.getText());
//		 }
		
		
		
		
		// Here I am trying to get all the date in the drop down box.
		
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='due_day']")));
		
		  List<WebElement> options   = sel.getOptions();
//		  System.out.println(options.size());
//		  
		  
		  // print  all date ,i am going to use for each loop 
//		  
		  for(WebElement e : options) {
//			  
//			  System.out.println("The value are in the console " +  e.getText());
//			  
		  }
		  sel.selectByVisibleText("9");
		  
		  
		  
		  
		  // i am printing all the month in the console 
		    Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='due_month']")));
		    
		       List<WebElement>options1 =  sel1.getOptions();
		       
		    //   System.out.println(options1.size());
		       
		       for(WebElement e1 : options1) {
		    	//   System.out.println("Print all Day "  + e.getText());
		       }
		      sel1.selectByVisibleText("Feb");
		      
		     // here i am trying to get year 
		      
		      Select se = new Select(driver.findElement(By.xpath("//select[@name='due_year']")));
		      
		      se.selectByVisibleText("2023");
		      
		      
		      // i going to choose colour
		      
		      Select se1 = new Select(driver.findElement(By.xpath("//select[@name='colour']")));
		      
		        se1.selectByVisibleText("Purple");
}	      
   
}
