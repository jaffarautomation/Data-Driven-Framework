package Utility;

import java.util.ArrayList;

public class Data_Utlity {
	
	
	public static void main(String args[])
	{
		
		getdatafromexcel();
		
	}
	
	  public static ArrayList<Object[]> getdatafromexcel()
	  
	  {
		  
		  
		  
		    ArrayList<Object[]> mydata =new ArrayList<Object[]>();
		    
		    Xls_Reader r = new Xls_Reader("F:\\Selenium all\\Data Driven Testing\\Data1.xlsx");
		     
			
		           int size=	r.getRowCount("data");
		           System.out.println(size);
		           
		           for (int i =2; i<=size;i++)
		           {
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
		     	      
		     	      
		     	      
		     	      
		     	      
		     	      //Here we have created the array of type Object of size 11.
		     	      //All the column value are fetch from the excel sheet and store in the respective string variable such as FirstName, LastName.
		     	      //Then Those String variables are store in array in index from 0 to 10.
		     	      //No of arrays creation will depend upon the no of rows in excel sheet
		     	      
		     	      Object[] array  = {FirstName, LastName,DOB,Email,Address,PostCode,city,State,telephone,password,CP};
		  
		     	     
		     	      //In below code we are adding the array in ArrayList 
		     	      mydata.add(array);
		     	      
		     	      System.out.println(array);
		     	      
		     	     

		        }
		            
		           
		           //If we execute the below code it will give the reference of the arrays
		           System.out.println(mydata.get(0));
		           System.out.println(mydata.get(1));
		           System.out.println(mydata.get(2));
		                      
		  
		  return  mydata;
		  
	  }

}
