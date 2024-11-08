public class Pr11 // 1.1
{
	public static void main (String args[])
	{
		String name = IBIO.input("What is your name? ");
		int	number = IBIO.inputInt("How many times to repeat it? ");
		for (int i = 0; i < number; i++)
		{	IBIO.output(name);
		}
	}
}