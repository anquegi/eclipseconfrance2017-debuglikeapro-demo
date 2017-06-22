package org.eclipsecon.france2017.debuglikeapro._5.deadlock;

public class Deadlock {
	private static final Object lockA = new Object();
	private static final Object lockB = new Object();
	
	public static void main(String[] args) {
		Runnable runnableA = () -> {
			synchronized(lockA) {
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) { }
				synchronized(lockB) {
					System.out.println("Retrieved lock A and lock B");
				}
			}
		};
		Runnable runnableB = () -> {
			synchronized(lockB) {
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) { }
				synchronized(lockA) {
					System.out.println("Retrieved lock B and lock A");
				}
			}
		};
		Thread threadA = new Thread(runnableA, "Thread A");
		Thread threadB = new Thread(runnableB, "Thread B");		
		threadA.start();
		threadB.start();
	}
	
	
}
