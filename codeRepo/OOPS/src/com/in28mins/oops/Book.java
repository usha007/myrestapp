package com.in28mins.oops;
public class Book {
 int noOfCopies;
Book(){
	this(70);
}
Book(int noOfCopies){
	this.noOfCopies= noOfCopies;
	
}
void setCopies(int noOfCopies) {
	if(noOfCopies>0) {
	this.noOfCopies=noOfCopies;
	System.out.println(this.noOfCopies);
}
}
int getCopies() {
	return this.noOfCopies;
}
void increaseCopies( int howMuch) {
	//this.noOfCopies+= howMuch;
	//System.out.println(this.noOfCopies);
	setCopies(this.noOfCopies+howMuch);
}
void decreaseCopies(int howMuch) {
//	this.noOfCopies-= howMuch;
//	System.out.println(this.noOfCopies);
	setCopies(this.noOfCopies-howMuch);
}
}
