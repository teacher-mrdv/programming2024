public class Pr41 // 4.1

	public static void main(String args[])
	{
		int a = IBIO.inputInt("enter first number ");
		int b = IBIO.inputInt("enter second number ");
		int num = 0;
		do
		{
			IBIO.output("\nPress [1] for addition");
			IBIO.output("      [2] for multiplication");
			IBIO.output("      [3] to  quit");
			num = IBIO.inputInt("Your selection: ");
			
			switch(num)
			{
				case 1:
					IBIO.output("\n\n" + a + " plus " + b + " = " + (a+b));
					break;
				case 2:
					IBIO.output("\n\n" + a + " times " + b + " = " + (a*b));
					break;
				case 3:
					IBIO.output("\nHasta la vista, baby.\n");
					break;
				default:
					IBIO.output("\nPlease enter 1, 2, or 3.\n");
					break;
			}
		} while (num != 3);
	}
}
