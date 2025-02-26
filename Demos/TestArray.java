import java.util.*;

public class TestArray {

	public static void printArray(String[] stringArray)
	{
		for(int i = 0; i < stringArray.length; i++)
		{	System.out.print(stringArray[i] + " ");
		}
	}

	public static void printArray(int[] intArray)
	{
		for(int i = 0; i < intArray.length; i++)
		{	System.out.print(intArray[i] + " ");
		}
	}
	
	public static void main (String[] args) {
		int[] a = new int[10];
		int[] b = {1,2,3,4,5};
		int[] c = {1,2,3,4,5};
		String[] s = new String[10];
		s[0] = "alpha";
		s[9] = "omega";
		s[3] = "delta";
		a = b;
		printArray(a);
		printArray(b);
		printArray(c);
		System.out.println(a + " " + b + " " + c);
		System.out.println(a == b);
		System.out.println(a == c);
		printArray(s);
		
	}
}

