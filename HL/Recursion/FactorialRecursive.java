/*
 * factorial recursive version
 * 
 */

public class FactorialRecursive
{

	public static long factorial(int n)
	{
		System.out.println( ">>>" + n); 
		if(n==0)
		{
			return 1;
		}
		else
		{
			//System.out.println( ">>>" + n);
			return n * factorial(n - 1);
		}
		//System.out.println( ">>>" + n); // unreachable
	}
	
	public static void main (String[] args)
	{
		System.out.println( factorial(5) );
	}
}

/* OUTPUT

>>>5
>>>4
>>>3
>>>2
>>>1
>>>0
120

 */

