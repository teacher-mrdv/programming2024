/*
 * This demonstrates variable scope and
 * example of a (global) constant in Java
 */
public class MethodDemo
{	// final makes it a constant. ALL CAPS to signal that.
	public static final double GST = 0.09;
	
	public static double calculateGST(double price)
	{
		/*	parameter variables and any variables declared and used
			here are local to the calculateGST() method */
		System.out.println("\tPrevailing GST = " + GST);
		System.out.println("\tparameter variable-in = " + price);
		price = price + (price * gst); // not recommended to change a parameter variable
		System.out.println("\tparameter variable-post processing = " + price);
		return price;
	}
	
	public static void main (String[] args)
	{
		double price = 100; // local to the main method
		System.out.println("Prevailing GST = " + GST); // global constant-- we can't change its value
		System.out.println("price variable before method call = " + price);
		System.out.println( ">>> Price incl. GST = " + calculateGST(price, GST) );
		System.out.println("price variable after method call = " + price);
		
	}
}

