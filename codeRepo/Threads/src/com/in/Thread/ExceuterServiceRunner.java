package com.in.Thread;


import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceuterServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exS=Executors.newSingleThreadExecutor();
		exS.execute(new Task1());
		exS.execute(new Thread(new Task2()));
		exS.shutdown();
	}

}
