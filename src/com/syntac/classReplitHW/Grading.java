package com.syntac.classReplitHW;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		
		System.out.println("Please enter your mark");
		Scanner mark=new Scanner (System.in);
		int m=mark.nextInt();
		
		if (m>=1 && m<=25) {
			System.out.println("Your grade is F");
		}else if(m>25 && m<=45) {
			System.out.println("Your grade is E");
		}else if(m>45 && m<=50) {
			System.out.println("Your grade is D");
		}else if(m>50 && m<=60) {
			System.out.println("Your grade is C");
		}else if(m>60 && m<=80) {
			System.out.println("Your grade is B");
		}else if(m>80) {
			System.out.println("Your grade is A");
		}else {
			System.out.println("Please enter valid mark");
			
		}
		
		
		
	}
}
