package com.in.functional;

import java.util.List;

public class NumberRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number= List.of(4,6,8,13,3,15);
		//number.stream().forEach(element -> System.out.println(element));
		/*int dum=0;
		for(int num:number) {
		dum+=num;		
	}*/
		int sum=number.stream().filter(element -> element%2==1).reduce(0,(number1,number2)->number1+number2);
		//int sum=number.stream().reduce(0,(number1,number2)->number1+number2);
		System.out.println(sum);
	}	
}
