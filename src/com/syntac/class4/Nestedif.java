package com.syntac.class4;

public class Nestedif {
public static void main(String[] args) {
	
	boolean allergy=true;
	boolean pet=true;
	boolean peanut=true;
	
	
	if (allergy) {
		System.out.println("Lets do further check");
	    
		if (pet) {
			System.out.println("No pet inside house");
		}else if (peanut) {
			System.out.println("No more peanuts");
		}else {
			System.out.println("just a seasonal allergy");
		}
	
	}else {
		System.out.println("You're lucky");
	
		
	}
	
}
}
