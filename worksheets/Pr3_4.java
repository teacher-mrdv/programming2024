class Pr3_4
{
/*
Consider the sequence. If a number was even then the next number would be half of that number, if the number was not even then the next number would be got by multiplying that number by 3 and then adding 1. eg if 7 was the starting number then that number is odd so it is multiplied by 3 and 1 added to get 22, 7, 22, 11, 34. This sequence continues until it eventually arrives at 1. Write a program that will allow you to input a number and then it continues this sequence until it eventually arrives at 1. I want to know how many steps it takes. Eg starting at 3 the sequence is 3, 10, 5, 16, 8, 4, 2, 1 and that takes 7 steps.
*/
	public static void main(String[] args)
	{
		int n = IBIO.inputInt("Enter a number: ");
		int next = 0;
		int steps = 0;
		while( next != 1 )			// stop when sequence = 1
		{
			steps ++;
			if( n % 2 == 0 )	// if number is even...
			{	next = n / 2;
			} else
			{	next = n * 3 + 1;
			}
			n = next;
			IBIO.out( next + "\t" );
		}
		IBIO.output( "\nSteps: " + steps );
	}
}
			
				