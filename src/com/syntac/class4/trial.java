package com.syntac.class4;

import java.util.Scanner;

public class trial {
	 public static void main(String[] args) {
          System.out.println("Do you need a loan?");
          Scanner input=new Scanner(System.in);
          boolean loan=input.nextBoolean();
          
     if (loan) {
    	 System.out.println("What is your credit score?");
           int credit=input.nextInt();
             if (credit<600) {
            	 System.out.println("The eligibility is Not eligible");
             }else if(credit>=600 && credit<=700) {
            	 System.out.println("The eligibility is Maybe eligible");
            	
             }else if (credit>700 && credit<800) {
            	 System.out.println("The eligibility is Eligible");
             }else {
            	 System.out.println("The eligibility is Definitely eligible");
            	 
             }
     
     
     }else {
    	 System.out.println("The eligibility is Unknown");
     }
	 
             
}
}