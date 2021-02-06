package com.in.functional;

import java.util.List;
import java.util.stream.IntStream;

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10);
	//	IntStream.range(1, 10).forEach(p->System.out.println(p));
		//IntStream.range(1,11).map(e->e*e).forEach(p->System.out.println(p));
	List<String> str=List.of("Apple","Bat");
	str.stream().map(s->s.toLowerCase()).forEach(p->System.out.println(p));
	
	}

}
