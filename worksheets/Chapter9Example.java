
public class Chapter9Example
{
	
	public static void main (String[] args)
	{
		int[] num = new int[100]; // create the array
		for (int i = 0; i < 100; i++)
		{
			double xx = Math.random() * 6;
			num[i] = (int)(xx + 1);
		}
		for (int i = 0; i < 100; i++)
		{	System.out.print(num[i] + " ");
		}
	}
}

