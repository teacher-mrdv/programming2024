
public class NestedLoops {
	
	public static void main (String[] args) {
		int c = 0;
		for(int i = 0; i < 4; i++)
			for(int j = i; j < 4; j++)
				for(int k = j; k < 4; k++)
				{	System.out.printf("%2d, %2d, %2d \n", i, j, k);
					//System.out.println(i+ " " + j + " " + k);
					c++;
				}
		System.out.println(c);
	}
}

