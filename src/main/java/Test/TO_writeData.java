package Test;

import Utility.Xls_Reader;

public class TO_writeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Xls_Reader r = new Xls_Reader("F:\\Selenium all\\Data Driven Testing\\fr.xlsx");
	    
		
		
		//Below code will create a new sheet in excel file
		System.out.println("New sheet has been created : "  +r.addSheet("My sheet"));
		
		
	
		//Creating a new column in excel sheet 
		System.out.println("Column has been added to excel file : "  +r.addColumn("My sheet", "My values"));
		
		
		
		
		
		for(int i =2; i<=r.getRowCount("data");i++)
			
		{
		
		 //Below code will set the values in excel sheet in desired column
	           boolean value = r.setCellData("My sheet", "My values", i, "Pass");
		         System.out.println("Value has been set to desired cell : " +value);
	     }
		
		
		
		//Below code will remove the desired column from the excel sheet
		System.out.println("Column have been removed from excel sheet : " + r.removeColumn("My Sheet", 1));
		
		
		
		//below code remove the sheet from excel file
		System.out.println("Sheet has been removed from the excel file : " +r.removeSheet("My sheet"));
		
		
		
	     
		
	}

}
