package Test;

import java.util.ArrayList;

import Utility.Xls_Reader;

public class TO_WritetheDynamicCoulmnValue {

	// Here defining the variable h, which will pass to the list variable u
	static int h =0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	   // Request you to give location of excel file store on your local directory 	
       Xls_Reader r = new Xls_Reader("F:\\Selenium all\\Data Driven Testing\\fr.xlsx");
	    
		
	    //Below code will create a new sheet in excel file
	    System.out.println("New sheet has been created : "  +r.addSheet("My sheet"));
		
	
		//Below code will create the string
	    //This string is used for generating the columns
		String t ="Name@LastName@Address@gender";
		
		
		//Below code will split the string from "@"
		String array[] = t.split("@");
 
		//Below code will print the size of the array
	    int size =	array.length;
		System.out.println(size);
		
		
		//Below code will print the values of array, just for getting the sense of columns name
		System.out.println("The values of all 4 rows are as follow : "+array[0]+array[1]+array[2]+array[3]);
		
		
		//creating columns
	    for (int s =0; s<size;s++)
			
		{
		
		//Creating a 4 new column in excel sheet by using the split concept of array and passing in the for loop
	    System.out.println("Column has been added to excel file : "  +r.addColumn("My sheet", array[s]));
		
		}
	    
	    
	    
	    //Static method for passing the same cell values for each rows
	    
	    //In below code we adding values in rows till 5.
	    //Note : In below code we are passing the same values i.e "Pass" in all rows for desired columns
	    for(int i =2; i<=5;i++)
			
		{	//In below for loop we are adding the same values in different column 
		       for (int p=0; p<size; p++)
		       { 
		    	   
		    	   System.out.println("In row : " +i + " currently" );
		    	   
		    	   //Below code will set the values in excel sheet in desired column
	               boolean value = r.setCellData("My sheet", array[p], i, "Pass");
	               
	              
		           System.out.println("Value has been set to desired cell of row  "  +value);
		       }
		       
		       
		        System.out.println("ALL values in row is printed on excel sheet for all columns name ----->" +i);
		 }
		
		
	    
	    
	    
	    
	    //Partially dynamic method to pass the different values in all cell for desired column
	    
	    //NOTE : In this cell values will be different but for rows it will be same.
	    String cellvalueforrows = "John@Wick@CA@Male";
	    String ar[] = cellvalueforrows.split("@");
	    
	    System.out.println( "The values of rows for FisrtName, LastName , Adress and Gender are : "+ ar[0]+ar[1]+ar[2]+ar[3]);
	    
       for(int i =6; i<=10;i++)
			
		{	
    	            System.out.println("In row : " +i + " currently" );
    	            
    	         //In below for loop we are adding the same values in rows in different column  but different cell values
		       for (int p=0; p<size; p++)
		       { 
		    	   //Below code will set the values in excel sheet in desired column
	               boolean value = r.setCellData("My sheet", array[p], i, ar[p]);
	               
	            
		           System.out.println("Value has been set to desired cell of row  "  +value);
		       }
		       
		       
		        System.out.println("ALL values in row is printed on excel sheet for all columns name ----->" +i);
		 }
	    
	   
       
	    
	    //Complete Dynamic method to pass different values in each cell in every rows.
	    
	    // ArrayList is created which accept the string type of array
       ArrayList<String[]> u = new ArrayList<String[]>();
       
       
       String array0[] = {"John","Wick","CA","Male"};
       String array1[] = {"Alex","Mahone","LA","Female"};
       String array2[] = {"Dominic","Mah","LA","Male"};
       
       u.add(array0);
       u.add(array1);
       u.add(array2);
       
           
        for(int i =11; i<=13;i++)
			 
		{	           
                   System.out.println("In row : " +i + " currently" );
   	            
   	         //In below for loop we are adding the same values in rows in different column  but different cell values
		       for (int p=0; p<size; p++)
		       { 
		                String[] a =  u.get(h);
		    	   
		    	   //Below code will set the values in excel sheet in desired column
	               boolean value = r.setCellData("My sheet", array[p], i, a[p]);
	               
	            
		           System.out.println("Value has been set to desired cell of row  "  +value);
		       }
		       
		       h++;
		        System.out.println("ALL values in row is printed on excel sheet for all columns name ----->" +i);
		 }
		
	}
	
	
	

}
