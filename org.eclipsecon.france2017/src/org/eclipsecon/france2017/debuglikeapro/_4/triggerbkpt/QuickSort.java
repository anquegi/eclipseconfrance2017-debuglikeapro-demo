package org.eclipsecon.france2017.debuglikeapro._4.triggerbkpt;

public class QuickSort {

	public void sort(int[] inputArr) {
		if (inputArr == null) {
			throw new NullPointerException();
		}
		if (inputArr.length == 0) {
			throw new IllegalArgumentException("Cannot sort empty array");
		}
		quickSort(inputArr, 0, inputArr.length - 1);
	}

	private void quickSort(int[] array, int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		// calculate pivot number, taking pivot as middle index number
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		// Divide into two arrays
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search is done, then we exchange both numbers.
			 */
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(array, i, j);
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (lowerIndex < j) {
			quickSort(array, lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(array, i, higherIndex);
		}
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}