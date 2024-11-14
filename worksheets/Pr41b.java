/*
Write a program that will let you enter two numbers. Then it will ask you to enter “1” for add, “2” for multiply, “3” for quit. This will be displayed on the screen like below:
   Press:	[1] for addition
			[2] for multiplication
			[3] for quit
*/

public class Pr41b // with letters instead of numbers for options
{
	public static void main(String args[])
	{
		int a = IBIO.inputInt("enter first number ");
		int b = IBIO.inputInt("enter second number ");
		char opt;
		do
		{
			IBIO.output("Press [A] for addition");
			IBIO.output("      [M] for multiplication");
			IBIO.output("      [Q] to  quit");
			opt = IBIO.inputChar("Your selection: ");
			opt = Character.toLowerCase(opt);

			switch(opt)
			{
				case 'a':
					IBIO.output(a + " plus " + b + " = " + (a+b));
					break;
				case 'm':
					IBIO.output(a + " times " + b + " = " + (a*b));
					break;
				case 'q':
					IBIO.output("\nHasta la vista, baby.\n");
					break;
				default:
					IBIO.output("Please enter A, M, or Q.\n");
					break;
			}
		} while (opt != 'q');
	}
}
