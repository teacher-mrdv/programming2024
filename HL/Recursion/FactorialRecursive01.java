import java.util.Scanner;

public class FactorialRecursive01
{
	public static long factorial(int n)
	{
		System.out.println(n);
		if(n == 0)
		{
			return 1;
		}
		return n * factorial(n-1);
	}
	
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println( factorial(n) );
	}
}

