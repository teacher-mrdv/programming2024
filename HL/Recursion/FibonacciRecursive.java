
public class FibonacciRecursive
{
	static int c = 0;
	
	public static int fibo(int term)
	{
		c++;
		if(term == 0)
		{	return 0;
		}x
		if(term == 1)
		{	return 1;
		}
		return fibo(term-1) + fibo(term-2);
	}
	public static void main (String[] args)
	{
		System.out.println( fibo() );
		System.out.println( c );
		//System.out.println( term );
	}
}

