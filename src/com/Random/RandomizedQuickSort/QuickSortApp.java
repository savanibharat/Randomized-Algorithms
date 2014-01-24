package com.Random.RandomizedQuickSort;

// TODO: Auto-generated Javadoc
/**
 * The Class QuickSortApp.
 */
public class QuickSortApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		int maxSize = 30; 
		QuickSort arr;
		arr = new QuickSort(maxSize); 

		for (int j = 0; j < maxSize; j++) 
		{ 

			long n = (int) (java.lang.Math.random() * 99);
			arr.insert(n);

		}
		arr.display(); 
		
		arr.quickSort();
		
		arr.display(); 

	}

}