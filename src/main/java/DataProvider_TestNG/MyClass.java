package DataProvider_TestNG;

import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.Data_Utlity;

public class MyClass {
	
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup()
	{
		
		
		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gcrit.com/build3/create_account.php");
	}
	
	
	
	@DataProvider
	public  Iterator<Object[]> getTestdata()
	{
		
		ArrayList<Object[]> t =Data_Utlity.getdatafromexcel();
	    return	t.iterator();
	
	}
	
	@Test(dataProvider= "getTestdata")
	public  void form(String FirstName, String LastName, String DOB, String Email, String Address, String PostCode, String city, String State, String telephone, String password,String CP )
	{
		
		  
	      driver.findElement(By.xpath("//input[@name='firstname']")).clear();
	      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);

	      
	      driver.findElement(By.xpath("//input[@name='lastname']")).clear();
	      driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LastName);
	      
	      driver.findElement(By.xpath("//input[@name='dob']")).clear();
	      driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(DOB);
	      
	      driver.findElement(By.xpath("//input[@name='email_address']")).clear();
	      driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys(Email);
	      
	      
	      driver.findElement(By.xpath("//input[@name='street_address']")).clear();
	      driver.findElement(By.xpath("//input[@name='street_address']")).sendKeys(Address);
	      
	      driver.findElement(By.xpath("//input[@name='postcode']")).clear();
	      driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(PostCode);
	      
	      driver.findElement(By.xpath("//input[@name='city']")).clear();
	      driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
	      
	      
	      driver.findElement(By.xpath("//input[@name='state']")).clear();
	      driver.findElement(By.xpath("//input[@name='state']")).sendKeys(State);
	      
	      driver.findElement(By.xpath("//input[@name='telephone']")).clear();
	      driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys(telephone);
	      
	      driver.findElement(By.xpath("//input[@name='password']")).clear();
	      driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	      
	      driver.findElement(By.xpath("//input[@name='confirmation']")).clear();
	      driver.findElement(By.xpath("//input[@name='confirmation']")).sendKeys(CP);
	      
	      
	      
	      // Below code select value from the dropdown 
	      Select t =new Select(driver.findElement(By.xpath("//select[@name='country']")));
	       t.selectByIndex(4);

		
	}
	
	
	
	
	

}
