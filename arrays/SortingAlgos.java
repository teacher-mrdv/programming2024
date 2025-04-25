/*
 * Sorting algos in Java
 * v2.0 mrdv
 *
 */


public class SortingAlgos
{
	private static final String BOLD  = "\u001b[1m"; // change to empty strings
	private static final String RESET = "\u001b[0m"; // if this doesn't work for you
	
	public static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{	System.out.printf( "[%d]:%s%d%s  ", i, BOLD, array[i], RESET);
		}
		System.out.println();
	}

	public static int[] clone(int[] array)
	{
		int[] x = new int[array.length];
		for(int i = 0; i < array.length; i++)
		{	x[i] = array[i];
		}
		return x;
	}

	public static void selectionSort(int[] array)
	{	int indexToSort = 0;
		int comparisons = 0;
		while( indexToSort < array.length - 1)
	    {	int smallestIndex = indexToSort;
			int indexToCheck = smallestIndex + 1;
			while(indexToCheck < array.length)
		    {	comparisons++;
				if( array[indexToCheck] < array[smallestIndex])
				{	smallestIndex = indexToCheck;
				}
				indexToCheck++;
			}
			int temp = array[indexToSort];
			array[indexToSort] = array[smallestIndex];
			array[smallestIndex] = temp;
			indexToSort++;
			System.out.print("\t>>> ");	printArray(array); // traces the array
	    }
	    System.out.println("\tComparisons: " + comparisons);
	}

	public static void bubbleSort(int[] array)
	{	int comparisons = 0;
		int len = array.length;
		for(int i = 0; i < len-1; i++)
		{	for(int j = 0; j < len-1-i; j++)
			{	if( array[j] > array[j + 1])
				{	comparisons++;
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					System.out.print("\t>>> ");	printArray(array); // traces the array
				}
			}
		}
		System.out.println("\tComparisons: " + comparisons);
	}

	public static void insertionSort(int[] array)
	{
		int comparisons = 0;
		int len = array.length;
		for(int i = 1; i < array.length; i++)
		{	int temp = array[i];
			int j = i-1;
			while(j >= 0 && array[j] > temp)
			{	comparisons++;
				array[j+1] = array[j];
				j--;
				System.out.print("\t>>> ");	printArray(array); // comment this line for less output; shows changes in the array/traces the array
			}
			array[j+1] = temp;
		}
		System.out.println("\tComparisons: " + comparisons);
	}

	public static void main (String[] args)
	{
		int[] original  = { 9, 1, 3, 7, 5, 0 };
		int[] selection = clone(original);
		int[] bubble = clone(original);
		int[] insert = clone(original);
		System.out.print(BOLD + "\nOriginal array:     " + RESET);
		printArray(original);
		System.out.println(BOLD + "\nSelection sort:" + RESET);
		selectionSort(selection);
		System.out.print(BOLD + "\tFinal result:     " + RESET);
		printArray(selection);
		System.out.println(BOLD + "\nBubble sort:" + RESET);
		bubbleSort(bubble);
		System.out.print(BOLD + "\tFinal result:     " + RESET);
		printArray(bubble);
		System.out.println(BOLD + "\nInsertion sort:" + RESET);
		insertionSort(insert);
		System.out.print(BOLD + "\tFinal result:     " + RESET);
		printArray(insert);
	}
}
