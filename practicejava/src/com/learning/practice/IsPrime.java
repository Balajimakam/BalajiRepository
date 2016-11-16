package com.learning.practice;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int i,m=0,flag=0;    
		  int n=20;//it is the number to be checked  
		  m=n/2;    
		  for(i=2;i<=m;i++){    
		   if(n%i==0){    
		   System.out.println("Number is not prime");    
		   flag=1;    
		   break;    
		   }    
		  }    
		  if(flag==0)    
		  System.out.println("Number is prime");    
		}  

	}


//package com.instaceofjava;
//public class primenumbers {
// 
//public static void main(String[] args) {
// 
//int num=50;
//int count=0;
// 
//for(int i=2;i<=num;i++){
// 
//count=0;
// 
//for(int j=2;j<=i/2;j++){
// 
//if(i%j==0){
//count++;
//break;
//}
// 
//}
// 
//if(count==0){
// 
//System.out.println(i);
// 
//}
// 
//}
// 
//}
// 
//}
//
//
