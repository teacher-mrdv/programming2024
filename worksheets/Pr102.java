/*
 * Binary to denary simple conversion program
 * example to help you solve problem 10.2
 * by teacher Marcos
 * Feb 2024
 */
 
public class Pr102
{
	
	public static void main (String[] args)
	{
		String binary = args[0];
		char[] bin = binary.toCharArray();
		boolean error = false;
		int sum = 0;
		//System.out.println(binary.length());
		//System.out.println(bin.length);
		for(int i = 0; i < bin.length; i++)
		{
			if(bin[i] == '0')
			{	sum = sum * 2;
			} else if(bin[i] == '1')
			{	sum = sum * 2;
				sum++;
			} else {
				System.out.println("Error-not a binary number");
				error = true;
				break;
			}
		}
		if( !error )
		{	System.out.println(sum);
		}
	}
}

