/* Pr. 2.4
Write a program to print out the cubes of numbers from 1 to 10
so that they line up on the right
*/

public class Pr24b
{
	public static void main (String args[])
	{
		int cube = 0;
		int nlen = 0;
		String spaces = "";
		
		for (int i=1; i<=10; i++)
		{
			cube = i*i*i;
			
			nlen = 
			for( int i = 0; i < 
			if(cube<10)
				spaces = "   ";
			else if(cube>=10 && cube<100)
				spaces = "  ";
			else if(cube>=100 && cube<1000)
				spaces = " ";
			else if(cube>=1000)
				spaces = "";
				
			IBIO.output(spaces + cube);
		}
	}
}

/*
   1
   8
  27
  64
 125
 216
 343
 512
 729
1000
*/