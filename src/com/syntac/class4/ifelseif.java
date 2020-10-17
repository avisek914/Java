package com.syntac.class4;

public class ifelseif {
	public static void main(String[] args) {
		
		int num1=19;
		int num2=99;
		
		if(num1>num2) {
			System.out.println(num1+ " is bigger than "+num2);
		}else if (num1<num2) {
			System.out.println(num1+ " is smaller than "+num2);
		}else {
			System.out.println(num1 + " is equal to "+num2);
		}
		
		System.out.println("---------------------");
		
		int day=7;
		
		if (day==1) {
			System.out.println("Today is monday we have no class");
		}else if (day==2) {
			System.out.println("Today is tuesday we have manual class");
		}else if (day==3) {
			System.out.println("Today is wednesday we have manual class");
		}else if (day==4) {
			System.out.println("Today is thursday  we have Review class");
		}else if (day==5) {
			System.out.println("Today is friday we have no class");
		}else if (day==6) {
			System.out.println("Today is saturday and we have Java class");
		}else if (day==7) {
			System.out.println("Today is sunday and Java fun day");
		}else {
			System.out.println("your input is incorrect");
		}	
		
			
			
		
			
	}

}
