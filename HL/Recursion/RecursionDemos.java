/*
 * Recursion demos
 * Note that head recursion isn't feasible
 * with fruitful recursive methods (non-void)
 *
 * This links to our binary trees topic
 *
 */
public class RecursionDemos {

	static int counter = 0;
	
	// factorial example with pretty output -- tail recursion example
	public static int factorial(int n) {
		if(n == 0) {
			System.out.print("= ");
			return 1;
		} else {
			System.out.print(n + " ");
			if(n > 1) {
				System.out.print("x ");
			}
			return n * factorial(n-1);
		}
	}

	// our typical tree recursion example
	public static int fibo(int n) {
		//System.out.println( ">>> " + n );
		counter++;
		if(  n == 0 )
			return 0;
		else if( n == 1 )
			return 1;
		else
			return fibo(n - 2) + fibo(n - 1);
	}

	 // tail recursion  (recursive call last, at the end of the method)
	public static void countDown(int n) {
		if( n == 0 )
			return;
		System.out.println(n);
		countDown(n-1);
	}
	
	// head recursion (recursive call first, right after base case)
	public static void countUp(int n) {
		if( n == 0 )
			return;
		countUp(n-1);
		System.out.println(n);
	}

	// trace in class
	public static void count(int start, int end) {
		if( start == end+1 ) // so that we do print/process the end
			return;
		System.out.print(start + " ");
		count(start+1, end);
	}

	// to trace
	public static int gcd(int a, int b) {
		System.out.println(">>> a = " + a + " b = "+b);
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static int sum(int n) {
		//System.out.print( n + " " );
		if(n == 1) {
			return 1;
		} else {
			return n + sum(n-1);
			//System.out.println( n );
			//^previous statement is unreachable because it's
			//after the returning of a value 
		}
	}

	// Challenge: trace this method!
	public static void madness(int n) {
		if(n > 0) { // implied base case: stop recursing when n<=0
			madness(n-1);
			System.out.println(n);
			madness(n-1);
		}
	}

	/*
		madness(2)
		├── madness(1)
		│   ├── madness(0) → stop
		│   ├── print 1
		│   └── madness(0) → stop
		├── print 2
		└── madness(1)
			├── madness(0) → stop
			├── print 1
			└── madness(0) → stop

				  madness(2)
				 /          \
				/            \
		Call madness(1) p Call madness(1)
			   /    \           /     \
			  /      \         /       \
		Call m(0)pCall m(0) Call m(0)pCall m(0)

		1.  madness(2) starts.
		2.  It must call madness(1) (left branch) first.
		3.  madness(1) starts. It must call madness(0) (its own left branch).
		4.  madness(0) starts, does nothing (base case), and returns.
		5.  madness(1) resumes. It now executes its `println`, printing 1.
		6.  madness(1) now calls madness(0) (its right branch).
		7.  madness(0) starts, does nothing, and returns.
		8.  madness(1) is finished and returns.
		9.  madness(2) resumes. It has just finished its *entire* left `madness(n-1)` call.
			It now executes its `println`, printing 2.
		10. madness(2) now calls madness(1) (right branch).
		11. This new madness(1) call repeats steps 3-8 exactly, which results in printing 1 again.
		12. madness(2) is finished and returns.

		This "left, self, right" traversal is known as an in-order traversal in tree data structures.

	 */
	
	public static void main (String[] args) {
		System.out.println( "5! = " + factorial(5) );
		System.out.print( "4! = " );
		System.out.println( factorial(4) );
		
		System.out.println();
		counter = 0;
		System.out.println( "\nTerm 4 of the Fibonacci sequence = " + fibo(4) );
		System.out.println(counter + " times fibo");
		System.out.println("\nCount UP to 4:");
		countUp(4);
		System.out.println("\nCount DOWN to 4:");
		countDown(4);
		System.out.println("\nCount from 1, to 4:");
		count(1, 4);
		System.out.println("\nGCD of 1071 and 462 = ");
		System.out.println( gcd(1071, 462) );
		System.out.print("sum(3) = ");
		System.out.println( sum(3) );
		
		System.out.println("\nMadness with simultaneous head & tail recursion");
		System.out.println("madness(2)");
		madness(2);
		System.out.println("\nmadness(3)");
		madness(3);
		
	}
}

/*
	madness(3) → stack
	├── madness(2) → stack
	│   ├── madness(1) → stack
	│   │   ├── madness(0) → stop
	│   │   ├── print 1
	│   │   └── madness(0) → stop
	│   ├── print 2
	│   └── madness(1) → stack
	│       ├── madness(0) → stop
	│       ├── print 1
	│       └── madness(0) → stop
	├── print 3
	└── madness(2) → stack
		├── madness(1) → stack
		│   ├── madness(0) → stop
		│   ├── print 1
		│   └── madness(0) → stop
		├── print 2
		└── madness(1) → stack
			├── madness(0) → stop
			├── print 1
			└── madness(0) → stop

				   madness(3)
				 /     |      \
				/      |       \
		  madness(2)  print(3)   madness(2)
		   /  |  \                 /    |   \
		  /   |   \               /     |    \__
		m(1) p(2)  m(1)           m(1)  p(2)    m(1)
		/|\        / | \          / |\         / | \
	   / | \      /  |  \        /  | \       /  |  \
	m(0)p(1)m(0) m(0)p(1)m(0) m(0)p(1)m(0) m(0)p(1)m(0)
*/
