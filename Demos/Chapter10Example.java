
public class Chapter10Example
{
	
	public static void main (String[] args)
	{
		String string = IBIO.input("Enter your name: ");
		System.out.println("Your input was " + string);
		char[] array = string.toCharArray();
		for(int index = array.length-1; index >= 0; index--)
		{
			System.out.print(array[index] );
		}
		System.out.println();
		for(int index = 0; index < array.length; index++)
		{
			System.out.println( index + ": " + array[index] );
		}
		System.out.println( "the length is " + array.length );
		System.out.println( "the length is " + string.length() );
	}
}

/*
Hello lollypop
popyllol
0: l
1: o
2: l
3: l
4: y
5: p
6: o
7: p
the length is 8
the length is 8
*/

