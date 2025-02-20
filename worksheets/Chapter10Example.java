/*
 * https://www.geeksforgeeks.org/strings-in-java/ for more on Strings and...
 * ...String related methods
 * v2 clean up with methods
 */
public class Chapter10Example
{
	public static String reverse(String s)
	{
		char[] array = s.toCharArray();
		String reversed = "";
		for(int index = array.length-1; index >= 0; index--)
		{	reversed = reversed + array[index] ;
		}
		return reversed;
	}
	
	public static void main (String[] args)
	{
		String string = IBIO.input("Enter your name: ");
		System.out.println("Your input was " + string + " containing " +
							string.length() + " characters");
		System.out.println( string + " reversed: " + reverse(string) );
		System.out.println();
		System.out.println( "NOTE that the array length is array.length" );
		System.out.println( "==== while for Strings is string.length()" );
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

