package com.syntac.class01;

import java.util.Scanner;

public class Firstprogram {
	
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    	System.out.print("Please enter your gender");
			  	String g=input.next();	 
			  	    if (g=="m"){
			  System.out.println("Please enter your age ");
			  	     int age=input.nextInt();
			  	   if (age>25) {
			  	    	  System.out.println("Man");
			  	      }else {
			  	    	  System.out.println("Boy");
			  	      }
			  
			  
			  
				  
			  
				  	   
}
	}
}