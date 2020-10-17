package com.syntac.class5;

import java.util.Scanner;

public class Logicaland {

	public static void main(String[] args) {
		Scanner input;
		int n;
		input=new Scanner(System.in);
		System.out.println("please enter any number");
		n=input.nextInt();
		
		if (n>0 && n<=10) {
			System.out.println("you entered small number");
		}else if (n>10 && n<=100) {
			System.out.println("you entered medium number");
		}else if (n>100 && n<=1000) {
			System.out.println("you entered large number");
		}
		
		
		
	}
}
