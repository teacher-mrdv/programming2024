
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

	public static int min(int[] array)
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
		
	public static void main (String[] args)
	{
		int[] array1 = {5,2,3,7,9,0,-3};
		//System.out.println( array1 );
		printArray(array1);
		int[] array2 = clone(array1);
		printArray(array2);
		System.out.println( min(array1) );
		
	}
}

