package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import Utility.Xls_Reader;


//@Author ~ Jaffar Ali 
//This is data driven framework ---> driving the data from excel sheet
//This is used to defined the concept of reading the values from excel file.


public class To_ReadtheData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gcrit.com/build3/create_account.php");
		Xls_Reader r = new Xls_Reader("F:\\Selenium all\\Data Driven Testing\\Data Sheets.xlsx");
	     
		
		
		//Below code will print the no of rows.
		System.out.println(r.getRowCount("data"));
		
		
		// For loop has been used to, if we need to iterate more than 1 rows
		for(int i =2; i<=r.getRowCount("data");i++)
			
		{
		
		//Below code read data from excel file and print the value on console
		
		String FirstName =	r.getCellData("data","FirstName", i);
	      System.out.println(FirstName);
	     

	      String LastName =	r.getCellData("data","LastName", i);
	      System.out.println(LastName);
	      
	      String DOB =	r.getCellData("data","DOB", i);
	      System.out.println(DOB);
	      
	      String Email	 =	r.getCellData("data","Email", i);
	      System.out.println(Email);
	      
	      String Address =	r.getCellData("data","Address", i);
	      System.out.println(Address);
	      
	      
	      String PostCode =	r.getCellData("data","Post-code", i);
	      System.out.println(PostCode);
	      
	      String city =	r.getCellData("data","city", i);
	      System.out.println(city);
	      
	      String State =	r.getCellData("data","State", i);
	      System.out.println(State);
	      
	      String telephone =	r.getCellData("data","Telephone", i);
	      System.out.println(telephone);
	      
	      String password =	r.getCellData("data","Password", i);
	      System.out.println(password);
	      
	      String CP =	r.getCellData("data","Confirmpassword", i);
	      System.out.println(CP);
	      
	      
	      //In below code we are passing the values in desired  field 
	      
	      
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

}
