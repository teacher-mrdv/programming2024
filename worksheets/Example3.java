public class Example3 {
	
	public static void main (String[] args) {
		int a = IBIO.inputInt("Enter a number = ");
		int b = IBIO.inputInt("Enter another number = ");
		int c = a * b;
		IBIO.output("the product of " + a + " and " + b + " is " + c );
		c = a + b;
		IBIO.output("the sum of " + a + " and " + b + " is " + c );
		c = a / b;
		IBIO.output("the division of " + a + " and " + b + " is " + c );
		c = a % b;	// % is modulo/remainder of floor division
		IBIO.output("the modulo of " + a + " and " + b + " is " + c );
		c = a - b;
		IBIO.output("the subtraction of " + a + " and " + b + " is " + c );
			
	}
}
/* OUTPUT
Enter a number = 5
Enter another number = 2
the product of 5 and 2 is 10
the sum of 5 and 2 is 7
the division of 5 and 2 is 2
the modulo of 5 and 2 is 1
the subtraction of 5 and 2 is 3
*/
