package com.syntac.class11;

import java.lang.reflect.Array;

public class Accessingallvaluesfrom2darray {
	
	 public static void main(String[] args) {
		 char[][] $array=new char[3][4];
			
			//first row
			
			$array[0][0]='A';
			$array[0][1]='B';
			$array[0][2]='C';
			$array[0][3]='D';
			
			//Second row
			
			$array[1][0]='W';
			$array[1][1]='X';
			$array[1][2]='Y';
			$array[1][3]='Z';
			
			//Third row
			
			$array[2][0]='Q';
			$array[2][1]='E';
			$array[2][2]='R';
			$array[2][3]='T';
		
			
			for (int row=0; row<$array.length; row++) { //loops through rows
				for (int c=0; c<$array[row].length; c++) { //loops through column
					System.out.print($array[row][c]);
				}
				System.out.println();
				
			}
			
			
			System.out.println("------------Another Way to create 2d Array-----------");
			int [][] array= {
					{10, 20, 30},
					{1, 2, 3},
					{100, 200, 300}
			
			          };
			
		System.out.println(array[2][1]);
		System.out.println(array[0][0]);
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
			
			
	}

}
