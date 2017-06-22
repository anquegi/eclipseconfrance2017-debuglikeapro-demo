package org.eclipsecon.france2017.debuglikeapro._1.watchpoint;

import java.util.Random;

public class Watchpoints {

	private String myField;
	
	public static void main(String[] args) {
		new Watchpoints().run();
	}

	private void run() {
		System.out.println("Watchpoints.run()");
		myField = "new value";
		System.out.println(myField);
		System.out.println(myField.hashCode());
		if (myCoolMethod()) {
			System.out.println("Watchpoints.run()");
		}
	}
	
	private boolean myCoolMethod() {
		// do some important stuff
		return new Random().nextBoolean();
	}
}
