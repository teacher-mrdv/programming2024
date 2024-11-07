public class RecursionWorksheets1
{

    public static int sum(int n)
    {
		System.out.print(n + " ");
		System.out.println( (n == 1) );
        if (n == 1)
		{	return 1;
        } else
        {	return n + sum(n - 1);
		}
		
    }

    public static int result(int n)
    {
        if (n == 1)
        {    return 2;
        } else
        {    return 2 * result(n - 1);
		}
    }
    
    public static void main(String[] args)
    {
        System.out.println("sum(5) = " + sum(5));
        System.out.println("result(5) = " + result(5));
    }
}
