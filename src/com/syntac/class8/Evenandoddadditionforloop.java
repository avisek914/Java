package com.syntac.class8;

public class Evenandoddadditionforloop {
	public static void main(String[] args) {
		int sumO=0;
		int sumE=0;
		for (int n=1; n<51; n++) {
			if (n%2==0) {
				sumE+=n;
			}else {
				sumO+=n;
			}
		}
		System.out.println("The sum of even number from 1 to 50 is "+sumE);
		System.out.println("The sum of odd number from 1 to 50 is "+sumO);

	}

}
