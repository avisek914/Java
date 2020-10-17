package com.syntac.class6;

import java.util.Scanner;

public class switchdemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the browser");
		String browser;
		String message;
		browser=input.nextLine();
		
		
		switch (browser) {
		case "Safari":
			message="your code is going to be executed in Safari";
			break;
		case "Chrome":
			message="Your code is going to be executed in Chrome";
			break;
			default:
				message="Entered Browser is not Supported";
				break;
				
		
		}
	System.out.println(message);
		
	}

}
