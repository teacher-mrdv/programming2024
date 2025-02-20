/*
 * https://www.geeksforgeeks.org/java-math-class/ for more Maths methods
 * https://alvinalexander.com/programming/printf-format-cheat-sheet/
 * 
 */
public class Chapter9Problems
{
	/* global CONSTANT; makes the code more maintaneable
	 * problem 9.5; ROLLS here is tha same as SIZE in worksheets */
	public static final int ROLLS = 100;	// change to 1000 for 9.5

	// problem #9.1
	public static double average(int[] array)
	{
		double sum = 0;
		int len = array.length;
		for(int i = 0; i < len; i++)
		{	sum = sum + array[i];
		}
		return sum / len;
	}

	// problem #9.2
	public static int random()			// if no argument is given, assume 6
	{
		double random = Math.random() * 6;
		return (int)(random + 1);
		//	   \---/ this is casting: converts a double to int
		// https://www.w3schools.com/java/java_type_casting.asp
	}
	
	public static int random(int max)	// overloading random() in case an argument is used when calling the method
	{
		double random = Math.random() * max;
		return (int)(random + 1);
	}
 
	/* Min, Max, Range calcaulation methods:
	 * These may not very useful with our die roll dataset,
	 * but useful for future use! (we know the min=1 and max=6)
	 * so at least the testing will be easy */
	public static int minimum(int[] array)
	{
		int minimum = array[0];
		int len = array.length;
		for(int i = 1; i < len; i++)	// why 1 here?
		{	if( array[i] < minimum)
			{	minimum = array[i];
			}
		}
		return minimum;
	}

	public static int maximum(int[] array)
	{
		int maximum = array[0];
		int len = array.length;
		for(int i = 1; i < len; i++)	// why 1 here again?
		{	if( array[i] > maximum)
			{	maximum = array[i];
			}
		}
		return maximum;
	}

	public static int range(int[] array)
	{
		return maximum(array) - minimum(array);
	}
	
	public static void main (String[] args)
	{
		int[] num = new int[ROLLS]; // create the array
		for (int i = 0; i < ROLLS; i++)
		{	num[i] = random(6);		// 6-sided die
		}
		System.out.println();
		for (int i = 0; i < ROLLS; i++)
		{	System.out.print(num[i] + " ");
		}
		System.out.println();
		// printf replaces print, allows us to print with format
		System.out.printf( "\nAverage = %,.3f \n", average(num) );
		System.out.printf( "Minimum = %,d \n", minimum(num) );
		System.out.printf( "Minimum = %,d \n", maximum(num) );
		System.out.printf( "Range   = %,d \n", range(num) );
	}
}

