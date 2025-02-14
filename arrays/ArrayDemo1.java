/*	Coding challenges for today:

	1.	Make a (new, different) copy of an array
	2.	Print an array
	3.	Calculate the:
	⁃ average,
	⁃ minimum,
	⁃ maximum, and
	⁃ range
	…of all integers in an array
*/
public class ArrayDemo1
{
	public static int[] clone(int[] original)
	{
		int[] copy = new int[original.length];
		for(int i = 0; i < original.length; i++)
		{
			copy[i] = original[i];
		}
		return copy;
	}

	public static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]);
			if(i < array.length - 1)
			{
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	public static double average(int[] array)
	{
		double average = 0;
		for(int i = 0; i < array.length; i++)
		{
			average = average + array[i];
		}
		return average/array.length;
	}

	public static int minimum(int[] array)
	{
		int min = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if( array[i] < min )
			{	min = array[i];
			}
		}
		return min;
	}

	// do the maximum, & the range
	public static int maximum(int[] array)
	{
		int max = array[0];
		for(int i = 1; i < array.length; i++)
		{
			if( array[i] > max )
			{	max = array[i];
			}
		}
		return max;
	}

	public static int range(int[] array)
	{
		return maximum(array) - minimum(array);
	}
		
	public static void main (String[] args)
	{
		int[] array1 = {5,2,3,7,9,2};
		System.out.println( array1 );
		printArray(array1);
		int[] array2 = clone(array1);
		printArray(array2);
		System.out.println( minimum(array1) );
		System.out.println( maximum(array1) );
		System.out.println( range(array1) );
	}
}

