package com.in.functional;

import java.util.List;

public class LambdaBehind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of(23,43,36,48,34,45).stream().filter(n->n%2==0)
		.forEach(e->System.out.println(e));

}
}
