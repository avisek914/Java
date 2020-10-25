package com.syntac.class6;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
    System.out.println("Please eter day number");
    Scanner input=new Scanner(System.in);
    
     int day=input.nextInt();
     String today;
     
      
		
		switch(day) {
		case 1:
		today="Monday";
		break;
		case 2:
			today="Tuesday";
			break;
		case 3:
			today="Wednesday";
			break;
		case 4:
			today="Thursday";
			break;
		case 5:
			today="Friday";
			break;
		case 6:
			today="Saturday";
			break;
		case 7:
			today="Sunday";
			break;

		
		}
		
	
		
	}
}
