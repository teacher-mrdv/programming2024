import java.util.*;

public class TestArray {

	public static void printArray(String[] stringArray)
	{
		System.out.print(stringArray[0]);
		for(int i = 1; i < stringArray.length; i++)
		{	System.out.print(", " + stringArray[i]);
		}
		System.out.println();
	}

	public static void printArray(int[] intArray)
	{
		System.out.print(intArray[0]);
		for(int i = 1; i < intArray.length; i++)
		{	System.out.print(", " + intArray[i]);
		}
		System.out.println();
	}

	public static void initialiseStringArray(String[] s)
	{
		for(int i = 0; i < s.length; i++)
		{	s[i] = "";
		}
	}
	
	public static void main (String[] args)
	{
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
		System.out.println(s[1]);
		initialiseStringArray(s);
		printArray(s);
		
	}
}

