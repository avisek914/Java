package com.syntac.class7;

public class Task {
public static void main(String[] args) {
	  boolean workday=true;
	   int day=1;
	   
	   while (workday) {
		   if (day<6) {
			   System.out.println("I need a day off");
		   }else {
			   System.out.println("It is weekend and i am off");
			   workday=false;
		   }
	   day++;
	   }
}
}
