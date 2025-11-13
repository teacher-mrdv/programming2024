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
        System.out.println("Size   = " + numbers.size(numbers.getRoot()));
        System.out.println("Leaves = " + numbers.leaves(numbers.getRoot()));
        System.out.println("Non-Leaves = " + numbers.nonLeaves(numbers.getRoot()));
        numbers.preOrder();
        System.out.println();
        numbers.inOrder();
        System.out.println();
        numbers.postOrder();
        System.out.println();
        System.out.println("Input a couple of ints to search for:");
        Scanner in = new Scanner(System.in);
        System.out.print("First int = ");
        int search = in.nextInt();
        System.out.println( "Found? " + numbers.search(search));
        System.out.print("Second int = ");
        search = in.nextInt();
        System.out.println(numbers.size(numbers.getRoot()));
        System.out.println( "Found? " + numbers.search(search));
        in.close();
    }
}
/* this is the visual representation of the resulting tree:

     5
   /   \
  2     9
/  \   / \
0  3  8   11

 */