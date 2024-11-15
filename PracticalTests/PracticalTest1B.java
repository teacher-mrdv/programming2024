public class PracticalTest1B
{
	public static void main (String[] args)
	{
		int n;
		int min = 0;
		int max = 0;
		int evens = 0;
		int odds = 0;
		double sum = 0; // for the average, we need decimals (double)
		IBIO.output("\nJuan Perez");
		n = IBIO.inputInt("\nHow many numbers to process? ");
		if (n < 3)
		{	IBIO.output("Error: input must be at least 3.");
			System.exit(1);
		}
		// or, instead of the Ssytem.exit(1), add another if:
		// if(n > 2) { ...
		for(int i = 0; i < n; i++)
		{
			int x = IBIO.inputInt("Enter number: ");
			sum = sum + x;
			if(i == 0)
			{
				min = x;
				max = x;
			}
			if(x > max)
			{
				max = x;
			}
			if(x < min)
			{
				min = x;
			}
			
		}
		IBIO.output("\nMinimum: " + min);
		IBIO.output("Maximum: " + max);
		IBIO.output("Range  : " + (max-min));
		IBIO.output("Average: " + (sum/n));
		int x = max;
		boolean prime = true; // you could also do this with int prime = 1;
		for(int j = 2; j < x; j++)
		{
			if(x % j == 0)
			{	prime = false;
			}
		}
		IBIO.output("Is the maximum a prime? " + prime);
		// ...} closing } for the if(n > 2) above
		IBIO.output("[End]");
	} // end main
} // end class
