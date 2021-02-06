package com.in28mins.oops;

public class MotorBike {
 int speed;
void start(int speed) {
	this.speed=speed;
	System.out.println(speed);
	System.out.println(this.speed);
	//System.out.println("Print speed");
		
}
int getSpeed() {	
	return this.speed;
}
	
}
