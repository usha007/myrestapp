package com.in.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

//extends thread or implements runnable
class Task1 extends Thread{
	public void run() { //Exact signature
				for(int i=101;i<=199;i++) {
			System.out.println(i+"");
			
		}System.out.println("Task1 Done");
	} 
}

class Task2 implements Runnable{
	public void run() { //Exact signature
				for(int i=201;i<=299;i++) {
			System.out.println(i+"");
			}System.out.println("Task2 Done");
	} 
}

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Task1
		Task1 task1= new Task1();
		task1.setPriority(10);
		task1.start();

		//Task2
		Task2 task2= new Task2();
		Thread thread= new Thread(task2);
		thread.start();
		task1.join();
		thread.join();
		//Task3
		for(int i=301;i<=399;i++) {
			System.out.println(i+"");
			
		}System.out.println("\nTask3 Done");
	}

}


/*
 * NEW:THREAD IS CREATED/READY TO RUN BUT NO BADY ASKED TO EXECUTE
 * RUNNABLE:READY TO RUN BUT OTHER THREAD IS EXCEUTED
 * RUNNING:IF THE THREAD IS BEING EXCEUTED IT IS IN RUNNING
 * BLOCKED/WAITING:IF WAITING ON EXTERNAL SERVICE DATA/ SOME OTHER THREAD FOR DATA THEN IT IS BLOCKED
 * TERMINATED/DEAD:THREAD IS DEAD AFTER IT IS DONE EXCECUTION
 * 
 * WE CAN SET PRIORITY(JUST A REQUEST) OF A THREAD IN RANGE OF mAX(1), NORMAL(5) AND MIN PROPERTY(10)
 * thread.sleep(*ms);//wait time
 * thread.yield();// request current thread yields to give up cpu processing
 * synchronized//only one thread can execute that synchronized code
 * 
 * join 
 * exceuter service: shutdown, execue
 * multiple thread kick off at same time
 * monitor states
 * helps writing logic to return results
 * newFixedThreadPool(max 5)
 * */
