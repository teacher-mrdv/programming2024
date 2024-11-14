/*
 * Write a program that will add up the sequence discussed above to 10000 terms.
 * Output 4 times the answer to get pi. (3.1414926535900345)
 */
public class Pr53 // 5.3
{
	public static void main(String args[])
	{
		double sum = 0;
		double x = 1;
		double term = 0;
		int sign = 1;

		for (int i = 1; i <= 10000; i++)
		{
			term = sign/x;
			sum = sum + term;
			x = x + 2;
			sign = sign * -1;
			
		}
		IBIO.output("Pi is " + (sum*4));

	}
}
// Pi is 3.1414926535900345
