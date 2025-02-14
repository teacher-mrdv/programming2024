public class NameAdd2
{
	public static String[] BUGS = {"ANT", "FLY", "FREE", "", "", ""};
	
	public static void add(String THISNAME)
	{
		int POS = 0;
		do
		{	POS = POS + 1;
		} while (!BUGS[POS].equals("FREE") &&
		         !BUGS[POS].equals(THISNAME));
		
		if(BUGS[POS].equals("FREE"))
		{
			BUGS[POS] = THISNAME;
			BUGS[POS + 1] = "FREE";
		}
	}
	
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{	System.out.printf("%d:%-9s", i, a[i]);
		}
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		printArray(BUGS);
		add("BEE"); printArray(BUGS);
		add("ANT"); printArray(BUGS);
		add("FLY"); printArray(BUGS);
		
		/* for further testing the algorithm
		add("BEETLE"); printArray(BUGS);
		add("CRICKET"); printArray(BUGS);
		add("FIREFLY"); printArray(BUGS);
		*/
	}
}

