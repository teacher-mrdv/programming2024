/****************************************
 * Solving the denary to binary problem
 *	using recursion
 * IB HL CompSci
 * 14.11.2024
 ****************************************/
 
public class Int2Bin
{
	// brainstorming idea...
	public static int den2binA(int d)
	{
		if( d == 0 )
		{	return 0;
		}
		System.out.println( d % 2 );
		return den2binA(d/2);
	}
	
	public static void den2bin(int d)
	{
		if( d == 0 )
		{	return;
		}
		den2bin(d/2);	// note that we call the method first
		System.out.print( d  % 2 ); // and then we output the modulo
	}
	
	public static void main (String[] args)
	{
		den2binA(26);
		System.out.println("\n\n");
		den2bin(26);
	}
}

