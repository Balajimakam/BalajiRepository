package com.learning.ExceptionHandling;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pattern.matches("(^\d{1,2}\/\d{1,2}\/\d{4}$)", "02/12/2016"));
	}

}
