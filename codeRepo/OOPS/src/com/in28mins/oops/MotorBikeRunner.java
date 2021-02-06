package com.in28mins.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike hyundai= new MotorBike();
		MotorBike yamaha = new MotorBike();
		yamaha.start(110);
		System.out.println(yamaha.getSpeed());
		hyundai.start(80);
		
		yamaha.speed=110;
	hyundai.speed=80;

	}

}
