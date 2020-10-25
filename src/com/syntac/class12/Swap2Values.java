package com.syntac.class12;

public class Swap2Values {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		x=y+x;
		y=x-y;
		x=x-y;
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);
	}

}
