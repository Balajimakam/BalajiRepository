package com.learning.practice;

import java.util.Random;
import java.util.Scanner;
public class Random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter minimum number");
		int min = in.nextInt();
		
		System.out.println("Enter Maximum number");
		int max = in.nextInt();
		
		int range = (max-min)+1;
		
		Random ren = new Random();
	
		int rand_num = ren.nextInt(range) + min;
		System.out.println(rand_num);
	}
}
