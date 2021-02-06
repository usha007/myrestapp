package com.in28mins.Array;

import java.math.BigDecimal;

public class StudentArray {
private int[] marks;
private String name;
public StudentArray(String name, int[] marks) {
	// TODO Auto-generated constructor stub
	this.name=name;
	this.marks=marks;
}
int getNumberOfMarks() { 
	return marks.length;
	} 
int getSumOfMarks() { 
	int sum=0;
	for(int mark: marks) {
		sum+=mark;
		}
	return sum;
	} 
int getMaximunMark() 
{ 
		int maxMark= 0;
		for(int mark: marks) {
			if(mark>maxMark) {
				maxMark=mark;
			}
		}
		return maxMark;
}
int getMinimunMark() 
{ 
		int minMark= 0;
		for(int mark: marks) {
			if(mark<minMark) {
				minMark=mark;
			}
		}
		return minMark;
}

BigDecimal getAverage() {
	BigDecimal avg = null;
	int sum= getTotalSumOfMarks();
	int total= getNumberOfMarks();
	return new BigDecimal(sum/total);
}


int getTotalSumOfMarks() 
{ 
		int sumMark=0;
		int[] marks=this.marks;
		for(int i=0;i<marks.length;i++) {
			sumMark= sumMark+marks[i];
			}
		return sumMark;
	}
}

