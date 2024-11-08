public class Pr12 // 1.2
{
	public static void main (String args[])
	{
		int number = IBIO.inputInt("Starting number: ");
		int	steps  = IBIO.inputInt("Number of steps: ");
		int increment = IBIO.inputInt("Increment: ");
		for (int i = 0; i < steps; i++)
		{
			IBIO.output(number);
			number = number + increment;
		}
	}
}