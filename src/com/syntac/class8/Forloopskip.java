package com.syntac.class8;

public class Forloopskip {
public static void main(String[] args) {
	for (int i=1; i<=5; i++) {
		if(i==3 || i==4) {
			continue;
		}
	System.out.print(i+" ");
	}
}
}
