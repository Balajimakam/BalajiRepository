package com.learning;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Label;
import jxl.write.WriteException;

public class Write_Excel {

	static Workbook wbook;
    static WritableWorkbook wwbCopy;
    static String ExecutedTestCasesSheet;
    static WritableSheet shSheet;
    
    public void readExcel() throws BiffException, IOException
    {
    
    wbook = Workbook.getWorkbook(new File("C:\\A551684\\datacopy5.xls"));
    wwbCopy = Workbook.createWorkbook(new File("C:\\A551684\\datacopy5.xls"), wbook);
    shSheet = wwbCopy.getSheet("Sheet1");
    }
    
    public void setValueIntoCell_new(String filepath, String strSheetName,int iColumnNumber, int iRowNumber,String strData ) throws IOException
    {
    	wwbCopy = Workbook.createWorkbook(new File(filepath));
    	WritableSheet wshTemp = wwbCopy.createSheet(strSheetName, 0);
    	
    	//WritableSheet wshTemp = wwbCopy.getSheet(strSheetName);
    			
    			//getSheet(strSheetName);
        Label labTemp = new Label(iColumnNumber, iRowNumber, strData);
                
        try {
        	 wshTemp.addCell(labTemp);
             } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
    }
    
    public void insert_Data(String filepath, String strSheetName,int iColumnNumber, int iRowNumber,String strData ) throws IOException, BiffException
    {
    	
    	
    	WritableSheet wshTemp = wwbCopy.getSheet(strSheetName);
    	
    	//WritableSheet wshTemp = wwbCopy.getSheet(strSheetName);
    			
    			//getSheet(strSheetName);
        Label labTemp = new Label(iColumnNumber, iRowNumber, strData);
                
        try {
        	 wshTemp.addCell(labTemp);
             } 
            catch (Exception e) 
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
    
    public static void main(String[] args) throws WriteException, BiffException, IOException
    {
    	Write_Excel ds = new Write_Excel();
    	ds.readExcel();
      
       // ds.setValueIntoCell("Sheet1", 1, 1, "FAIL");
       
        //ds.setValueIntoCell_new("C:\\Users\\A551684\\Desktop\\datacopy1.xls","Sheet1", 1, 1, "FAIL");
    	
    	ds.insert_Data("C:\\A551684\\datacopy5.xls","Sheet1", 1, 1, "FAIL");
        
        ds.closeFile();
    }
}