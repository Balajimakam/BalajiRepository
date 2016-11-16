package com.learning.practice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class jxl {
	static Workbook wbook;
    static WritableWorkbook wwbCopy;
    static String ExecutedTestCasesSheet;
    static WritableSheet shSheet;
    
    
	public void readExcel()
    {
    try{
    	wbook = Workbook.getWorkbook(new File("path\\testSampleData.xls"));
        wwbCopy = Workbook.createWorkbook(new File("path\\testSampleDataCopy.xls"), wbook);
		
		//Sheet s1= wrk.getSheet("mysample");
		
		Sheet s1 = wbook.getSheet(0);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    
    public void setValueIntoCell(String strSheetName,int iColumnNumber, int iRowNumber,String strData) throws WriteException
    {
        WritableSheet wshTemp = wwbCopy.getSheet(strSheetName);
        Label labTemp = new Label(iColumnNumber, iRowNumber, strData);
                
        try {
            wshTemp.addCell(labTemp);
             } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
    }
    
    public void closeFile()
    {
        try {
            // Closing the writable work book
            wwbCopy.write();
            wwbCopy.close();

            // Closing the original work book
            wbook.close();
        } catch (Exception e)

        {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) throws BiffException, IOException, WriteException  {
		// TODO Auto-generated method stub

		//FileInputStream fi = new FileInputStream("C:\\Users\\A551684\\Desktop\\mysample.xls");
		
	
		 jxl ds = new jxl();
	        ds.readExcel();
	        ds.setValueIntoCell("sheet1", 5, 1, "PASS");
	        ds.setValueIntoCell("sheet1", 5, 2, "FAIL");
	        ds.setValueIntoCell("sheet1", 5, 3, "PASS");
	        ds.closeFile();
	
		
		
		/*int rows_cnt = s1.getRows();
		int column_cnt = s1.getColumns();
		
		// for (int i=0;i<rows_cnt ; i++)
		for (int rows = 1; rows <  rows_cnt ; rows++) {     
			
			
			System.out.println(s1.getCell(0,rows).getContents());
			//System.out.println(s1.getCell(8,rows).getContents());
			
			// one --> 1 --> a
			// two --> 2 --> b
			
			
			
		}*/
		
	}
	}