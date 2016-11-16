package com.learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		
		System.out.println(m.matches());
		
		System.out.println(Pattern.matches(".a", "ba"));
		
		
		//Check whteher Balaji is as per standards or not
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "arun"));//true 
		
		System.out.println(Pattern.matches("((?:19|20)\\d\\d)/(0?[1-9]|1[012])/(0?[1-9]|[0-9]|)", "2016\10\20"));
	}

}
