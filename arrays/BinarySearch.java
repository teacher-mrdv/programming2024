/*
 *	Binary search in Java
 *  ITERATIVE implementation (SL)
 * 	v2.0 mrdv
 */

public class BinarySearch
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
	
	// Parameters: array and key; returns the index of the key
	// or -1 if the key is not found in the array
    public static int binarySearch(int[] array, int key)
    {	printArray(array); System.out.println();
		int counter = 0;
        int low  = 0;
        int high = array.length - 1;
        int mid  = 0;
        while (low <= high)
        {	counter++;
            mid = (low + high) / 2;
            System.out.printf( "\t[ Low: %2d | High: %2d | Mid: %2d | Found: %b]\n", low, high, mid, (array[mid] == key) );
            if (array[mid] == key)
            {	System.out.println("\tComparisons: " + counter);
				return mid;
            } else if (array[mid] < key)
            {	low = mid + 1;
            } else
            {	high = mid - 1;
            }
        }
        System.out.printf( "\t[ Low: %2d | High: %2d | Mid: %2d | Found: %b ]", low, high, mid, (array[mid] == key) );
        System.out.println("  Comparisons: " + counter);
        return -1;
    }

    public static void main(String[] args)
    {	System.out.println("\n\u001b[1mBinary search demo\u001b[0m");
        /* for further testing
        int[] array =
        {
            2, 8, 12, 14, 16, 19, 24, 28, 31, 33,
            39, 40, 45, 49, 51, 53, 55
        }; */
        int[] array = { 0, 2, 4, 6, 8, 9, 10, 12 };
        
        System.out.println("\nbinarySearch(array, 1)  ");
        System.out.println(binarySearch(array, 1));
        System.out.println("\nbinarySearch(array, 2)  ");
        System.out.println(binarySearch(array, 2));
        System.out.println("\nbinarySearch(array, 8)  ");
        System.out.println(binarySearch(array, 8));
        System.out.println("\nbinarySearch(array, 12) ");
        System.out.println(binarySearch(array, 12));
        System.out.println("\nbinarySearch(array, 55) ");
        System.out.println(binarySearch(array, 55));
        System.out.println("\nbinarySearch(array, 99) ");
        System.out.println(binarySearch(array, 99));
        
        System.out.println();
	}
}

