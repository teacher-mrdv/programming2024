public class Snippet
{
	
	public static void main (String[] args)
	{
		int mark = IBIO.inputInt("mark = ");
		switch(mark/10)
		{
			case	10:
			case	9:
			case	8:
				System.out.println("Excellent");
				break;
			case	7:
				System.out.println("Veryb Good");
				break;
			case	6:
				System.out.println("Good");
				break;
			case	5:
				System.out.println("Work Hard");
				break;
			case	4:
				System.out.println("Poor");
				break;
			case	3:
			case	2:
			case	1:
			case	0:
				System.out.println("Very Poor");
				break;
			default:
				System.out.println("Invalid	value entered");
				break;
		}
	}
}

