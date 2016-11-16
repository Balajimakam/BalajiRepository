package com.learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Excel {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub

		String s = "C:\\A551684\\TAM\\temp\\data.xls";
		File f = new File(s);
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet sh  = wb.getSheet(0);
		
		int  r = sh.getRows();

		int col = sh.getColumns();
		
		for(int i =0; i<r; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(sh.getCell(j, i).getContents());
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
