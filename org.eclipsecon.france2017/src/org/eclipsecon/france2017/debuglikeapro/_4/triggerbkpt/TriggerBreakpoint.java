package org.eclipsecon.france2017.debuglikeapro._4.triggerbkpt;

import java.util.stream.IntStream;

public class TriggerBreakpoint {
	
	public static void main(String[] args) {
		QuickSort sorter = new QuickSort();
		int[] input = { 24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12 };
		sorter.sort(input);
		IntStream.of(input).forEach(i -> System.out.println(i));
	}
}
