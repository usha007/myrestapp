package com.in28minutes.oops.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("move piece up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("move piece down");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("move piece left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("move piece right");
	}

}
