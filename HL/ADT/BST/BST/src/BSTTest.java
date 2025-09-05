import java.util.Scanner;

public class BSTTest
{
    public static void main(String[] args)
    {
        BST numbers = new BST(5);
        numbers.addNode(9);
        numbers.addNode(1);
        numbers.addNode(3);
        numbers.addNode(8);
        numbers.addNode(0);
        numbers.addNode(11);
        System.out.println("Input a couple of ints to search for:");
        Scanner in = new Scanner(System.in);
        System.out.print("First int = ");
        int search = in.nextInt();
        System.out.println( "Found? " + numbers.search(search));
        System.out.print("Second int = ");
        search = in.nextInt();
        System.out.println( "Found? " + numbers.search(search));
        in.close();
    }
}
