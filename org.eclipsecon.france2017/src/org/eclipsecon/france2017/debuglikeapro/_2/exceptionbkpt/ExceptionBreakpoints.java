package org.eclipsecon.france2017.debuglikeapro._2.exceptionbkpt;

public class ExceptionBreakpoints {

	private String myField;
	
	public static void main(String[] args) {
		new ExceptionBreakpoints().run();
	}

	private void run() {
		if (myField.getBytes().length == 0) {
			System.out.println("Empty string");
		}
	}
}
