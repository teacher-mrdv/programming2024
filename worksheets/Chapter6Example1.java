
public class Chapter6Example1
{

	public static String spaces(int numberOfSpaces)
	{
		String spaces = "";
		for(int i = 0; i < numberOfSpaces; i++)
		{
			spaces = spaces + " ";
		}
		return spaces;
	}


	public static String stars(int numberOfStars)
	{
		String stars = "";
		for(int i = 0; i < numberOfStars; i++)
		{
			stars = stars + "*";
		}
		return spaces(10) + stars;
	}
	
	public static void main (String[] args)
	{
		int lines = IBIO.inputInt("Number of lines? ");
		//System.out.println( stars( lines ) );
		for(int i = 0; i < lines; i++)
		{
			String lineNumber = "" + (i+1);
			if( i < 9 )
			{	lineNumber = " " + lineNumber;
			}
			lineNumber = lineNumber + ": ";
			System.out.print( lineNumber );
			System.out.println( stars(lines) );
		}
	}
}

