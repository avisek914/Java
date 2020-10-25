package com.syntac.class12;

public class Primenumber {
	public static void main(String[] args) {
		int num=4;
		boolean flag=true;
		if(num>1) {
		for (int i=2; i<num; i++) {
			if (num%1==0) {
				flag=false;
				break;
			}
			
		}
		}else {
			flag=false;
		}
			
	if (flag) {
		System.out.println("Prime number");
	}else {
		System.out.println("Not a Prime number");
	}
	
	
	}
	
}
