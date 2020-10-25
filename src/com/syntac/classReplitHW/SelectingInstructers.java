package com.syntac.classReplitHW;

import java.util.Scanner;

public class SelectingInstructers {
	
	public static void main(String[] args) {
		
		System.out.println("Enter name of the instructor");
		Scanner input=new Scanner (System.in);
		String name=input.next();
		
		switch (name) {
		case "Asghar":
			System.out.println("Will take care of Java Assignment");
			break;
		case "Moazam":
			System.out.println("Will take care of SDLC Assignment");
			break;
		case "Weqas":
			System.out.println("Will take care of Selenium Assignment");
			break;
		case "Asel":
			System.out.println("Will take care of every Assignment");
			break;
			default:
				System.out.println("Invalid instructor selected");
		}
		
		
		
	}

}
