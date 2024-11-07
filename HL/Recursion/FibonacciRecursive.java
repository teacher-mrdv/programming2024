
public class FibonacciRecursive
{
	static int c = 0;
	
	public static int fibo(int term)
	{
		c++;
		if(term == 0)
		{	return 0;
		}
		if(term == 1)
		{	return 1;
		}
		return fibo(term-1) + fibo(term-2);
	}
	public static void main (String[] args)
	{
		System.out.println( fibo(20) );
		System.out.println( c );
	}
}

