package com.syntac.class4;

import java.util.Scanner;

public class Scannerdemo {
public static void main(String[] args) {
	 int num=80;
	 String str="i am a string";
	 
	 Scanner scan=new Scanner(System.in);//enables input to the console
	System.out.println("Please Enter your name");
	 String value=scan.nextLine();//waits for your input and once you provide input-->> hit ENTER
	 
	 System.out.println("Nice to meet you " +value);
	 
	
}
}
