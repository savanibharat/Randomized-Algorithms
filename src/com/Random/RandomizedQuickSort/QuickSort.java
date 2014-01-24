package com.Random.RandomizedQuickSort;

import java.util.*; // imported so that Random class can be used

// TODO: Auto-generated Javadoc
/**
 * The Class QuickSort.
 */
class QuickSort {
	
	/** The array. */
	private long[] theArray; // ref to array theArray
	
	/** The n elems. */
	private int nElems; // number of data items

	// --------------------------------------------------------------

	/**
	 * Instantiates a new quick sort.
	 *
	 * @param max the max
	 */
	public QuickSort(int max) // constructor
	{

		theArray = new long[max]; // create the array
		nElems = 0; // no items yet
	}

	// --------------------------------------------------------------
	/**
	 * Insert.
	 *
	 * @param value the value
	 */
	public void insert(long value) // put element into array
	{

		theArray[nElems] = value; // insert it
		nElems++; // increment size

	}

	// --------------------------------------------------------------
	/**
	 * Display.
	 */
	public void display() // displays array contents
	{

		System.out.print("A=");
		for (int j = 0; j < nElems; j++)
			// for each element,
			System.out.print(theArray[j] + " "); // display it
		System.out.println("");

	}

	// --------------------------------------------------------------
	/**
	 * Quick sort.
	 */
	public void quickSort() {

		recQuickSort(0, nElems - 1);

	}

	// --------------------------------------------------------------
	/**
	 * Rec quick sort.
	 *
	 * @param left the left
	 * @param right the right
	 */
	public void recQuickSort(int left, int right) {

		if (right - left <= 0) // if size <= 1,
			return; // already sorted

		else // size is 2 or larger

		{

			// The following three lines of code ensure that an
			// element chosen uniformly at random from
			// theArray[left..right] is used as the pivot.
			Random rand = new Random();
			int pivotIndex = left + rand.nextInt(right - left + 1);
			swap(pivotIndex, right);

			long pivot = theArray[right]; // rightmost item
											// partition range
			int partition = partitionIt(left, right, pivot);
			
			recQuickSort(left, partition - 1); // sort left side
			recQuickSort(partition + 1, right); // sort right side

		}
	} // end recQuickSort()
		// --------------------------------------------------------------

	/**
		 * Partition it.
		 *
		 * @param left the left
		 * @param right the right
		 * @param pivot the pivot
		 * @return the int
		 */
		public int partitionIt(int left, int right, long pivot) {

		int leftPtr = left - 1; // left (after ++)
		int rightPtr = right; // right-1 (after --)

		while (true) { // find bigger item

			while (theArray[++leftPtr] < pivot)
				; // (nop)
					// find smaller item

			while (rightPtr > 0 && theArray[--rightPtr] > pivot)
				; // (nop)

			if (leftPtr >= rightPtr) // if pointers cross,
				break; // partition done
			else
				// not crossed, so
				swap(leftPtr, rightPtr); // swap elements
		} // end while(true)

		swap(leftPtr, right); // restore pivot
		return leftPtr; // return pivot location

	} // end partitionIt()
		// --------------------------------------------------------------

	/**
		 * Swap.
		 *
		 * @param a
		 * @param b
		 */
		public void swap(int a, int b) // swap two elements
	{

		long temp = theArray[a]; // A into temp
		theArray[a] = theArray[b]; // B into A
		theArray[b] = temp; // temp into B

	}
}