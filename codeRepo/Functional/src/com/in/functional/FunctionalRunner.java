package com.in.functional;

import java.util.List;

public class FunctionalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list2= List.of(1,4,7,9);
		printBasicWithFPWithFilter(list2);
		}
	private static void printBasic(List<Integer> list2) {
		for(Integer list1:list2) {
			System.out.println(list1);
		}
	}
	private static void printBasicWithFP(List<Integer> list2) {
		list2.stream().forEach(element -> System.out.println("Element - "+element));
		}
	private static void printBasicWithFPWithFilter(List<Integer> list2) {
		list2.stream().filter(element -> element%2==1).forEach(element -> System.out.println("Element - "+element));
		}
	
	}


