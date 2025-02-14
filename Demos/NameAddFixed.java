public class NameAddFixed
{
	public static String[] BUGS = {"ANT", "FLY", "FREE", "", "", ""};
	
	public static void add(String THISNAME)
	{
		int POS = 0;
		while(	!BUGS[POS].equals("FREE") &&
				!BUGS[POS].equals(THISNAME) &&
				POS < BUGS.length-1 )
		{	POS = POS + 1;
		}
		if(BUGS[POS].equals("FREE"))
		{	BUGS[POS] = THISNAME;
			if(POS < BUGS.length-1)
			{	BUGS[POS + 1] = "FREE";
			}
		} else {
			System.out.println("Can't add. Element repeated or array full.");
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
		System.out.println(">>> adding BEE:");
		add("BEE"); printArray(BUGS);
		System.out.println(">>> adding ANT:");
		add("ANT"); printArray(BUGS);
		System.out.println(">>> adding FLY:");
		add("FLY"); printArray(BUGS);
		// extra testing
		System.out.println(">>> adding BEETLE:");
		add("BEETLE"); printArray(BUGS);
		System.out.println(">>> adding CRICKET:");
		add("CRICKET"); printArray(BUGS);
		System.out.println(">>> adding FIREFLY:");
		add("FIREFLY"); printArray(BUGS);
		System.out.println(">>> adding CICADA:");
		add("CICADA");
	}
}

