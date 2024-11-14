public class Pr15 // 1.5
{
	public static void main (String[] args)
	{
		int term = 1;
		for (int i = 0; i <= 20; i++)
		{
			IBIO.output("2 to the power of " + i + " = " + term);
			term = term * 2;	// each time it loops, it multiplies itself by 2
		}
	}
}
