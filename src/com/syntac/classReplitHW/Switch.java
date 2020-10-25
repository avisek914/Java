package com.syntac.classReplitHW;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		System.out.println("Please enter your favorite car make");
		Scanner input=new Scanner (System.in);
		String car=input.next();
		
		switch (car) {
		case "BMW":
			System.out.println("Your favorite car is german car");
			break;
		case "Toyota":
			System.out.println("Your favorite car is japanese car");
			break;
		case "Maserati":
			System.out.println("Your favorite car is italian car");
			break;
			default:
				System.out.println("Your favorite car is unknown");
			
			
			
		}
		
		
		
	}

}
