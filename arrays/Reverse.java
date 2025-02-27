
public class Reverse
{
	public static String reverse(String s)
	{
		String reversed = ""; // initialise the string
		char[] spell = s.toCharArray();
		for(int i = 0; i < s.length(); i++)
		{	reversed = spell[i] + reversed;
		}
		return reversed;
	}
	
	public static void main (String[] args)
	{
		System.out.println( reverse("CAIO"));
	}
}

