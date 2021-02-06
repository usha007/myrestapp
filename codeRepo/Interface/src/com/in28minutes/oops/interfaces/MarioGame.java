package com.in28minutes.oops.interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("goes into hole");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go backward");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go Forward");
	}

}
