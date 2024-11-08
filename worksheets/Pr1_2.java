class Pr1_2
{
/*	Problem 1.2
Write a program that allows you to input the number of steps,
the starting point and the increment and then prints out your sequence.
So for example step = 4, start = 3, increment = 2.
Then the sequence will be 3 5 7 9
*/
	public static void main(String[] args)
	{
		IBIO.output("\n");		// leaves one empty line
		int steps = IBIO.inputInt("enter number of steps: ");
		int start = IBIO.inputInt("enter starting number: ");
		int increment = IBIO.inputInt("enter increment: ");
		int n = start;	// valiable used to calculate term
						// of the sequence; initial value is
						// the starting number input by user
		for (int i = 0; i < steps; i++)	// repeat "steps" times
		{
			IBIO.out( n + " " );		// print term horizontally, leave space in between
			n = n + increment;	// calculate next term in the sequence
		}
		IBIO.output("\n");		// leaves one empty line
	}
}

// Output:
//
// enter number of steps: 4
// enter starting number: 3
// enter increment: 2
// 3 5 7 9
//