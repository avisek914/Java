package com.syntac.classReplitHW;

public class TwoDimArray {
	public static void main(String[] args) {
		int n[][]= {
				{1,2,3,4,5,6,7},
				{1,2,3,4,5,6},
				{1,2,3,4,5},
				{1,2,3,4},
				{1,2,3},
				{1,2},
				{1}
				
				
		};
		
		for (int i=0; i<n.length; i++) {
			for (int k=0; k<n[i].length; k++) {
				System.out.print(n[i][k]+" ");
				
			}
			System.out.println();
		}
		
	}

}
