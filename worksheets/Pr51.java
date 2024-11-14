public class Pr51 // 5.1
{
	public static void main(String args[])
	{
		double term = 1;
		double sum = 0;

		for (int i = 0; i < 100; i++)
		{
			term = term/5;
			sum = sum + term;
		}
		IBIO.output("total is "+sum);

	}
}
