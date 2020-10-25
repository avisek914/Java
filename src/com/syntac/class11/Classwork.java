package com.syntac.class11;

public class Classwork {
public static void main(String[] args) {
	String[][] array= {
			{"Mr", "Mrs", "Ms", "Miss"},
			{"Smith", "Jordan", "Jackson", "Obama"}
			
	};
	System.out.println(array[0][1]+" "+array[1][0]);
	System.out.println(array[0][0]+" "+array[1][3]);
	System.out.println(array[0][2]+" "+array[1][2]);
	System.out.println(array[0][3]+" "+array[1][1]);
	
	
	
	System.out.println("------------Second Task----------");

	    String[][] car= {
	    		{"American", "German", "Korean","Italian"},
	    		{"Dodge", "Bmw", "Hundai", "Ferrari"}
	    };
	    		for (int i=0; i<car.length; i++) {
	    			for(int j=0; j<car[i].length; j++) {
	    				System.out.print(car[i][j] + " ");
	    			}
	    			
	    			System.out.println();
	    			
	    		}
	    		
	    		// printing 2d Array from enhanced for loop
	    		
	    		for (String[] carArray:car) {
	    			for(String cars:carArray) {
	    				System.out.print(cars + "*");
	    			}
	    			System.out.println();
	    		}
	    		

	       
}
}
