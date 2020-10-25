package com.syntac.class10;

public class AllValursFromArray {
     public static void main(String[] args) {
		String[] cars = {"Bmw", "Audi", "Lexus", "Mercedes", "Audi"};
		
	 for (int a=0; a<cars.length; a++) {
		 System.out.print(cars[a]+ " ");
	 }
	 System.out.println();
	 
	 System.out.println("getting values from array using enhanced for loop");
	 
	 for (String car:cars) {
		 System.out.print(car+" ");
	 }
	 
	 
	}
}
