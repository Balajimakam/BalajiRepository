package com.learning.ExceptionHandling;

import java.io.IOException;

public class ExceptionPropogation_Checked {

	
	void m() throws IOException{  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	  void n() throws IOException{  
	    m();  
	  }  
	  void p() throws IOException{  
	  /* try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  */
		  n();
	  }
	  public static void main(String args[]) throws IOException{  
		  ExceptionPropogation_Checked obj=new ExceptionPropogation_Checked();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  
}
