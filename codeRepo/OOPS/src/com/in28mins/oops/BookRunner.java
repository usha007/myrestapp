package com.in28mins.oops;

public class BookRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book computerProgramming=new Book(15); 
		Book socialStudies= new Book(16);
		Book mathematics= new Book(54);
		Book chemistry = new Book();
		System.out.println(computerProgramming.getCopies());
		System.out.println(socialStudies.getCopies());
		System.out.println(mathematics.getCopies());
		System.out.println(chemistry.getCopies());
//System.out.println(computerProgramming.getCopies());
//computerProgramming.increaseCopies(15);	
	//computerProgramming.decreaseCopies(20);
	}
}
