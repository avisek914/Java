package com.syntac.class4;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("is it raining ?");
		boolean rain=input.nextBoolean();
		if (rain) {
			System.out.println("please take an umbrella");
		}else {
			System.out.println("Its a nice weather lets take a walk");
		}
		
		System.out.println("please enter your age");
		int age=input.nextInt();
		System.out.println("you are "+age+ " "
				+ "syears old");
		
		
}


}
