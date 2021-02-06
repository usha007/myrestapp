package com.in.Exception;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extracted();System.out.println("Main Ended");
	}

	private static void extracted() {
		extracted1();System.out.println("Method1 Ended");
	}

	private static void extracted1() {
		try{
			String str=null;
			str.length();
		System.out.println("Method2 Ended");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
