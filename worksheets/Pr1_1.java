/*
Pr1.1:
Change the program so that you enter in a number and then the program will print your name down the screen that number of times. 
*/

public class Pr1_1
{
	public static void main(String args[])
	{
		String name = "Bruce Wayne";
		int times	= inputInt( "How many times to repeat? " );
		for ( int i = 0; i < times; i++ )
		{	IBIO.output( name );
		}
	}
}

/*
185-2:java m_drienvargas$ ./jc Pr1_1

How many times to repeat? 5
Bruce Wayne
Bruce Wayne
Bruce Wayne
Bruce Wayne
Bruce Wayne
*/