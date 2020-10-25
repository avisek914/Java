package com.syntac.classReplitHW;

public class Array {
public static void main(String[] args) {
	
	int [][] n= {
			{1,2,3,4,5,6,7,8,9,10},
			{2,4,6,8,10,12,14,16,18,20},
			{3,6,9,12,15,18,21,24,27,30},
			{4,8,12,16,20,24,28,32,36,40},
			{5,10,15,20,25,30,40,45,50}
	};
			
			for (int i=0; i<n.length; i++) {
				for (int k=0; k<n[i].length; k++) {
					System.out.print(n[i][k]+" ");
					
				}
				System.out.println();
			}
			
			
}
}
