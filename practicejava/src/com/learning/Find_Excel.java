package com.learning;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Find_Excel {

	static Workbook wbook;
    static WritableWorkbook wwbCopy;
    static String ExecutedTestCasesSheet;
    static WritableSheet shSheet;
    
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub

		wbook = Workbook.getWorkbook(new File("C:\\A551684\\datacopy5.xls"));
	    //wwbCopy = Workbook.createWorkbook(new File("C:\\A551684\\datacopy5.xls"), wbook);
	    Sheet s = wbook.getSheet("Sheet1");
	    
	    int rows = s.getRows();
	    int cols = s.getColumns();
	    for(int i=0; i<rows; i++)
	    {
	    	for(int j =0; j<cols; j++)
	    	{
	    		if(s.getCell(j, i).getContents().equals("NAME"))
	    				{
	    					System.out.println("Given data exists");
	    					break;
	    				}
	    		
	    	}
	    }
	}

}
