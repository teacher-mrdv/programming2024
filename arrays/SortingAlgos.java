/*
 * Sorting algos in Java
 * https://youtu.be/eOPIuDkUkDk?si=WzizpO03foz2S9qT <-- bubble sort
 * https://youtu.be/fWm1R3vU-MM?si=rlY0h6TAw7Q5tB4a <-- selection sort
 * https://youtu.be/kCku5BLI3fo?si=E8HSpU7BFN7VMSWv <-- insertion sort
 *
 */


public class SortingAlgos
{
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]:%d  ",i , a[i]);
		}
		System.out.println();
	}

	public static int[] clone(int[] a)
	{
		int[] x = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}

	public static void selectionSort(int[] a)
	{
		// finish this for homework. Refer to sorting_algos_SL.pdf and videos^
		
	}

	public static void bubbleSort(int[] a)
	{
		// finish this for homework. Refer to sorting_algos_SL.pdf and videos^
		
	}

	public static void insertionSort(int[] a)
	{	int c = 0; // counter to evaluate performance
		int len = a.length;
		for(int i = 1; i < a.length; i++)
		{	int temp = a[i];
			int j = i-1;
			while(j >= 0 && a[j] > temp)
			{	c++;
				a[j+1] = a[j];
				j--;
				System.out.print("\t>>> ");	printArray(a); // comment this line for less output
			}
			a[j+1] = temp;
		}
		System.out.println("\tComparisons: " + c);
	}

	public static void main (String[] args)
	{
		int[] original = { 7, 1, 2, 6, 5, 3, 4 };
		int[] selection = clone(original);
		int[] bubble = clone(original);
		int[] insert = clone(original);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nSelection sort:");
		selectionSort(selection);
		System.out.println("\nFinal result:");
		printArray(selection);
		System.out.println("\nBubble sort:");
		bubbleSort(bubble);
		System.out.println("\nFinal result:");
		printArray(bubble);
		System.out.println("\nInsertion sort:");
		insertionSort(insert);
		System.out.println("\nFinal result:");
		printArray(insert);
	}
}
