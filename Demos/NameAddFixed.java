public class NameAddFixed
{
	static String[] BUGS = {"ANT", "FLY", "FREE", "", "", ""};
	
	static void add(String THISNAME)
	{
		int POS = 0;
		while (!BUGS[POS].equals("FREE") && !BUGS[POS].equals(THISNAME))
		{	POS = POS + 1;
		}
		if(POS < BUGS.length)
		{
			if(BUGS[POS] == "FREE")
			{
				BUGS[POS] = THISNAME;
				if(POS < BUGS.length-1)
				{	BUGS[POS + 1] = "FREE";
				}
			}
		}
	}
	
	static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
			System.out.printf("%d:%-9s", i, a[i]);
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		printArray(BUGS);
		add("BEE"); printArray(BUGS);
		add("ANT"); printArray(BUGS);
		add("FLY"); printArray(BUGS);
		add("BEETLE"); printArray(BUGS);
		add("CRICKET"); printArray(BUGS);
		add("FIREFLY"); printArray(BUGS);
	}
}

