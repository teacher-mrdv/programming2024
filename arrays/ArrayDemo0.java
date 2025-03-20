
public class ArrayDemo0
{
	
	public static void main (String[] args)
	{
		int[] array = {1,2,3,4,5,6,7,8,9,0};
		System.out.println(array);
		for(int index = 0; index < array.length; index++)
		{
			System.out.print(array[index] + " ");
		}
		int[] numbers = array;
		System.out.println(numbers);
	}
}

