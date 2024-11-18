
public class Factorial
{
	
	public static void main (String[] args)
	{
		// #1
		IBIO.output("Marcos Drien");
		int n;
		do
		{	n = IBIO.inputInt("n = (1~20): "); // #2
			/*if(n < 0)
			{	IBIO.output("Error-out of range");
			}
			if(n > 12)
			{	IBIO.output("Error-out of range");
			} */
			if(n < 0 || n > 20)
			{	IBIO.output("Error-out of range");
			} else
			{
				IBIO.out(n + "!= ");
				long factorial = 1;
				int factor = n;
				//for(int factor = n; factor > 0; factor--)
				for(int i = 1; i <= n; i++)
				{
					factorial = factorial * factor;
					//if( n <= 10 )
					if( n > 1 && n <= 10)
					{
						IBIO.out(factor);
						if( factor > 1)
						{	IBIO.out( " x " );
						}
					}
					factor = factor - 1;
				}
				//if(n <= 10)
				if( n > 1 && n <= 10)
				{	IBIO.out(" = ");
				}
				IBIO.output(factorial);
			
				int digits = 0;
				long f = factorial;
				while( f > 0 )
				{
					digits++;
					f = f / 10;
				}
				IBIO.output(factorial + " has " + digits + " digits");
			}
		} while(n < 1 || n > 20);
		
	}
}

/*
Marcos Drien
n = (1~20): 12
12!= 479001600
479001600 has 9 digits

Marcos Drien
n = (1~20): 5
5!= 5 x 4 x 3 x 2 x 1 = 120
120 has 3 digits
*/
