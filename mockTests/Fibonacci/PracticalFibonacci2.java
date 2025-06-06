public class PracticalFibonacci2
{

    public static void main (String[] args)
    {
		int n;
		
		System.out.println("Marcos Drien");
		System.out.println("Fibonacci sequence\n");
		do
		{
			long term1 = 0, term2 = 1, next = term1 + term2;
			double sum = next;
			do
			{
				n = IBIO.inputInt("Calculate up to term (n)? ");
				if(n < 0)
				{
					System.out.println("ERROR - Enter a positive number: ");
				}
			} while( n < 0 );
			if( n == 0 )
			{
				break;
			}
			if( n <= 20 )
			{
				System.out.print( term1 + "; " + term2 + "; " );
			}
				
			for( int i = 2; i <= n; i++)
			{
				next = term1 + term2;
				term1 = term2;
				term2 = next;
				if( n <= 20)
				{
					IBIO.out( next );
					if(i < n)
					{
						IBIO.out("; ");
					}
				}
				sum = sum + next;
			}
			
			if( n > 20 )
			{
				IBIO.out( next );
			}
			System.out.println( "\nAverage = " + (sum/n) );
			
			// how many digits
			IBIO.out(next + " has ");
			int digits = 0;
			do
			{
				digits++;
				next = next / 10;
			} while(next > 0);
			System.out.println(digits + " digits\n");
			
		} while(n != 0);
	}
	
}
