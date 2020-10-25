package com.syntac.class10;

import java.util.Scanner;

public class ArrayFromScanner {
       public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] names;
		System.out.println("How many names do you wanna input");
		int size=scan.nextInt();
		names=new String[size];
		for (int i=0; i<size; i++) {
			System.out.println("Please Enter name");
			names[i]=scan.next();
		}
		
		for (int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
    	   
    	   
	}
    	
}
