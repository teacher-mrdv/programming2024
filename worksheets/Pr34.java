public class Pr34 // 3.4
{
	public static void main(String args[])
	{
		int steps = 0;
		int next = 0;
		int num = IBIO.inputInt("Enter a number:\n");

		do
		{
			if(num%2==0)
				next = num/2;
			else
				next = num*3+1;
			
			num = next;
			steps++;
			IBIO.out(num + "\t");
			
		} while ( num != 1);
		
		IBIO.output("\nNumber of steps: " + steps);
	}
}
