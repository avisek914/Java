package com.syntac.classReplitHW;

import java.util.Scanner;

public class Boolean2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
			System.out.println("Is it weekend?");
			
			boolean weekend=input.nextBoolean();
			
			if (weekend) {
				System.out.println("Today you will be learning Java");
			}else {
				System.out.println("Today you wil be learning Manual testing");
			}
		
		
}
}
