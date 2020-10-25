package com.syntac.classReplitHW;

import java.util.Scanner;

public class Boolean1 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Are you thirsty?");
	boolean thirsty=input.nextBoolean();
	System.out.println("Are you sleepy?");
	boolean sleepy=input.nextBoolean();
	
      if (thirsty && !sleepy) {
    	  System.out.println("Looks like you need to drink Water");
      }else if(thirsty && sleepy) {
    	  System.out.println("Looks like you need to drink Coffee");
      }else if (!thirsty && sleepy) {
    	  System.out.println("Looks like you need to drink Tea");
      }else {
    	  System.out.println("Looks like you need to drink Nothing");
      }


}
}
