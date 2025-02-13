
public class ArraysDemo2 {

	public static void mystery(int[] a)
	{
		for(int i = a.length-1; i >= 0; i--)
		{
			a[i] = a[i] +5;
			printArray(a);
		}
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
				array[i] = -array[i];
			}
		}
		return odds;
	}
	
	public static void main (String[] args) {
		int[] array = {1,2,3,4,5};
		printArray(array);
		mystery(array);
		System.out.println( countOdds(array) );
		printArray(array);
		
	}
}

