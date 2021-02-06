package com.in28minutes.firstjavaProject;

public class Multiplication {
	void print() {
		print(5);
	}
	
	void print(int j) {
		print(j,1,10);
		
	}
	void print(int j, int from , int to) {
		for(int i=from;i <=to; i++) {
			System.out.printf("%d*%d=%d",i,j,i*j ).println();
		
	}
	}

}
