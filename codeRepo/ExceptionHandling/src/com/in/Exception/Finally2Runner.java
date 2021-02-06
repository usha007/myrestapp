package com.in.Exception;

public class Finally2Runner {
	public static void main(String[] args)  {
	try {
			someMethod();
			Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
		someMethod1();}

	private static void someMethod() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		
	}
	private static void someMethod1() throws RuntimeException {
		// TODO Auto-generated method stub
		
		
	}
		
}


/*Exception Hierachy
 * Error(system error) , exception(Programmmer handled)
 * Runtimeexception subclass of runtimeException(unChecked)
 * Interrupted Exception
 * Not a runtime or subclasee (unchecked exp) or runtime is riskyException, calling method must handle it or throw it
 * 
 * 
 * */


