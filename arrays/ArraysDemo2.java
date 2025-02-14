public class ArraysDemo2
{
	// what does this method do?
	public static int[] mystery(int[] a)
	{
		int len = a.length;
		int[] output = new int[len];
		for(int i = len-1; i >= 0; i--)
		{
			output[len-1-i] = a[i];
			printArray(output);
		}
		return output;
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

	public static int countOdds(int[] array)
	{
		int odds = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] % 2 != 0)
			{
				odds = odds + 1;
			}
		}
		return odds;
	}
	
	public static void main (String[] args) {
		int[] array = {1,2,3,4,5};
		printArray(array);
		array = mystery(array);
		System.out.println( countOdds(array) );
		printArray(array);
		
	}
}
