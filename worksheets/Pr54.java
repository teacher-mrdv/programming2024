/* Chapter 5, problem #4 [5.4]

π       1   1×2   1×2×3   1×2×3×4
- = 1 + - + --- + ----- + ------- + ...
2       3   3×5   3×5×7   3×5×7×9

 * The sequence above is a much quicker way of calculating pi
 * Write a program that will add up the sequence above to 100 terms.
 * Output double the answer (3.1415926535897922)
 */
public class Pr54
{
	public static void main(String args[])
	{
		double sum = 0;
		double numerator   = 1;
		double denominator = 1;
		double increment   = 1;
		double term = 0;

		for (int i = 1; i <= 100; i++)
		{
			term = numerator/denominator;
			sum = sum + term;

			increment = increment + 2;
			numerator = numerator * i;
			denominator = denominator * increment;

		}
		IBIO.output( "Pi is " + (sum * 2) );

	}
}
// Pi is 3.1415926535897922

