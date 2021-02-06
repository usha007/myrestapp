package com.in.Exception;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=null;
		try {
		scanner=new Scanner(System.in);
		int[] numb= {1,2,3,4};
		int number=numb[5];
		}catch(Exception e) {
			e.printStackTrace();			
		}finally {
			System.out.println("Before closescanner");
			if(scanner !=null) {
				scanner.close();
			}
			
		}System.out.println("After closescanner");
	}
}
