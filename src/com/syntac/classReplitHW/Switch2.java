package com.syntac.classReplitHW;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		
		System.out.println("enter the roll number of the child");
		
		Scanner input=new Scanner (System.in);
		int roll=input.nextInt();
		
		switch (roll) {
		case 101:
			System.out.println("Student name: Ramesh");
			break;
		case 102:
			System.out.println("Student name: Mahesh");
			break;
		case 103:
			System.out.println("Student name: Mukesh");
			break;
			default:
				System.out.println("Not found Student name: in Class");
			
		}
		
		
		
	}

}
