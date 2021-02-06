package com.in28mins.Array;
import java.math.BigDecimal;
public class StudentArrayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {99,98,100};
		StudentArray student = new StudentArray("Ranga",marks);
		int number= student.getTotalSumOfMarks();
		System.out.println("Number of marks:"+number);
		BigDecimal average= student.getAverage();
		System.out.println("Number of marks:"+average);		
	}

}
