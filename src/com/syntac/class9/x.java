package com.syntac.class9;

import java.util.Scanner;

public class x {
public static void main(String[] args) {
      
	   System.out.println("Please enter two Strings");
	   Scanner input=new Scanner(System.in);
	   String w1=input.next();
	   String w2=input.next();
	   
	   System.out.println("Please enter two numbers");
	   int n1=input.nextInt();
	   int n2=input.nextInt();
	   
	   if (w1.equals(w2) && n1==n2) {
		   System.out.println("AND");
	   }else if(w1.equals(w2) || n1==n2) {
		   System.out.println("OR");
	   }else {
		   System.out.println("NONE");
		   
		   
	   }
	
	
	

	
}
}
