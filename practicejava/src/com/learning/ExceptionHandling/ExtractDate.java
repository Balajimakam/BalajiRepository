package com.learning.ExceptionHandling;

import java.util.Calendar;
import java.util.Date;

public class ExtractDate {

	
	
static String date = "13/12/2016";


public String year_extract(String date)
{
	this.date =date;

	String[] parts = date.split("/");
	
	String year = parts[2];
	
	
	String year_2 = year.substring(2);
	
	
	return year_2;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtractDate e = new ExtractDate();
		System.out.println(e.year_extract(date));
		
//		Calendar c = Calendar.getInstance();
//		c.setTime(date);
//		int g_date = c.get(Calendar.DATE);
//		int g_month = c.get(Calendar.MONTH);
//		int g_year =c.get(Calendar.YEAR);
		
	}

}
